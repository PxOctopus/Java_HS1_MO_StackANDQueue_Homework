package com.cagri.Q2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;

public class TestQ2 {
    public static void main(String[] args) {

        Customer customer1 = new Customer("Musteri #1");
        Customer customer2 = new Customer("Musteri #2");
        Customer customer3 = new Customer("Musteri #3");
        Customer customer4 = new Customer("Musteri #4");
        Customer customer5 = new Customer("Musteri #5");
        Customer customer6 = new Customer("Musteri #6");
        Customer customer7 = new Customer("Musteri #7");
        Customer customer8 = new Customer("Musteri #8");
        Customer customer9 = new Customer("Musteri #9");
        Customer customer10 = new Customer("Musteri #10");


        Queue<Customer> customerQ = new ArrayBlockingQueue<>(10);

        customerQ.offer(customer1);
        customerQ.offer(customer2);
        customerQ.offer(customer3);
        customerQ.offer(customer4);
        customerQ.offer(customer5);
        customerQ.offer(customer6);
        customerQ.offer(customer7);
        customerQ.offer(customer8);
        customerQ.offer(customer9);
        customerQ.offer(customer10);



        PideManager pideManager = new PideManager();
//        System.out.println(Arrays.toString(pideManager.randomPideUret()));

        System.out.println(pideManager.randomPideUretveDagit(customerQ));
    }
}
