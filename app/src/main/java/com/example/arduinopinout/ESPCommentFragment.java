package com.example.arduinopinout;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ESPCommentFragment extends Fragment {
    private TextView    commentText;
    private EditText    searchText;
    private Button      buttonOk;
    String comentario30;
    String entrada;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view30com = inflater.inflate(R.layout.fragment_espcomment, container, false);

        commentText = view30com.findViewById(R.id.ESPCommentIDXML);
        searchText = view30com.findViewById(R.id.ESPPesquisaIDXML);
        buttonOk = view30com.findViewById(R.id.ESPCommentOkIDXML);
        buttonOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                entrada = searchText.getText().toString();
                updateEditText(entrada);
            }
        });
        return view30com;
    }

    public void updateEditText(String texto_input) {
        if(texto_input.equals("Teste"))  { commentText.setText("Teste bem sucedido");   }
        else{   commentText.setText("Você digitou:  " + texto_input);   }
    }
}