package com.example.sergiorodriguez.micartavirtual;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(6.2,-75.5),5));
        // Add a marker in Sydney and move the camera
        LatLng medellin = new LatLng(6.2, -76);
        LatLng medellin2 = new LatLng(6.2, -75);
        LatLng medellin3 = new LatLng(6.2, -75.5);
        mMap.addMarker(new MarkerOptions().position(medellin).title("Marker in Medellin"));
        mMap.addMarker(new MarkerOptions().position(medellin2).title("Marker in Medellin"));
        mMap.addMarker(new MarkerOptions().position(medellin3).title("Marker in Medellin"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(medellin));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(medellin2));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(medellin3));
    }
}
