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
    private EditText ESP30EditTextSearch;
    private Button   ESP30ButtonOk;

    private Button      ESP30ButtonENT, ESP30ButtonVP, ESP30ButtonVN, ESP30Button34, ESP30Button35, ESP30Button32, ESP30Button33, ESP30Button25, ESP30Button26, ESP30Button27, ESP30Button14, ESP30Button12, ESP30Button13, ESP30ButtonGNDL, ESP30ButtonVin, ESP30ButtonENE;
    private Button      ESP30Button23, ESP30Button22, ESP30ButtonTX0, ESP30ButtonRX0, ESP30Button21, ESP30Button19, ESP30Button18, ESP30Button05, ESP30ButtonTX2, ESP30ButtonRX2, ESP30Button04, ESP30Button02, ESP30Button15, ESP30ButtonGNDR, ESP30Button3V3, ESP30ButtonBOOT;

    public interface Fragment30Listener {
        void onInput30(String input);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view30buttons = inflater.inflate(R.layout.fragment_esp30buttons, container, false);

        ESP30EditTextSearch  = view30buttons.findViewById(R.id.ESP30EditTextSearch);
        ESP30ButtonOk    = view30buttons.findViewById(R.id.ESP30ButtonOk);

        ESP30ButtonENT  = view30buttons.findViewById(R.id.ESP30ButtonENT);
        ESP30ButtonVP   = view30buttons.findViewById(R.id.ESP30ButtonVP);
        ESP30ButtonVN   = view30buttons.findViewById(R.id.ESP30ButtonVN);
        ESP30Button34   = view30buttons.findViewById(R.id.ESP30Button34);
        ESP30Button35   = view30buttons.findViewById(R.id.ESP30Button35);
        ESP30Button32   = view30buttons.findViewById(R.id.ESP30Button32);
        ESP30Button33   = view30buttons.findViewById(R.id.ESP30Button33);
        ESP30Button25   = view30buttons.findViewById(R.id.ESP30Button25);
        ESP30Button26   = view30buttons.findViewById(R.id.ESP30Button26);
        ESP30Button27   = view30buttons.findViewById(R.id.ESP30Button27);
        ESP30Button14   = view30buttons.findViewById(R.id.ESP30Button14);
        ESP30Button12   = view30buttons.findViewById(R.id.ESP30Button12);
        ESP30Button13   = view30buttons.findViewById(R.id.ESP30Button13);
        ESP30ButtonGNDL = view30buttons.findViewById(R.id.ESP30ButtonGNDL);
        ESP30ButtonVin  = view30buttons.findViewById(R.id.ESP30ButtonVin);
        ESP30ButtonENE  = view30buttons.findViewById(R.id.ESP30ButtonENE);

        ESP30Button23   = view30buttons.findViewById(R.id.ESP30Button23);
        ESP30Button22   = view30buttons.findViewById(R.id.ESP30Button22);
        ESP30ButtonTX0  = view30buttons.findViewById(R.id.ESP30ButtonTX0);
        ESP30ButtonRX0  = view30buttons.findViewById(R.id.ESP30ButtonRX0);
        ESP30Button21   = view30buttons.findViewById(R.id.ESP30Button21);
        ESP30Button19   = view30buttons.findViewById(R.id.ESP30Button19);
        ESP30Button18   = view30buttons.findViewById(R.id.ESP30Button18);
        ESP30Button05   = view30buttons.findViewById(R.id.ESP30Button05);
        ESP30ButtonTX2  = view30buttons.findViewById(R.id.ESP30ButtonTX2);
        ESP30ButtonRX2  = view30buttons.findViewById(R.id.ESP30ButtonRX2);
        ESP30Button04   = view30buttons.findViewById(R.id.ESP30Button04);
        ESP30Button02   = view30buttons.findViewById(R.id.ESP30Button02);
        ESP30Button15   = view30buttons.findViewById(R.id.ESP30Button15);
        ESP30ButtonGNDR = view30buttons.findViewById(R.id.ESP30ButtonGNDR);
        ESP30Button3V3  = view30buttons.findViewById(R.id.ESP30Button3V3);
        ESP30ButtonBOOT = view30buttons.findViewById(R.id.ESP30ButtonBOOT);

        View.OnClickListener handler = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int botao = view.getId();

                if      (botao == R.id.ESP30ButtonOk)         {listener.onInput30(getSearch(ESP30EditTextSearch.getText().toString()));}

                else if (botao == R.id.ESP30ButtonVin)        {listener.onInput30(getSearch("GND"));}
                else if (botao == R.id.ESP30Button3V3)        {listener.onInput30(getSearch("GND"));}
                else if (botao == R.id.ESP30ButtonGNDL || botao == R.id.ESP30ButtonGNDR)  {listener.onInput30(getSearch("GND"));}
                else if (botao == R.id.ESP30ButtonENT || botao == R.id.ESP30ButtonENE)         {listener.onInput30(getSearch("GND"));}
                else if (botao == R.id.ESP30ButtonBOOT)       {listener.onInput30(getSearch("GND"));}

                else if (botao == R.id.ESP30ButtonVP)         {listener.onInput30(getSearch("GND"));}
                else if (botao == R.id.ESP30ButtonVN)         {listener.onInput30(getSearch("GND"));}
                else if (botao == R.id.ESP30Button34)         {listener.onInput30(getSearch("GND"));}
                else if (botao == R.id.ESP30Button35)         {listener.onInput30(getSearch("GND"));}
                else if (botao == R.id.ESP30Button32)         {listener.onInput30(getSearch("GND"));}
                else if (botao == R.id.ESP30Button33)         {listener.onInput30(getSearch("GND"));}
                else if (botao == R.id.ESP30Button25)         {listener.onInput30(getSearch("GND"));}
                else if (botao == R.id.ESP30Button26)         {listener.onInput30(getSearch("GND"));}
                else if (botao == R.id.ESP30Button27)         {listener.onInput30(getSearch("GND"));}
                else if (botao == R.id.ESP30Button14)         {listener.onInput30(getSearch("GND"));}
                else if (botao == R.id.ESP30Button12)         {listener.onInput30(getSearch("GND"));}
                else if (botao == R.id.ESP30Button13)         {listener.onInput30(getSearch("GND"));}

                else if (botao == R.id.ESP30Button23)         {listener.onInput30(getSearch("GND"));}
                else if (botao == R.id.ESP30Button22)         {listener.onInput30(getSearch("GND"));}
                else if (botao == R.id.ESP30ButtonTX0)        {listener.onInput30(getSearch("GND"));}
                else if (botao == R.id.ESP30ButtonRX0)        {listener.onInput30(getSearch("GND"));}
                else if (botao == R.id.ESP30Button21)         {listener.onInput30(getSearch("GND"));}
                else if (botao == R.id.ESP30Button19)         {listener.onInput30(getSearch("GND"));}
                else if (botao == R.id.ESP30Button18)         {listener.onInput30(getSearch("GND"));}
                else if (botao == R.id.ESP30Button05)         {listener.onInput30(getSearch("GND"));}
                else if (botao == R.id.ESP30ButtonTX2)        {listener.onInput30(getSearch("GND"));}
                else if (botao == R.id.ESP30ButtonRX2)        {listener.onInput30(getSearch("GND"));}
                else if (botao == R.id.ESP30Button04)         {listener.onInput30(getSearch("GND"));}
                else if (botao == R.id.ESP30Button02)         {listener.onInput30(getSearch("GND"));}
                else if (botao == R.id.ESP30Button15)         {listener.onInput30(getSearch("GND"));}
            }
        };
        ESP30ButtonOk.setOnClickListener(handler);

        ESP30ButtonENT  .setOnClickListener(handler);
        ESP30ButtonVP   .setOnClickListener(handler);
        ESP30ButtonVN   .setOnClickListener(handler);
        ESP30Button34   .setOnClickListener(handler);
        ESP30Button35   .setOnClickListener(handler);
        ESP30Button32   .setOnClickListener(handler);
        ESP30Button33   .setOnClickListener(handler);
        ESP30Button25   .setOnClickListener(handler);
        ESP30Button26   .setOnClickListener(handler);
        ESP30Button27   .setOnClickListener(handler);
        ESP30Button14   .setOnClickListener(handler);
        ESP30Button12   .setOnClickListener(handler);
        ESP30Button13   .setOnClickListener(handler);
        ESP30ButtonGNDL .setOnClickListener(handler);
        ESP30ButtonVin  .setOnClickListener(handler);
        ESP30ButtonENE  .setOnClickListener(handler);

        ESP30Button23   .setOnClickListener(handler);
        ESP30Button22   .setOnClickListener(handler);
        ESP30ButtonTX0  .setOnClickListener(handler);
        ESP30ButtonRX0  .setOnClickListener(handler);
        ESP30Button21   .setOnClickListener(handler);
        ESP30Button19   .setOnClickListener(handler);
        ESP30Button18   .setOnClickListener(handler);
        ESP30Button05   .setOnClickListener(handler);
        ESP30ButtonTX2  .setOnClickListener(handler);
        ESP30ButtonRX2  .setOnClickListener(handler);
        ESP30Button04   .setOnClickListener(handler);
        ESP30Button02   .setOnClickListener(handler);
        ESP30Button15   .setOnClickListener(handler);
        ESP30ButtonGNDR .setOnClickListener(handler);
        ESP30Button3V3  .setOnClickListener(handler);
        ESP30ButtonBOOT .setOnClickListener(handler);

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