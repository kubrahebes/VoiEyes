package com.example.recodedharran.voieyes.Fragments;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.recodedharran.voieyes.R;
import com.example.recodedharran.voieyes.adapters.AdapterTrendler;
import com.example.recodedharran.voieyes.models.ClassTrendler;

import java.util.ArrayList;

/**
 * Created by Recodedharran on 27.11.2017.
 */

public class FragmentTrendlerSayfasi extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_trendler_sayfasi, container, false);
        ListView listView_trendler= rootView.findViewById(R.id.listview_trend);
        ArrayList<ClassTrendler>trendlerArrayList=new ArrayList<>();
        trendlerArrayList.add(new ClassTrendler(R.drawable.profil1,"Mesut Sure","RABARDA"));
        trendlerArrayList.add(new ClassTrendler(R.drawable.profil3,"Ahmet Kara","GEVEZE SHOW"));
        trendlerArrayList.add(new ClassTrendler(R.drawable.profil2,"Aliye Gun","SOCRATES DUKKAN"));
        trendlerArrayList.add(new ClassTrendler(R.drawable.profil5,"Aysem Gul","FARFARA PAZARLAMA"));
        trendlerArrayList.add(new ClassTrendler(R.drawable.porofil4,"Mehmet Can","GENEL KULTURLENDIRIYORUZ"));
        trendlerArrayList.add(new ClassTrendler(R.drawable.profil6,"Mrat Kilic","MYSTERY GUEST"));
        AdapterTrendler adapterTrendler=new AdapterTrendler(getContext(),R.layout.activity_trendler_class,trendlerArrayList);
        listView_trendler.setAdapter(adapterTrendler);

        return rootView;
    }
}
