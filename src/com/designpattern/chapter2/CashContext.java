package com.designpattern.chapter2;

public class CashContext {
    private CashSuper cashSuper;

    public CashContext(String type) {
        switch (type){
            case "正常收费":
                cashSuper=new CashNormal();
                break;
            case "满300返100":
                cashSuper=new CashReturn(300, 100);
                break;
            case "打八折":
                cashSuper=new CashRebate(0.8);
                break;
            default:
                break;
        }
    }

    public double getResult(double money){
        return cashSuper.acceptCash(money);
    }
}
