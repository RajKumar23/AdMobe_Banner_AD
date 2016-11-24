package com.example.rajkumar.admobe_banner_ad;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

/**
 * Created by Rajkumar on 23-11-2016.
 */

public class Bottom extends AppCompatActivity {

    String[] List = { "Alpha", "Beta",
            "Cupcake", "Donut", "Eclair", "Froyo", "Gingerbread", "Honeycomb",
            "Ice Cream Sandwich", "Jelly Bean", "KitKat", "Lollipop", "Marshmallow", "Nougat"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bottom);

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

        List_adapter adapter1 = new List_adapter(Bottom.this, List);
        ListView listContent = (ListView) findViewById(R.id.list);
        listContent.setAdapter(adapter1);
    }
}
