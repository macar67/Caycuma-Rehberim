package com.muhammetacar.benimcaycumam;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class cafeler extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cafeler);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        // Add a marker in Sydney and move the camera
        // Add a marker in Sydney and move the camera
        LatLng kozdecay = new LatLng(41.427121, 32.0720683);
        mMap.addMarker(new MarkerOptions().position(kozdecay).title("Közde Çay"));

        LatLng vitamin = new LatLng(41.427122, 32.0720684);
        mMap.addMarker(new MarkerOptions().position(vitamin).title("Vitamin"));

        LatLng kahve = new LatLng(41.4220159, 32.0737656);
        mMap.addMarker(new MarkerOptions().position(kahve).title("KAHVERENGİ"));

        LatLng moon = new LatLng(41.4279443,32.0719108);
        mMap.addMarker(new MarkerOptions().position(moon).title("Moon Kafe"));

        LatLng timya = new LatLng(41.425875,32.073945);
        mMap.addMarker(new MarkerOptions().position(timya).title("Kafe Timya"));

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(kahve,15));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(kozdecay,15));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(moon,15));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(vitamin,15));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(timya,15));
    }
}
