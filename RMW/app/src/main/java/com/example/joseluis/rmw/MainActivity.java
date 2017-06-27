package com.example.joseluis.rmw;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnEntrar, btnRegistro, btnCreditos, btnPref;
    EditText etTextoSaludo;
    TextView tvMensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final AyudaBD ayudaBD = new AyudaBD(getApplicationContext());

        btnCreditos = (Button)findViewById(R.id.botonCreditos);
        btnPref = (Button)findViewById(R.id.botonPreferencias);
        btnEntrar = (Button)findViewById(R.id.botonEntrar);
        tvMensaje = (TextView)findViewById(R.id.tvTitulo);
        etTextoSaludo = (EditText)findViewById(R.id.etPedirNick);

        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SQLiteDatabase db = ayudaBD.getReadableDatabase();

                String[] projection = {AyudaBD.DatosTabla.COLUMN_NAME_TITLE};
                String sortOrder = AyudaBD.DatosTabla._ID + " ASC";
                Cursor c = db.query(AyudaBD.DatosTabla.TABLE_NAME, projection, null, null, null, null, sortOrder);

                boolean enc=false;
                if (c.moveToFirst()) { //Asegurarnos de que hay alguno.
                    //Recorremos el cursor hasta que no haya más registros
                    do {
                        //Toast.makeText(getApplicationContext(), "Nombre de usuario leido: "+c.getString(0), Toast.LENGTH_LONG).show();
                        if(c.getString(0).contentEquals(etTextoSaludo.getText().toString()))
                            enc=true;
                    } while(c.moveToNext()&&!enc);
                }
                if(enc) {
                    Intent intent = new Intent(MainActivity.this, ElegirRuleta.class);
                    intent.putExtra("usuario", etTextoSaludo.getText().toString());
                    startActivity(intent);
                }
                else{
                    Toast.makeText(getApplicationContext(), "No se encuentra el nombre de usuario: "+etTextoSaludo.getText().toString(), Toast.LENGTH_LONG).show();
                }

            }
        });

        btnRegistro = (Button) findViewById(R.id.botonRegistro);
        btnRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, crearUsuario.class);
                startActivity(intent);
            }
        });

        btnCreditos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Creditos.class);
                startActivity(intent);
            }
        });

        btnPref.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, preferencias.class);
            }
        });

    }
}
