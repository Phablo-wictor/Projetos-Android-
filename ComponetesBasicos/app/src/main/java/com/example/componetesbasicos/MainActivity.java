package com.example.componetesbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void enviar(View view){

        EditText compoNome = findViewById(R.id.editnome);
        TextInputEditText compoEmail = findViewById(R.id.editemail);
        TextView textoResulatado = findViewById(R.id.textResulatado);
        TextView textoResulatado1 = findViewById(R.id.texto);

        String nome = compoNome.getText().toString();
        String email = compoEmail.getText().toString();

        textoResulatado.setText("Nome: "+ nome);
        textoResulatado1.setText("E-mail: "+ email);

    }


}