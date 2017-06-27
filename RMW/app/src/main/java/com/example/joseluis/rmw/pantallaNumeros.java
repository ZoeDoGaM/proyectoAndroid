package com.example.joseluis.rmw;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.util.StringBuilderPrinter;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class pantallaNumeros extends AppCompatActivity {

    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13, btn14, btn15, btn16, btn17, btn18, btn19, btn20, btn21,
    btn22, btn23, btn24, btn25, btn26, btn27, btn28, btn29, btn30, btn31, btn32, btn33, btn34, btn35, btn36;

    ObtenerWebService hiloconexion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_numeros);

        btn0 = (Button) findViewById(R.id.boton0);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Bundle bundle = getIntent().getExtras();
                String datoUsuario = bundle.getString("usuario").toString();

                hiloconexion = new ObtenerWebService();
                String dir="http://www.newtoncaceres.com/registro.php?numero=0&usuario="+datoUsuario;
                hiloconexion.execute(dir);
                //new CargarDatos().execute("http://newtoncaceres.com/registro.php?numero=0&usuario=zoedogam");

                Intent intent = new Intent(pantallaNumeros.this, mostrarInfoNumero.class);
                intent.putExtra("numero", "0");
                startActivity(intent);
                finish();
            }
        });

        btn1 = (Button) findViewById(R.id.boton1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = getIntent().getExtras();
                String datoUsuario = bundle.getString("usuario").toString();

                hiloconexion = new ObtenerWebService();
                String dir="http://www.newtoncaceres.com/registro.php?numero=1&usuario="+datoUsuario;
                hiloconexion.execute(dir);

                Intent intent = new Intent(pantallaNumeros.this, mostrarInfoNumero.class);
                intent.putExtra("numero", "1");
                startActivity(intent);
                finish();
            }
        });

        btn2 = (Button) findViewById(R.id.boton2);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = getIntent().getExtras();
                String datoUsuario = bundle.getString("usuario").toString();

                hiloconexion = new ObtenerWebService();
                String dir="http://www.newtoncaceres.com/registro.php?numero=2&usuario="+datoUsuario;
                hiloconexion.execute(dir);

                Intent intent = new Intent(pantallaNumeros.this, mostrarInfoNumero.class);
                intent.putExtra("numero", "2");
                startActivity(intent);
                finish();
            }
        });

        btn3 = (Button) findViewById(R.id.boton3);

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = getIntent().getExtras();
                String datoUsuario = bundle.getString("usuario").toString();

                hiloconexion = new ObtenerWebService();
                String dir="http://www.newtoncaceres.com/registro.php?numero=3&usuario="+datoUsuario;
                hiloconexion.execute(dir);

                Intent intent = new Intent(pantallaNumeros.this, mostrarInfoNumero.class);
                intent.putExtra("numero", "3");
                startActivity(intent);
                finish();
            }
        });

        btn4 = (Button) findViewById(R.id.boton4);

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = getIntent().getExtras();
                String datoUsuario = bundle.getString("usuario").toString();

                hiloconexion = new ObtenerWebService();
                String dir="http://www.newtoncaceres.com/registro.php?numero=4&usuario="+datoUsuario;
                hiloconexion.execute(dir);

                Intent intent = new Intent(pantallaNumeros.this, mostrarInfoNumero.class);
                intent.putExtra("numero", "4");
                startActivity(intent);
                finish();
            }
        });

        btn5 = (Button) findViewById(R.id.boton5);

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = getIntent().getExtras();
                String datoUsuario = bundle.getString("usuario").toString();

                hiloconexion = new ObtenerWebService();
                String dir="http://www.newtoncaceres.com/registro.php?numero=5&usuario="+datoUsuario;
                hiloconexion.execute(dir);

                Intent intent = new Intent(pantallaNumeros.this, mostrarInfoNumero.class);
                intent.putExtra("numero", "5");
                startActivity(intent);
                finish();
            }
        });

        btn6 = (Button) findViewById(R.id.boton6);

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = getIntent().getExtras();
                String datoUsuario = bundle.getString("usuario").toString();

                hiloconexion = new ObtenerWebService();
                String dir="http://www.newtoncaceres.com/registro.php?numero=6&usuario="+datoUsuario;
                hiloconexion.execute(dir);

                Intent intent = new Intent(pantallaNumeros.this, mostrarInfoNumero.class);
                intent.putExtra("numero", "6");
                startActivity(intent);
                finish();
            }
        });

        btn7 = (Button) findViewById(R.id.boton7);

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = getIntent().getExtras();
                String datoUsuario = bundle.getString("usuario").toString();

                hiloconexion = new ObtenerWebService();
                String dir="http://www.newtoncaceres.com/registro.php?numero=7&usuario="+datoUsuario;
                hiloconexion.execute(dir);

                Intent intent = new Intent(pantallaNumeros.this, mostrarInfoNumero.class);
                intent.putExtra("numero", "7");
                startActivity(intent);
                finish();
            }
        });

        btn8 = (Button) findViewById(R.id.boton8);

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = getIntent().getExtras();
                String datoUsuario = bundle.getString("usuario").toString();

                hiloconexion = new ObtenerWebService();
                String dir="http://www.newtoncaceres.com/registro.php?numero=8&usuario="+datoUsuario;
                hiloconexion.execute(dir);

                Intent intent = new Intent(pantallaNumeros.this, mostrarInfoNumero.class);
                intent.putExtra("numero", "8");
                startActivity(intent);
                finish();
            }
        });

        btn9 = (Button) findViewById(R.id.boton9);

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = getIntent().getExtras();
                String datoUsuario = bundle.getString("usuario").toString();

                hiloconexion = new ObtenerWebService();
                String dir="http://www.newtoncaceres.com/registro.php?numero=9&usuario="+datoUsuario;
                hiloconexion.execute(dir);

                Intent intent = new Intent(pantallaNumeros.this, mostrarInfoNumero.class);
                intent.putExtra("numero", "9");
                startActivity(intent);
                finish();
            }
        });

        btn10 = (Button) findViewById(R.id.boton10);

        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = getIntent().getExtras();
                String datoUsuario = bundle.getString("usuario").toString();

                hiloconexion = new ObtenerWebService();
                String dir="http://www.newtoncaceres.com/registro.php?numero=10&usuario="+datoUsuario;
                hiloconexion.execute(dir);

                Intent intent = new Intent(pantallaNumeros.this, mostrarInfoNumero.class);
                intent.putExtra("numero", "10");
                startActivity(intent);
                finish();
            }
        });

        btn11 = (Button) findViewById(R.id.boton11);

        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = getIntent().getExtras();
                String datoUsuario = bundle.getString("usuario").toString();

                hiloconexion = new ObtenerWebService();
                String dir="http://www.newtoncaceres.com/registro.php?numero=11&usuario="+datoUsuario;
                hiloconexion.execute(dir);

                Intent intent = new Intent(pantallaNumeros.this, mostrarInfoNumero.class);
                intent.putExtra("numero", "11");
                startActivity(intent);
                finish();
            }
        });

        btn12 = (Button) findViewById(R.id.boton12);

        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = getIntent().getExtras();
                String datoUsuario = bundle.getString("usuario").toString();

                hiloconexion = new ObtenerWebService();
                String dir="http://www.newtoncaceres.com/registro.php?numero=12&usuario="+datoUsuario;
                hiloconexion.execute(dir);

                Intent intent = new Intent(pantallaNumeros.this, mostrarInfoNumero.class);
                intent.putExtra("numero", "12");
                startActivity(intent);
                finish();
            }
        });

        btn13 = (Button) findViewById(R.id.boton13);

        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = getIntent().getExtras();
                String datoUsuario = bundle.getString("usuario").toString();

                hiloconexion = new ObtenerWebService();
                String dir="http://www.newtoncaceres.com/registro.php?numero=13&usuario="+datoUsuario;
                hiloconexion.execute(dir);

                Intent intent = new Intent(pantallaNumeros.this, mostrarInfoNumero.class);
                intent.putExtra("numero", "13");
                startActivity(intent);
                finish();
            }
        });

        btn14 = (Button) findViewById(R.id.boton14);

        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = getIntent().getExtras();
                String datoUsuario = bundle.getString("usuario").toString();

                hiloconexion = new ObtenerWebService();
                String dir="http://www.newtoncaceres.com/registro.php?numero=14&usuario="+datoUsuario;
                hiloconexion.execute(dir);

                Intent intent = new Intent(pantallaNumeros.this, mostrarInfoNumero.class);
                intent.putExtra("numero", "14");
                startActivity(intent);
                finish();
            }
        });

        btn15 = (Button) findViewById(R.id.boton15);

        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = getIntent().getExtras();
                String datoUsuario = bundle.getString("usuario").toString();

                hiloconexion = new ObtenerWebService();
                String dir="http://www.newtoncaceres.com/registro.php?numero=15&usuario="+datoUsuario;
                hiloconexion.execute(dir);

                Intent intent = new Intent(pantallaNumeros.this, mostrarInfoNumero.class);
                intent.putExtra("numero", "15");
                startActivity(intent);
                finish();
            }
        });

        btn16 = (Button) findViewById(R.id.boton16);

        btn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = getIntent().getExtras();
                String datoUsuario = bundle.getString("usuario").toString();

                hiloconexion = new ObtenerWebService();
                String dir="http://www.newtoncaceres.com/registro.php?numero=16&usuario="+datoUsuario;
                hiloconexion.execute(dir);

                Intent intent = new Intent(pantallaNumeros.this, mostrarInfoNumero.class);
                intent.putExtra("numero", "16");
                startActivity(intent);
                finish();
            }
        });

        btn17 = (Button) findViewById(R.id.boton17);

        btn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = getIntent().getExtras();
                String datoUsuario = bundle.getString("usuario").toString();

                hiloconexion = new ObtenerWebService();
                String dir="http://www.newtoncaceres.com/registro.php?numero=17&usuario="+datoUsuario;
                hiloconexion.execute(dir);

                Intent intent = new Intent(pantallaNumeros.this, mostrarInfoNumero.class);
                intent.putExtra("numero", "17");
                startActivity(intent);
                finish();
            }
        });

        btn18 = (Button) findViewById(R.id.boton18);

        btn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = getIntent().getExtras();
                String datoUsuario = bundle.getString("usuario").toString();

                hiloconexion = new ObtenerWebService();
                String dir="http://www.newtoncaceres.com/registro.php?numero=18&usuario="+datoUsuario;
                hiloconexion.execute(dir);

                Intent intent = new Intent(pantallaNumeros.this, mostrarInfoNumero.class);
                intent.putExtra("numero", "18");
                startActivity(intent);
                finish();
            }
        });

        btn19 = (Button) findViewById(R.id.boton19);

        btn19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = getIntent().getExtras();
                String datoUsuario = bundle.getString("usuario").toString();

                hiloconexion = new ObtenerWebService();
                String dir="http://www.newtoncaceres.com/registro.php?numero=19&usuario="+datoUsuario;
                hiloconexion.execute(dir);

                Intent intent = new Intent(pantallaNumeros.this, mostrarInfoNumero.class);
                intent.putExtra("numero", "19");
                startActivity(intent);
                finish();
            }
        });

        btn20 = (Button) findViewById(R.id.boton20);

        btn20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = getIntent().getExtras();
                String datoUsuario = bundle.getString("usuario").toString();

                hiloconexion = new ObtenerWebService();
                String dir="http://www.newtoncaceres.com/registro.php?numero=20&usuario="+datoUsuario;
                hiloconexion.execute(dir);

                Intent intent = new Intent(pantallaNumeros.this, mostrarInfoNumero.class);
                intent.putExtra("numero", "20");
                startActivity(intent);
                finish();
            }
        });

        btn21 = (Button) findViewById(R.id.boton21);

        btn21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = getIntent().getExtras();
                String datoUsuario = bundle.getString("usuario").toString();

                hiloconexion = new ObtenerWebService();
                String dir="http://www.newtoncaceres.com/registro.php?numero=21&usuario="+datoUsuario;
                hiloconexion.execute(dir);

                Intent intent = new Intent(pantallaNumeros.this, mostrarInfoNumero.class);
                intent.putExtra("numero", "21");
                startActivity(intent);
                finish();
            }
        });

        btn22 = (Button) findViewById(R.id.boton22);

        btn22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = getIntent().getExtras();
                String datoUsuario = bundle.getString("usuario").toString();

                hiloconexion = new ObtenerWebService();
                String dir="http://www.newtoncaceres.com/registro.php?numero=22&usuario="+datoUsuario;
                hiloconexion.execute(dir);

                Intent intent = new Intent(pantallaNumeros.this, mostrarInfoNumero.class);
                intent.putExtra("numero", "22");
                startActivity(intent);
                finish();
            }
        });

        btn23 = (Button) findViewById(R.id.boton23);

        btn23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = getIntent().getExtras();
                String datoUsuario = bundle.getString("usuario").toString();

                hiloconexion = new ObtenerWebService();
                String dir="http://www.newtoncaceres.com/registro.php?numero=23&usuario="+datoUsuario;
                hiloconexion.execute(dir);

                Intent intent = new Intent(pantallaNumeros.this, mostrarInfoNumero.class);
                intent.putExtra("numero", "23");
                startActivity(intent);
                finish();
            }
        });

        btn24 = (Button) findViewById(R.id.boton24);

        btn24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = getIntent().getExtras();
                String datoUsuario = bundle.getString("usuario").toString();

                hiloconexion = new ObtenerWebService();
                String dir="http://www.newtoncaceres.com/registro.php?numero=24&usuario="+datoUsuario;
                hiloconexion.execute(dir);

                Intent intent = new Intent(pantallaNumeros.this, mostrarInfoNumero.class);
                intent.putExtra("numero", "24");
                startActivity(intent);
                finish();
            }
        });

        btn25 = (Button) findViewById(R.id.boton25);

        btn25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = getIntent().getExtras();
                String datoUsuario = bundle.getString("usuario").toString();

                hiloconexion = new ObtenerWebService();
                String dir="http://www.newtoncaceres.com/registro.php?numero=25&usuario="+datoUsuario;
                hiloconexion.execute(dir);

                Intent intent = new Intent(pantallaNumeros.this, mostrarInfoNumero.class);
                intent.putExtra("numero", "25");
                startActivity(intent);
                finish();
            }
        });

        btn26 = (Button) findViewById(R.id.boton26);

        btn26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = getIntent().getExtras();
                String datoUsuario = bundle.getString("usuario").toString();

                hiloconexion = new ObtenerWebService();
                String dir="http://www.newtoncaceres.com/registro.php?numero=26&usuario="+datoUsuario;
                hiloconexion.execute(dir);

                Intent intent = new Intent(pantallaNumeros.this, mostrarInfoNumero.class);
                intent.putExtra("numero", "26");
                startActivity(intent);
                finish();
            }
        });

        btn27 = (Button) findViewById(R.id.boton27);

        btn27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = getIntent().getExtras();
                String datoUsuario = bundle.getString("usuario").toString();

                hiloconexion = new ObtenerWebService();
                String dir="http://www.newtoncaceres.com/registro.php?numero=27&usuario="+datoUsuario;
                hiloconexion.execute(dir);

                Intent intent = new Intent(pantallaNumeros.this, mostrarInfoNumero.class);
                intent.putExtra("numero", "27");
                startActivity(intent);
                finish();
            }
        });

        btn28 = (Button) findViewById(R.id.boton28);

        btn28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = getIntent().getExtras();
                String datoUsuario = bundle.getString("usuario").toString();

                hiloconexion = new ObtenerWebService();
                String dir="http://www.newtoncaceres.com/registro.php?numero=28&usuario="+datoUsuario;
                hiloconexion.execute(dir);

                Intent intent = new Intent(pantallaNumeros.this, mostrarInfoNumero.class);
                intent.putExtra("numero", "28");
                startActivity(intent);
                finish();
            }
        });

        btn29 = (Button) findViewById(R.id.boton29);

        btn29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = getIntent().getExtras();
                String datoUsuario = bundle.getString("usuario").toString();

                hiloconexion = new ObtenerWebService();
                String dir="http://www.newtoncaceres.com/registro.php?numero=29&usuario="+datoUsuario;
                hiloconexion.execute(dir);

                Intent intent = new Intent(pantallaNumeros.this, mostrarInfoNumero.class);
                intent.putExtra("numero", "29");
                startActivity(intent);
                finish();
            }
        });

        btn30 = (Button) findViewById(R.id.boton30);

        btn30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = getIntent().getExtras();
                String datoUsuario = bundle.getString("usuario").toString();

                hiloconexion = new ObtenerWebService();
                String dir="http://www.newtoncaceres.com/registro.php?numero=30&usuario="+datoUsuario;
                hiloconexion.execute(dir);

                Intent intent = new Intent(pantallaNumeros.this, mostrarInfoNumero.class);
                intent.putExtra("numero", "30");
                startActivity(intent);
                finish();
            }
        });

        btn31 = (Button) findViewById(R.id.boton31);

        btn31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = getIntent().getExtras();
                String datoUsuario = bundle.getString("usuario").toString();

                hiloconexion = new ObtenerWebService();
                String dir="http://www.newtoncaceres.com/registro.php?numero=31&usuario="+datoUsuario;
                hiloconexion.execute(dir);

                Intent intent = new Intent(pantallaNumeros.this, mostrarInfoNumero.class);
                intent.putExtra("numero", "31");
                startActivity(intent);
                finish();
            }
        });

        btn32 = (Button) findViewById(R.id.boton32);

        btn32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = getIntent().getExtras();
                String datoUsuario = bundle.getString("usuario").toString();

                hiloconexion = new ObtenerWebService();
                String dir="http://www.newtoncaceres.com/registro.php?numero=32&usuario="+datoUsuario;
                hiloconexion.execute(dir);

                Intent intent = new Intent(pantallaNumeros.this, mostrarInfoNumero.class);
                intent.putExtra("numero", "32");
                startActivity(intent);
                finish();
            }
        });

        btn33 = (Button) findViewById(R.id.boton33);

        btn33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = getIntent().getExtras();
                String datoUsuario = bundle.getString("usuario").toString();

                hiloconexion = new ObtenerWebService();
                String dir="http://www.newtoncaceres.com/registro.php?numero=33&usuario="+datoUsuario;
                hiloconexion.execute(dir);

                Intent intent = new Intent(pantallaNumeros.this, mostrarInfoNumero.class);
                intent.putExtra("numero", "33");
                startActivity(intent);
                finish();
            }
        });

        btn34 = (Button) findViewById(R.id.boton34);

        btn34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = getIntent().getExtras();
                String datoUsuario = bundle.getString("usuario").toString();

                hiloconexion = new ObtenerWebService();
                String dir="http://www.newtoncaceres.com/registro.php?numero=34&usuario="+datoUsuario;
                hiloconexion.execute(dir);

                Intent intent = new Intent(pantallaNumeros.this, mostrarInfoNumero.class);
                intent.putExtra("numero", "34");
                startActivity(intent);
                finish();
            }
        });

        btn35 = (Button) findViewById(R.id.boton35);

        btn35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = getIntent().getExtras();
                String datoUsuario = bundle.getString("usuario").toString();

                hiloconexion = new ObtenerWebService();
                String dir="http://www.newtoncaceres.com/registro.php?numero=35&usuario="+datoUsuario;
                hiloconexion.execute(dir);

                Intent intent = new Intent(pantallaNumeros.this, mostrarInfoNumero.class);
                intent.putExtra("numero", "35");
                startActivity(intent);
                finish();
            }
        });

        btn36 = (Button) findViewById(R.id.boton36);

        btn36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = getIntent().getExtras();
                String datoUsuario = bundle.getString("usuario").toString();

                hiloconexion = new ObtenerWebService();
                String dir="http://www.newtoncaceres.com/registro.php?numero=36&usuario="+datoUsuario;
                hiloconexion.execute(dir);

                Intent intent = new Intent(pantallaNumeros.this, mostrarInfoNumero.class);
                intent.putExtra("numero", "36");
                startActivity(intent);
                finish();
            }
        });
    }

    public class ObtenerWebService extends AsyncTask<String, Void, String>{

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
        }

        @Override
        protected void onProgressUpdate(Void... values) {
            super.onProgressUpdate(values);
        }

        @Override
        protected void onCancelled(String s) {
            super.onCancelled(s);
        }

        @Override
        protected String doInBackground(String... params) {
            URL url = null;
            String cadena = params[0];
            try{
                url = new URL(cadena);
                HttpURLConnection connection = (HttpURLConnection) url.openConnection(); //Abrir la conexión.
                //connection.setRequestProperty("User-Agent", "Mozilla/5.0" + " (Linux; Android 5.0; es_ES) Ejemplo HTTP");

                int respuesta = connection.getResponseCode();
                if(respuesta == HttpURLConnection.HTTP_OK){
                    Log.i("URL",""+cadena);
                }
                else{
                    Log.i("URL","Imposible conectar...");
                }

            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            return null;
        }
    }

}
