package com.example.felipe.actividad2ainterfaces;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FelipeNavarreActividad2A extends Activity {
    int contador=0;
    Button arriba;
    Button abajo;
    TextView uno;
    TextView dos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_felipe_navarre_actividad2);
        arriba=(Button) findViewById(R.id.arriba);
        abajo= (Button) findViewById(R.id.abajo);
        uno = (TextView)findViewById(R.id.uno);
        dos = (TextView)findViewById(R.id.dos);
        arriba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador=contador+1;
                if (contador!=1){
                dos.setText("Has pulsado "+contador+" veces los botones");
            }else{
                    dos.setText("Has pulsado una vez los botones");
                }
                uno.setText("Ultima pulsación Arriba");
            }
        });

        abajo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador=contador+1;
                if (contador!=1){
                    dos.setText("Has pulsado "+contador+" veces los botones");
                }else{
                    dos.setText("Has pulsado una vez los botones");
                }
                uno.setText("Ultima pulsación Abajo");

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_felipe_navarre_actividad2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
