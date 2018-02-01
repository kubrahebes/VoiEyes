package com.example.recodedharran.voieyes.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import com.example.recodedharran.voieyes.ActivityVoiEkle;
import com.example.recodedharran.voieyes.R;
import com.example.recodedharran.voieyes.models.ClassProfilDetay;
import com.example.recodedharran.voieyes.models.ClassVoiEkle;

import java.util.List;

/**
 * Created by Recodedharran on 29.11.2017.
 */

public class AdapterProfilDetay extends ArrayAdapter<ClassProfilDetay> {

    public AdapterProfilDetay(@NonNull Context context, int resource, @NonNull List<ClassProfilDetay> objects) {
        super(context, resource, objects);
    }   @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v = convertView;
        if (v == null) {
            LayoutInflater vi;
            vi = LayoutInflater.from(getContext());
            v = vi.inflate(R.layout.activity_profildetay_class, null);
            ClassProfilDetay obje = getItem(position);
            TextView txt_date = v.findViewById(R.id.date);
            TextView txt_name = v.findViewById(R.id.kullanici_adi);
            TextView txt_detay = v.findViewById(R.id.ses_icerigi);
            txt_date.setText(obje.getDate());
            txt_name.setText(obje.getShared_name());
            txt_detay.setText(obje.getShared_detail());


        }
        return v;
}}
