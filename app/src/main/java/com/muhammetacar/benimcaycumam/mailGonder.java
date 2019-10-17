package com.muhammetacar.benimcaycumam;

import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class mailGonder extends AppCompatActivity {

    EditText mailKonu, mailIcerik,mailAdres;
    Button btn;
    String icerikal, konual, myMailadress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mail_gonder);
        tanımlauc();

        mailGonder();
    }

    public void tanımlauc() {


        mailAdres=findViewById(R.id.mailAdress);
        mailIcerik = findViewById(R.id.mailIcerik);
        mailKonu = findViewById(R.id.mailKonu);
        btn = findViewById(R.id.gonder);

    }

    public void bilgileriAl() {
        icerikal = mailIcerik.getText().toString();
        konual = mailKonu.getText().toString();
        myMailadress = "muhammetacar4522@gmail.com";
    }

    public void mailGonder() {

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                bilgileriAl();
                Intent mail = new Intent(Intent.ACTION_SEND);
                mail.setData(Uri.parse("sda"));
                mail.setType("message/rfc822");
                mail.putExtra(Intent.EXTRA_EMAIL,"muhammetacar4522@gmail.com");
                mail.putExtra(Intent.EXTRA_SUBJECT,konual);
                mail.putExtra(Intent.EXTRA_TEXT,icerikal);
                mail.putExtra(Intent.EXTRA_CHOOSER_TARGETS,myMailadress);
                try{

                    startActivity(Intent.createChooser(mail,"Mail gönderiniz..!!"));
                   // startActivity(mail);
                }catch(Exception e){

                    e.printStackTrace();
                }

            }
        });
    }


}
