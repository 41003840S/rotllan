package com.project.rotllan;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class VinoAdapter extends ArrayAdapter{

    Context context;

    public VinoAdapter(Context context, int resource, int textViewResourceId, List objects) {
        super(context, resource, textViewResourceId, objects);
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        //Miramos si la View la esta reusando, sino es asi hinchamos la vista
        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(context);
            convertView = inflater.inflate(R.layout.vinos_row, parent, false);
        }

        TextView nombre = (TextView) convertView.findViewById(R.id.vinoName);
        TextView zona = (TextView) convertView.findViewById(R.id.zonaVino);

        /*String prueba = getResources().getString(R.string.contacto);
        nombre.setText(getResources().getStringArray(R.array.animals));*/

        return convertView;
    }
}