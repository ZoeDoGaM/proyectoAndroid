package com.example.joseluis.rmw;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import org.json.JSONArray;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class frecuenciasGenerales extends AppCompatActivity {

    TextView tvFG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frecuencias_generales);

        tvFG = (TextView) findViewById(R.id.tvFrecuenciasGenerales);

        ObtenerWebService hiloconexion;
        hiloconexion = new ObtenerWebService();
        String dir="http://www.newtoncaceres.com/consulta.php";
        hiloconexion.execute(dir);
    }

    public class ObtenerWebService extends AsyncTask<String, Void, String> {

        public String readIt(InputStream stream, int len) throws IOException, UnsupportedEncodingException {
            Reader reader = null;
            reader = new InputStreamReader(stream, "UTF-8");
            char[] buffer = new char[len];
            reader.read(buffer);
            return new String(buffer);
        }

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected void onPostExecute(String s) {
            Integer cont=0;
            Integer contTodos=0;
            JSONArray ja = null;
            ArrayList<Integer> listaNumero = new ArrayList<Integer>();
            s=s.replace("[\"", "");
            s=s.replace("\"]", "-");
            //tvNumero.setText(s.toString());
            String partido[] = s.split("-");
            for(int i=0; i<partido.length-1; i++)
                listaNumero.add(Integer.parseInt(partido[i]));


            Integer Vector[] = new Integer [37];
            for(int i =0; i<37; i++)
                Vector[i]=0;
            for(int i=0; i<listaNumero.size(); i++){
                if(i<listaNumero.size() && listaNumero.get(i)!=null && listaNumero.get(i)>=0 && listaNumero.get(i) <37 ){
                    Vector[listaNumero.get(i)]++;
                    contTodos++;
                }
            }

            String cadenaFinal= "";
            Float porc;
            for(int i=0; i<37; i++) {
                porc = ((float) Vector[i] / (float) contTodos) * 100;
                cadenaFinal += Integer.toString(i) + " Veces: " + Vector[i].toString() + " Porcentaje: " + porc.toString() + "%\n";
            }

            tvFG.setText(cadenaFinal);

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
            String devuelve = " ";
            String cadena = params[0];
            try{
                url = new URL(cadena);
                HttpURLConnection connection = (HttpURLConnection) url.openConnection(); //Abrir la conexión.
                //connection.setRequestProperty("User-Agent", "Mozilla/5.0" + " (Linux; Android 5.0; es_ES) Ejemplo HTTP");

                int respuesta = connection.getResponseCode();
                if(respuesta == HttpURLConnection.HTTP_OK){
                    Log.i("URL",""+cadena);
                    //StringBuilder result = new StringBuilder();

                    InputStream in = new BufferedInputStream(connection.getInputStream()); //Cadena de entrada
                    BufferedReader reader = new BufferedReader(new InputStreamReader(in)); //A un bufferedreader

                    devuelve=readIt(in, 500);






                }
                else{
                    Log.i("URL","Imposible conectar...");
                }

            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } //catch (JSONException e) {
            //e.printStackTrace();
            //}

            return devuelve;
        }
    }
}
