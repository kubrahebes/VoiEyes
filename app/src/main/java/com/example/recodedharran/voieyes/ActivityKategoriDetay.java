package com.example.recodedharran.voieyes;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.recodedharran.voieyes.adapters.AdapterKategoriDetay;
import com.example.recodedharran.voieyes.models.ClassKategoriDetay;
import com.example.recodedharran.voieyes.models.ClassTrendler;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

public class ActivityKategoriDetay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kategori_detay);

        Intent intent = getIntent();
        int secilen_kategori = intent.getIntExtra("secilen_kategori",0);
       String.valueOf(secilen_kategori);
     //   Toast.makeText(this, secilen_kategori, Toast.LENGTH_SHORT).show();
        TextView txt = findViewById(R.id.kategori_name);
        txt.setText(secilen_kategori);
        Button btn_geri = findViewById(R.id.ic_back);
        btn_geri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        ListView listView = findViewById(R.id.kategori_detay);
        final ArrayList<ClassKategoriDetay> arrayList = new ArrayList<>();
        if (secilen_kategori==R.string.kategori1){
            arrayList.add(new ClassKategoriDetay(R.drawable.egtim_profil1,"Can Gun","Ingilizce Ogren"));
            arrayList.add(new ClassKategoriDetay(R.drawable.egtim_profil2,"Kaya Kus","Her Gune Grammer"));
            arrayList.add(new ClassKategoriDetay(R.drawable.egtim_profil3,"Ayse Gunes","Cocuk Sagligi"));
            arrayList.add(new ClassKategoriDetay(R.drawable.oyun_profil1,"Tum dunya","Hitit Gunesi"));
            arrayList.add(new ClassKategoriDetay(R.drawable.oyun_profil2,"Hasan Kucuk","The PilotCast"));
            arrayList.add(new ClassKategoriDetay(R.drawable.oyun_profil3,"Murat Can","Aviator Cast"));
            arrayList.add(new ClassKategoriDetay(R.drawable.aile_profil1,"Michael ","Michael ile Hikayeler"));
            arrayList.add(new ClassKategoriDetay(R.drawable.aile_profil2,"muzeyyen Has","Cocuk Hikayeleri"));
            arrayList.add(new ClassKategoriDetay(R.drawable.aile_profil3,"Melehat ile Oyun","Lego Oyun Dunyasi"));
        }
        else  if (secilen_kategori==(R.string.kategori2)){
            arrayList.add(new ClassKategoriDetay(R.drawable.muzik_profil1,"Nisan Fa","Metro FM"));
            arrayList.add(new ClassKategoriDetay(R.drawable.muzik_profil2,"Lale Kilic","Virgin Radio"));
            arrayList.add(new ClassKategoriDetay(R.drawable.muzik_profil3,"Cenk ","Cenk &Erdem"));
            arrayList.add(new ClassKategoriDetay(R.drawable.muzik_profil1,"Levent Dur","Muzigin Baska Turlusu"));
            arrayList.add(new ClassKategoriDetay(R.drawable.muzik_profil2,"Mesut Sure","Joy Turk "));
            arrayList.add(new ClassKategoriDetay(R.drawable.muzik_profil3,"Super Konuk ","Super FM"));
            arrayList.add(new ClassKategoriDetay(R.drawable.saglik_profil1,"Fatih Can ","Grip den Korunma"));
            arrayList.add(new ClassKategoriDetay(R.drawable.saglik_profil2,"Mine Tek","Kilo Kontrol"));
            arrayList.add(new ClassKategoriDetay(R.drawable.saglik_profil3,"Melek Gunes","Cocuklarda Ates"));
        }
        else  if (secilen_kategori==(R.string.kategori3)){
            arrayList.add(new ClassKategoriDetay(R.drawable.sanat_profil1,"Acik Radio","Dunya Mirasi Adalar"));
            arrayList.add(new ClassKategoriDetay(R.drawable.sanat_profil2,"Mavi Hayat","Kitap Kokusu"));
            arrayList.add(new ClassKategoriDetay(R.drawable.sanat_3,"Gulistan ","Acik Dergi"));
            arrayList.add(new ClassKategoriDetay(R.drawable.sanat_profil1,"Tuba Ocak","Acik Mimari"));
            arrayList.add(new ClassKategoriDetay(R.drawable.sanat_profil2,"Zehra Haslak","Sanat Uzun Ilham Sonsuz"));
            arrayList.add(new ClassKategoriDetay(R.drawable.sanat_3,"Mine Tek ","Gerisi Hikaye"));
            arrayList.add(new ClassKategoriDetay(R.drawable.saglik_profil1,"Fatih Can ","Grip den Korunma"));
            arrayList.add(new ClassKategoriDetay(R.drawable.saglik_profil2,"Mine Tek","Kilo Kontrol"));
            arrayList.add(new ClassKategoriDetay(R.drawable.saglik_profil3,"Melek Gunes","Cocuklarda Ates"));
            arrayList.add(new ClassKategoriDetay(R.drawable.sanat_profil1,"Tuba Ocak","Acik Mimari"));
        }
        else  if (secilen_kategori==(R.string.kategori4)){
            arrayList.add(new ClassKategoriDetay(R.drawable.oyun_profil1,"Ramazan Cilgin","Serbest Oyun Imalati"));
            arrayList.add(new ClassKategoriDetay(R.drawable.oyun_profil2,"Mario-WL","Gott und WL"));
            arrayList.add(new ClassKategoriDetay(R.drawable.oyun_profil3,"Grand Auto","GTA Cast"));
            arrayList.add(new ClassKategoriDetay(R.drawable.oyun_profil1,"Tum dunya","Hitit Gunesi"));
            arrayList.add(new ClassKategoriDetay(R.drawable.oyun_profil2,"Hasan Kucuk","The PilotCast"));
            arrayList.add(new ClassKategoriDetay(R.drawable.oyun_profil3,"Murat Can","Aviator Cast"));
            arrayList.add(new ClassKategoriDetay(R.drawable.aile_profil2,"muzeyyen Has","Cocuk Hikayeleri"));
            arrayList.add(new ClassKategoriDetay(R.drawable.aile_profil3,"Melehat ile Oyun","Lego Oyun Dunyasi"));
            arrayList.add(new ClassKategoriDetay(R.drawable.muzik_profil1,"Levent Dur","Muzigin Baska Turlusu"));
            arrayList.add(new ClassKategoriDetay(R.drawable.muzik_profil2,"Mesut Sure","Joy Turk "));

        }
        else  if (secilen_kategori==(R.string.kategori5)){
            arrayList.add(new ClassKategoriDetay(R.drawable.saglik_profil1,"Aylin Dizi ","Yoga Zamani"));
            arrayList.add(new ClassKategoriDetay(R.drawable.saglik_profil2,"Deniz Bahar","Saglikli Hayat Sirlari"));
            arrayList.add(new ClassKategoriDetay(R.drawable.saglik_profil3,"Melek Gunes","Evde Meditasyon"));
            arrayList.add(new ClassKategoriDetay(R.drawable.saglik_profil1,"Fatih Can ","Grip den Korunma"));
            arrayList.add(new ClassKategoriDetay(R.drawable.saglik_profil2,"Mine Tek","Kilo Kontrol"));
            arrayList.add(new ClassKategoriDetay(R.drawable.saglik_profil3,"Melek Gunes","Cocuklarda Ates"));
            arrayList.add(new ClassKategoriDetay(R.drawable.sanat_profil1,"Tuba Ocak","Acik Mimari"));
            arrayList.add(new ClassKategoriDetay(R.drawable.sanat_profil2,"Zehra Haslak","Sanat Uzun Ilham Sonsuz"));
            arrayList.add(new ClassKategoriDetay(R.drawable.sanat_3,"Mine Tek ","Gerisi Hikaye"));
        }
        else  if (secilen_kategori==(R.string.kategori6)){
            arrayList.add(new ClassKategoriDetay(R.drawable.aile_profil1,"Michael ","Michael ile Hikayeler"));
            arrayList.add(new ClassKategoriDetay(R.drawable.aile_profil2,"muzeyyen Has","Cocuk Hikayeleri"));
            arrayList.add(new ClassKategoriDetay(R.drawable.aile_profil3,"Melehat ile Oyun","Lego Oyun Dunyasi"));
            arrayList.add(new ClassKategoriDetay(R.drawable.aile_profil1,"Michael ","Michael ile Hikayeler"));
            arrayList.add(new ClassKategoriDetay(R.drawable.aile_profil2,"muzeyyen Has","Cocuk Hikayeleri"));
            arrayList.add(new ClassKategoriDetay(R.drawable.aile_profil3,"Melehat ile Oyun","Lego Oyun Dunyasi"));
            arrayList.add(new ClassKategoriDetay(R.drawable.muzik_profil1,"Levent Dur","Muzigin Baska Turlusu"));
            arrayList.add(new ClassKategoriDetay(R.drawable.muzik_profil2,"Mesut Sure","Joy Turk "));
            arrayList.add(new ClassKategoriDetay(R.drawable.muzik_profil3,"Super Konuk ","Super FM"));
        } else  if (secilen_kategori==(R.string.kategori7)){
            arrayList.add(new ClassKategoriDetay(R.drawable.aile_profil1,"Michael ","Michael ile Hikayeler"));
            arrayList.add(new ClassKategoriDetay(R.drawable.aile_profil2,"muzeyyen Has","Cocuk Hikayeleri"));
            arrayList.add(new ClassKategoriDetay(R.drawable.aile_profil3,"Melehat ile Oyun","Lego Oyun Dunyasi"));
            arrayList.add(new ClassKategoriDetay(R.drawable.aile_profil1,"Michael ","Michael ile Hikayeler"));
            arrayList.add(new ClassKategoriDetay(R.drawable.aile_profil2,"muzeyyen Has","Cocuk Hikayeleri"));
            arrayList.add(new ClassKategoriDetay(R.drawable.aile_profil3,"Melehat ile Oyun","Lego Oyun Dunyasi"));
            arrayList.add(new ClassKategoriDetay(R.drawable.muzik_profil1,"Levent Dur","Muzigin Baska Turlusu"));
            arrayList.add(new ClassKategoriDetay(R.drawable.muzik_profil2,"Mesut Sure","Joy Turk "));
            arrayList.add(new ClassKategoriDetay(R.drawable.muzik_profil3,"Super Konuk ","Super FM"));
        }

        AdapterKategoriDetay adapterTrendler = new AdapterKategoriDetay(ActivityKategoriDetay.this, R.layout.activity_kategori_detay_class, arrayList);
        listView.setAdapter(adapterTrendler);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Bitmap bmp = BitmapFactory.decodeResource(getResources(), arrayList.get(i).getProfil_resmi());
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bmp.compress(Bitmap.CompressFormat.PNG, 100, stream);
                byte[] byteArray = stream.toByteArray();

                Intent intent = new Intent(ActivityKategoriDetay.this, ActivityProfilSayfasi.class);
                intent.putExtra("kullanici_adi", arrayList.get(i).getKullanici_adi());
                intent.putExtra("detay", arrayList.get(i).getSes_icerigi());
                intent.putExtra("resim", byteArray);
                intent.putExtra("kullanici_turu","misafir");
                startActivity(intent);
            }
        });
    }
}
