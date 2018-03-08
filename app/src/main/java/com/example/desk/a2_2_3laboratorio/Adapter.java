package com.example.desk.a2_2_3laboratorio;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by desk on 7/03/18.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.ListaViewHolder>{
    Context context;
    ArrayList<Usr> listadatos;

    public Adapter(Context context, ArrayList<Usr> listadatos) {
        this.context = context;
        this.listadatos = listadatos;
    }

    @Override
    public ListaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater= LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.layout2,null);
        return new ListaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ListaViewHolder holder, int position) {
        Usr item=listadatos.get(position);

        holder.txtId.setText(item.getClave()+"");
        holder.txtNombre.setText(item.getNombre());
        holder.txtSueldo.setText(item.getSueldo()+"");
    }

    @Override
    public int getItemCount() {
        return listadatos.size();
    }


    public class ListaViewHolder extends RecyclerView.ViewHolder {
        TextView txtId,txtNombre,txtSueldo;

        public ListaViewHolder(View itemView) {
            super(itemView);

            txtId=itemView.findViewById(R.id.txtId);
            txtNombre=itemView.findViewById(R.id.txtNombre);
            txtSueldo=itemView.findViewById(R.id.txtSueldo);
        }
    }
}
