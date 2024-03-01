package com.cagri.Q3;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class TestQ3 {
    public static void main(String[] args) {
        Musteri musteri1 = new Musteri("Cagri","Gumuskaptan", 1,false );
        Musteri musteri2= new Musteri("Sevgin","Gumuskaptan", 2,true );
        Musteri musteri3 = new Musteri("Oyku","Buyukbay", 3,true );
        Musteri musteri4 = new Musteri("Erman","Caglar", 4,false );
        Musteri musteri5 = new Musteri("Ozan","Akyol", 5,true );
        Musteri musteri6 = new Musteri("Hasan","Inceler", 6,false );




        Queue<Musteri> bankaQ = new PriorityQueue<>(6,new MusteriComparator());
        bankaQ.offer(musteri1);
        bankaQ.offer(musteri2);
        bankaQ.offer(musteri3);
        bankaQ.offer(musteri4);
        bankaQ.offer(musteri5);
        bankaQ.offer(musteri6);

        while(!bankaQ.isEmpty()){
            System.out.println(bankaQ.poll());
        }
    }

}
