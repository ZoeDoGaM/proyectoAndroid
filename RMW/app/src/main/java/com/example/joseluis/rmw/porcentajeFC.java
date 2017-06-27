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

public class porcentajeFC extends AppCompatActivity {

    TextView tvPorcentajes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_porcentaje_fc);

        tvPorcentajes = (TextView) findViewById(R.id.tvPorcentajeFC);

        //tvPorcentajes.findViewById(R.id.tvPorcentajeFC);

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
            Integer contDocena1=0;
            Integer contDocena2=0;
            Integer contDocena3=0;
            Integer contColumna1=0;
            Integer contColumna2=0;
            Integer contColumna3=0;
            Integer contCeros=0;
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
                        if (listaNumero.get(i) >= 0 && listaNumero.get(i) < 13)
                            contDocena1++;
                        if (listaNumero.get(i) >= 13 && listaNumero.get(i) < 25)
                            contDocena2++;
                        if (listaNumero.get(i) >= 25 && listaNumero.get(i) < 37)
                            contDocena3++;
                        switch (listaNumero.get(i)){
                            case 1:
                            case 4:
                            case 7:
                            case 10:
                            case 13:
                            case 16:
                            case 19:
                            case 22:
                            case 25:
                            case 28:
                            case 31:
                            case 34:
                                contColumna1++;
                                break;
                            case 2:
                            case 5:
                            case 8:
                            case 11:
                            case 14:
                            case 17:
                            case 20:
                            case 23:
                            case 26:
                            case 29:
                            case 32:
                            case 35:
                                contColumna2++;
                                break;
                            default:
                                contColumna3++;
                        }
                    }
                    else{
                        contCeros++;
                    }
                }
            }
            Float porc = ((float) contCeros / (float) contTotal) *100;
            String cadenaFinal = "Porcentaje de 0: " + porc.toString() + "%\n";
            porc = ((float) contDocena1 / (float) contTotal) *100;
            cadenaFinal+="Porcentaje de Primera docena: " + porc.toString() + "%\n";
            porc = ((float) contDocena2 / (float) contTotal) *100;
            cadenaFinal+="Porcentaje de Segunda docena: " + porc.toString() + "%\n";
            porc = ((float) contDocena3 / (float) contTotal) *100;
            cadenaFinal+="Porcentaje de Tercera docena: " + porc.toString() + "%\n";
            porc = ((float) contColumna1 / (float) contTotal) *100;
            cadenaFinal+="Porcentaje de Primera columna: " + porc.toString() + "%\n";
            porc = ((float) contColumna2 / (float) contTotal) *100;
            cadenaFinal+="Porcentaje de Segunda columna: " + porc.toString() + "%\n";
            porc = ((float) contColumna3 / (float) contTotal) *100;
            cadenaFinal+="Porcentaje de Tercera columna: " + porc.toString() + "%\n";





            tvPorcentajes.setText(cadenaFinal);

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
