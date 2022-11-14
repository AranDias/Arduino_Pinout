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
    private FragmentBaseButtonsListener listener;
    private EditText searchText;

    private Button GNDTL;

    public interface FragmentBaseButtonsListener {
        void onInputBase(String input);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View viewbasebuttons = inflater.inflate(R.layout.fragment_espbasebuttons, container, false);

        GNDTL     = viewbasebuttons.findViewById(R.id.ESPBaseButtonGNDTL);

        View.OnClickListener handler = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int botao = view.getId();

                switch (botao) {
                    case R.id.ESPBaseButtonGNDTL:       listener.onInputBase("GND");  break;

                    default:  listener.onInputBase("Tente novamente");
                }
            }
        };
        GNDTL.setOnClickListener(handler);

        return viewbasebuttons;
    }
    @Override
    public void onAttach(Context context){
        super.onAttach(context);
        if(context instanceof  FragmentBaseButtonsListener) {
            listener = (FragmentBaseButtonsListener) context;
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