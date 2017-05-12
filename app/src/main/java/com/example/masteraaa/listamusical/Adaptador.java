package com.example.masteraaa.listamusical;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by MasterAAA on 09/05/2017.
 */

public class Adaptador extends ArrayAdapter {

    Context contexto;
    ArrayList<Cancion> datos;

    public Adaptador(Context c, ArrayList<Cancion> datos){
        super(c,R.layout.activity_cancion,datos);

        this.contexto = c;
        this.datos = datos;
    }

    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflador=LayoutInflater.from(contexto);

        //El metodo inflate me devuelve la vista inflada
        convertView=inflador.inflate(R.layout.activity_cancion,null);

        //Accedo a traves de la posicion del array al objeto
        Cancion cancion=datos.get(position);

        ImageView fotoPortada=(ImageView)convertView.findViewById(R.id.portada);
        fotoPortada.setImageResource(cancion.getPortada());

        TextView textoTitulo=(TextView)convertView.findViewById(R.id.titulo);
        textoTitulo.setText(cancion.getTitulo());

        TextView textoArtista=(TextView)convertView.findViewById(R.id.artista);
        textoArtista.setText(cancion.getArtista());

        TextView textoDuracion=(TextView)convertView.findViewById(R.id.duracion);
        textoDuracion.setText(cancion.getDuracion());

        return convertView;
    }
}
