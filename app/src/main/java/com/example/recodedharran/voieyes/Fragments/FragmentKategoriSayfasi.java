package com.example.recodedharran.voieyes.Fragments;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.recodedharran.voieyes.ActivityKategoriDetay;
import com.example.recodedharran.voieyes.R;
import com.example.recodedharran.voieyes.adapters.AdapterKategori;
import com.example.recodedharran.voieyes.models.ClassKategori;

import java.util.ArrayList;

/**
 * Created by Recodedharran on 27.11.2017.
 */

public class FragmentKategoriSayfasi extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_kategoriler_sayfasi, container, false);
        ListView kategori_listview=rootView.findViewById(R.id.kategori_list);
        final ArrayList<ClassKategori>list_kategori=new ArrayList<>();
        list_kategori.add(new ClassKategori(R.string.kategori1,R.drawable.ic_ic_egtim1));
        list_kategori.add(new ClassKategori(R.string.kategori2,R.drawable.ic_ic_muzik1));
        list_kategori.add(new ClassKategori(R.string.kategori3,R.drawable.ic_ic_sanat));
        list_kategori.add(new ClassKategori(R.string.kategori4,R.drawable.ic_interview_microphone_1));
        list_kategori.add(new ClassKategori(R.string.kategori5,R.drawable.ic_health_care_3));
        list_kategori.add(new ClassKategori(R.string.kategori6,R.drawable.ic_ic_aile));
        list_kategori.add(new ClassKategori(R.string.kategori7,R.drawable.ic_ic_teknoloji));


        AdapterKategori adapter=new AdapterKategori(getContext(),R.layout.activity_kategori_class,list_kategori);
        kategori_listview.setAdapter(adapter);

        kategori_listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent=new Intent(getContext(),ActivityKategoriDetay.class);
               intent.putExtra("secilen_kategori",list_kategori.get(i).getName());
                //Toast.makeText(getContext(), list_kategori.get(i).getName(), Toast.LENGTH_SHORT).show();
                getContext().startActivity(intent);

            }
        });
        return rootView;
    }
}

