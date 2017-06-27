package com.example.joseluis.rmw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ElegirRuleta extends AppCompatActivity {

    Button btnEntrar1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elegir_ruleta);

        btnEntrar1 = (Button) findViewById(R.id.botonEntrar1);

        btnEntrar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = getIntent().getExtras();
                String datoUsuario = bundle.getString("usuario").toString();
                Intent intent2 = new Intent(ElegirRuleta.this, pantallaMenu.class);
                intent2.putExtra("usuario", datoUsuario.toString());
                startActivity(intent2);
            }
        });
    }
}
