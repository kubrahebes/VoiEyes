package com.example.recodedharran.voieyes;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ActivityAcilisEkrani extends AppCompatActivity {
ImageView iconn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acilis_ekrani);
     iconn=findViewById(R.id.icon);
        Handler h =new Handler();
        h.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(ActivityAcilisEkrani.this,ActivityGrisSayfasi.class);
                startActivity(intent);
            }
        },2000);


    }
}
