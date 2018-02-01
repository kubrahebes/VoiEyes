package com.example.recodedharran.voieyes;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PlayActivity extends AppCompatActivity {
MediaPlayer mediaPlayer;
int i=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        Intent intent = getIntent();
        final String kullanici_adi = intent.getStringExtra("name");
        String  detay=intent.getStringExtra("detay");
        TextView txt_kullanici_adi=findViewById(R.id.name);
        TextView txt_detay=findViewById(R.id.detay);
        txt_detay.setText(detay);
        txt_kullanici_adi.setText(kullanici_adi);
        final Button btn_play=findViewById(R.id.play);
        mediaPlayer = MediaPlayer.create(PlayActivity.this, R.raw.merve_ses);
     //   mediaPlayer.start();
        btn_play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i++;
                if (i%2==0){
                    btn_play.setBackgroundResource(R.drawable.play);
                    mediaPlayer.start();

                }
                else
                    mediaPlayer.pause();
                btn_play.setBackgroundResource(R.drawable.stop);
            }
        });

    }
}
