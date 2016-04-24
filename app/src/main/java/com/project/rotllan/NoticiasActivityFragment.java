package com.project.rotllan;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.BitmapImageViewTarget;
import com.firebase.client.Firebase;
import com.firebase.ui.FirebaseListAdapter;
import com.project.rotllan.pojos.Post;

/**
 * A placeholder fragment containing a simple view.
 */
public class NoticiasActivityFragment extends Fragment {

    ListView listPost;
    ImageView fotoNoticia;
    TextView tituloNoticia, descripcionNoticia;

    public NoticiasActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View fragment =  inflater.inflate(R.layout.fragment_noticias, container, false);

        listPost = (ListView) fragment.findViewById(R.id.listPost);

        //Le decimos a Firebase que este sera el contexto
        Firebase.setAndroidContext(getContext());

        //Creamos una referencia a nuestra bd de Firebase
        Firebase refBlog = new Firebase("https://rotllantorra.firebaseio.com/").child("blog");

        final FirebaseListAdapter adapter = new FirebaseListAdapter<Post>(getActivity(), Post.class, R.layout.blog_row, refBlog) {
            @Override
            protected void populateView(View v, Post model, int position) {
                super.populateView(v, model, position);

                tituloNoticia = (TextView) v.findViewById(R.id.tituloNoticia);
                descripcionNoticia = (TextView) v.findViewById(R.id.descripcionNoticia);
                fotoNoticia = (ImageView) v.findViewById(R.id.fotoNoticia);

                tituloNoticia.setText(model.getTitulo());
                descripcionNoticia.setText(model.getDescripcion());

                Glide.with(getActivity()).load(model.getImagen())
                        .asBitmap()
                        .centerCrop()
                        .into(new BitmapImageViewTarget(fotoNoticia));
            }
        };

        listPost.setAdapter(adapter);



        return fragment;
    }
}
