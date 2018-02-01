package com.example.recodedharran.voieyes.Fragments;

import android.support.v4.app.Fragment;;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.recodedharran.voieyes.R;
import com.example.recodedharran.voieyes.adapters.AdapterVoiEkle;
import com.example.recodedharran.voieyes.models.ClassVoiEkle;

import java.util.ArrayList;

/**
 * Created by Recodedharran on 27.11.2017.
 */

public class FragmentVoiEkleSayfasi extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_voi_ekle_sayfasi, container, false);
        ListView listView_voiekle=rootView.findViewById(R.id.listview_voiekle);
        ArrayList<ClassVoiEkle>arrayList_voiekle=new ArrayList<>();
        arrayList_voiekle.add(new ClassVoiEkle("06 OCA","Kubra Bozkurt","Harran universitesi Akademik takvim ?",7 ));
        arrayList_voiekle.add(new ClassVoiEkle("15 MAY","Kubra Hebes","15 Mayis Gundem Basliklari Nelerdir ?",1 ));
        arrayList_voiekle.add(new ClassVoiEkle("18 SUB","Merve Hancioglu","Gitar Akoru Nasil Yapilir ?" ,2));
        arrayList_voiekle.add(new ClassVoiEkle("01 KAS","Kubra Bozkurt","Sabah Gazetesi Mahsetler Nelerdir ?",3 ));
        arrayList_voiekle.add(new ClassVoiEkle("18 SUB","Merve Hancioglu","30.11.2017 Nuray Sayari kova burcu yorumu..",4 ));
        arrayList_voiekle.add(new ClassVoiEkle("30 KAS","Arzu Gun","Gribe Iyi Gelen Meyveler Nelerdir ?" ,5));
        arrayList_voiekle.add(new ClassVoiEkle("25 NIS","Ayse Nur","Bilgisayar Muhendisligi Ders Notlari.." ,6));
        AdapterVoiEkle adapterVoiEkle =new AdapterVoiEkle(getContext(),R.layout.activity_voiekle_class,arrayList_voiekle);
        listView_voiekle.setAdapter(adapterVoiEkle);
        return rootView;
    }}
