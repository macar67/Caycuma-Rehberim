package com.muhammetacar.benimcaycumam;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Tumcamiler extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tumcamiler);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }



    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng seka = new LatLng(41.423908, 32.0934633);
        mMap.addMarker(new MarkerOptions().position(seka).title("Seka"));


        LatLng siteler  = new LatLng(41.439307, 32.0792399);
        mMap.addMarker(new MarkerOptions().position(siteler).title("siteler"));


        LatLng ulu =  new LatLng(41.429183, 32.0794163);
        mMap.addMarker(new MarkerOptions().position(ulu).title("Ulu camii"));


        LatLng beyler =  new LatLng(41.425334, 32.0819493);
        mMap.addMarker(new MarkerOptions().position(beyler).title("Beyler"));


        LatLng merkez = new LatLng(41.427167, 32.0700453);
        mMap.addMarker(new MarkerOptions().position(merkez).title("Merkez Cami"));


        LatLng ihsan = new LatLng(41.4208765, 32.0984381);
        mMap.addMarker(new MarkerOptions().position(ihsan).title("İhsan Doğan  Camii"));

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(seka,15));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(merkez,15));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(ulu,15));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(ihsan,15));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(beyler,15));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(siteler,15));

    }
}
