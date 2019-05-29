package com.tt.chapter15.generics;

import com.tt.net.mindview.util.Generator;

import java.util.*;

class Customer {
    private static long counter = 1;
    private final long id = counter++;

    private Customer() {
    }

    @Override
    public String toString() {
        return "Customer " + id;
    }

    public static Generator<Customer> generator() {
        return new Generator<Customer>() {
            @Override
            public Customer next() {
                return new Customer();
            }
        };
    }
}

class Teller {
    private static long counter = 1;
    private final long id = counter++;

    private Teller() {
    }

    @Override
    public String toString() {
        return "Teller " + id;
    }

    public static Generator<Teller> generator() {
        return new Generator<Teller>() {
            @Override
            public Teller next() {
                return new Teller();
            }
        };
    }
}

public class BankTeller {
    public static void serve(Teller t, Customer customer) {
        System.out.println(t + " serves " + customer);
    }

    public static void main(String[] args) {
        Random random=new Random();
        Queue<Customer> queue=new LinkedList<>();
        Generators.fill(queue, Customer.generator(), 15);
        List<Teller> list=new ArrayList<>();
        Generators.fill(list, Teller.generator(), 4);
        for(Customer c:queue){
            serve(list.get(random.nextInt(list.size())), c);
        }
    }
}
