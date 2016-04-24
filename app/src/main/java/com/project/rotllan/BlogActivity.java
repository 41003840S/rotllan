package com.project.rotllan;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.BitmapImageViewTarget;
import com.firebase.client.Firebase;
import com.firebase.ui.FirebaseListAdapter;
import com.project.rotllan.pojos.Post;


public class BlogActivity extends AppCompatActivity {

    ListView listPost;
    int position1 = 0;
    ImageView fotoNoticia;
    TextView tituloNoticia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blog);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        listPost = (ListView) findViewById(R.id.listPost);

        //Le decimos a Firebase que este sera el contexto
        Firebase.setAndroidContext(this);

        //Creamos una referencia a nuestra bd de Firebase
        Firebase refBlog = new Firebase("https://rotllantorra.firebaseio.com/").child("blog");

        final FirebaseListAdapter adapter = new FirebaseListAdapter<Post>(this, Post.class, R.layout.blog_row, refBlog) {
            @Override
            protected void populateView(View v, Post model, int position) {
                super.populateView(v, model, position);

                tituloNoticia = (TextView) v.findViewById(R.id.tituloNoticia);
                fotoNoticia = (ImageView) v.findViewById(R.id.fotoNoticia);

                tituloNoticia.setText(model.getTitulo());


                Glide.with(getBaseContext()).load(model.getImagen())
                        .asBitmap()
                        .centerCrop()
                        .into(new BitmapImageViewTarget(fotoNoticia));
/*                    @Override
                    protected void setResource(Bitmap resource) {
                        RoundedBitmapDrawable circularBitmapDrawable = RoundedBitmapDrawableFactory.create(getBaseContext().getResources(), resource);
                        circularBitmapDrawable.setCircular(true);
                        fotoNoticia.setImageDrawable(circularBitmapDrawable);
                    }
                });*/

            }
        };

        listPost.setAdapter(adapter);


/*        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
