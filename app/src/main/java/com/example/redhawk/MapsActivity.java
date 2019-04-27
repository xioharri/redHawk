package com.example.redhawk;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

/*This activity opens after MainActivity DRIVE TO MSU button is clicked, the button caches the coordinates to MSU
using the API you can enter any address and it will provide driving, transit etc. to arrive to MSU*/
public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
/*Initializing map maps system and views using map fragments*/
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }
/*latitude and longitude is set for a marker that is named msu. The exact coordinates take you to partidge hall/*/
    @Override
    public  void onMapReady(GoogleMap googleMap){
        map = googleMap;

        LatLng msu = new LatLng(40.862359, -74.197926);
        map.addMarker(new MarkerOptions().position(msu).title("msu"));
        map.moveCamera(CameraUpdateFactory.newLatLng(msu));
    }
}
