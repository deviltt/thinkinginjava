package com.tt.chapter19.enumerated;

/**
 * 默认的enum实例在toString中只会输出实例的名字，
 * 因此提供一个构造器，专门负责处理这个额外的信息，
 * 再创建一个方法来获取这个额外的信息，用于对这个实例进行描述
 */
public enum OzWitch {
    WEST("Miss Gulch, aka the Wicked Witch of the west", 3),
    NORTH("Glinda, the Good Witch of the North", 4);

    private String description;
    private int num;

    /**
     * 提供一个私有构造器，
     */
    private OzWitch(String description, int num){
        this.description=description;
        this.num=num;
    }

    public String getDescription(){
        return description;
    }

    public int getNum(){
        return num;
    }

    public static void main(String[] args) {
        for (OzWitch ozWitch:OzWitch.values()){
            System.out.println(ozWitch+": "+ozWitch.getDescription()+" "+ozWitch.getNum());
        }
    }
}
