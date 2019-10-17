package com.muhammetacar.benimcaycumam;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Camiİhsandogan extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cami_ihsandogan);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng ocak = new LatLng(41.4208765, 32.0984381);
        mMap.addMarker(new MarkerOptions().position(ocak).title("İhsan Doğan  Camii"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(ocak,17));

        //41.421269,32.0745063 seka camii
        //41.425334,32.0819493 beyler
        //41.439307,32.0792399 siteler
        //41.4208765,32.0984381 ihsan
    }
}
