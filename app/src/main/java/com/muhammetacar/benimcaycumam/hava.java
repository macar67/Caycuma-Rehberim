package com.muhammetacar.benimcaycumam;

import android.app.Activity;
import android.graphics.Bitmap;

import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;




import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import org.jsoup.select.Elements;


import java.io.IOException;

public class hava extends Activity {

    TextView txt1, txt2, txt3;

    private static final String url = "http://www.havadurumux.net/zonguldak-hava-durumu/caycuma/";

    Elements element, denemek;
    Document document;
    Bitmap bitmap;
    Elements image;
    String imageUrl, element1, element2, element3;
    ImageView imgHavaLogo;

    WebView webwiev, meteweb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hava);


        new getirHtml().execute();


    }


    public class getirHtml extends AsyncTask<Void, Void, Void> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            txt1 = findViewById(R.id.aciklama);
            txt2 = findViewById(R.id.derece);
            txt3 = findViewById(R.id.hissedilen);
            webwiev = findViewById(R.id.webview);
            //meteweb = findViewById(R.id.webviewmeteor);

            //  imgHavaLogo = findViewById(R.id.havaresim);
            //  abs=(LinearLayout)findViewById(R.id.klm);

        }

        @Override
        protected Void doInBackground(Void... voids) {

            try {
                document = Jsoup.connect(url).get();
                element = document.select("span");
                image = document.select("img");
                imageUrl = image.get(1).attr("src");
                Log.i("abc", "" + image.get(1).attr("src"));
                //Log.i("abc", "" + image);
                element1 = element.get(1).text();
                element2 = element.get(2).text();
                element3 = element.get(3).text();


//                InputStream input = new java.net.URL(imageUrl).openStream();
//                bitmap = BitmapFactory.decodeStream(input);


            } catch (IOException e) {
                e.printStackTrace();
            }


            return null;
        }


        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            Log.i("netice", "" + element1);
            Toast.makeText(getApplicationContext(), "Lütfen internet bağlantınızı kontrol ediniz...", Toast.LENGTH_SHORT).show();
           // goster();
            txt1.setText(element1);
            txt2.setText(element2);
            txt3.setText(element3);
////////////////////webview gösterme resim/////////////////////
            webwiev.getSettings().setJavaScriptEnabled(true);

            webwiev.setWebViewClient(new WebViewClient());
            webwiev.loadUrl(imageUrl);
///////////////////////////////////////////////////////////////
//            imgHavaLogo.setVisibility(View.VISIBLE);
//            imgHavaLogo.setImageBitmap(bitmap);


            //gosteriki();
        }

        public void goster() {

            webwiev.getSettings().setJavaScriptEnabled(true);

            webwiev.setWebViewClient(new WebViewClient());
            webwiev.loadUrl(imageUrl);
        }

//        public void gosteriki() {
//
//                 meteweb.getSettings().setJavaScriptEnabled(true);
//
//            meteweb.setWebViewClient(new WebViewClient());
//            meteweb.loadUrl("https://www.mgm.gov.tr/tahmin/il-ve-ilceler.aspx?il=Zonguldak&ilce=Çaycuma");
//            meteweb.setOnTouchListener(new View.OnTouchListener() {
//                @Override
//                public boolean onTouch(View v, MotionEvent event)
//                {
//                    return true;
//                } });
//        }


    }
}