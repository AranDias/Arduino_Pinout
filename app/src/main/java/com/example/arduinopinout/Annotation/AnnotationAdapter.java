package com.example.arduinopinout.Annotation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.arduinopinout.R;
import java.util.List;

public class AnnotationAdapter extends RecyclerView.Adapter<AnnotationAdapter.MyViewHolder> {

    private List<AnnotationFunctions> listaTarefas;

    public AnnotationAdapter(List<AnnotationFunctions> lista) {
        this.listaTarefas = lista;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemLista = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_annotationlist, parent, false);

        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        AnnotationFunctions tarefa = listaTarefas.get(position);
        holder.tarefa.setText(tarefa.getAnnotationName());

    }

    @Override
    public int getItemCount() {
        return this.listaTarefas.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView tarefa;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            tarefa = itemView.findViewById(R.id.textTarefa);

        }
    }
}