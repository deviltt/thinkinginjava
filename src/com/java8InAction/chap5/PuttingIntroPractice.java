package com.java8InAction.chap5;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class PuttingIntroPractice {
    public static void main(String... args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );

        //1.找出2011年的所有交易并按交易额排序
        List<Transaction> tr2011 =
                transactions.stream()
                        .filter(transaction -> transaction.getYear() == 2011)
                        .sorted(comparing(Transaction::getValue))
                        .collect(toList());
        System.out.println(tr2011);

        //2.交易员都在那些不同的城市工作过
        List<String> cities =
                transactions.stream()
                        .map(transaction -> transaction.getTrader().getCity())
                        .distinct()
                        .collect(toList());
        System.out.println(cities);

        //3.查找所有来自于剑桥的交易员，并按姓名排序
        List<Trader> traders =
                transactions.stream()
                        .map(Transaction::getTrader)
                        .filter(trader -> "Cambridge".equals(trader.getCity()))
                        .sorted(comparing(Trader::getName))
                        .collect(toList());
        System.out.println(traders);

        //4.返回所有交易员的姓名字符串，按字母顺序排序
        String traderStr =
                transactions.stream()
                        .map(transaction -> transaction.getTrader().getName())
                        .distinct()
                        .sorted()
                        .reduce("", (n1, n2) -> n1 + n2);
        System.out.println(traderStr);

        //5.有没有交易员是在米兰工作的
        boolean milanBased =
                transactions.stream()
                        .anyMatch(transaction -> "Milan".equals(transaction.getTrader().getCity()));
        System.out.println(milanBased);

        //6.打印生活在剑桥的交易员的所有交易额
        transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
                .map(Transaction::getValue)
//                .forEach(value-> System.out.println(value));    //可以用方法引用替换
                .forEach(System.out::println);

        //7.所有交易中，最高的交易金额是多少
        Optional<Integer> highestValue =
                transactions.stream()
                        .map(Transaction::getValue)
                        .reduce(Integer::max);
        System.out.println(highestValue);

        //8.找到交易额最小的交易
        Optional<Transaction> smallestTransaction =
                transactions.stream()
                        .reduce((t1, t2) -> t1.getValue() < t2.getValue() ? t1 : t2);
        System.out.println(smallestTransaction);
    }
}
