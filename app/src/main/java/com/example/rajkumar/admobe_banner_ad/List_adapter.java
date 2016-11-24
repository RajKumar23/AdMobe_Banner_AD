package com.example.rajkumar.admobe_banner_ad;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.NativeExpressAdView;

/**
 * Created by Rajkumar on 23-11-2016.
 */

public class List_adapter extends ArrayAdapter {

    private Activity context;
    private final String[] test;
    private String adPlacementId = "929696930495695_929772917154763";
    private LinearLayout adView1;
    View rowView = null;

    //List<List_POJO> rowItems;
    public List_adapter(Activity context,
                        String[] web) {

        super(context, R.layout.list_adapter, web);
        this.test = web;
        this.context = context;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        //List_POJO. holder ;
        //View view=convertView;




            LayoutInflater inflater = context.getLayoutInflater();
            rowView= inflater.inflate(R.layout.list_adapter, null, true);
            TextView test1 = (TextView) rowView.findViewById(R.id.textView);
            test1.setText(test[position]);
        return rowView;


    }
}

