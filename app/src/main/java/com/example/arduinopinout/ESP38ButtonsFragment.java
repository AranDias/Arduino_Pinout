package com.example.arduinopinout;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;
import android.widget.EditText;

import androidx.fragment.app.Fragment;

public class ESP38ButtonsFragment extends Fragment {
    private Fragment38Listener listener;
    private EditText searchText;
    private Button   buttonOk;

    private Button ENT;

    public interface Fragment38Listener {
        void onInput38(String input);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view38buttons = inflater.inflate(R.layout.fragment_esp38buttons, container, false);

        searchText  = view38buttons.findViewById(R.id.ESP38EditTextSearch);
        buttonOk    = view38buttons.findViewById(R.id.ESP38ButtonOk);

        ENT     = view38buttons.findViewById(R.id.ESP38ButtonENT);

        View.OnClickListener handler = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int botao = view.getId();

                switch (botao) {
                    case R.id.ESP38ButtonOk:    listener.onInput38(getSearch(searchText.getText().toString())); break;
                    case R.id.ESP38ButtonENT:   listener.onInput38(getSearch("GND"));  break;
                    default:                    listener.onInput38(getSearch("Falhou"));
                }
            }
        };
        buttonOk.setOnClickListener(handler);
        ENT.setOnClickListener(handler);

        return view38buttons;
    }
    private String getSearch (String entrada){
        if(entrada.equals("GND"))           { return "GND";         }
        else if(entrada.equals("Teste"))    { return "Teste Ok";    }
        else                                { return "Falhou";      }
    }

    @Override
    public void onAttach(Context context){
        super.onAttach(context);
        if(context instanceof  Fragment38Listener) {
            listener = (Fragment38Listener) context;
        } else {
            throw new RuntimeException(context.toString() + "Aguardando comando");
        }
    }

    @Override
    public void onDetach(){
        super.onDetach();
        listener = null;
    }
}