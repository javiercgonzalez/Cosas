package com.example.javi.practicafragments1.adaptadores;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.javi.practicafragments1.R;
import com.example.javi.practicafragments1.fragments.FragmentUno;
import com.example.javi.practicafragments1.utils.Version;

import java.util.ArrayList;

public class AdaptadorRecycler extends RecyclerView.Adapter<AdaptadorRecycler.MiHolder> {
    ArrayList list;
    Context c;
    OnVersionRecyclerListener onVersionRecyclerListener;


    public AdaptadorRecycler(ArrayList list, Context c) {
        this.list = list;
        this.c = c;
        onVersionRecyclerListener = (OnVersionRecyclerListener) c;
    }

    @Override
    public MiHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(c).inflate(R.layout.item_recycler, viewGroup, false);

        return new MiHolder(view);
    }

    @Override
    public void onBindViewHolder(MiHolder miHolder, int i) {
        final Version v = (Version) list.get(i);
        miHolder.getImagen().setImageResource(v.getImagen());
        miHolder.getNombre().setText(v.getNombre());
        miHolder.getNombre().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View vista) {
                onVersionRecyclerListener.onVersionRecyclerSelected(v);

            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MiHolder extends RecyclerView.ViewHolder {
        ImageView imagen;
        TextView nombre;

        public MiHolder(View itemView) {
            super(itemView);
            imagen = itemView.findViewById(R.id.imagenRecycler);
            nombre = itemView.findViewById(R.id.nombreRecycler);
        }

        public ImageView getImagen() {
            return imagen;
        }

        public TextView getNombre() {
            return nombre;
        }
    }

    public interface OnVersionRecyclerListener {
        void onVersionRecyclerSelected(Version version);

    }
}

