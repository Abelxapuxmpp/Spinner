package com.example.abel.spinner;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;


public class principal extends ActionBarActivity implements AdapterView.OnItemSelectedListener{

    Spinner spiner, spiner2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        spiner = (Spinner) findViewById(R.id.spinner1);
        spiner2 = (Spinner) findViewById(R.id.spinner2);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.operaciones, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_list_item_1);
        spiner.setAdapter(adapter);

        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this, R.array.conversiones, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_list_item_1);
        spiner2.setAdapter(adapter2);

        spiner.setOnItemSelectedListener(this);
        spiner2.setOnItemSelectedListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater menuInflater = getMenuInflater();
        getMenuInflater().inflate(R.menu.menu_principal, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.cerrar) {
            finish();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        int posicion = spiner.getSelectedItemPosition();
        int posicion2 = spiner2.getSelectedItemPosition();

        switch (posicion) {
            case 0:
                break;
            case 1:
                Intent abrirsuma = new Intent(principal.this, suma.class);
                startActivity(abrirsuma);
                break;
            case 2:
                Intent abrirresta = new Intent(principal.this, resta.class);
                startActivity(abrirresta);
                break;
            case 3:
                Intent abrirmultiplicacion = new Intent(principal.this, multiplicacion.class);
                startActivity(abrirmultiplicacion);
                break;
            case 4:
                Intent abrirdivision = new Intent(principal.this, division.class);
                startActivity(abrirdivision);
                break;
        }

        switch (posicion2) {
            case 0:
                break;
            case 1:
                Intent abrirgradosc = new Intent(principal.this, caf.class);
                startActivity(abrirgradosc);
                break;
            case 2:
                Intent abrirgradosf = new Intent(principal.this, fac.class);
                startActivity(abrirgradosf);
                break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
