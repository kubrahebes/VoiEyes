package com.example.recodedharran.voieyes.models;

/**
 * Created by Recodedharran on 28.11.2017.
 */

public class ClassTrendler {
    private int profil_resmi;
    private String kullanici_adi;
    private String ses_icerigi;

    public ClassTrendler() {

    }

    public ClassTrendler(int profili, String kullanici_adii, String ses_icerigii) {
        profil_resmi = profili;
        kullanici_adi = kullanici_adii;
        ses_icerigi = ses_icerigii;
    }

    public int getProfil_resmi() {
        return profil_resmi;
    }

    public void setprofil_resmi(int profil_resmii) {
        profil_resmi = profil_resmii;
    }

    public void setKullanici_adi(String name) {
        kullanici_adi = name;
    }

    public void setSes_icerigi(String iconn) {
        ses_icerigi = iconn;

    }

    public String getKullanici_adi() {
        return kullanici_adi;
    }

    public String getSes_icerigi() {
        return ses_icerigi;
    }
}
