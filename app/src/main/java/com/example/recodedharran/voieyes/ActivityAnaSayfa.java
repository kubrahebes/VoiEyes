package com.example.recodedharran.voieyes;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import com.example.recodedharran.voieyes.Fragments.FragmentKategoriSayfasi;
import com.example.recodedharran.voieyes.Fragments.FragmentProfilimSayfasi;
import com.example.recodedharran.voieyes.Fragments.FragmentTrendlerSayfasi;
import com.example.recodedharran.voieyes.Fragments.FragmentVoiEkleSayfasi;
import com.example.recodedharran.voieyes.models.MyBounceInterpolator;

public class ActivityAnaSayfa extends AppCompatActivity {

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    private SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ana_sayfa);
        final Button arama = findViewById(R.id.sesli_arama_button);

        arama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent1 = new Intent(ActivityAnaSayfa.this, SesliAramaActivity.class);
                startActivity(intent1);
            }
        });


arama.setOnTouchListener(new View.OnTouchListener() {
    @Override
    public boolean onTouch(View v, MotionEvent event) {

        final Animation myAnim = AnimationUtils.loadAnimation(ActivityAnaSayfa.this, R.anim.bounce);

        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);

        arama.startAnimation(myAnim);
        return false;
    }
});

        Button profil = findViewById(R.id.profilim);
        profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(ActivityAnaSayfa.this, ActivityProfilSayfasi2.class);
               startActivity(intent);
            }
        });
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);

        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(mViewPager));


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_ana_sayfa, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {

            switch (position) {
                case 0:
                    FragmentKategoriSayfasi kategoriSayfasi = new FragmentKategoriSayfasi();
                    return kategoriSayfasi;

                case 1:
                    FragmentTrendlerSayfasi trendlerSayfasi = new FragmentTrendlerSayfasi();
                    return trendlerSayfasi;
                case 2:
                    FragmentVoiEkleSayfasi voiEkleSayfasi = new FragmentVoiEkleSayfasi();
                    return voiEkleSayfasi;
                case 3:
                    FragmentProfilimSayfasi profilimSayfasi = new FragmentProfilimSayfasi();
                    return profilimSayfasi;
                default:
                    return null;

            }
        }

        @Override
        public int getCount() {
            // Show 4 total pages.
            return 4;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "TAB1";
                case 1:
                    return "TAB2";
                case 2:
                    return "TAB3";
                case 3:
                    return "TAB4";


            }
            return null;
        }
    }

}

