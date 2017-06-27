package com.example.joseluis.rmw;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.Arrays;
import java.util.List;

public class Creditos extends AppCompatActivity {

    RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creditos);

        rv = (RecyclerView) findViewById(R.id.rvCreditos);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        rv.setLayoutManager((llm));

        List <claseCredito> listaAcreditatos;

        listaAcreditatos = Arrays.asList(new claseCredito(R.drawable.yo, "Desarrollador", "José Luis Jiménez Recio"),
                new claseCredito(R.drawable.miroci, "Graficos", "Rocio Solis Izquierdo"),
                new claseCredito(R.drawable.mifati, "Inspeccion", "Fatima Breña Casco"));

        Adaptadorrv adaptadorrv = new Adaptadorrv(listaAcreditatos);
        rv.setAdapter(adaptadorrv);
    }
}
