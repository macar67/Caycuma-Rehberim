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

public class AdapterTaksi extends BaseAdapter {
    List<TaksiListe> taksilist;
    Context context;
    Activity activity;

    public AdapterTaksi(List<TaksiListe> taksiList, Context context,Activity activity) {
        this.taksilist = taksiList;
        this.context = context;
        this.activity=activity;
    }

    @Override
    public int getCount() {
        return taksilist.size();
    }

    @Override
    public Object getItem(int position) {
        return taksilist.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {


         convertView = LayoutInflater.from(context).inflate(R.layout.taksilayout, parent, false);
        //yeni layout içindeki tanımlamalar

       // ImageView taksiImg = convertView.findViewById(R.id.taksi);
        TextView isim = convertView.findViewById(R.id.taksiismi);
        TextView adresss = convertView.findViewById(R.id.taksiadress);
        Button btn=convertView.findViewById(R.id.btnArama);
        final TextView tel=convertView.findViewById(R.id.taksiTel);

        // atama işlemleri yaomalıyız...

        //taksiImg.setImageResource(taksilist.get(position).getImg());
        isim.setText(taksilist.get(position).getName());
        tel.setText(taksilist.get(position).getTel());
        adresss.setText(taksilist.get(position).getadres());

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel: " + taksilist.get(position).getTel()));
                    activity.startActivity(intent);

                }catch (Exception e){
                    e.printStackTrace();
                }


            }
        });
        return convertView;

    }
}
