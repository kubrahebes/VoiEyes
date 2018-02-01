package com.example.recodedharran.voieyes;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.recodedharran.voieyes.adapters.AdapterProfilDetay;
import com.example.recodedharran.voieyes.models.ClassProfilDetay;
import com.example.recodedharran.voieyes.models.MyBounceInterpolator;

import java.util.ArrayList;

/**
 * Created by Recodedharran on 17.12.2017.
 */

public class SesliAramaActivity extends AppCompatActivity {
    ListView liste;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sesli_arama);
        final TextView txtnotfound = findViewById(R.id.notfound);
        liste = findViewById(R.id.sonuclar_liste);
        final ArrayList<ClassProfilDetay> arrayList = new ArrayList<>();
        arrayList.add(new ClassProfilDetay("24 SUB", "Gulay Zen", "Grisimcilik Vakfi "));
        arrayList.add(new ClassProfilDetay("18 Kas", "Canan Can", "GirVak "));
        final Button okeybtn = findViewById(R.id.btnok);
        AdapterProfilDetay adapterProfilDetay = new AdapterProfilDetay(SesliAramaActivity.this, R.layout.activity_profildetay_class, arrayList);
        liste.setAdapter(adapterProfilDetay);
        final RelativeLayout relativeLayout=findViewById(R.id.relativ);
        final Button yeni_arama = findViewById(R.id.yeni_arama);
        yeni_arama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AdapterProfilDetay adapter = new AdapterProfilDetay(SesliAramaActivity.this, R.layout.activity_profildetay_class, new ArrayList<ClassProfilDetay>());
                liste.setAdapter(adapter);

                relativeLayout.setVisibility(View.VISIBLE);
                okeybtn.setVisibility(View.VISIBLE);
                txtnotfound.setVisibility(View.VISIBLE);
                txtnotfound.setText("Opss bulunamadi :/ Bunu ilk isteyen sen ol..");
            }
        });
        liste.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(SesliAramaActivity.this, PlayActivity.class);
                intent.putExtra("name", arrayList.get(i).getShared_name());
                intent.putExtra("detay", arrayList.get(i).getShared_detail());
                startActivity(intent);
            }
        });
        yeni_arama.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                final Animation myAnim = AnimationUtils.loadAnimation(SesliAramaActivity.this, R.anim.bounce);

                MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
                myAnim.setInterpolator(interpolator);

                yeni_arama.startAnimation(myAnim);

                return false;
            }
        });
        okeybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SesliAramaActivity.this, "Isteginiz Alindi..", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(SesliAramaActivity.this, ActivityAnaSayfa.class);
                                startActivity(intent);




            }
        });
    }
}
