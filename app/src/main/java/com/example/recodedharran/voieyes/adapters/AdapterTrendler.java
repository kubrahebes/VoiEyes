package com.example.recodedharran.voieyes.adapters;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.recodedharran.voieyes.ActivityProfilSayfasi;
import com.example.recodedharran.voieyes.ActivityTrendlerDetay;
import com.example.recodedharran.voieyes.R;
import com.example.recodedharran.voieyes.models.ClassTrendler;

import java.io.ByteArrayOutputStream;
import java.util.List;

/**
 * Created by Recodedharran on 28.11.2017.
 */

public class AdapterTrendler extends ArrayAdapter<ClassTrendler> {
    public AdapterTrendler(@NonNull Context context, int resource, @NonNull List<ClassTrendler> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v = convertView;
        if (v == null) {
            LayoutInflater vi;
            vi = LayoutInflater.from(getContext());
            v = vi.inflate(R.layout.activity_trendler_class, null);
            final ClassTrendler obje = getItem(position);
            Button btn = v.findViewById(R.id.play);
            ImageView image_profil = v.findViewById(R.id.image_icon);
            TextView txt_kullanici_adi = v.findViewById(R.id.kullanici_adi);
            TextView txt_ses_icerigi = v.findViewById(R.id.ses_icerigi);
            txt_kullanici_adi.setText(obje.getKullanici_adi());
            txt_ses_icerigi.setText(obje.getSes_icerigi());
            image_profil.setImageResource(obje.getProfil_resmi());
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Bitmap bmp = BitmapFactory.decodeResource(getContext().getResources(), obje.getProfil_resmi());
                    ByteArrayOutputStream stream = new ByteArrayOutputStream();
                    bmp.compress(Bitmap.CompressFormat.PNG, 100, stream);
                    byte[] byteArray = stream.toByteArray();
                    Intent intent = new Intent(getContext(), ActivityProfilSayfasi.class);
                    intent.putExtra("kullanici_adi", obje.getKullanici_adi());
                    intent.putExtra("detay", obje.getSes_icerigi());
                    intent.putExtra("resim", byteArray);
                    intent.putExtra("kullanici_turu", "misafir");
                    getContext().startActivity(intent);
                }
            });
        }
        return v;
    }

}
