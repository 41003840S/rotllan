package com.project.rotllan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class DenominacionesActivity extends AppCompatActivity {

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_denominaciones);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(new ImageAdapter(this));

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {

                switch (position){
                    case 0:
                        intent = new Intent(getApplicationContext(), PrioratActivity.class);
                        startActivity(intent);
                        break;
                    case 1:
                        intent = new Intent(getApplicationContext(), RiojaActivity.class);
                        startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(getApplicationContext(), RiasbaixasActivity.class);
                        startActivity(intent);
                        break;
                    case 3:
                        intent = new Intent(getApplicationContext(), CatalunyaActivity.class);
                        startActivity(intent);
                        break;
                    case 4:
                        intent = new Intent(getApplicationContext(), CavaActivity.class);
                        startActivity(intent);
                        break;

                }
                /*Toast.makeText(DenominacionesActivity.this, "" + position,
                        Toast.LENGTH_SHORT).show();*/
            }
        });

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
