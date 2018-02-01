package com.example.recodedharran.voieyes;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Recodedharran on 29.11.2017.
 */

public class ActivityVoiEkle extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voiekle);
        Intent intent = getIntent();
        String icerikk = intent.getStringExtra("icerik");
        String kategorii = intent.getStringExtra("kategori");
        String kullanici = intent.getStringExtra("kullanici_adi");

        TextView share_name = findViewById(R.id.share_name);
        TextView kategori = findViewById(R.id.add_kategori);
        TextView icerik = findViewById(R.id.add_title);
        TextView adree = findViewById(R.id.adress);

        icerik.setText(icerikk);
        kategori.setText(kategorii);
        share_name.setText(kullanici);
        adree.setText(kullanici);


    }
}
