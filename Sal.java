package com.example.sqlapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editName, editMatricula;
    private Button btnInsertar, btnVerDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editName = findViewById(R.id.editName);
        editMatricula = findViewById(R.id.editMatricula);
        btnInsertar = findViewById(R.id.btnInsertar);
        btnVerDB = findViewById(R.id.btnVerDB);

        btnInsertar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editName.getText().toString();
                String matricula = editMatricula.getText().toString();

                if (name.isEmpty() || matricula.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Por favor llena todos los campos", Toast.LENGTH_SHORT).show();
                } else {
                    // Lógica para insertar en la base de datos
                    Toast.makeText(MainActivity.this, "Datos insertados correctamente", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnVerDB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lógica para mostrar la base de datos
                Toast.makeText(MainActivity.this, "Mostrando base de datos", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
