package com.muhammetacar.benimcaycumam;

import android.content.Intent;
import android.net.Uri;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.WebViewClient;
import android.widget.Toast;

import com.muhammetacar.benimcaycumam.Models.Eczane;
import com.muhammetacar.benimcaycumam.Models.EczaneDetay;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import android.widget.ProgressBar;

public class eczane extends AppCompatActivity {
    String tokenstr;
    WebView webview;
    // TextView text;
    List<EczaneDetay> eczaneDetayList;
    String array[];

    TextView eczaneIsim, eczaneTel, eczaneAdress;
    Button eczaneAra, eczaneHaritagoster;
    ProgressBar simpleProgressBar;
    ListView listVieeczaneAraw;
    Document document;

    Map<String, String> userMap = new HashMap<String, String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eczane);
        simpleProgressBar = (ProgressBar) findViewById(R.id.simpleProgressBar);
        simpleProgressBar.setVisibility(View.VISIBLE);
        Tanımla();
        tıkla();
        Toast.makeText(getApplicationContext(), "Lütfen internet bağlantınızı kontrol ediniz...", Toast.LENGTH_SHORT).show();
        //listView = findViewById(R.id.listview);
        webview = new WebView(getApplicationContext()); //main activity tarafında bir webview oluşturduk arka planda çalışacak
        webview.getSettings().setJavaScriptEnabled(true); //javascript görünür yaptık..
        webview.addJavascriptInterface(new JsBridge(), "Android"); //ınterface i kullandık buradaki name sadece android olmalı..
        this.getToken();
        //Toast.makeText(getApplicationContext(), "Azıcık bekleyin hemen geliyor...", Toast.LENGTH_LONG).show();


        getEczane("1");
        ///////////////////////////////////////

        ////////////////////////////////////

//        text=findViewById(R.id.textview);
//        text.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                getEczane("1");
//            }
//        });
    }

    public void tıkla() {

        eczaneAra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent arama = new Intent(Intent.ACTION_DIAL);
                String veriAl = eczaneTel.getText().toString();
                arama.setData(Uri.parse("tel :" + veriAl));
                startActivity(arama);
            }
        });
    }

    public void Tanımla() {
        eczaneIsim = findViewById(R.id.eczaneiSiM);
        eczaneAdress = findViewById(R.id.eczaneAdress);
        eczaneTel = findViewById(R.id.eczaneTel);
        eczaneAra = findViewById(R.id.araEczane);

    }

    public void getEczane(String id) {
        webview.setWebViewClient(new WebViewClient()

                                 {
                                     @Override
                                     public void onPageFinished(WebView view, String url) {
                                         super.onPageFinished(view, url);
                                         view.loadUrl("javascript:window.Android.htmlEczaneDetay(" +
                                                 "'<html>'+document.getElementsByTagName('html')[0].innerHTML +'</html>'); ");

                                     }
                                 }
        );
        // webview.loadUrl("http://apps/'istanbulsaglik.gov.tr/Eczane/nobetci?id="+id+"&token="+tokenstr);

    }

    public void getToken() {
        webview.setWebViewClient(new WebViewClient()

                                 {
                                     @Override
                                     public void onPageFinished(WebView view, String url) {
                                         super.onPageFinished(view, url);
                                         view.loadUrl("javascript:window.Android.htmlContentForToken(" +
                                                 "'<html>'+document.getElementsByTagName('html')[0].innerHTML +'</html>'); ");

                                     }
                                 }
        );

        webview.loadUrl("https://www.zeo.org.tr/nobetci-1"); //Çaycuma nöbetçi eczabne web sitesi
    }

    private Handler handler = new Handler() {

        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if (msg.what == 1) {
                tokenstr = (String) msg.obj;
            } else if (msg.what == 2) {


                parseHtml((String) msg.obj);


            }
        }
    };

    private EczaneDetay parseHtml(String htmlKaynak) {

        document = Jsoup.parse(htmlKaynak);

        Elements table = document.select("title");
        String baslik[] = (table.get(0).text()).split(" ");
        Eczane eczane = new Eczane();
        eczane.setEczaneTarih(baslik[0]);
        eczane.setIlceIsmi(baslik[5]);



        Elements detay = document.select("div[class=eight columns top-1]");
        Elements sd = detay.select("strong");
        Elements deneme = detay.select("p");

        String a[] = deneme.text().split("(372)");
        String telefonnumarası[] = a[1].split(" ");



        String arrayDetay[] = (detay.text()).split(" ");

        String substringAdress = arrayDetay[2] + " " + arrayDetay[3] + " " + arrayDetay[4] + " " +
                arrayDetay[5] + " " + arrayDetay[6] + " " + arrayDetay[7] + " " + arrayDetay[8] + " " + arrayDetay[9] + " "
                + arrayDetay[10] + " " + arrayDetay[11] + " " + arrayDetay[12] + " " + arrayDetay[13] + " " + arrayDetay[14] + " ";
            //   + arrayDetay[15] + " " + arrayDetay[16] + " " + arrayDetay[17] + " " + arrayDetay[18] + " " + arrayDetay[19] + " "
       //  + arrayDetay[20] + " " + arrayDetay[21]+" "+arrayDetay[22]+ " "+arrayDetay[23]+" "+arrayDetay[24]+" "
        //   + arrayDetay[25] + " " + arrayDetay[26]+" "+arrayDetay[27]+ " "+arrayDetay[28]+" "+arrayDetay[29];
        String yeniadress[] = substringAdress.split("(372)");

        final String substringTel = "0372 " + telefonnumarası[1] + " " + telefonnumarası[2] + " " + telefonnumarası[3];
        //Log.i("sonuccc ", ""+yeniTelefon[0]);
        EczaneDetay eczaneDetay = new EczaneDetay();

        eczaneDetay.setEczaneIsmi(sd.text());
        eczaneDetay.setAdres(yeniadress[0].replaceAll("\\(", " "));
        eczaneDetay.setTel(substringTel);


        eczaneTel.setText("Tel: " + substringTel);
        eczaneAdress.setText("Adress : " + yeniadress[0].replaceAll("\\(", " "));
        eczaneIsim.setText(sd.text());

        if( eczaneIsim!=null){
            simpleProgressBar.setVisibility(View.INVISIBLE);
        }


        eczaneAra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel: " + substringTel));
                   startActivity(intent);

                }catch (Exception e){
                    e.printStackTrace();
                }


            }
        });

        Log.i("sonuccc2", "" + substringAdress);
        return eczaneDetay;
    }



    class JsBridge extends MainActivity {

        @JavascriptInterface
        public void htmlContentForToken(String str) {
            String s[] = str.split("token");

            if (s.length > 1) {

                String token[] = s[1].split(Pattern.quote("}"));
                tokenstr = token[0].replaceAll(" ", "")
                        .replaceAll(":", "").replaceAll("\"", "");
                Message message = new Message();
                message.what = 1;
                message.obj = tokenstr;
                // Log.i("sdfjsfdsf",tokenstr);
                handler.sendMessage(message);
            }
        }

        @JavascriptInterface
        public void htmlEczaneDetay(String str) {

            //  Log.i("sonuccc",str);
            Message message = new Message();
            message.what = 2;
            message.obj = str;
            handler.sendMessage(message);


        }

    }
}

