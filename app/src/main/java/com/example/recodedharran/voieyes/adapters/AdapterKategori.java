package com.example.recodedharran.voieyes.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.recodedharran.voieyes.R;
import com.example.recodedharran.voieyes.models.ClassKategori;

import java.util.List;

/**
 * Created by Recodedharran on 28.11.2017.
 */

public class AdapterKategori extends ArrayAdapter<ClassKategori> {
    public AdapterKategori(@NonNull Context context, int resource, @NonNull List<ClassKategori> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v = convertView;
        if (v == null) {
            LayoutInflater vi;
            vi = LayoutInflater.from(getContext());
            v = vi.inflate(R.layout.activity_kategori_class, null);
            ClassKategori obje=getItem(position);
            ImageView icon=v.findViewById(R.id.image_icon);
            TextView kategori_name=v.findViewById(R.id.txt_kategori_adi);
            icon.setImageResource(obje.geticon());
            kategori_name.setText(obje.getName());
        }
        return v;
    }

}
