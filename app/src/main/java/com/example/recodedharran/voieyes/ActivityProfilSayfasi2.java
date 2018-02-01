package com.example.recodedharran.voieyes;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.recodedharran.voieyes.adapters.AdapterProfilDetay;
import com.example.recodedharran.voieyes.models.ClassProfilDetay;

import java.util.ArrayList;

public class ActivityProfilSayfasi2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil_sayfasi2);
        Button btn = findViewById(R.id.add);


        Button btn_geri = findViewById(R.id.ic_back);
        ListView listView = findViewById(R.id.share_voi_list);
        final ArrayList<ClassProfilDetay> arrayList_voiekle = new ArrayList<>();
        arrayList_voiekle.add(new ClassProfilDetay("15 MAY"," Ayse Nurdan", "Haftalik Dersler 11"));
        arrayList_voiekle.add(new ClassProfilDetay("18 SUB", " Ayse Nurdan", "Haftalik Dersler 10 "));
        arrayList_voiekle.add(new ClassProfilDetay("01 KAS", " Ayse Nurdan", "Haftalik Dersler 9"));
        arrayList_voiekle.add(new ClassProfilDetay("18 SUB", " Ayse Nurdan", "Haftalik Dersler 8"));
        arrayList_voiekle.add(new ClassProfilDetay("30 KAS", " Ayse Nurdan", "Haftalik Dersler 7"));
        arrayList_voiekle.add(new ClassProfilDetay("25 NIS", " Ayse Nurdan", "Haftalik Dersler 6"));
        AdapterProfilDetay adapterVoiEkle = new AdapterProfilDetay(ActivityProfilSayfasi2.this, R.layout.activity_profildetay_class, arrayList_voiekle);
        listView.setAdapter(adapterVoiEkle);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(ActivityProfilSayfasi2.this, PlayActivity.class);
                intent.putExtra("name", arrayList_voiekle.get(i).getShared_name());
                intent.putExtra("detay", arrayList_voiekle.get(i).getShared_detail());
                startActivity(intent);
            }
        });

btn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent =new Intent(ActivityProfilSayfasi2.this,ActivityVoiEkle.class);
        intent.putExtra("icerik","Haftalik Dersler 12");
        intent.putExtra("kategori","EGTIM");
        intent.putExtra("kullanici_adi","Ayse Nurdan");
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
