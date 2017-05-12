package com.example.masteraaa.listamusical;

import android.media.MediaPlayer;

/**
 * Created by MasterAAA on 09/05/2017.
 */

public class Cancion implements java.io.Serializable {

    //Declaro propiedades
    int portada, cancion;
    String titulo, artista, duracion;

    public Cancion (int portada, String titulo, String artista, String duracion, int cancion) {
        this.portada = portada;
        this.titulo = titulo;
        this.artista = artista;
        this.duracion = duracion;
        this.cancion = cancion;
    }

    //Getters y Setters
    public int getPortada() {
        return portada;
    }

    public void setPortada(int portada) {
        this.portada = portada;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public int getCancion() {
        return cancion;
    }

    public void setCancion(int cancion) {
        this.cancion = cancion;
    }
}
