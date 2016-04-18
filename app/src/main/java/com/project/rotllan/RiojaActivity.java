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

public class RiojaActivity extends AppCompatActivity {

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
        setContentView(R.layout.activity_rioja);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_rioja, menu);
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
            View rootView = inflater.inflate(R.layout.fragment_rioja, container, false);

            posicion = getArguments().getInt(ARG_SECTION_NUMBER);
            int posicion2 = posicion - 1;


            TextView nombre = (TextView) rootView.findViewById(R.id.nombreRiojas);
            TextView ano = (TextView) rootView.findViewById(R.id.anoRiojas);
            TextView coupage = (TextView) rootView.findViewById(R.id.coupatgeRiojas);
            TextView descripcion = (TextView) rootView.findViewById(R.id.descripcionRiojas);
            ImageView foto = (ImageView) rootView.findViewById(R.id.fotoRiojas);
            TextView grado = (TextView) rootView.findViewById(R.id.gradosRiojas);

            ImageView logo1 = (ImageView) rootView.findViewById(R.id.logo1);
            ImageView logo2 = (ImageView) rootView.findViewById(R.id.logo2);
            ImageView logo3 = (ImageView) rootView.findViewById(R.id.logo3);
            ImageView logo4 = (ImageView) rootView.findViewById(R.id.logo4);
            ImageView logo5 = (ImageView) rootView.findViewById(R.id.logo5);
            ImageView logo6 = (ImageView) rootView.findViewById(R.id.logo6);

            String[] arrayNombres = getResources().getStringArray(R.array.array_nombre_rioja);
            String[] arrayAnos = getResources().getStringArray(R.array.array_anada_rioja);
            String[] arrayCoupage = getResources().getStringArray(R.array.array_coupatge_rioja);
            String[] arrayDescripcion = getResources().getStringArray(R.array.array_descripcion_rioja);
            String[] arrayGrados = getResources().getStringArray(R.array.array_graualco_rioja);

            nombre.setText(Arrays.asList(arrayNombres).get(posicion2));
            ano.setText(Arrays.asList(arrayAnos).get(posicion2));
            coupage.setText(Arrays.asList(arrayCoupage).get(posicion2));
            descripcion.setText(Arrays.asList(arrayDescripcion).get(posicion2));
            Glide.with(this).load(R.drawable.vinoprueba).into(foto);
            grado.setText(Arrays.asList(arrayGrados).get(posicion2));
            Glide.with(this).load(R.drawable.pollo).into(logo1);
            Glide.with(this).load(R.drawable.carne).into(logo2);
            Glide.with(this).load(R.drawable.jamon).into(logo3);
            Glide.with(this).load(R.drawable.pato).into(logo4);
            Glide.with(this).load(R.drawable.pescado).into(logo5);
            Glide.with(this).load(R.drawable.cheese).into(logo6);

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
            // Show 2 total pages.
            return 2;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "Aribau Cuvée Crianza";
                case 1:
                    return "Aribau Cuvée Reserva";
            }
            return null;
        }
    }
}