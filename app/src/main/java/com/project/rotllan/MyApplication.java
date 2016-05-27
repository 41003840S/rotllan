package com.project.rotllan;

import android.app.Application;
import android.content.res.Configuration;
import android.util.Log;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;
import com.project.rotllan.pojos.Vino;

import java.util.ArrayList;
import java.util.Locale;

public class MyApplication extends Application {

    public static ArrayList<Vino> arrayPriorats = new ArrayList<>();
    public static ArrayList<Vino> arrayRiojas = new ArrayList<>();
    public static ArrayList<Vino> arrayCat = new ArrayList<>();
    public static ArrayList<Vino> arrayCava = new ArrayList<>();
    public static ArrayList<Vino> arrayRias = new ArrayList<>();
    public static ArrayList<Vino> arrayVarios = new ArrayList<>();
    public static boolean descargado = false;

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }

    @Override
    public void onCreate() {
        super.onCreate();

        Firebase.setAndroidContext(getApplicationContext());

        if(Locale.getDefault().getLanguage().equals("es")) {

            Firebase refPriorat = new Firebase("https://rotllantorra2.firebaseio.com/vinos/do/priorat");
            refPriorat.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot snapshot) {
                    //Recorremos todos los restaurantes que haya en ese momento
                    for (DataSnapshot postSnapshot : snapshot.getChildren()) {
                        Vino vino = postSnapshot.getValue(Vino.class);
                        arrayPriorats.add(vino);
                    }
                }

                @Override
                public void onCancelled(FirebaseError firebaseError) {
                    Log.e("ERROR FIREBASE", String.valueOf(firebaseError));
                }
            });

            Firebase refRiojas = new Firebase("https://rotllantorra2.firebaseio.com/vinos/do/rioja");
            refRiojas.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot snapshot) {
                    //Recorremos todos los restaurantes que haya en ese momento
                    for (DataSnapshot postSnapshot : snapshot.getChildren()) {
                        Vino vino = postSnapshot.getValue(Vino.class);
                        arrayRiojas.add(vino);
                    }
                }

                @Override
                public void onCancelled(FirebaseError firebaseError) {
                    Log.e("ERROR FIREBASE", String.valueOf(firebaseError));
                }
            });

            Firebase refCat = new Firebase("https://rotllantorra2.firebaseio.com/vinos/do/catalunya");
            refCat.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot snapshot) {
                    //Recorremos todos los restaurantes que haya en ese momento
                    for (DataSnapshot postSnapshot : snapshot.getChildren()) {
                        Vino vino = postSnapshot.getValue(Vino.class);
                        arrayCat.add(vino);
                    }
                }

                @Override
                public void onCancelled(FirebaseError firebaseError) {
                    Log.e("ERROR FIREBASE", String.valueOf(firebaseError));
                }
            });

            Firebase refCava = new Firebase("https://rotllantorra2.firebaseio.com/vinos/do/cava");
            refCava.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot snapshot) {
                    //Recorremos todos los restaurantes que haya en ese momento
                    for (DataSnapshot postSnapshot : snapshot.getChildren()) {
                        Vino vino = postSnapshot.getValue(Vino.class);
                        arrayCava.add(vino);
                    }
                }

                @Override
                public void onCancelled(FirebaseError firebaseError) {
                    Log.e("ERROR FIREBASE", String.valueOf(firebaseError));
                }
            });

            Firebase refVarios = new Firebase("https://rotllantorra2.firebaseio.com/vinos/sindo");
            refVarios.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot snapshot) {
                    //Recorremos todos los restaurantes que haya en ese momento
                    for (DataSnapshot postSnapshot : snapshot.getChildren()) {
                        Vino vino = postSnapshot.getValue(Vino.class);
                        arrayVarios.add(vino);
                    }
                }

                @Override
                public void onCancelled(FirebaseError firebaseError) {
                    Log.e("ERROR FIREBASE", String.valueOf(firebaseError));
                }
            });

            Firebase refRias = new Firebase("https://rotllantorra2.firebaseio.com/vinos/do/riasbaixas");
            refRias.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot snapshot) {
                    //Recorremos todos los restaurantes que haya en ese momento
                    for (DataSnapshot postSnapshot : snapshot.getChildren()) {
                        Vino vino = postSnapshot.getValue(Vino.class);
                        arrayRias.add(vino);
                    }
                }

                @Override
                public void onCancelled(FirebaseError firebaseError) {
                    Log.e("ERROR FIREBASE", String.valueOf(firebaseError));
                }
            });

        }else{

            Firebase refPriorat = new Firebase("https://rotllantorra2.firebaseio.com/vinos/doEN/prioratEN");
            refPriorat.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot snapshot) {
                    //Recorremos todos los restaurantes que haya en ese momento
                    for (DataSnapshot postSnapshot : snapshot.getChildren()) {
                        Vino vino = postSnapshot.getValue(Vino.class);
                        arrayPriorats.add(vino);
                    }
                }

                @Override
                public void onCancelled(FirebaseError firebaseError) {
                    Log.e("ERROR FIREBASE", String.valueOf(firebaseError));
                }
            });

            Firebase refRiojas = new Firebase("https://rotllantorra2.firebaseio.com/vinos/doEN/riojaEN");
            refRiojas.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot snapshot) {
                    //Recorremos todos los restaurantes que haya en ese momento
                    for (DataSnapshot postSnapshot : snapshot.getChildren()) {
                        Vino vino = postSnapshot.getValue(Vino.class);
                        arrayRiojas.add(vino);
                    }
                }

                @Override
                public void onCancelled(FirebaseError firebaseError) {
                    Log.e("ERROR FIREBASE", String.valueOf(firebaseError));
                }
            });

            Firebase refCat = new Firebase("https://rotllantorra2.firebaseio.com/vinos/doEN/catalunyaEN");
            refCat.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot snapshot) {
                    //Recorremos todos los restaurantes que haya en ese momento
                    for (DataSnapshot postSnapshot : snapshot.getChildren()) {
                        Vino vino = postSnapshot.getValue(Vino.class);
                        arrayCat.add(vino);
                    }
                }

                @Override
                public void onCancelled(FirebaseError firebaseError) {
                    Log.e("ERROR FIREBASE", String.valueOf(firebaseError));
                }
            });

            Firebase refRias = new Firebase("https://rotllantorra2.firebaseio.com/vinos/doEN/riasbaixasEN");
            refRias.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot snapshot) {
                    //Recorremos todos los restaurantes que haya en ese momento
                    for (DataSnapshot postSnapshot : snapshot.getChildren()) {
                        Vino vino = postSnapshot.getValue(Vino.class);
                        arrayRias.add(vino);
                    }
                }
                @Override
                public void onCancelled(FirebaseError firebaseError) {
                    Log.e("ERROR FIREBASE", String.valueOf(firebaseError));
                }
            });

            Firebase refCava = new Firebase("https://rotllantorra2.firebaseio.com/vinos/doEN/cavaEN");
            refCava.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot snapshot) {
                    //Recorremos todos los restaurantes que haya en ese momento
                    for (DataSnapshot postSnapshot : snapshot.getChildren()) {
                        Vino vino = postSnapshot.getValue(Vino.class);
                        arrayCava.add(vino);
                    }
                }
                @Override
                public void onCancelled(FirebaseError firebaseError) {
                    Log.e("ERROR FIREBASE", String.valueOf(firebaseError));
                }
            });

            Firebase refVarios = new Firebase("https://rotllantorra2.firebaseio.com/vinos/sindoEN");
            refVarios.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot snapshot) {
                    //Recorremos todos los restaurantes que haya en ese momento
                    for (DataSnapshot postSnapshot : snapshot.getChildren()) {
                        Vino vino = postSnapshot.getValue(Vino.class);
                        arrayVarios.add(vino);
                    }
                }

                @Override
                public void onCancelled(FirebaseError firebaseError) {
                    Log.e("ERROR FIREBASE", String.valueOf(firebaseError));
                }
            });
        }

        descargado = true;
        Log.w("TAREA COMPLETADA", "Se ha descargado todo de firebase");
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }

}