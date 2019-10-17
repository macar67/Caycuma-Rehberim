package com.muhammetacar.benimcaycumam;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


public class yemekYerleri extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yemek_yerleri);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {


        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng sepet = new LatLng(41.426971, 32.0734854);
        mMap.addMarker(new MarkerOptions().position(sepet).title("SEPETÇİOĞLU PİDE"));

        LatLng padisah = new LatLng(41.4218611,32.0738149);
        mMap.addMarker(new MarkerOptions().position(padisah).title("Padişah Sofrası"));

        LatLng resume = new LatLng(41.4265013,32.0737566);
        mMap.addMarker(new MarkerOptions().position(resume).title("Resume Çiğköfte"));


        LatLng ocak = new LatLng(41.428516, 32.0720143);
        mMap.addMarker(new MarkerOptions().position(ocak).title("OCAKBAŞI PİDE VE KEBAP SALONU"));

        LatLng cadde = new LatLng(41.4222788,32.0737486);
        mMap.addMarker(new MarkerOptions().position(cadde).title("Cadde Izgara"));

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sepet, 15));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(ocak, 15));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(cadde, 15));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(padisah, 15));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(resume, 15));

        //41.4222788,32.0737486 cadde ızgara  41.4218611,32.0738149 padişah sofrası 41.4265013,32.0737566 resume çiğköfte
    }



}