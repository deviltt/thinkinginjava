package com.tt.chapter19.enumerated;

import java.util.Iterator;

/**
 * 包装一封邮件，使用enum实例来记录这个邮件有多少状态
 * 随机生成一封邮件，每个邮件的enum实例中的状态也是随机的
 */
class Mail {
    enum GeneralDelivery {YES, NO1, NO2, NO3, NO4, NO5}         //揽收邮件

    enum Scannability {UNSCANNABLE, YES1, YES2, YES3, YES4}     //可扫描

    enum Readability {ILLEGIBLE, YES1, YES2, YES3, YES4}        //可阅读

    enum Address {INCORRECT, OK1, OK2, OK3, OK4, OK5, OK6}      //发送地址

    enum ReturnAddress {MISSING, OK1, OK2, OK3, OK4, OK5}       //返回地址

    GeneralDelivery generalDelivery;
    Scannability scannability;
    Readability readability;
    Address address;
    ReturnAddress returnAddress;

    static long counter = 0;
    long id = counter++;

    @Override
    public String toString() {
        return "Mail " + id + "\n";
    }

    public String details() {
        return toString() +
                "General Delivery: " + generalDelivery + "\n" +
                "Address Scannability: " + scannability + "\n" +
                "Address Readability: " + readability + "\n" +
                "Address Address: " + address + "\n" +
                "Return address: " + returnAddress + "\n";
    }

    public static Mail randomMail() {
        Mail mail = new Mail();
        mail.generalDelivery = Enums.random(GeneralDelivery.class); //随机的生成一个enum实例状态
        mail.scannability = Enums.random(Scannability.class);
        mail.readability = Enums.random(Readability.class);
        mail.address = Enums.random(Address.class);
        mail.returnAddress = Enums.random(ReturnAddress.class);
        return mail;
    }

    public static Iterable<Mail> generator(final int count) {
        return new Iterable<Mail>() {
            int n = count;

            @Override
            public Iterator<Mail> iterator() {
                return new Iterator<Mail>() {
                    @Override
                    public boolean hasNext() {
                        return n-- > 0;
                    }

                    @Override
                    public Mail next() {
                        return randomMail();
                    }

                    @Override
                    public void remove() {
                        throw new UnsupportedOperationException();
                    }
                };
            }
        };
    }
}

public class PostOffice {
    //处理邮件，enum实例表示邮件的状态
    enum MailHandler {
        GENERAL_DELIVERY {
            boolean handle(Mail m) {
                switch (m.generalDelivery) {
                    case YES:
                        System.out.println("邮件揽收成功！！");
                        System.out.println("Using general delivery for " + m);
                        return true;
                    default:
                        System.out.println("邮件揽收失败");
                        return false;
                }
            }
        },
        MACHINE_SCAN {
            boolean handle(Mail m) {
                switch (m.scannability) {
                    case UNSCANNABLE:
                        System.out.println("邮件扫描失败！");
                        return false;
                    default:    //邮件扫描失败了，那就看看是什么原因造成的失败
                        switch (m.address) {
                            case INCORRECT:
                                System.out.println("邮件地址错误！");
                                return false;
                            default:
                                System.out.println("Delivering " + m + " automatically");
                                return true;
                        }
                }
            }
        },
        VISUAL_INSPECTION {
            boolean handle(Mail m) {
                switch (m.readability) {
                    case ILLEGIBLE:
                        System.out.println("邮件不可读！！");
                        return false;
                    default:
                        switch (m.address) {
                            case INCORRECT:
                                System.out.println("邮件地址错误！");
                                return false;
                            default:
                                System.out.println("Delivering " + m + " normally");
                                return true;
                        }
                }
            }
        },
        RETURN_TO_SENDER {
            boolean handle(Mail m) {
                switch (m.returnAddress) {
                    case MISSING:
                        return false;
                    default:
                        System.out.println("Returning " + m + " to sender");
                        return true;
                }
            }
        };

        abstract boolean handle(Mail m);
    }

    static void handle(Mail m) {
        for (MailHandler handler : MailHandler.values()) {
            if (handler.handle(m))
                return;
        }
        System.out.println(m + " is a dead letter");
    }

    public static void main(String[] args) {
        for (Mail mail : Mail.generator(10)) {
            System.out.println(mail.details()); //显示邮件的详细信息，可发送性、可读性、发送接收地址是否正确
            handle(mail);
            System.out.println("*******");
        }
    }
}
