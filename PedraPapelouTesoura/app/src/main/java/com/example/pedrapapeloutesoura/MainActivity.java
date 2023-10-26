package com.example.pedrapapeloutesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void selecionaPedra(View view){
        this.opcaoSelecionada("Pedra");

    }
    public void selcionarPapel(View view){
        this.opcaoSelecionada("Papel");

    }
    public void selcionarTesoura(View view){
        this.opcaoSelecionada("Tesoura");

    }

    public void opcaoSelecionada(String opcaoSelecionada){

        //metado para muda um componete da inteface
        ImageView imagemResutado = findViewById(R.id.imageResutado);
        //metado para muda um texto
        TextView textoResultado = findViewById(R.id.textResultado);

        //gerador de escolhas
        int numero = new Random().nextInt(3);
        String[] opcao = {"Pedra", "Papel", "Tesoura"};
        String opcaoApp = opcao[numero];


        switch (opcaoApp){
            case "Pedra":
                imagemResutado.setImageResource(R.drawable.pedra);
                break;
            case "Papel":
                imagemResutado.setImageResource(R.drawable.papel);
                break;
            case "Tesoura":
                imagemResutado.setImageResource(R.drawable.tesoura);
                break;
        }
        if((opcaoApp == "Tesoura" && opcaoSelecionada == "Papel") ||
           (opcaoApp == "papel" && opcaoSelecionada == "Pedra") ||
           (opcaoApp == "Pedra" && opcaoSelecionada == "Papel"))
        {
            textoResultado.setText("Você perdeu! 😓");

        }else if((
                (opcaoSelecionada == "Tesoura" && opcaoApp == "Papel") ||
                (opcaoSelecionada == "Papel")  && opcaoApp == "Pedra") ||
                (opcaoSelecionada == "Pedra" && opcaoApp == "Tesoura"))
        {
            textoResultado.setText("Você ganhou! 🥳");

        }else{
            textoResultado.setText("Empate! 😐");

        }


    }

}