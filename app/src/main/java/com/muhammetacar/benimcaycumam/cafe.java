package com.muhammetacar.benimcaycumam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class cafe extends AppCompatActivity {

    List<cafeModel> liste;
    ListView listView;
    cafeAdapter adpt;
    Button btn;
    LinearLayout lyt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cafe);
        tanımla();
        listeDoldurq();

        goster();
    }

    public void tanımla() {
        listView = findViewById(R.id.listViewCafe);
        btn=findViewById(R.id.Harita);
        lyt=findViewById(R.id.cafelayout);
    }
    public void goster() {

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent harİTA = new Intent(getApplicationContext(), cafeler.class);
                startActivity(harİTA);
            }
        });
    }
    public void listeDoldurq() {

        liste = new ArrayList<>();

        cafeModel cafe1 = new cafeModel(R.drawable.timya, "Közde Çay Keyfi", "Çay Mah. Mustafa Zeren Sok. 5 Çaycuma, Zonguldak");
        cafeModel cafe2 = new cafeModel(R.drawable.timya, "Eski Ev", "Çay Mah. Mustafa Zeren Sok. 5 Çaycuma, Zonguldak");
        cafeModel cafe3 = new cafeModel(R.drawable.timya, "Cafe TİMYA", "Yeni Mah. Doğu Sok. Çaycuma, Zonguldak");
        cafeModel cafe4 = new cafeModel(R.drawable.timya, "Vitamin", "Çay Mah. Mustafa Zeren Sok. 5 Çaycuma, Zonguldak");
        cafeModel cafe5 = new cafeModel(R.drawable.timya, "Kahverengi", "Yeni Mah. Nihat Kantarcı Cad. 71/A Çaycuma, Zonguldak");

        liste.add(cafe1);
        liste.add(cafe2);
        liste.add(cafe3);
        liste.add(cafe4);
        liste.add(cafe5);

        adpt = new cafeAdapter(liste, cafe.this,cafe.this);
        listView.setAdapter(adpt);
    }

}
