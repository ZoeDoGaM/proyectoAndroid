package com.example.joseluis.rmw;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;



public class mostrarUsuarios extends AppCompatActivity {

    ListView lvUsuarios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_usuarios);

        final AyudaBD ayudaBD = new AyudaBD(getApplicationContext());
        lvUsuarios = (ListView)findViewById(R.id.lvMostrarUsuarios);

        ArrayList listado = new ArrayList();

        SQLiteDatabase db = ayudaBD.getReadableDatabase();
        String[] projection = {AyudaBD.DatosTabla._ID, AyudaBD.DatosTabla.COLUMN_NAME_TITLE, AyudaBD.DatosTabla.COLUMN_NAME_SUBTITLE};
        String sortOrder = AyudaBD.DatosTabla._ID + " ASC";
        Cursor c = db.query(AyudaBD.DatosTabla.TABLE_NAME, projection, null, null, null, null, sortOrder);

        if (c.moveToFirst()) {
            //Recorremos el cursor hasta que no haya más registros
            do {
                listado.add("Registro con ID: "+  c.getString(0));
                listado.add("Nombre: "+ c.getString(1));
                listado.add("Ciudad: "+ c.getString(2));
            } while(c.moveToNext());
        }



        ArrayAdapter adaptador =  new ArrayAdapter(this, android.R.layout.simple_list_item_1, listado);
        lvUsuarios.setAdapter(adaptador);

    }
}
