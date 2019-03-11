package com.example.javi.practicafragments1.fragments;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.javi.practicafragments1.R;
import com.example.javi.practicafragments1.adaptadores.AdaptadorRecycler;
import com.example.javi.practicafragments1.utils.DataSet;
import com.example.javi.practicafragments1.utils.Version;

public class FragmentUno extends Fragment {
    RecyclerView recyclerView;
    View v;
    Context c;



    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        c=context;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        v= inflater.inflate(R.layout.fragment_layout,container,false);
        recyclerView=v.findViewById(R.id.recyclerVersiones1);
        recyclerView.setAdapter(new AdaptadorRecycler(DataSet.listar(),c));
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false));

        return v;

    }

}
