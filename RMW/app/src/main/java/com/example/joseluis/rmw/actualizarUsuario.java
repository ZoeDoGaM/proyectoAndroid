package com.example.joseluis.rmw;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ContentFrameLayout;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class actualizarUsuario extends AppCompatActivity {

    EditText etNnick, etNciudad, etNid;
    Button btnNactualizar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actualizar_usuario);


        final AyudaBD ayudaBD = new AyudaBD(getApplicationContext());


        etNnick = (EditText) findViewById(R.id.etPedirNuevoNick);
        etNciudad = (EditText) findViewById(R.id.etPedirNuevaCiudad);
        etNid = (EditText) findViewById(R.id.etPedirAntiguoID);

        btnNactualizar = (Button) findViewById(R.id.botonNuevoActualizar);

        btnNactualizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SQLiteDatabase db = ayudaBD.getWritableDatabase();
                ContentValues valores = new ContentValues();
                valores.put(AyudaBD.DatosTabla.COLUMN_NAME_TITLE, etNnick.getText().toString());
                valores.put(AyudaBD.DatosTabla.COLUMN_NAME_SUBTITLE, etNciudad.getText().toString());

                String selection = AyudaBD.DatosTabla._ID + " = " + etNid.getText().toString();

                int contador = db.update(AyudaBD.DatosTabla.TABLE_NAME, valores, selection, null);

                if(contador==-1){
                    Toast.makeText(getApplicationContext(), "No se encuentra el ID de usuario: "+etNid.getText().toString(), Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(getApplicationContext(), "Actualizado correctamente", Toast.LENGTH_LONG).show();
                }
            }
        });


    }
}
