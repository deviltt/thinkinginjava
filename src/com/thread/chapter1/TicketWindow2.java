package com.thread.chapter1;

public class TicketWindow2 extends Thread{
    private final String name;

    private static final int MAX = 50;
    private static int index = 1;

    public TicketWindow2(String name) {
        this.name = name;
    }

    @Override
    /**
     * 线程要执行的任务，打印当前的号码
     */
    public void run() {
        while (index <= MAX) {
            System.out.println("柜台：" + name + " 当前的号码是：" + (index++));
        }
    }

    public static void main(String[] args) {
        TicketWindow2 ticketWindow1 = new TicketWindow2("一号出号机");
        ticketWindow1.start();
        TicketWindow2 ticketWindow2 = new TicketWindow2("二号出号机");
        ticketWindow2.start();
        TicketWindow2 ticketWindow3 = new TicketWindow2("三号出号机");
        ticketWindow3.start();
        TicketWindow2 ticketWindow4 = new TicketWindow2("四号出号机");
        ticketWindow4.start();
    }

}
