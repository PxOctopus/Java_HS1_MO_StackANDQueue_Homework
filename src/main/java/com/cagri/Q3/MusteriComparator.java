package com.cagri.Q3;

import java.util.Comparator;

public class MusteriComparator implements Comparator<Musteri>{
    //V1 Benim yaptığım:
    @Override
    public int compare(Musteri o1, Musteri o2) {
        if (!o1.isMusteriMi() && !o2.isMusteriMi()) {
            if (o1.getSiraNo() > o2.getSiraNo()) {
                return 1;
            } else
                return -1;
        } else if (o1.isMusteriMi() && !o2.isMusteriMi()) {
            return -1;
        } else
            return 1;
    }


}
