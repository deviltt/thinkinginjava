package com.tt.chapter10.innerclasses;

public class Parcel2 {
    //内部类1
    class Contents{
        private int i = 11;
        public int value(){
            return i;
        }
    }
    //内部类2
    class Destination{
        private String label;
        Destination(String whereTo){
            label = whereTo;
        }
        String readLabel(){
            return label;
        }
    }

    /**
     * 创建内部类对象
     * @param s 参数
     * @return 返回内部类对象
     */
    public Destination to(String s){
        return new Destination(s);
    }

    /**
     * 创建内部类对象
     * @return 返回内部类对象
     */
    public Contents contents(){
        return new Contents();
    }

    public void ship(String dest){
        Contents c = contents();
        Destination d = to(dest);
        System.out.println(d.readLabel());
    }

    public static void main(String[] args) {
        Parcel2 p = new Parcel2();
        p.ship("Tasmania");
        Parcel2 q = new Parcel2();

        /**
         * 在外部类的非静态方法之外的任意位置地方创建某个内部类的对象
         * 必须具体的指明对象的类型 OuterClassName.InnerClassName
         */
        Parcel2.Destination d = q.to("Borneo");
        Parcel2.Contents c = q.contents();
    }
}
