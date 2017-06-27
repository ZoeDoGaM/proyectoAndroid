package com.example.joseluis.rmw;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class BorrarUsuario extends AppCompatActivity {

    EditText etBorrar;
    Button btnBorrarb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_borrar_usuario);

        btnBorrarb = (Button) findViewById(R.id.botonBorrarBorrar);

        etBorrar = (EditText) findViewById(R.id.etPedirIdBorrar);
        final AyudaBD ayudaBD = new AyudaBD(getApplicationContext());


        btnBorrarb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SQLiteDatabase db = ayudaBD.getWritableDatabase();

                String selection = AyudaBD.DatosTabla._ID+" = " + etBorrar.getText().toString();
                String argsel[] = {etBorrar.getText().toString()};
                long dev=db.delete(AyudaBD.DatosTabla.TABLE_NAME, selection, null);
                if(dev == 0) {
                    Toast.makeText(getApplicationContext(), "No se pudo borrar el usuario con ID: "+etBorrar.getText().toString(), Toast.LENGTH_LONG).show();
                }
                if(dev == 1){
                    Toast.makeText(getApplicationContext(), "Borrado con éxito el usuario con ID: "+etBorrar.getText().toString(), Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
