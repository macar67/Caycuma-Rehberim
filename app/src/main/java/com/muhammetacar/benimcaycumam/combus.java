package com.muhammetacar.benimcaycumam;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;


import android.view.MotionEvent;
import android.widget.ZoomControls;
public class combus extends AppCompatActivity {
    Spinner spin;
    String[] yon = {"gitmek istediğiniz yöne tıklayın...  ","ZONGULDAK","KARABÜK"};
    ArrayAdapter arrayAdapter;
    ImageView img;
    ImageView image;
    ZoomControls simpleZoomControls;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_combus);
        defination();
        adapter();
        adapterEkle();
        bilgiVer();
        zoom();
    }

    public void adapter() {

        arrayAdapter = new ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item, yon);


    }
    public void defination() {
        spin = findViewById(R.id.spinner);
        img = findViewById(R.id.zonguldakkarabuk);

        simpleZoomControls = (ZoomControls) findViewById(R.id.simpleZoomControl); // initiate a ZoomControls
    }

    public void adapterEkle() {

        spin.setAdapter(arrayAdapter);

    }

    public void bilgiVer() {
        img.setImageResource(R.drawable.zonguldak);
        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (spin.getSelectedItem().toString().equals("ZONGULDAK")){

                    img.setImageResource(R.drawable.zonguldak);
                    Toast.makeText(getApplicationContext(),spin.getSelectedItem().toString(),Toast.LENGTH_SHORT).show();}
                else if (spin.getSelectedItem().toString().equals("KARABÜK")){

                    img.setImageResource(R.drawable.karabuk);
                    Toast.makeText(getApplicationContext(),spin.getSelectedItem().toString(),Toast.LENGTH_SHORT).show();
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
            Toast.makeText(getApplicationContext(),"Zoom In",Toast.LENGTH_SHORT).show();
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
            Toast.makeText(getApplicationContext(),"Zoom Out",Toast.LENGTH_SHORT).show();
            // hide the ZoomControls from the screen
            simpleZoomControls.hide();
        }
    });
}

//    public class MainActivity extends AppCompatActivity {
//
//
//        @Override
//        protected void onCreate(Bundle savedInstanceState) {
//            super.onCreate(savedInstanceState);
//            setContentView(R.layout.activity_main);
//            image = (ImageView) findViewById(R.id.image); // initiate a ImageView
//            simpleZoomControls = (ZoomControls) findViewById(R.id.simpleZoomControl); // initiate a ZoomControls
//            simpleZoomControls.hide(); // initially hide ZoomControls from the screen
//            // perform setOnTouchListener event on ImageView
//            image.setOnTouchListener(new View.OnTouchListener() {
//                @Override
//                public boolean onTouch(View v, MotionEvent event) {
//                    // show Zoom Controls on touch of image
//                    simpleZoomControls.show();
//                    return false;
//                }
//            });
//            // perform setOnZoomInClickListener event on ZoomControls
//            simpleZoomControls.setOnZoomInClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    // calculate current scale x and y value of ImageView
//                    float x = image.getScaleX();
//                    float y = image.getScaleY();
//                    // set increased value of scale x and y to perform zoom in functionality
//                    image.setScaleX((float) (x + 1));
//                    image.setScaleY((float) (y + 1));
//                    // display a toast to show Zoom In Message on Screen
//                    Toast.makeText(getApplicationContext(),"Zoom In",Toast.LENGTH_SHORT).show();
//                    // hide the ZoomControls from the screen
//                    simpleZoomControls.hide();
//                }
//            });
//            // perform setOnZoomOutClickListener event on ZoomControls
//            simpleZoomControls.setOnZoomOutClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    // calculate current scale x and y value of ImageView
//                    float x = image.getScaleX();
//                    float y = image.getScaleY();
//                    // set decreased value of scale x and y to perform zoom out functionality
//                    image.setScaleX((float) (x - 1));
//                    image.setScaleY((float) (y - 1));
//                    // display a toast to show Zoom Out Message on Screen
//                    Toast.makeText(getApplicationContext(),"Zoom Out",Toast.LENGTH_SHORT).show();
//                    // hide the ZoomControls from the screen
//                    simpleZoomControls.hide();
//                }
//            });
//        }
//
//
//    }
}
