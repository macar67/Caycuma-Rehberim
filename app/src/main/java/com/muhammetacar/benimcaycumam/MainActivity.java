package com.muhammetacar.benimcaycumam;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static int gosterim_suresi = 1500;
    ImageView girisResmi;
    TextView girisText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tanımla();

       // gecisYap();
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                Intent intent=new Intent(MainActivity.this,SeceneklerActivity.class);
                startActivity(intent);
                finish();
            }
        }, gosterim_suresi);
    }


    public void tanımla(){

        girisResmi=findViewById(R.id.giris);
       // girisText=findViewById(R.id.girisTexti);
    }
    public void gecisYap()
    {
        girisResmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,SeceneklerActivity.class);
                startActivity(intent);
            }
        });

    }

}
