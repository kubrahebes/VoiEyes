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
import com.example.recodedharran.voieyes.models.ClassVoiEkle;

import java.util.List;

/**
 * Created by Recodedharran on 29.11.2017.
 */

public class AdapterVoiEkle extends ArrayAdapter<ClassVoiEkle> {
    public AdapterVoiEkle(@NonNull Context context, int resource, @NonNull List<ClassVoiEkle> objects) {
        super(context, resource, objects);
    }
    String kategori = null;
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v = convertView;
        if (v == null) {
            LayoutInflater vi;
            vi = LayoutInflater.from(getContext());
            v = vi.inflate(R.layout.activity_voiekle_class, null);
            final ClassVoiEkle obje = getItem(position);
            TextView txt_date = v.findViewById(R.id.date);
            TextView txt_name = v.findViewById(R.id.kullanici_adi);
            TextView txt_detay = v.findViewById(R.id.ses_icerigi);
            Button btn_voiekle = v.findViewById(R.id.voi_ekle);
            txt_date.setText(obje.getDate());
            txt_name.setText(obje.getShared_name());
            txt_detay.setText(obje.getShared_detail());

            if (obje.getId()==1){
                kategori="HABER";
            }else if (obje.getId()==2){
                kategori="MUZIK";
            }else if (obje.getId()==3){
                kategori="HABER";
            }else if (obje.getId()==4){
                kategori="HABER";
            }else if (obje.getId()==5){
                kategori="SAGLIK";
            }else if (obje.getId()==6){
                kategori="EGITIM";
            }else if (obje.getId()==7){
                kategori="EGITIM";
            }

            btn_voiekle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getContext(), ActivityVoiEkle.class);
                    intent.putExtra("icerik",obje.getShared_detail());
                    intent.putExtra("kategori",kategori);
                    intent.putExtra("kullanici_adi",obje.getShared_name());
                    getContext().startActivity(intent);
                }
            });

        }
        return v;
    }
}
