package com.example.recyclerview.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.R;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHoldr> {

    @NonNull
    @Override
    public MyViewHoldr onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View instemLista = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_lista, parent, false);

        return new MyViewHoldr(instemLista) ;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHoldr holder, int position) {

        holder.titulo.setText("Titulo de Teste");
        holder.genero.setText("Comédia");
        holder.ano.setText("2017");

    }

    @Override
    public int getItemCount() {
        return 5;
    }

    public class MyViewHoldr extends  RecyclerView.ViewHolder{

        TextView titulo;
        TextView ano;
        TextView genero;

        public MyViewHoldr(@NonNull View itemView) {
            super(itemView);

            titulo = itemView.findViewById(R.id.textTitulo );
            ano = itemView.findViewById(R.id.textAno);
            genero = itemView.findViewById(R.id.textGenero);



        }
    }

}
