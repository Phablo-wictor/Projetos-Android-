package com.example.frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        }

        public void geraNovaFrase(View view){

            String[] frases  = {
                    "Que você encontre seu valor no mundo desperto",
                    "Eu sou uma pessoa extremamente tolerante, desde que tudo saia exatamente como eu quero 😁", //1
                    "Falaram para eu devia seguir os meus sonhos, então eu virei pro lado e continuei dormindo", //2
                    "Juro que não te deixei no vácuo… É que eu respondi por telepatia.", //3
                    "Quem curte balada é adolescente, adulto gosta é de dormir com os boletos pagos.", //4
                    "Se eu concordasse com você, os dois estaríamos errados.🤣", //5
                    "Uma história de terror em três palavras: hoje é segunda. 😌", //6
                    "Inveja de você? Inveja eu sinto do meu cachorro, que come, passeia e dorme o dia inteiro." ,//7
                     "Tudo que vai, volta. Menos as canetas que eu emprestei na sala de aula…",
                    "De uma voadora na cabeça do capeta 😉"
            };

            int numero = new Random().nextInt(9); // numeros que vão ser gerados 0,1,2,3,4,5.6.7

            TextView texto = findViewById(R.id.textResutado);
            texto.setText( frases[numero] );

        }

    }

