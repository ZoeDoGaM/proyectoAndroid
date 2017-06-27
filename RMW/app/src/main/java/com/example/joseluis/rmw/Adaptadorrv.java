package com.example.joseluis.rmw;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextClock;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by Jose Luis on 27/06/2017.
 */

public class Adaptadorrv extends RecyclerView.Adapter<Adaptadorrv.CreditosViewHolder>{

    List<claseCredito> listaCreditos;

    public Adaptadorrv(List<claseCredito> listaCreditos) {
        this.listaCreditos = listaCreditos;
    }

    @Override
    public CreditosViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.vistarv, parent, false);
        CreditosViewHolder creditosViewHolder = new CreditosViewHolder(v);
        return creditosViewHolder;
    }

    @Override
    public void onBindViewHolder(CreditosViewHolder holder, int position) {
        holder.imagenF.setImageResource(listaCreditos.get(position).getImagenFoto());
        holder.tipo.setText(listaCreditos.get(position).getTipoPersona());
        holder.desc.setText(listaCreditos.get(position).getDescripcion());
    }

    @Override
    public int getItemCount() {
        return listaCreditos.size();
    }

    public static class CreditosViewHolder extends RecyclerView.ViewHolder{

        ImageView imagenF;
        TextView tipo, desc;

        public CreditosViewHolder(View itemView) {
            super(itemView);

            imagenF = (ImageView) itemView.findViewById(R.id.imagen);
            tipo = (TextView) itemView.findViewById(R.id.tvTipo);
            desc = (TextView) itemView.findViewById(R.id.tvDescripcion);

        }
    }
}
