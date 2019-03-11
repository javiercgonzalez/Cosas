package com.example.practicafragments2.fragments;

import android.support.v4.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.practicafragments2.R;
import com.example.practicafragments2.adaptadores.AdaptadorRecycler2;
import com.example.practicafragments2.utils.Version;

public class FragmentDos extends Fragment {
    RecyclerView recyclerView;
    View v;
    Context c;
    Version version;

    public static FragmentDos newInstance(Version version) {
        FragmentDos d = new FragmentDos();
        Bundle b = new Bundle();
        b.putSerializable("version", version);
        d.setArguments(b);
        return d;

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        c = context;
        if (getArguments() != null) {
            version = (Version) getArguments().getSerializable("version");
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_layout2, container, false);
        recyclerView = v.findViewById(R.id.recyclerVersiones2);
        recyclerView.setAdapter(new AdaptadorRecycler2(c, version.getSubversiones()));
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        return v;

    }

}
