package com.project.rotllan;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.BitmapImageViewTarget;

import butterknife.Bind;
import butterknife.ButterKnife;

public class ContactoActivity extends AppCompatActivity {

    @Bind(R.id.thumbnail)   ImageView photo;
    @Bind(R.id.cardTlf)     CardView cardTlf;
    @Bind(R.id.cardWeb)     CardView cardWeb;

    Intent intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto);

        //Set toolbar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(getResources().getString(R.string.contacto));
        setSupportActionBar(toolbar);

        //Inicializar la libreria ButterKnive
        ButterKnife.bind(this);

        Glide.with(this).load(R.drawable.jordiportrait).asBitmap().fitCenter().into(new BitmapImageViewTarget(photo) {
            @Override
            protected void setResource(Bitmap resource) {
                RoundedBitmapDrawable circularBitmapDrawable = RoundedBitmapDrawableFactory.create(getBaseContext().getResources(), resource);
                circularBitmapDrawable.setCircular(true);
                photo.setImageDrawable(circularBitmapDrawable);
            }
        });

        cardTlf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String PhoneNum = getResources().getString(R.string.numero_telefono);
                intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + Uri.encode(PhoneNum.trim())));
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);

            }
        });

        cardWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "http://www.vinsrotllantorra.webnode.es";
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
