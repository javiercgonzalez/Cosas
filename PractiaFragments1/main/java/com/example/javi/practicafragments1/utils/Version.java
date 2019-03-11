package com.example.javi.practicafragments1.utils;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Version implements Serializable {
    String nombre;
    int imagen,desc;
    String fech,api;

    ArrayList subversiones = new ArrayList();

    public ArrayList getSubversiones() {
        return subversiones;
    }

    public Version(String nombre,String fech,int desc, int imagen,String api) {
        this.nombre = nombre;
        this.fech = fech;
        this.desc = desc;
        this.imagen = imagen;
        this.api=api;
        subversiones=new ArrayList();
    }

    public String getNombre() {
        return nombre;
    }

    public int getImagen() {
        return imagen;
    }

    public int getDesc() {
        return desc;
    }

    public String getFech() {
        return fech;
    }

    public String getApi() {
        return api;
    }
}
