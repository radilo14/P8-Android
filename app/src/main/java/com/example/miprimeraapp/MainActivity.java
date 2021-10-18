package com.example.miprimeraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // declaramos un textview llamado textoPrincipales
    private TextView textoPrincipales;
    private String frasePrincipal= "Hola desde el activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // asignamos al textView textoPrincipales el valor del TextView del activity_main.xml
        textoPrincipales = findViewById(R.id.textoPrincipal);
        // modificamos el campo del TextView
        textoPrincipales.setText(frasePrincipal);
    }
}