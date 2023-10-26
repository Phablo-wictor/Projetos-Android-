package com.example.alcoolougasolina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText editPrecoAlcool, editPrecoGasolina;
    private TextView textResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editPrecoAlcool   = findViewById(R.id.editPrecoAlcool);
        editPrecoGasolina = findViewById(R.id.edtPrecoGasolina);
        textResultado     = findViewById(R.id.editResultado);

    }

    public void calcularPreco(){
        //recupera os valores digitados
        String precoAlcool   =  editPrecoAlcool.getText().toString();
        String precoGasolina  = editPrecoGasolina.getText().toString();

        //validar campos digitados
        boolean camposValidados = validarCampos(precoAlcool, precoGasolina);

        if (camposValidados){
        //converter string em numero
            double valorAlcool    = Double.parseDouble(precoAlcool);
            double valorGasolina  = Double.parseDouble(precoGasolina);

            double resultado = valorAlcool / valorGasolina ;

                if (resultado >= 0.7 ){

                textResultado.setText("Melhor ultiliza gasolina");
                }else{
                textResultado.setText("Melhor ultiliza Alcool");
                }


        }else {
        textResultado.setText("Preencha os preços primeiros! ");
        }
    }

    public boolean validarCampos(String pAlcool, String pGasolina) {
        boolean camposValidados = true;

        if (pAlcool == null || pAlcool.equals("")){
            camposValidados = false;

        }else if(pGasolina == null || pGasolina.equals("")){
            camposValidados = false;

        }

        return  camposValidados;
    }
}