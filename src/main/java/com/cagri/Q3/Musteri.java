package com.cagri.Q3;

public class Musteri {
    private String ad;
    private String soyAd;
    private int siraNo;
    private boolean musteriMi;

    public Musteri(String ad, String soyAd, int siraNo, boolean musteriMi) {
        this.ad = ad;
        this.soyAd = soyAd;
        this.siraNo = siraNo;
        this.musteriMi = musteriMi;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyAd() {
        return soyAd;
    }

    public void setSoyAd(String soyAd) {
        this.soyAd = soyAd;
    }

    public int getSiraNo() {
        return siraNo;
    }

    public void setSiraNo(int siraNo) {
        this.siraNo = siraNo;
    }

    public boolean isMusteriMi() {
        return musteriMi;
    }

    public void setMusteriMi(boolean musteriMi) {
        this.musteriMi = musteriMi;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Musteri{");
        sb.append("ad='").append(ad).append('\'');
        sb.append(", soyAd='").append(soyAd).append('\'');
        sb.append(", siraNo=").append(siraNo);
        sb.append(", musteriMi=").append(musteriMi);
        sb.append('}');
        return sb.toString();
    }
}
