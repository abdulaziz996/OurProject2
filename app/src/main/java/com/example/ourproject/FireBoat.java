package com.example.ourproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class FireBoat extends Fragment {
    private ArrayList<AdvItem> advItems = new ArrayList<>();



    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fregmnthome, container, false);
        RecyclerView recyclerView = root.findViewById(R.id.recucle);
        recyclerView.setHasFixedSize(true);


        recyclerView.setAdapter(new ItemAdapter(advItems, getActivity()));
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        advItems.add(new AdvItem(R.drawable.karib, "Fire Boat", "0", "0"));
        advItems.add(new AdvItem(R.drawable.goos, "Diving", "1", "0"));
        advItems.add(new AdvItem(R.drawable.tkem, "Camping", "2", "0"));
        advItems.add(new AdvItem(R.drawable.img_7, "Hiking", "3", "0"));
 return root;}
   }