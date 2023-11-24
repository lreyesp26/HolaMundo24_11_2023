package com.example.holamundo24_11_2023;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnEnviar(View view) {
        Intent intent = new Intent(MainActivity.this, actBienvenida.class);
        EditText txtNombre = (EditText)findViewById(R.id.txtNombre);
        Bundle b = new Bundle();
        b.putString("NOMBRE", txtNombre.getText().toString());
        intent.putExtras(b);
        startActivity(intent);
    }
}