package com.tt.chapter19.enumerated;

import java.util.EnumMap;
import java.util.Map;

import static com.tt.chapter19.enumerated.AlarmPoints.*;

interface Command {
    void action();
}

/**
 * EnumMap是将enum实例作为key，因此enum实例定义的顺序决定了其在EnumMap中的顺序
 */
public class EnumMaps {
    public static void main(String[] args) {
        EnumMap<AlarmPoints, Command> em = new EnumMap<>(AlarmPoints.class);
        em.put(KITCHEN, new Command() {
            @Override
            public void action() {
                System.out.println("Kitchen fire!");
            }
        });
        em.put(BATHROOM, new Command() {
            @Override
            public void action() {
                System.out.println("Bathroom fire!");
            }
        });
        for (Map.Entry<AlarmPoints, Command> entry : em.entrySet()) {
            System.out.print(entry.getKey() + " ");
            entry.getValue().action();
        }
        try {
            em.get(UTILITY).action();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
