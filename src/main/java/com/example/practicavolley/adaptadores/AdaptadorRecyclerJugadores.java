package com.example.practicavolley.adaptadores;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import com.bumptech.glide.Glide;
import com.example.practicavolley.R;
import com.example.practicavolley.utils.Jugador;

import java.util.ArrayList;

public class AdaptadorRecyclerJugadores extends RecyclerView.Adapter<AdaptadorRecyclerJugadores.MiHolder>{
    Context context;
    ArrayList lista;

    public AdaptadorRecyclerJugadores(Context context, ArrayList lista) {
        this.context = context;
        this.lista = lista;
    }

    @NonNull
    @Override
    public MiHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(context).inflate(R.layout.item_recycler_jugadores,viewGroup,false);
        MiHolder h = new MiHolder(v);
        return h;
    }

    @Override
    public void onBindViewHolder(@NonNull MiHolder holderAlineacion, int i) {
        Jugador j = (Jugador) lista.get(i);
        Glide.with(context).load(j.getImagen()).into(holderAlineacion.getImagen());
        holderAlineacion.getNombre().setText(j.getNombre());
        holderAlineacion.getPosicion().setText(j.getPos());


    }

    @Override
    public int getItemCount() {
        return lista.size();
    }

    class MiHolder extends RecyclerView.ViewHolder {
        ImageView imagen;
        TextView nombre, posicion;

        public MiHolder(@NonNull View v) {
            super(v);
            imagen = v.findViewById(R.id.jugador);
            nombre = v.findViewById(R.id.nombre);
            posicion = v.findViewById(R.id.posicion);
        }

        public ImageView getImagen() {
            return imagen;
        }

        public TextView getNombre() {
            return nombre;
        }

        public TextView getPosicion() {
            return posicion;
        }
    }
}
