package com.example.joseluis.rmw;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class crearUsuario extends AppCompatActivity {

    Button btnSave, btnDelete, btnUpdate, btnShow;
    EditText etNick, etCiudad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_usuario);

        btnSave = (Button) findViewById(R.id.botonSave);
        btnDelete = (Button) findViewById(R.id.botonDelete);
        btnUpdate = (Button) findViewById(R.id.botonUpdate);
        btnShow = (Button) findViewById(R.id.botonShow);

        etNick = (EditText) findViewById(R.id.etPedirNickRegistro);
        etCiudad = (EditText) findViewById(R.id.etPedirCiudadRegistro);

        final AyudaBD ayudaBD = new AyudaBD(getApplicationContext());

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SQLiteDatabase db = ayudaBD.getWritableDatabase();
                ContentValues valores = new ContentValues();
                //valores.put(AyudaBD.DatosTabla.COLUMN_NAME_ID, "1");
                valores.put(AyudaBD.DatosTabla.COLUMN_NAME_TITLE, etNick.getText().toString() );
                valores.put(AyudaBD.DatosTabla.COLUMN_NAME_SUBTITLE, etCiudad.getText().toString());

                Long idGuardado = db.insert(AyudaBD.DatosTabla.TABLE_NAME, null, valores);
                Toast.makeText(getApplicationContext(), "Se guardo el dato: "+idGuardado, Toast.LENGTH_LONG).show();
            }
        });

        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(crearUsuario.this, BorrarUsuario.class);
                startActivity(intent);
            }
        });

        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(crearUsuario.this, actualizarUsuario.class);
                startActivity(intent);
            }
        });

        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /*SQLiteDatabase db = ayudaBD.getReadableDatabase();
                String[] projection = {AyudaBD.DatosTabla._ID, AyudaBD.DatosTabla.COLUMN_NAME_TITLE, AyudaBD.DatosTabla.COLUMN_NAME_SUBTITLE};
                String sortOrder = AyudaBD.DatosTabla._ID + " DESC";
                Cursor c = db.query(AyudaBD.DatosTabla.TABLE_NAME, projection, null, null, null, null, sortOrder);

                c.moveToFirst();*/

                Intent intent = new Intent(crearUsuario.this, mostrarUsuarios.class);
                startActivity(intent);

            }
        });
    }
}
