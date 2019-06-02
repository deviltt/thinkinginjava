package com.tt.chapter19.enumerated;

public enum SpaceShip {
    SCOUT, CARGO, TRANSPORT, CRUISER, BATTLESHIP, MOTHERSHIP;

    /**
     * 以往就是返回枚举实例的名字
     *
     * @return 现在返回首字母大写，其余字母小写的实例名字
     */
    @Override
    public String toString() {
        String originalName = name();
        String tail = originalName.substring(1).toLowerCase();
        return originalName.charAt(0) + tail;
    }

    public static void main(String[] args) {
        for (SpaceShip spaceShip:SpaceShip.values()){
            System.out.println(spaceShip);
        }
    }
}
