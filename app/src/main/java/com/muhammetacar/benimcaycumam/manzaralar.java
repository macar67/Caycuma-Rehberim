package com.muhammetacar.benimcaycumam;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class manzaralar extends AppCompatActivity {
    ImageView img;
    Button btn;
    int number=0;
   // Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manzaralar);
        tanımlaiki();
        tıkla();
    }

    public void tanımlaiki() {

        img = findViewById(R.id.resim);
        btn = findViewById(R.id.degistir);
    }

    public void tıkla(){

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {




         number++;
                degistir(number);
            }
        });

    }
    public void degistir(int number){


        if(number==1) {
            img.setImageResource(R.drawable.manzara1);


        }
        else if(number==2) {
            img.setImageResource(R.drawable.manzara2);
        }
        else if(number==3) {
            img.setImageResource(R.drawable.manzara3);
        }
        else if(number==4) {
            img.setImageResource(R.drawable.manzara4);
        }
        else if(number==5) {
            img.setImageResource(R.drawable.manzara5);
        }
        else if(number==6) {
            img.setImageResource(R.drawable.manzara6);
        }
        else if(number==7) {
            img.setImageResource(R.drawable.manzara7);
        }
        else if(number==8) {
            img.setImageResource(R.drawable.manzara8);
        }
        else if(number==9) {
            img.setImageResource(R.drawable.manzara9);
        }
        else if(number==10) {
            img.setImageResource(R.drawable.manzara10);
        }
        else if(number==11) {
            img.setImageResource(R.drawable.manzara11);
        }
        else if(number==12) {
            img.setImageResource(R.drawable.manzara12);
        }
        else if(number==13) {
            img.setImageResource(R.drawable.manzara13);
        }
        else if(number==14) {
            img.setImageResource(R.drawable.manzara14);
        }
        else if(number==15) {
            img.setImageResource(R.drawable.manzara15);
        }
        else if(number==16) {
            img.setImageResource(R.drawable.manzara16);
        }
        else if(number==17) {
            img.setImageResource(R.drawable.manzara17);
        }
        else if(number==18) {
            img.setImageResource(R.drawable.manzara18);
        }
        else if(number==19) {
            img.setImageResource(R.drawable.manzara19);
        }
        else if(number==20) {
            img.setImageResource(R.drawable.manzara20);
        }
        else if(number==21) {
            img.setImageResource(R.drawable.manzara21);
        }
        else if(number==22) {
            img.setImageResource(R.drawable.manzara22);
        }
        else if(number==23) {
            img.setImageResource(R.drawable.manzara23);
        }
        else if(number==24) {
            img.setImageResource(R.drawable.manzara24);
        }
        else if(number==25) {
            img.setImageResource(R.drawable.manzara25);
        }
        else if(number==26) {
            img.setImageResource(R.drawable.manzara26);
        }
        else if(number==27) {
            img.setImageResource(R.drawable.manzara27);
        }
        else if(number==28) {
            img.setImageResource(R.drawable.manzara28);
        }
        else if(number==29) {
            img.setImageResource(R.drawable.manzara29);
        }
        else if(number==30) {
            img.setImageResource(R.drawable.manzara30);
        }
        else if(number==31) {
            img.setImageResource(R.drawable.manzara31);
        }
        else if(number==32) {
            img.setImageResource(R.drawable.manzara32);
        }
        else if(number==33) {
            img.setImageResource(R.drawable.manzara33);
        }
    }
}
