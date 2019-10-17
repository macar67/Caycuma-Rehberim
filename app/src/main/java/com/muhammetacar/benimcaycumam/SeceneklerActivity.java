package com.muhammetacar.benimcaycumam;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ScrollView;
import android.widget.TextView;

public class SeceneklerActivity extends AppCompatActivity {

    TextView cami, taksi, eczane, soru, caycuma, combus, kahve, yemek, tren, havadurumu;
    ImageButton camiImg, taksiImg, eczaneImg, soruImg, caycumaImg, combusImg, kahveImg, yemekImg, trenImg, havadurumuImg;
    ScrollView src;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secenekler);


      //  zoom();
        tanımla();
        camiGirisi();
        manzaralar();
        sorusor();
        combus();
        tren();
        taksici();
        eczane();
        yemek();
        cafe();
        havaDurumu();


    }


    public void tanımla() {

        //imageButton tanımları
        //src=findViewById(R.id.scr);
        camiImg = findViewById(R.id.camiResim);
        taksiImg = findViewById(R.id.taksiResim);
        eczaneImg = findViewById(R.id.eczaneResim);
        soruImg = findViewById(R.id.soruResim);
        caycumaImg = findViewById(R.id.caycumaResim);
        combusImg = findViewById(R.id.combusResim);
        kahveImg = findViewById(R.id.kahveResim);
        yemekImg = findViewById(R.id.yemekResim);
        havadurumuImg = findViewById(R.id.havadurumuResim);
        trenImg = findViewById(R.id.TrenResim);
         src=findViewById(R.id.scroll);
        ///text view tanımları

        cami = findViewById(R.id.camiTextview);
        taksi = findViewById(R.id.taksiTextview);
        eczane = findViewById(R.id.eczaneTextview);
        soru = findViewById(R.id.soruTextview);
        caycuma = findViewById(R.id.caycumaTextview);
        combus = findViewById(R.id.combusTextview);
        kahve = findViewById(R.id.kafeTextview);
        yemek = findViewById(R.id.yemekTextview);
        havadurumu = findViewById(R.id.havadurumuTextview);
        tren = findViewById(R.id.trenTextview);

        ///////////////////////////////////

    }

    public void zoom() {
        View view = getLayoutInflater().inflate(R.layout.activity_secenekler, null);
        setContentView(view);

        view.setOnClickListener(new View.OnClickListener() {
            float zoomFactor = 2f;
            boolean zoomedOut = false;

            @Override
            public void onClick(View v) {
                if (zoomedOut) {
                    v.setScaleX(1);
                    v.setScaleY(1);
                    zoomedOut = false;
                } else {
                    v.setScaleX(zoomFactor);
                    v.setScaleY(zoomFactor);
                    zoomedOut = true;
                }
            }
        });
    }
    public void camiGirisi() {

        camiImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent cami = new Intent(SeceneklerActivity.this, Camiler.class);
                startActivity(cami);

            }
        });

    }

    public void manzaralar() {

        caycumaImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent manzara = new Intent(SeceneklerActivity.this, manzaralar.class);
                startActivity(manzara);


            }
        });
    }

    public void sorusor() {
        soruImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mail = new Intent(SeceneklerActivity.this, mailGonder.class);
                startActivity(mail);

            }
        });


    }

    public void combus() {
        combusImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent combusSaati = new Intent(SeceneklerActivity.this, combus.class);
                startActivity(combusSaati);

            }
        });


    }

    public void tren() {
        trenImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tren = new Intent(SeceneklerActivity.this, tren.class);
                startActivity(tren);

            }
        });


    }

    public void taksici()
    {

        taksiImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent taksi = new Intent(SeceneklerActivity.this, taksi.class);
                startActivity(taksi);

            }
        });

    }
    public void eczane()
    {

        eczaneImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent eczane = new Intent(SeceneklerActivity.this, eczane.class);
                startActivity(eczane);

            }
        });

    }

    public void yemek()
    {

        yemekImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yemek = new Intent(SeceneklerActivity.this, yemek.class);

                startActivity(yemek);

            }
        });

    }
    public void cafe()
    {

        kahveImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kafe = new Intent(SeceneklerActivity.this, cafe.class);
                startActivity(kafe);

            }
        });

    }
    public void havaDurumu()
    {

        havadurumuImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hava = new Intent(SeceneklerActivity.this, hava.class);
                startActivity(hava);

            }
        });

    }


}
