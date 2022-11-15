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

    private EditText    ESPBaseEditTextSearch;
    private Button      ESPBaseButtonOk;

    private Button      ESPBaseButtonGNDTL, ESPBaseButtonVin, ESPBaseButtonEN, ESPBaseButton36, ESPBaseButton39, ESPBaseButton34, ESPBaseButton35, ESPBaseButton32, ESPBaseButton33, ESPBaseButton25, ESPBaseButton26, ESPBaseButton27, ESPBaseButton14, ESPBaseButton12;
    private Button      ESPBaseButtonGNDTR, ESPBaseButton23, ESPBaseButton22, ESPBaseButton01, ESPBaseButton03, ESPBaseButton21, ESPBaseButtonNC, ESPBaseButton19, ESPBaseButton18, ESPBaseButton05, ESPBaseButton17, ESPBaseButton16, ESPBaseButton04, ESPBaseButton00;
    private Button      ESPBaseButtonGNDE, ESPBaseButton13, ESPBaseButton09, ESPBaseButton10, ESPBaseButton11, ESPBaseButton06, ESPBaseButton07, ESPBaseButton08, ESPBaseButton15, ESPBaseButton02;

    public interface FragmentBaseListener {
        void onInputBase(String input);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View viewbasebuttons = inflater.inflate(R.layout.fragment_espbasebuttons, container, false);

        ESPBaseEditTextSearch   = viewbasebuttons.findViewById(R.id.ESPBaseEditTextSearch);
        ESPBaseButtonOk         = viewbasebuttons.findViewById(R.id.ESPBaseButtonOk);

        ESPBaseButtonGNDTL  = viewbasebuttons.findViewById(R.id.ESPBaseButtonGNDTL);
        ESPBaseButtonVin    = viewbasebuttons.findViewById(R.id.ESPBaseButtonVin);
        ESPBaseButtonEN     = viewbasebuttons.findViewById(R.id.ESPBaseButtonEN);
        ESPBaseButton36     = viewbasebuttons.findViewById(R.id.ESPBaseButton36);
        ESPBaseButton39     = viewbasebuttons.findViewById(R.id.ESPBaseButton39);
        ESPBaseButton34     = viewbasebuttons.findViewById(R.id.ESPBaseButton34);
        ESPBaseButton35     = viewbasebuttons.findViewById(R.id.ESPBaseButton35);
        ESPBaseButton32     = viewbasebuttons.findViewById(R.id.ESPBaseButton32);
        ESPBaseButton33     = viewbasebuttons.findViewById(R.id.ESPBaseButton33);
        ESPBaseButton25     = viewbasebuttons.findViewById(R.id.ESPBaseButton25);
        ESPBaseButton26     = viewbasebuttons.findViewById(R.id.ESPBaseButton26);
        ESPBaseButton27     = viewbasebuttons.findViewById(R.id.ESPBaseButton27);
        ESPBaseButton14     = viewbasebuttons.findViewById(R.id.ESPBaseButton14);
        ESPBaseButton12     = viewbasebuttons.findViewById(R.id.ESPBaseButton12);

        ESPBaseButtonGNDTR  = viewbasebuttons.findViewById(R.id.ESPBaseButtonGNDTR);
        ESPBaseButton23     = viewbasebuttons.findViewById(R.id.ESPBaseButton23);
        ESPBaseButton22     = viewbasebuttons.findViewById(R.id.ESPBaseButton22);
        ESPBaseButton01     = viewbasebuttons.findViewById(R.id.ESPBaseButton01);
        ESPBaseButton03     = viewbasebuttons.findViewById(R.id.ESPBaseButton03);
        ESPBaseButton21     = viewbasebuttons.findViewById(R.id.ESPBaseButton21);
        ESPBaseButtonNC     = viewbasebuttons.findViewById(R.id.ESPBaseButtonNC);
        ESPBaseButton19     = viewbasebuttons.findViewById(R.id.ESPBaseButton19);
        ESPBaseButton18     = viewbasebuttons.findViewById(R.id.ESPBaseButton18);
        ESPBaseButton05     = viewbasebuttons.findViewById(R.id.ESPBaseButton05);
        ESPBaseButton17     = viewbasebuttons.findViewById(R.id.ESPBaseButton17);
        ESPBaseButton16     = viewbasebuttons.findViewById(R.id.ESPBaseButton16);
        ESPBaseButton04     = viewbasebuttons.findViewById(R.id.ESPBaseButton04);
        ESPBaseButton00     = viewbasebuttons.findViewById(R.id.ESPBaseButton00);

        ESPBaseButtonGNDE   = viewbasebuttons.findViewById(R.id.ESPBaseButtonGNDE);
        ESPBaseButton13     = viewbasebuttons.findViewById(R.id.ESPBaseButton13);
        ESPBaseButton09     = viewbasebuttons.findViewById(R.id.ESPBaseButton09);
        ESPBaseButton10     = viewbasebuttons.findViewById(R.id.ESPBaseButton10);
        ESPBaseButton11     = viewbasebuttons.findViewById(R.id.ESPBaseButton11);
        ESPBaseButton06     = viewbasebuttons.findViewById(R.id.ESPBaseButton06);
        ESPBaseButton07     = viewbasebuttons.findViewById(R.id.ESPBaseButton07);
        ESPBaseButton08     = viewbasebuttons.findViewById(R.id.ESPBaseButton08);
        ESPBaseButton15     = viewbasebuttons.findViewById(R.id.ESPBaseButton15);
        ESPBaseButton02     = viewbasebuttons.findViewById(R.id.ESPBaseButton02);

        View.OnClickListener handler = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int botao = view.getId();

                if      (botao == R.id.ESPBaseButtonOk)         {listener.onInputBase(getSearch(ESPBaseEditTextSearch.getText().toString()));}

                else if (botao == R.id.ESPBaseButtonGNDTL || botao == R.id.ESPBaseButtonGNDTR || botao == R.id.ESPBaseButtonGNDE)  {listener.onInputBase(getSearch("GND"));}
                else if (botao == R.id.ESPBaseButtonVin)        {listener.onInputBase(getSearch("GND"));}
                else if (botao == R.id.ESPBaseButtonEN)         {listener.onInputBase(getSearch("GND"));}
                else if (botao == R.id.ESPBaseButton36)         {listener.onInputBase(getSearch("GND"));}
                else if (botao == R.id.ESPBaseButton39)         {listener.onInputBase(getSearch("GND"));}
                else if (botao == R.id.ESPBaseButton34)         {listener.onInputBase(getSearch("GND"));}
                else if (botao == R.id.ESPBaseButton35)         {listener.onInputBase(getSearch("GND"));}
                else if (botao == R.id.ESPBaseButton32)         {listener.onInputBase(getSearch("GND"));}
                else if (botao == R.id.ESPBaseButton33)         {listener.onInputBase(getSearch("GND"));}
                else if (botao == R.id.ESPBaseButton25)         {listener.onInputBase(getSearch("GND"));}
                else if (botao == R.id.ESPBaseButton26)         {listener.onInputBase(getSearch("GND"));}
                else if (botao == R.id.ESPBaseButton27)         {listener.onInputBase(getSearch("GND"));}
                else if (botao == R.id.ESPBaseButton14)         {listener.onInputBase(getSearch("GND"));}
                else if (botao == R.id.ESPBaseButton12)         {listener.onInputBase(getSearch("GND"));}
                else if (botao == R.id.ESPBaseButton23)         {listener.onInputBase(getSearch("GND"));}
                else if (botao == R.id.ESPBaseButton22)         {listener.onInputBase(getSearch("GND"));}
                else if (botao == R.id.ESPBaseButton01)         {listener.onInputBase(getSearch("GND"));}
                else if (botao == R.id.ESPBaseButton03)         {listener.onInputBase(getSearch("GND"));}
                else if (botao == R.id.ESPBaseButton21)         {listener.onInputBase(getSearch("GND"));}
                else if (botao == R.id.ESPBaseButtonNC)         {listener.onInputBase(getSearch("GND"));}
                else if (botao == R.id.ESPBaseButton19)         {listener.onInputBase(getSearch("GND"));}
                else if (botao == R.id.ESPBaseButton18)         {listener.onInputBase(getSearch("GND"));}
                else if (botao == R.id.ESPBaseButton05)         {listener.onInputBase(getSearch("GND"));}
                else if (botao == R.id.ESPBaseButton17)         {listener.onInputBase(getSearch("GND"));}
                else if (botao == R.id.ESPBaseButton16)         {listener.onInputBase(getSearch("GND"));}
                else if (botao == R.id.ESPBaseButton04)         {listener.onInputBase(getSearch("GND"));}
                else if (botao == R.id.ESPBaseButton00)         {listener.onInputBase(getSearch("GND"));}
                else if (botao == R.id.ESPBaseButton13)         {listener.onInputBase(getSearch("GND"));}
                else if (botao == R.id.ESPBaseButton09)         {listener.onInputBase(getSearch("GND"));}
                else if (botao == R.id.ESPBaseButton10)         {listener.onInputBase(getSearch("GND"));}
                else if (botao == R.id.ESPBaseButton11)         {listener.onInputBase(getSearch("GND"));}
                else if (botao == R.id.ESPBaseButton06)         {listener.onInputBase(getSearch("GND"));}
                else if (botao == R.id.ESPBaseButton07)         {listener.onInputBase(getSearch("GND"));}
                else if (botao == R.id.ESPBaseButton08)         {listener.onInputBase(getSearch("GND"));}
                else if (botao == R.id.ESPBaseButton15)         {listener.onInputBase(getSearch("GND"));}
                else if (botao == R.id.ESPBaseButton02)         {listener.onInputBase(getSearch("GND"));}
            }
        };
        ESPBaseButtonOk     .setOnClickListener(handler);

        ESPBaseButtonGNDTL  .setOnClickListener(handler);
        ESPBaseButtonVin    .setOnClickListener(handler);
        ESPBaseButtonEN     .setOnClickListener(handler);
        ESPBaseButton36     .setOnClickListener(handler);
        ESPBaseButton39     .setOnClickListener(handler);
        ESPBaseButton34     .setOnClickListener(handler);
        ESPBaseButton35     .setOnClickListener(handler);
        ESPBaseButton32     .setOnClickListener(handler);
        ESPBaseButton33     .setOnClickListener(handler);
        ESPBaseButton25     .setOnClickListener(handler);
        ESPBaseButton26     .setOnClickListener(handler);
        ESPBaseButton27     .setOnClickListener(handler);
        ESPBaseButton14     .setOnClickListener(handler);
        ESPBaseButton12     .setOnClickListener(handler);

        ESPBaseButtonGNDTR  .setOnClickListener(handler);
        ESPBaseButton23     .setOnClickListener(handler);
        ESPBaseButton22     .setOnClickListener(handler);
        ESPBaseButton01     .setOnClickListener(handler);
        ESPBaseButton03     .setOnClickListener(handler);
        ESPBaseButton21     .setOnClickListener(handler);
        ESPBaseButtonNC     .setOnClickListener(handler);
        ESPBaseButton19     .setOnClickListener(handler);
        ESPBaseButton18     .setOnClickListener(handler);
        ESPBaseButton05     .setOnClickListener(handler);
        ESPBaseButton17     .setOnClickListener(handler);
        ESPBaseButton16     .setOnClickListener(handler);
        ESPBaseButton04     .setOnClickListener(handler);
        ESPBaseButton00     .setOnClickListener(handler);

        ESPBaseButtonGNDE   .setOnClickListener(handler);
        ESPBaseButton13     .setOnClickListener(handler);
        ESPBaseButton09     .setOnClickListener(handler);
        ESPBaseButton10     .setOnClickListener(handler);
        ESPBaseButton11     .setOnClickListener(handler);
        ESPBaseButton06     .setOnClickListener(handler);
        ESPBaseButton07     .setOnClickListener(handler);
        ESPBaseButton08     .setOnClickListener(handler);
        ESPBaseButton15     .setOnClickListener(handler);
        ESPBaseButton02     .setOnClickListener(handler);
        return viewbasebuttons;
    }

    private String getSearch (String entrada){
        if      (entrada.equals("GND"))             { return "GND";         }
        else if (entrada.equals("Teste"))           { return "Teste Ok\nTeste Ok\nTeste Ok\nTeste Ok\nTeste Ok";    }
        else                                        { return "Falhou";      }
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