package com.example.recodedharran.voieyes;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.recodedharran.voieyes.adapters.AdapterProfilDetay;
import com.example.recodedharran.voieyes.adapters.AdapterVoiEkle;
import com.example.recodedharran.voieyes.models.ClassProfilDetay;
import com.example.recodedharran.voieyes.models.ClassVoiEkle;

import java.util.ArrayList;

public class ActivityProfilSayfasi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil_sayfasi);
        Button btn = findViewById(R.id.add);

        Intent intent = getIntent();

        String kullanici_turu = intent.getStringExtra("kullanici_turu");
        if (kullanici_turu.equals("misafir")) {
            btn.setVisibility(View.GONE);
        } else {
            btn.setVisibility(View.VISIBLE);
        }

        Bundle extras = getIntent().getExtras();
        byte[] byteArray = extras.getByteArray("resim");

        Bitmap bmp = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
        ImageView image_view = (ImageView) findViewById(R.id.profile_image);

        image_view.setImageBitmap(bmp);

       final String kullanici_adi = intent.getStringExtra("kullanici_adi");
        String detay = intent.getStringExtra("detay");
        TextView txt_kullanici_adi = findViewById(R.id.kullanici_adi);
        TextView txt_detay = findViewById(R.id.aciklama);
       txt_detay.setText(detay);
        txt_kullanici_adi.setText(kullanici_adi);
        Button btn_geri = findViewById(R.id.ic_back);
        ListView listView = findViewById(R.id.share_voi_list);
        final ArrayList<ClassProfilDetay> arrayList_voiekle = new ArrayList<>();
        arrayList_voiekle.add(new ClassProfilDetay("15 MAY", kullanici_adi, "Haftalik Dersler 11"));
        arrayList_voiekle.add(new ClassProfilDetay("18 SUB", kullanici_adi, "Haftalik Dersler 10 "));
        arrayList_voiekle.add(new ClassProfilDetay("01 KAS", kullanici_adi, "Haftalik Dersler 9"));
        arrayList_voiekle.add(new ClassProfilDetay("18 SUB", kullanici_adi, "Haftalik Dersler 8"));
        arrayList_voiekle.add(new ClassProfilDetay("30 KAS", kullanici_adi, "Haftalik Dersler 7"));
        arrayList_voiekle.add(new ClassProfilDetay("25 NIS", kullanici_adi, "Haftalik Dersler 6"));
        AdapterProfilDetay adapterVoiEkle = new AdapterProfilDetay(ActivityProfilSayfasi.this, R.layout.activity_profildetay_class, arrayList_voiekle);
        listView.setAdapter(adapterVoiEkle);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(ActivityProfilSayfasi.this, PlayActivity.class);
                intent.putExtra("name", arrayList_voiekle.get(i).getShared_name());
                intent.putExtra("detay", arrayList_voiekle.get(i).getShared_detail());
                startActivity(intent);
            }
        });


        btn_geri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
