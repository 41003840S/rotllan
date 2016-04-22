package com.project.rotllan;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.Arrays;

public class VariosActivity extends AppCompatActivity {

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    private SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_varios);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_varios, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private static final String ARG_SECTION_NUMBER = "section_number";
        int posicion;

        public PlaceholderFragment() {
        }

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        public static PlaceholderFragment newInstance(int sectionNumber) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_varios, container, false);

            posicion = getArguments().getInt(ARG_SECTION_NUMBER);
            int posicion2 = posicion - 1;

            TextView nombre = (TextView) rootView.findViewById(R.id.nombreVarios);
            TextView ano = (TextView) rootView.findViewById(R.id.anoVarios);
            TextView coupage = (TextView) rootView.findViewById(R.id.coupatgeVarios);
            TextView descripcion = (TextView) rootView.findViewById(R.id.descripcionVarios);
            TextView elaboracion = (TextView) rootView.findViewById(R.id.elaboracionVarios);
            ImageView foto = (ImageView) rootView.findViewById(R.id.fotoVarios);
            TextView grado = (TextView) rootView.findViewById(R.id.gradosVarios);


            String[] arrayNombres = getResources().getStringArray(R.array.array_nombre_varios);
            String[] arrayAnos = getResources().getStringArray(R.array.array_anada_varios);
            String[] arrayCoupage = getResources().getStringArray(R.array.array_coupatge_varios);
            String[] arrayDescripcion = getResources().getStringArray(R.array.array_caracteristicas_varios);
            String[] arrayElaboracion = getResources().getStringArray(R.array.array_elaboracion_varios);
            String[] arrayGrados = getResources().getStringArray(R.array.array_graualco_varios);
            int[] imagenes = {R.drawable.musicato};

            Glide.with(this).load(imagenes[posicion2]).into(foto);
            nombre.setText(Arrays.asList(arrayNombres).get(posicion2));
            ano.setText(Arrays.asList(arrayAnos).get(posicion2));
            coupage.setText(Arrays.asList(arrayCoupage).get(posicion2));
            grado.setText(Arrays.asList(arrayGrados).get(posicion2));
            descripcion.setText(Arrays.asList(arrayDescripcion).get(posicion2));
            elaboracion.setText(Arrays.asList(arrayElaboracion).get(posicion2));

            return rootView;
        }
    }

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            // Return a PlaceholderFragment (defined as a static inner class below).
            return PlaceholderFragment.newInstance(position + 1);
        }

        @Override
        public int getCount() {
            // Show 1 total pages.
            return 1;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "Musicato";
            }
            return null;
        }
    }
}