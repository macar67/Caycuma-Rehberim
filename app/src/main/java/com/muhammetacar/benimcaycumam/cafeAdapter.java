package com.muhammetacar.benimcaycumam;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.actions.ItemListIntents;
import com.muhammetacar.benimcaycumam.R;
import com.muhammetacar.benimcaycumam.cafeModel;

import java.util.List;

public class cafeAdapter extends BaseAdapter {

    List<cafeModel> cafeModelList;
    Context context;
    Activity activity;

    public cafeAdapter(List<cafeModel> cafeModelList, Context context, Activity activity) {
        this.cafeModelList = cafeModelList;
        this.context = context;
        this.activity = activity;
    }



    @Override
    public int getCount() {
        return cafeModelList.size();
    }

    @Override
    public Object getItem(int position) {
        return cafeModelList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View layout=LayoutInflater.from(context).inflate(R.layout.kafelayout, parent, false);

        ImageView imgCafe=layout.findViewById(R.id.caferes);
        Button btncafe=layout.findViewById(R.id.cafeHarita);
        TextView isim=layout.findViewById(R.id.cafeİsim);
        TextView adress=layout.findViewById(R.id.cafeAdress);
        //TextView tel=layout.findViewById(R.id.cafeTel);



        imgCafe.setImageResource(cafeModelList.get(position).getResimid());
        isim.setText(cafeModelList.get(position).getCafeaIsim());
        adress.setText(cafeModelList.get(position).getCafeAdress());
       // tel.setText(cafeModelList.get(position).getCafeTel());

        if(cafeModelList.get(position).getCafeaIsim().equals("Közde Çay Keyfi")){

            btncafe.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent harİTA = new Intent(activity.getApplicationContext(), Cafeharita.class);
                    activity.startActivity(harİTA);
                }
            });
        }
        else if(cafeModelList.get(position).getCafeaIsim().equals("Eski Ev")){

            btncafe.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent harİTA = new Intent(activity.getApplicationContext(), Cafeharita.class);
                    activity.startActivity(harİTA);
                }
            });
        }
        else if(cafeModelList.get(position).getCafeaIsim().equals("Cafe TİMYA")){

            btncafe.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent harİTA = new Intent(activity.getApplicationContext(), kozde.class);
                    activity.startActivity(harİTA);
                }
            });
        }
        else if(cafeModelList.get(position).getCafeaIsim().equals("Vitamin")){

            btncafe.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent harİTA = new Intent(activity.getApplicationContext(), Cafeharita.class);
                    activity.startActivity(harİTA);
                }
            });
        }
        else if(cafeModelList.get(position).getCafeaIsim().equals("Kahverengi")){



            btncafe.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent harİTA = new Intent(activity.getApplicationContext(), vitamin.class);
                    activity.startActivity(harİTA);
                }
            });
        }



        return layout;
    }

}
