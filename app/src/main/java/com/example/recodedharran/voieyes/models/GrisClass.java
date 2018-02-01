package com.example.recodedharran.voieyes.models;

/**
 * Created by Recodedharran on 30.12.2017.
 */

public class GrisClass {
    public String kullaniciadi;
    public String sifre;

    public GrisClass(String kullaniciadi, String sifre) {
        this.kullaniciadi = kullaniciadi;
        this.sifre = sifre;
    }

    public GrisClass() {
    }

    public String getKullaniciadi() {
        return kullaniciadi;
    }

    public void setKullaniciadi(String kullaniciadi) {
        this.kullaniciadi = kullaniciadi;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }
}
