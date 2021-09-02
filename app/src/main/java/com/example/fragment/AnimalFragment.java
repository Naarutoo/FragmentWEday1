package com.example.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class AnimalFragment extends Fragment {
private RecyclerView recyclerView;
private ArrayList<Animal>animalList  = new ArrayList<>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_animal, container, false);
    }

    @Override
    public void onViewCreated( View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initviews(view);
        buildlist();
        setRecycleView();
    }

    private void setRecycleView() {
        AnimalAdapter adapter = new AnimalAdapter(animalList);
        GridLayoutManager grid = new GridLayoutManager(getContext(),2);
        recyclerView.setLayoutManager(grid);
        recyclerView.setAdapter(adapter);
    }

    private void buildlist() {
        for (int i=0;i<20;i++){
            Animal animal = new Animal("fox",R.drawable.fox);
            animalList.add(animal);
        }
    }

    private void initviews(View view) {
        recyclerView = view.findViewById(R.id.recyclerView);
    }


}