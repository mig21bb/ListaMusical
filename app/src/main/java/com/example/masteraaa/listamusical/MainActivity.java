package com.example.masteraaa.listamusical;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //Declaramos el ListView
    ListView listaCanciones;

    //Creamos el array de objetos Cancion
    ArrayList<Cancion> datos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Instanciamos el ListView
        listaCanciones = (ListView)findViewById(R.id.listacanciones);

        datos=new ArrayList<Cancion>();
        datos.add(new Cancion(R.drawable.bon_jovi,"Livin' on a Prayer","Bon Jovi","4:37", R.raw.livin_on_a_prayer));
        datos.add(new Cancion(R.drawable.cindy_lauper,"She's so unusual","Cindy Lauper", "3:33", R.raw.girls_just_want_to_have_fun));
        datos.add(new Cancion(R.drawable.madonna,"Like a Prayer","Madonna", "4:15", R.raw.like_a_prayer));
        datos.add(new Cancion(R.drawable.bon_jovi,"We are the Champions","Queen","4:00", R.raw.we_are_the_champions));

        Adaptador adaptador=new Adaptador(this,datos);
        listaCanciones.setAdapter(adaptador);
        listaCanciones.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(getApplicationContext(),datos.get(position).getTitulo(),Toast.LENGTH_SHORT).show();
                Intent i=new Intent(getApplicationContext(),Reproducir.class);
                i.putExtra("objCancion",datos.get(position));
                startActivity(i);
            }
        });
    }
}
