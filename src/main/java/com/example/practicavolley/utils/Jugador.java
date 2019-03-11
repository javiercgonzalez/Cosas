package com.example.practicavolley.utils;

public class Jugador {
    String nombre, imagen, pos;

    public Jugador(String nombre, String imagen, String pos) {
        this.nombre = nombre;
        this.imagen = imagen;
        this.pos = pos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getImagen() {
        return imagen;
    }

    public String getPos() {
        return pos;
    }
}
