package com.muhammetacar.benimcaycumam;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class taksi extends AppCompatActivity {

    Button btnAra;
    ImageView imgTaksiismi;
    ListView listView;

    List<TaksiListe> taksilist;
    AdapterTaksi adp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taksi);
        def();
        listeyeEkle();

    }
    public void def(){

       // btnAra=findViewById(R.id.btnArama);
       // imgTaksiismi=findViewById(R.id.taksi);
        listView=findViewById(R.id.listViewTaksi);
    }
    public void listeyeEkle()
    {

        taksilist=new ArrayList<>();

        TaksiListe taksi1=new TaksiListe("Terminal Taksi","0372 615 34 09","İstasyon Mah. İstasyon Cad. Çaycuma, Zonguldak");
        TaksiListe taksi2=new TaksiListe("PTT Taksi","0372 615 07 96","Yeni Mah. Burcu Sok. 4 Çaycuma, Zonguldak");
     //  TaksiListe taksi3=new TaksiListe("Gar Taksi","0372 618 10 46","Kokaksu Mah. Atatürk Cad. Saltukova, Çaycuma, Zonguldak");
       TaksiListe taksi4=new TaksiListe("MERKEZ Taksi","03726150037","Çay Mah. Esengil Cad. Çaycuma, Zonguldak");
       TaksiListe taksi5=new TaksiListe("Çaycuma Taksi","05367363918","İstasyon Mah. 12 İnci Sok. Çaycuma, Zonguldak");


        taksilist.add(taksi1);
        taksilist.add(taksi2);
       // taksilist.add(taksi3);
        taksilist.add(taksi4);
        taksilist.add(taksi5);

        adp=new AdapterTaksi(taksilist,taksi.this,taksi.this);
        listView.setAdapter(adp);

    }


}
