package com.example.practicafragments2.adaptadores;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.practicafragments2.R;
import com.example.practicafragments2.utils.Version;

import java.util.ArrayList;

public class AdaptadorRecycler2 extends RecyclerView.Adapter<AdaptadorRecycler2.MiHolder> {
    ArrayList list;
    Context c;
    OnVersionRecyclerListener2 onVersionRecyclerListener2;

    public AdaptadorRecycler2(Context c, ArrayList list) {
        this.c = c;
        this.list = list;
        onVersionRecyclerListener2 = (OnVersionRecyclerListener2) c;
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
                onVersionRecyclerListener2.onVersionRecyclerSelected2(v);
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

    public interface OnVersionRecyclerListener2 {
        void onVersionRecyclerSelected2(Version version);

    }
}
