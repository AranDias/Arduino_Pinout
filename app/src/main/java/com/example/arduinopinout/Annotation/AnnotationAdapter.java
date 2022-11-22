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

    private List<AnnotationBridge> annotationList;

    public AnnotationAdapter(List<AnnotationBridge> list) {
        this.annotationList = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemLista = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_annotationlist, parent, false);

        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        AnnotationBridge annotation = annotationList.get(position);
        holder.annotation.setText(annotation.getAnnotationName());

    }

    @Override
    public int getItemCount() {
        return this.annotationList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView annotation;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            annotation = itemView.findViewById(R.id.textAnotacao);

        }
    }
}
