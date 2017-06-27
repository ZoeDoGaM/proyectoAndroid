package com.example.joseluis.rmw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class pantallaMenu extends AppCompatActivity {

    Button btnSS;
    Button btnPFC;
    Button btnFG;
    Button btnUNI;
    Button btnIN;
    Button btnBUI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_menu);

        btnSS = (Button) findViewById(R.id.botonSuertesSimples);

        btnSS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(pantallaMenu.this, suertesSimples.class);
                startActivity(intent);
            }
        });

        btnIN = (Button) findViewById(R.id.botonInsertarNumero);

        btnIN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(pantallaMenu.this, pantallaNumeros.class);
                Bundle bundle = getIntent().getExtras();
                String datoUsuario = bundle.getString("usuario").toString();
                intent.putExtra("usuario", datoUsuario.toString());
                startActivity(intent);
            }
        });

        btnPFC = (Button) findViewById(R.id.botonPorcentajeFilasColumnas);

        btnPFC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(pantallaMenu.this, porcentajeFC.class);
                startActivity(intent);
            }
        });

        btnFG = (Button) findViewById(R.id.botonFrecuenciasGenerales);

        btnFG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(pantallaMenu.this, frecuenciasGenerales.class);
                startActivity(intent);
            }
        });

        btnUNI = (Button) findViewById(R.id.botonUltimosInsertados);

        btnUNI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(pantallaMenu.this, ultimosInsertados.class);
                startActivity(intent);
            }
        });

        btnBUI = (Button) findViewById(R.id.botonBorrarUltimo);

        btnBUI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(pantallaMenu.this, borrarUltimo.class);
                startActivity(intent);
            }
        });
    }
}
