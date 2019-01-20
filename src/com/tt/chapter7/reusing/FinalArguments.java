package com.tt.chapter7.reusing;

class Gizmo{
    public void spin(){}
}
public class FinalArguments {
    void with(final Gizmo gizmo){
        //gizmo = new Gizmo();    final声明的对象参数不能指向另一个存储空间
        gizmo.spin();
    }
    void without(Gizmo gizmo){
        gizmo = new Gizmo();
        gizmo.spin();
    }

    void f(final int i){
        //i++;  final参数只能用来读，而不能对其进行修改
    }
    int g(final int i){
        return i + 1;
    }

    public static void main(String[] args) {
        FinalArguments finalArguments = new FinalArguments();
        finalArguments.with(new Gizmo());
        finalArguments.without(new Gizmo());
    }
}
