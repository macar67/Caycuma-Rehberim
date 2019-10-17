package com.muhammetacar.benimcaycumam;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Camiler extends AppCompatActivity {

    ListView listView;
    List<CamiListe> camilist;
    Adapter adp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camiler);
        tanımlaListView();
        listeyiDoldur();

    }
    public void zoom() {
        View view = getLayoutInflater().inflate(R.layout.activity_camiler, null);
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
    public void tanımlaListView()
    {
        listView=findViewById(R.id.listViewCami);

    }
    public void listeyiDoldur(){

        camilist=new ArrayList<>();

        CamiListe cami1=new CamiListe("Seka","Seka Site Cami, Yeni, Şemsi Denizer Cd., 67900 Çaycuma/Zonguldak",R.drawable.sembolikcamii);
        CamiListe cami2=new CamiListe("Beyler","Beyler Cami, Yeni, Beyler Sk., 67900 Çaycuma/Zonguldak",R.drawable.sembolikcamii);
        CamiListe cami3=new CamiListe("Siteler","Siteler Cami, Pehlivanlar, Kültür Cd. 46 A, 67900 Çaycuma/Zonguldak",R.drawable.sembolikcamii);
        CamiListe cami4=new CamiListe("Ulu Camii","Ulu Cami, Yeni, Bahar Sk., 67900 Çaycuma/Zonguldak",R.drawable.sembolikcamii);
        CamiListe cami5=new CamiListe("Merkez Camii","Yeni Cami, Çay, Metin Yurtbay Cd., 67900 Çaycuma/Zonguldak",R.drawable.sembolikcamii);
        CamiListe cami6=new CamiListe("50.Yıl Camii","50. Yıl Cami, Çay, Namık Kemal Sk., 67900 Çaycuma/Zonguldak",R.drawable.sembolikcamii);
      //  CamiListe cami7=new CamiListe("İhsan Doğan Camii","dokapfalan filan",R.drawable.cami6);
        CamiListe cami8=new CamiListe("Tüm camiler","Kendinize en yakın camii bulmak için üstüne gelip tıklayın ve yol tarifi alın...",R.drawable.sembolikcamii);

//camiler cami listesine ekleniyor....
        camilist.add(cami1);
        camilist.add(cami2);
        camilist.add(cami3);
        camilist.add(cami4);
        camilist.add(cami5);
        camilist.add(cami6);
       // camilist.add(cami7);
        camilist.add(cami8);

//adpater gösterme...

        adp=new Adapter(camilist,Camiler.this,Camiler.this);
        listView.setAdapter(adp);


    }
}
