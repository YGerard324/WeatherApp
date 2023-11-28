package com.example.rainorhell.Activities.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.rainorhell.Activities.Adapters.HourlyAdapters;
import com.example.rainorhell.Activities.Domains.Hourly;
import com.example.rainorhell.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapterHourly;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initRecyclerView();
    }

    private void initRecyclerView() {
        ArrayList<Hourly> items=new ArrayList<>();

        items.add(new Hourly("21:00",24,"cloudy"));
        items.add(new Hourly("23:00",24,"sunny"));
        items.add(new Hourly("00:00",23,"wind"));
        items.add(new Hourly("01:00",22,"rainy"));
        items.add(new Hourly("02:00",20,"storm"));

        recyclerView = findViewById(R.id.view1);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        adapterHourly =  new HourlyAdapters(items);
        recyclerView.setAdapter(adapterHourly);

    }
}