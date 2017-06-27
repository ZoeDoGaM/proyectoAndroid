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

public class suertesSimples extends AppCompatActivity {

    TextView tvMensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suertes_simples);

        tvMensaje = (TextView) findViewById(R.id.tvSuertesSimples);



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
            Integer contNegro=0;
            Integer contRojo=0;
            Integer contCeros=0;
            Integer contPares=0;
            Integer contImpares=0;
            Integer contFalta=0;
            Integer contPasa=0;
            Integer contTotal=0;

            JSONArray ja = null;
            ArrayList<Integer> listaNumero = new ArrayList<Integer>();
            s=s.replace("[\"", "");
            s=s.replace("\"]", "-");
            //tvNumero.setText(s.toString());
            String partido[] = s.split("-");
            for(int i=0; i<partido.length-1; i++)
                listaNumero.add(Integer.parseInt(partido[i]));


            for(int i=0; i<listaNumero.size(); i++){
                if(listaNumero.get(i)>=0 && listaNumero.get(i)<37){
                    contTotal++;
                    if(listaNumero.get(i)!=0) {
                        if (listaNumero.get(i) % 2 == 0) {
                            contPares++;
                        }
                        else{
                            contImpares++;
                        }

                        if(listaNumero.get(i)>18){
                            contFalta++;
                        }
                        else{
                            contPasa++;
                        }
                        switch (listaNumero.get(i)){
                            case 1:
                            case 3:
                            case 5:
                            case 7:
                            case 9:
                            case 12:
                            case 14:
                            case 16:
                            case 18:
                            case 19:
                            case 21:
                            case 23:
                            case 25:
                            case 27:
                            case 30:
                            case 32:
                            case 34:
                            case 36:
                                contRojo++;
                                break;
                            default:
                                contNegro++;
                                break;
                        }
                    }
                    else{
                        contCeros++;
                    }
                }
            }
            Float porc = ((float) contCeros / (float) contTotal) *100;
            String cadenaFinal = "Porcentaje de 0: " + porc.toString() + "%\n";
            porc = ((float) contNegro / (float) contTotal) *100;
            cadenaFinal+="Porcentaje de Negros: " + porc.toString() + "%\n";
            porc = ((float) contRojo / (float) contTotal) *100;
            cadenaFinal+="Porcentaje de Rojos: " + porc.toString() + "%\n";
            porc = ((float) contPares / (float) contTotal) *100;
            cadenaFinal+="Porcentaje de Pares: " + porc.toString() + "%\n";
            porc = ((float) contImpares / (float) contTotal) *100;
            cadenaFinal+="Porcentaje de Impares: " + porc.toString() + "%\n";
            porc = ((float) contFalta / (float) contTotal) *100;
            cadenaFinal+="Porcentaje de Falta: " + porc.toString() + "%\n";
            porc = ((float) contPasa / (float) contTotal) *100;
            cadenaFinal+="Porcentaje de Pasa: " + porc.toString() + "%\n";





            tvMensaje.setText(cadenaFinal);

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
