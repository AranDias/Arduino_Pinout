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
    private Fragment30ButtonsListener listener;
    private EditText searchText;

    private Button ENT, VP, VN, D34, D35, D32, D33, D25, D26, D27, D14, D12, D13, GNDL, Vin, EN;
    private Button D23, D22, TX0, RX0, D21, D19, D18, D5, TX2, RX2, D4, D2, D15, GNDR, V3V3, BOOT;

    public interface Fragment30ButtonsListener {
        void onInput30(String input);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view30buttons = inflater.inflate(R.layout.fragment_esp30buttons, container, false);

        ENT     = view30buttons.findViewById(R.id.ESP30ButtonENT);

        View.OnClickListener handler = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int botao = view.getId();

                switch (botao) {
                    case R.id.ESP30ButtonENT:       listener.onInput30("EN");  break;

                    default:  listener.onInput30("Tente novamente");
                }
            }
        };
        ENT.setOnClickListener(handler);

        return view30buttons;
    }
    @Override
    public void onAttach(Context context){
        super.onAttach(context);
        if(context instanceof  Fragment30ButtonsListener) {
            listener = (Fragment30ButtonsListener) context;
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