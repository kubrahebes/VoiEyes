package com.example.recodedharran.voieyes.models;

/**
 * Created by Recodedharran on 28.11.2017.
 */

public class ClassKategori {
    private int Name;
    private int icon;

    public ClassKategori() {

    }

    public ClassKategori(int name, int iconn) {
        Name = name;
        icon = iconn;
    }

    public int getName() {
        return Name;
    }

    public int geticon() {
        return icon;
    }

    public void setName(int name) {
        Name = name;
    }

    public void seticon(int iconn) {
        icon = iconn;

    }
}
