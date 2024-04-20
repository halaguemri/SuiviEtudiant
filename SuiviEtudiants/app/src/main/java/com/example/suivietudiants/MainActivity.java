package com.example.suivietudiants;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText name , password ;
    Button btn ;
    TextView tv ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.name);
        password = findViewById(R.id.password);
        btn = findViewById(R.id.button);
        tv = findViewById(R.id.textView3);

        btn.setOnClickListener(v -> {
            String nom = name.getText().toString();
            String mdp = password.getText().toString();

            if (nom.length() == 0 || mdp.length() == 0) {
                Toast.makeText(getApplicationContext(), "Remplir tous les champs svp", Toast.LENGTH_LONG).show();

            } else {
                Toast.makeText(getApplicationContext(), "Nom et mot de passe ne sont pas validés", Toast.LENGTH_LONG).show();
            }
        });
        tv.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, Inscription.class)));
    }
 }
