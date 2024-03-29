package com.muhammetacar.benimcaycumam;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


public class CamiGocmenler extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cami_gocmenler);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng ocak = new LatLng(41.423908, 32.0934633);
        mMap.addMarker(new MarkerOptions().position(ocak).title("Göçmenler Camii"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(ocak,17));

        //41.421269,32.0745063 seka camii
        //41.425334,32.0819493 beyler
        //41.439307,32.0792399 siteler
        // 41.427167,32.0700453 merkez ve 50.yıl camii
        //41.423908,32.0934633 göçmenler camii
    }
}
