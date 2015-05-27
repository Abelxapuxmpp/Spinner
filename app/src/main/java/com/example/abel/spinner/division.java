package com.example.abel.spinner;

import android.app.Dialog;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class division extends ActionBarActivity implements View.OnClickListener{

    EditText valor1, valor2, resultado;
    Button boton1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_division);

        valor1 = (EditText) findViewById(R.id.valor1);
        valor2 = (EditText) findViewById(R.id.valor2);
        resultado = (EditText) findViewById(R.id.valor3);
        boton1 = (Button) findViewById(R.id.Boton3);

        boton1.setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_division, menu);
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
            finish();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.Boton3:
                if (valor1.getText().toString().equals("") || valor2.getText().toString().equals("")){
                    Dialog d = new Dialog(this);
                    d.setTitle("¡ERROR!");
                    TextView tv = new TextView(this);
                    tv.setText("Debe ingresar los dos valores");
                    d.setContentView(tv);
                    d.show();
                }
                else {
                    float v1 = Float.parseFloat(valor1.getText().toString());
                    float v2 = Float.parseFloat(valor2.getText().toString());
                    float v3 = v1 / v2;
                    resultado.setText("" + v3);
                }
                break;
        }
    }
}
