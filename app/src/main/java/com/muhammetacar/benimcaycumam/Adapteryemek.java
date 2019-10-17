
package com.muhammetacar.benimcaycumam;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Adapteryemek extends BaseAdapter {
    List<yemekliste> yemeklist;
    Context context;
    Activity activity;

    public Adapteryemek(List<yemekliste> yemeklist, Context context,Activity activity) {
        this.yemeklist = yemeklist;
        this.context = context;
        this.activity=activity;
    }

    @Override
    public int getCount() {
        return yemeklist.size();
    }

    @Override
    public Object getItem(int position) {
        return yemeklist.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        View layout = LayoutInflater.from(context).inflate(R.layout.yemeklayout, parent, false);

        //yeni layout içindeki tanımlamalar

        ImageView restRes = layout.findViewById(R.id.yemek);

        TextView resIsim = layout.findViewById(R.id.yemekIsmi);
        TextView siparischeck = layout.findViewById(R.id.siparis);
        final TextView telefon = layout.findViewById(R.id.Yemektel);
        TextView tarz = layout.findViewById(R.id.detay);

        Button btnAra = layout.findViewById(R.id.yemekaramak);
       // Button harita = layout.findViewById(R.id.yemehHarita);

        // atama işlemleri yaomalıyız...

        restRes.setImageResource(yemeklist.get(position).getResimIdyemek());
        resIsim.setText(yemeklist.get(position).getName());
        siparischeck.setText(yemeklist.get(position).getSiparis());
        telefon.setText(yemeklist.get(position).getTelno());
        tarz.setText(yemeklist.get(position).getTarz());

        btnAra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel: "+yemeklist.get(position).getTelno()));
                    activity.startActivity(intent);
                }
                catch (Exception e){
                    e.printStackTrace();
                }
            }
        });

//        if(yemeklist.get(position).getName().equals("OCAKBAŞI PİDE VE KEBAP SALONU")){
//
//            harita.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    Intent harİTA = new Intent(activity.getApplicationContext(), ocakbasi.class);
//                    activity.startActivity(harİTA);
//                }
//            });
//        }
//        else if(yemeklist.get(position).getName().equals("CADDE IZGARA")){
//
//            harita.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    Intent harİTA = new Intent(activity.getApplicationContext(), Cafeharita.class);
//                    activity.startActivity(harİTA);
//                }
//            });
//        }
//        else if(yemeklist.get(position).getName().equals("PADİŞAH SOFRASI")){
//
//            harita.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    Intent harİTA = new Intent(activity.getApplicationContext(), yemekYerleri.class);
//                    activity.startActivity(harİTA);
//                }
//            });
//        }
//
//        else if(yemeklist.get(position).getName().equals("SEPETÇİOĞLU")){
//
//            harita.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    Intent harİTA = new Intent(activity.getApplicationContext(), sepetcioglu.class);
//                    activity.startActivity(harİTA);
//                }//SEPETÇİOĞLU
//            });
//        }

        return layout;
    }
}