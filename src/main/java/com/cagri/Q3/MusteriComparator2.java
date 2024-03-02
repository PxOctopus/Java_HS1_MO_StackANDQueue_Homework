package com.cagri.Q3;

public class MusteriComparator2 implements Comparable<Musteri> {
    //V2
    @Override
    public int compareTo(Musteri o) {
        if (o.isMusteriMi()) {
            return -1;
        } else {
            return 1;
        }
    }
}
