package com.example.rajkumar.admobe_banner_ad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //View adContainer = findViewById(R.id.adMob);
        MobileAds.initialize(this,"ca-app-pub-6467211839715338~3943760206");
//        showNativeAd();


        AdView adView = (AdView) this.findViewById(R.id.adMob);
        //request TEST ads to avoid being disabled for clicking your own ads
        AdRequest adRequest = new AdRequest.Builder()
                //.addTestDevice(AdRequest.DEVICE_ID_EMULATOR)// This is for emulators
                //test mode on DEVICE (this example code must be replaced with your device uniquq ID)
                .addTestDevice("23B29F690F8BFBF8928A846E75BDFA90") // Nexus 5
                .build();
        adView.loadAd(adRequest);

        Button b1 = (Button) findViewById(R.id.button2);
        Button b2 = (Button) findViewById(R.id.button3);
        Button b3 = (Button) findViewById(R.id.button4);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Upper.class));
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Bottom.class));
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Both.class));
            }
        });
    }
}
