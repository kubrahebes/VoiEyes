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
import com.example.recodedharran.voieyes.models.ClassKategoriDetay;

import java.util.List;

/**
 * Created by Recodedharran on 30.11.2017.
 */

public class AdapterKategoriDetay extends ArrayAdapter<ClassKategoriDetay> {
    public AdapterKategoriDetay(@NonNull Context context, int resource, @NonNull List<ClassKategoriDetay> objects) {
        super(context, resource, objects);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v = convertView;
        if (v == null) {
            LayoutInflater vi;
            vi = LayoutInflater.from(getContext());
            v = vi.inflate(R.layout.activity_kategori_detay_class, null);
            ClassKategoriDetay obje = getItem(position);
            ImageView image_profil = v.findViewById(R.id.image_icon);
            TextView txt_kullanici_adi = v.findViewById(R.id.kullanici_adi);
            TextView txt_ses_icerigi = v.findViewById(R.id.ses_icerigi);
            txt_kullanici_adi.setText(obje.getKullanici_adi());
            txt_ses_icerigi.setText(obje.getSes_icerigi());
            image_profil.setImageResource(obje.getProfil_resmi());

        }
        return v;
    }
}
