package com.muhammetacar.benimcaycumam;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class yemek extends AppCompatActivity {
    ListView listview;
    List<yemekliste> restronlistesi;
    Adapteryemek adpymk;

    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_yemek);

        tanımla();
        listeekelme();
        harita();

    }

    public void tanımla() {
        listview = findViewById(R.id.yemeklistview);
        btn=findViewById(R.id.btnHarita);
    }

    public  void harita(){

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent harİTA = new Intent(getApplicationContext(), yemekYerleri.class);
                startActivity(harİTA);
            }
        });

    }
    public void listeekelme() {

        restronlistesi = new ArrayList<>();

        yemekliste restoran1 = new yemekliste("OCAKBAŞI PİDE VE KEBAP SALONU", "Kebap",R.drawable.iskender,"0372 615 07 07","evelere sipariş VAR :)" );
        yemekliste restoran2 = new yemekliste(" CADDE IZGARA", "Kebap",R.drawable.iskender,"0372 615 66 66","evelere sipariş VAR :)" );
        yemekliste restoran3 = new yemekliste("PADİŞAH SOFRASI", "Kebap",R.drawable.iskender,"0372 615 67 65","evelere sipariş VAR :)" );
        yemekliste restoran4 = new yemekliste("SEPETÇİOĞLU", "Kebap",R.drawable.iskender,"0372 615 11 53","evelere sipariş YOK :(" );
        yemekliste restoran5 = new yemekliste("Resume Çiğköfte", "ÇiğKöfte",R.drawable.resume,"0372 600 01 27","evelere sipariş YOK :(" );


        restronlistesi.add(restoran1);
        restronlistesi.add(restoran2);
        restronlistesi.add(restoran3);
        restronlistesi.add(restoran4);
        restronlistesi.add(restoran5);

        adpymk=new Adapteryemek(restronlistesi,yemek.this,yemek.this);
        listview.setAdapter(adpymk);

    }




}
