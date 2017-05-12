package com.example.masteraaa.listamusical;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Jorge on 09/05/2017.
 */

public class Reproducir extends AppCompatActivity {

    TextView t1, t2;
    ImageView i1;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reproductor);

        t1=(TextView)findViewById(R.id.txtCancion);
        t2=(TextView)findViewById(R.id.txtArtista);
        i1=(ImageView)findViewById(R.id.imgPortada);


        Bundle b=getIntent().getExtras();

        Cancion c=(Cancion)b.getSerializable("objCancion");
        t1.setText(c.getTitulo());
        t2.setText(c.getArtista());
        i1.setImageResource(c.getPortada());
        mp = MediaPlayer.create(this, c.getCancion());
        //mp.setAudioSessionId(c.getCancion());



        Button play = (Button)findViewById(R.id.play);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
            }
        });

    }






}
