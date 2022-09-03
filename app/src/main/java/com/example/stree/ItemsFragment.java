package com.example.stree;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class ItemsFragment extends Fragment {

    RecyclerView recyclerView;
    ArrayList<Item_model> arrItems = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_items, container, false);

        recyclerView = view.findViewById(R.id.recycleView);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));

        arrItems.add(new Item_model(R.drawable.demo,"watch","14wd","13","10","130"));
        arrItems.add(new Item_model(R.drawable.demo,"watch2","14wd","13","10","130"));
        arrItems.add(new Item_model(R.drawable.demo,"watch22","14wd","13","10","130"));
        arrItems.add(new Item_model(R.drawable.demo,"watch222","14wd","13","10","130"));
        arrItems.add(new Item_model(R.drawable.demo,"watc12h","14wd","13","10","130"));
        arrItems.add(new Item_model(R.drawable.demo,"watch","14wd","13","10","130"));
        arrItems.add(new Item_model(R.drawable.demo,"watch2","14wd","13","10","130"));
        arrItems.add(new Item_model(R.drawable.demo,"watch22","14wd","13","10","130"));
        arrItems.add(new Item_model(R.drawable.demo,"watch222","14wd","13","10","130"));
        arrItems.add(new Item_model(R.drawable.demo,"watc12h","14wd","13","10","130"));
        arrItems.add(new Item_model(R.drawable.demo,"watch","14wd","13","10","130"));
        arrItems.add(new Item_model(R.drawable.demo,"watch2","14wd","13","10","130"));
        arrItems.add(new Item_model(R.drawable.demo,"watch22","14wd","13","10","130"));
        arrItems.add(new Item_model(R.drawable.demo,"watch222","14wd","13","10","130"));
        arrItems.add(new Item_model(R.drawable.demo,"watc12h","14wd","13","10","130"));

        Item_adapter adapter = new Item_adapter(getContext(),arrItems);
        recyclerView.setAdapter(adapter);



        return view;
    }
}