package com.project.rotllan;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.util.Log;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.project.rotllan.pojos.Restaurante;

public class RestaurantesActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    Firebase refRest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurantes);

        //Le decimos a Firebase que este sera el contexto
        Firebase.setAndroidContext(getApplication());

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

        // Add a marker in Sydney and move the camera
//        LatLng sydney = new LatLng(-34, 151);
//        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
        mMap.setMyLocationEnabled(true);

        //Creamos una referencia a nuestra bd de Firebase
        refRest = new Firebase("https://rotllantorra2.firebaseio.com/").child("restaurantes");

        refRest.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot snapshot) {
                //Recorremos todos los restaurantes que haya en ese momento
                for (DataSnapshot postSnapshot : snapshot.getChildren()) {
                    //Creamos un objeto restaurante de ese elemento
                    Restaurante restaurante = postSnapshot.getValue(Restaurante.class);
                    mMap.addMarker(new MarkerOptions()
                            .position(new LatLng(restaurante.getLatitud(), restaurante.getLongitud()))
                            .title(restaurante.getNombre())
                            .snippet(restaurante.getDireccion()));
                }
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {
                Log.e("ERROR FIREABSE", String.valueOf(firebaseError));
            }

        });
    }
}