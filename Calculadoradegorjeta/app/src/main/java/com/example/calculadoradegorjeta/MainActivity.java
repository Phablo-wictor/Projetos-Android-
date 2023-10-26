package com.example.calculadoradegorjeta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editValor;
    private TextView TextPorcentagem;
    private TextView textGorjeta;
    private TextView TextTotal;
    private SeekBar seekBarGorjeta;

    private  double porcentagem = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editValor         = findViewById(R.id.editValor);
        TextPorcentagem   = findViewById(R.id.TextPorcentagem);
        textGorjeta       = findViewById(R.id.textGorjeta);
        TextTotal         = findViewById(R.id.textTotal);
        seekBarGorjeta    = findViewById(R.id.seekBarGojeta);
        //para usa o seekBar user esse comando
        seekBarGorjeta.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override                                    // esse "i" e o progresso do seekBar a contagem
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                porcentagem = i;
                TextPorcentagem.setText(Math.round(porcentagem) + " %");

                calcular();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }
    public void calcular(){

        String valorRecuperado  = editValor.getText().toString();

        //codição caso o usuario digita nada
        if (valorRecuperado == null || valorRecuperado.equals("")){

            //comando para cria um mesagem tela
            Toast.makeText(getApplicationContext(),
                    "Digite um valor primeiro!",Toast.LENGTH_LONG).show();

        }else{

            //converte String para double
            double valorDigitado = Double.parseDouble(valorRecuperado);

            //calculo da gorjeta
            double gorjeta = valorDigitado * (porcentagem / 100);
            double total = gorjeta + valorDigitado;

            //exibe a gorjeta total
            textGorjeta.setText("R$ "+ Math.round(gorjeta));
            TextTotal.setText("R$ "+ total);

        }

    }
}