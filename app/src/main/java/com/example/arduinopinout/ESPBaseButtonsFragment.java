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

public class ESPBaseButtonsFragment extends Fragment {
    private FragmentBaseListener listener;
    private EditText searchText;
    private Button   buttonOk;

    private Button GNDTL;

    public interface FragmentBaseListener {
        void onInputBase(String input);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View viewbasebuttons = inflater.inflate(R.layout.fragment_espbasebuttons, container, false);

        searchText  = viewbasebuttons.findViewById(R.id.ESPBaseEditTextSearch);
        buttonOk    = viewbasebuttons.findViewById(R.id.ESPBaseButtonOk);

        GNDTL       = viewbasebuttons.findViewById(R.id.ESPBaseButtonGNDTL);

        View.OnClickListener handler = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int botao = view.getId();

                switch (botao) {
                    case R.id.ESPBaseButtonOk:          listener.onInputBase(getSearch(searchText.getText().toString())); break;
                    case R.id.ESPBaseButtonGNDTL:       listener.onInputBase(getSearch("GND"));  break;
                    default:                            listener.onInputBase(getSearch("Falhou"));
                }
            }
        };
        buttonOk.setOnClickListener(handler);
        GNDTL.setOnClickListener(handler);
        return viewbasebuttons;
    }

    private String getSearch (String entrada){
        if(entrada.equals("GND"))           { return "GND";         }
        else if(entrada.equals("Teste"))    { return "Teste Ok\nTeste Ok\nTeste Ok\nTeste Ok\nTeste Ok";    }
        else                                { return "Falhou";      }
    }

    @Override
    public void onAttach(Context context){
        super.onAttach(context);
        if(context instanceof  FragmentBaseListener) {
            listener = (FragmentBaseListener) context;
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