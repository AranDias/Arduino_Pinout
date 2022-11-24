package com.example.arduinopinout.Annotation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.arduinopinout.R;
import java.util.List;
//aula 1 = annotation adapter que vai receber uma lista de anotações para serem exibidas
public class AnnotationAdapter extends RecyclerView.Adapter<AnnotationAdapter.MyViewHolder> { //recycle view depende do adapter

    private List<AnnotationBridge> annotationList; //criar um atributo aula 01

    public AnnotationAdapter(List<AnnotationBridge> list) {//vai passar a lista de anotações
        this.annotationList = list; //conseguimos passar no adapter a lista de anotações
    }//construtor

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) { //vai retornar o layout

        View itemLista = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_annotationlist, parent, false);

        return new MyViewHolder(itemLista); //vai retornar a lista
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        AnnotationBridge annotation = annotationList.get(position);
        holder.annotation.setText(annotation.getAnnotationName());

    }

    @Override
    public int getItemCount() {
        return this.annotationList.size();
    } //numero de anotações que temos (aula1)

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView annotation;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            annotation = itemView.findViewById(R.id.textAnotacao); //

        }
    }
}
