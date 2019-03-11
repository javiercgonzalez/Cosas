package com.example.practicavolley.adaptadores;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.practicavolley.R;
import com.example.practicavolley.utils.Equipo;

import java.util.ArrayList;

public class AdaptadorRecyclerEquipos extends RecyclerView.Adapter<AdaptadorRecyclerEquipos.MiHolder> {
    Context context;
    ArrayList lista;
    OnRecyclerListener onRecyclerListener;


    public AdaptadorRecyclerEquipos(Context context, ArrayList lista) {
        this.context = context;
        this.lista = lista;
        onRecyclerListener = (OnRecyclerListener) context;
    }

    @NonNull
    @Override
    public MiHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(context).inflate(R.layout.item_recycler, viewGroup, false);
        MiHolder holder = new MiHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MiHolder holder, int i) {
        final Equipo e = (Equipo) lista.get(i);
        Glide.with(context).load(e.getCamiseta()).into(holder.getCamiseta());
        Glide.with(context).load(e.getEscudo()).into(holder.getEscudo());
        Glide.with(context).load(e.getEstadio()).into(holder.getEstadio());
        holder.getNombre().setText(e.getNombre());
        holder.getLinear().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onRecyclerListener.onRecyclerSelected(e);
            }
        });
    }

    @Override
    public int getItemCount() {
        return lista.size();
    }

    class MiHolder extends RecyclerView.ViewHolder {
        ImageView camiseta, estadio, escudo;
        TextView nombre;
        LinearLayout linear;

        public MiHolder(@NonNull View v) {
            super(v);
            camiseta = v.findViewById(R.id.cami);
            estadio = v.findViewById(R.id.estadio);
            escudo = v.findViewById(R.id.escudo);
            nombre = v.findViewById(R.id.nombreRecycler);
            linear = v.findViewById(R.id.linear);
        }

        public ImageView getCamiseta() {
            return camiseta;
        }

        public ImageView getEstadio() {
            return estadio;
        }

        public ImageView getEscudo() {
            return escudo;
        }

        public TextView getNombre() {
            return nombre;
        }

        public LinearLayout getLinear() {
            return linear;
        }
    }

    public interface OnRecyclerListener {
        void onRecyclerSelected(Equipo e);
    }
}
