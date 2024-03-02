package com.cagri.Q2;

import java.util.Arrays;
import java.util.Queue;
import java.util.Random;

public class PideManager {

    public static Random rndm = new Random();

    public static EPide randomEnum() {
        EPide[] pideler = EPide.values();
        return pideler[rndm.nextInt(pideler.length)];
    }

    public String randomPideUretveDagit(Queue<Customer> customerQ) {
        Random random = new Random();
        int randomIndex = random.nextInt(1, 13);
        String[] temp = new String[randomIndex];

        for (int i = 0; i < randomIndex; i++) {
            temp[i] = Arrays.toString(new String[]{randomEnum().toString()});
        }

        for (int i = 0; i < temp.length; i++) {
            customerQ.poll();
        }
        if (!customerQ.isEmpty()) {
            return "Pide kalmadi!" + "\nPide alamayan musteriler: " + customerQ;
        }
        return "Tum musteriler siparisini teslim aldı! :)";
    }
}


