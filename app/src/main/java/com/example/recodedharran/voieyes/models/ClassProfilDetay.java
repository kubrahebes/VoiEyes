package com.example.recodedharran.voieyes.models;

/**
 * Created by Recodedharran on 29.11.2017.
 */

public class ClassProfilDetay {
    String date;
    private String Shared_name;
    private String shared_detail;

    public ClassProfilDetay(String date, String shared_name, String shared_detail) {
        this.date = date;
        Shared_name = shared_name;
        this.shared_detail = shared_detail;
    }

    public ClassProfilDetay() {
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getShared_name() {
        return Shared_name;
    }

    public void setShared_name(String shared_name) {
        Shared_name = shared_name;
    }

    public String getShared_detail() {
        return shared_detail;
    }

    public void setShared_detail(String shared_detail) {
        this.shared_detail = shared_detail;
    }
}
