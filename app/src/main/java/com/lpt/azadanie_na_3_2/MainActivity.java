package com.lpt.azadanie_na_3_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private String[] planety = { "Merkury", "Wenus", "Ziemia", "Mars", "Jowisz", "Saturn", "Uran", "Neptun" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<String> adapterPlanet = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                planety
        );

        ListView lista_planet = findViewById(R.id.listaPlanet);
        lista_planet.setAdapter(adapterPlanet);
    }
}
