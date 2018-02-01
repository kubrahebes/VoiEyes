package com.example.recodedharran.voieyes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.recodedharran.voieyes.adapters.AdapterVoiEkle;
import com.example.recodedharran.voieyes.models.ClassVoiEkle;

import java.util.ArrayList;

public class ActivityTrendlerDetay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trendler_detay);
        ListView listView_trendler= findViewById(R.id.trend_detay);
        ArrayList<ClassVoiEkle>arrayList_voiekle=new ArrayList<>();
        arrayList_voiekle.add(new ClassVoiEkle("15 MAY","Kubra Hebes","Kiymali Su Boregi Tarifi ?" ));
        arrayList_voiekle.add(new ClassVoiEkle("18 SUB","Merve Hancioglu","Sunum Makyaji Nasil Yapilir ?" ));
        arrayList_voiekle.add(new ClassVoiEkle("01 KAS","Kubra Bozkurt","Dogun Haritasi Nasil Cikartilir ?" ));
        arrayList_voiekle.add(new ClassVoiEkle("18 SUB","Merve Hancioglu","30.11.2017 Nuray Sayari kova burcu yorumu.." ));
        arrayList_voiekle.add(new ClassVoiEkle("30 KAS","Arzu Gun","Grie Iyi Gelen Meyveler Nelerdir ?" ));
        arrayList_voiekle.add(new ClassVoiEkle("25 NIS","Ayse Nur","Bilgisayar Muhendisligi Ders Notlari.." ));
        AdapterVoiEkle adapterVoiEkle =new AdapterVoiEkle(ActivityTrendlerDetay.this,R.layout.activity_voiekle_class,arrayList_voiekle);
        listView_trendler.setAdapter(adapterVoiEkle);
    }
}
