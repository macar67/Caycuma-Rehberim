package com.muhammetacar.benimcaycumam;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Adapter extends BaseAdapter {
    List<CamiListe> camilist;
    Context context;
    Activity activity;

    public Adapter(List<CamiListe> camilist, Context context, Activity activity) {
        this.camilist = camilist;
        this.context = context;
        this.activity = activity;
    }


    @Override
    public int getCount() {
        return camilist.size();
    }

    @Override
    public Object getItem(int position) {
        return camilist.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View layout = LayoutInflater.from(context).inflate(R.layout.layout, parent, false);

        //yeni layout içindeki tanımlamalar

        ImageView camiImg = layout.findViewById(R.id.camiId);
        TextView isim = layout.findViewById(R.id.camiIsmiTextView);
        TextView aciklama = layout.findViewById(R.id.camiAciklamaTextView);
        Button btnHaritaCami=layout.findViewById(R.id.camiHarita);
        // atama işlemleri yaomalıyız...

        camiImg.setImageResource(camilist.get(position).getResimId());
        isim.setText(camilist.get(position).getCamiIsmi());
        aciklama.setText(camilist.get(position).getCamiAciklama());
        btnHaritaCami.setText("Haritada Göster");
        if(camilist.get(position).getCamiIsmi().equals("Seka")){

                    btnHaritaCami.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent harİTA = new Intent(activity.getApplicationContext(), CamiSeka.class);
                            activity.startActivity(harİTA);
                        }
                    });
                }
                else if(camilist.get(position).getCamiIsmi().equals("Beyler")){

                    btnHaritaCami.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent harİTA = new Intent(activity.getApplicationContext(), CamiBeyler.class);
                            activity.startActivity(harİTA);
                        }
                    });
                }
        else if(camilist.get(position).getCamiIsmi().equals("Siteler")){

            btnHaritaCami.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent harİTA = new Intent(activity.getApplicationContext(), CamiSiteler.class);
                    activity.startActivity(harİTA);
                }
            });
        }
        else if(camilist.get(position).getCamiIsmi().equals("Ulu Camii")){

            btnHaritaCami.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent harİTA = new Intent(activity.getApplicationContext(), CamiUlu.class);
                    activity.startActivity(harİTA);
                }
            });
        }
        else if(camilist.get(position).getCamiIsmi().equals("Merkez Camii")){

            btnHaritaCami.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent harİTA = new Intent(activity.getApplicationContext(), CamiMerkez.class);
                    activity.startActivity(harİTA);
                }
            });
        }
        else if(camilist.get(position).getCamiIsmi().equals("50.Yıl Camii")){

            btnHaritaCami.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent harİTA = new Intent(activity.getApplicationContext(), CamiMerkez.class);
                    activity.startActivity(harİTA);
                }
            });
        }
//        else if(camilist.get(position).getCamiIsmi().equals("İhsan Doğan Camii")){
//
//            btnHaritaCami.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    Intent harİTA = new Intent(activity.getApplicationContext(), Camiİhsandogan.class);
//                    activity.startActivity(harİTA);
//                }
//            });
//        }
        else if(camilist.get(position).getCamiIsmi().equals("Tüm camiler")){

            btnHaritaCami.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent harİTA = new Intent(activity.getApplicationContext(), Tumcamiler.class);
                    activity.startActivity(harİTA);
                }
            });
        }





        return layout;
    }
}