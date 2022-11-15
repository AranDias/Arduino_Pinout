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

public class ESP30ButtonsFragment extends Fragment {
    private Fragment30Listener listener;
    private EditText searchText;
    private Button   buttonOk;

    private Button ENT;

    public interface Fragment30Listener {
        void onInput30(String input);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view30buttons = inflater.inflate(R.layout.fragment_esp30buttons, container, false);

        searchText  = view30buttons.findViewById(R.id.ESP30EditTextSearch);
        buttonOk    = view30buttons.findViewById(R.id.ESP30ButtonOk);

        ENT     = view30buttons.findViewById(R.id.ESP30ButtonENT);

        View.OnClickListener handler = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int botao = view.getId();

                switch (botao) {
                    case R.id.ESP30ButtonOk:    listener.onInput30(getSearch(searchText.getText().toString())); break;
                    case R.id.ESP30ButtonENT:   listener.onInput30(getSearch("GND"));  break;
                    default:                    listener.onInput30(getSearch("Falhou"));
                }
            }
        };
        buttonOk.setOnClickListener(handler);
        ENT.setOnClickListener(handler);

        return view30buttons;
    }
    private String getSearch (String entrada){
        if(entrada.equals("GND"))           { return "GND";         }
        else if(entrada.equals("Teste"))    { return "Teste Ok";    }
        else                                { return "Falhou";      }
    }

    @Override
    public void onAttach(Context context){
        super.onAttach(context);
        if(context instanceof  Fragment30Listener) {
            listener = (Fragment30Listener) context;
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