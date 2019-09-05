package com.example.leonpsilva.sankatour;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.leonpsilva.sankatour.adapter.TourAdapter;
import com.example.leonpsilva.sankatour.modelos.Tour;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private List<Tour> tour = new ArrayList<>();
    private ArrayAdapter<Tour> tourArrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CriarTours();

        listView = findViewById(R.id.list_view_tour);

        tourArrayAdapter = new TourAdapter(MainActivity.this,
                (ArrayList<Tour>) tour );
        listView.setAdapter(tourArrayAdapter);
    }

    public void CriarTours() {
        tour.add(new Tour("1","Catedral",0.8,R.drawable.catedralsaocarlos));
        tour.add(new Tour("2","Cristo",3.6,R.drawable.cristo));
    }


}
