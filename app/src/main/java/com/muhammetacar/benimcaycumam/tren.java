package com.muhammetacar.benimcaycumam;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ZoomControls;
public class tren extends AppCompatActivity {
    Spinner spin;
    String[] sayfa = {"Sayfa no seçin: ", "1-5 TUR(7.40-10.00)", "6-10 TUR(10.10-12.30)", "11-15 TUR(13.30-15.50)","16-19 TUR(16.00-17.50)","Cuma günleri 11-16 TUR"};
    ArrayAdapter arrayAdapter;
    ImageView img;
    ZoomControls simpleZoomControls;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tren);
        defination();
        adapter();
        adapterEkle();
        bilgiVer();
        zoom();

    }

    public void adapter() {

        arrayAdapter = new ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item, sayfa);


    }

    public void defination() {
        spin = findViewById(R.id.spinner2);
       simpleZoomControls = (ZoomControls) findViewById(R.id.simpleZoomControl); // initiate a ZoomControls
        img = findViewById(R.id.tren);
    }

    public void adapterEkle() {

        spin.setAdapter(arrayAdapter);

    }

    public void bilgiVer() {
       // img.setImageResource(R.drawable.combus);
        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (spin.getSelectedItem().toString().equals("1-5 TUR(7.40-10.00)" )) {

                    img.setImageResource(R.drawable.cmb1);
                    Toast.makeText(getApplicationContext(), spin.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
                } else if (spin.getSelectedItem().toString().equals("6-10 TUR(10.10-12.30)")) {

                    img.setImageResource(R.drawable.cmb42);
                    Toast.makeText(getApplicationContext(), spin.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
                }
                else if (spin.getSelectedItem().toString().equals("11-15 TUR(13.30-15.50)")) {

                    img.setImageResource(R.drawable.cmb3);
                    Toast.makeText(getApplicationContext(), spin.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
                }
                else if (spin.getSelectedItem().toString().equals("16-19 TUR(16.00-17.50)")) {

                    img.setImageResource(R.drawable.cmb4);
                    Toast.makeText(getApplicationContext(), spin.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
                }
                else if (spin.getSelectedItem().toString().equals("Cuma günleri 11-16 TUR")) {

                    img.setImageResource(R.drawable.combus2);
                    Toast.makeText(getApplicationContext(), spin.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }

        });

    }
    public void zoom(){
        simpleZoomControls.hide(); // initially hide ZoomControls from the screen
        // perform setOnTouchListener event on ImageView
        img.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                // show Zoom Controls on touch of image
                simpleZoomControls.show();
                return false;
            }
        });
        // perform setOnZoomInClickListener event on ZoomControls
        simpleZoomControls.setOnZoomInClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // calculate current scale x and y value of ImageView
                float x = img.getScaleX();
                float y = img.getScaleY();
                // set increased value of scale x and y to perform zoom in functionality
                img.setScaleX((float) (x + 1));
                img.setScaleY((float) (y + 1));
                // display a toast to show Zoom In Message on Screen
                Toast.makeText(getApplicationContext(),"Yaklaştın",Toast.LENGTH_SHORT).show();
                // hide the ZoomControls from the screen
                simpleZoomControls.hide();
            }
        });
        // perform setOnZoomOutClickListener event on ZoomControls
        simpleZoomControls.setOnZoomOutClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // calculate current scale x and y value of ImageView
                float x = img.getScaleX();
                float y = img.getScaleY();
                // set decreased value of scale x and y to perform zoom out functionality
                img.setScaleX((float) (x - 1));
                img.setScaleY((float) (y - 1));
                // display a toast to show Zoom Out Message on Screen
                Toast.makeText(getApplicationContext(),"Uzaklaştın",Toast.LENGTH_SHORT).show();
                // hide the ZoomControls from the screen
                simpleZoomControls.hide();
            }
        });
    }
}