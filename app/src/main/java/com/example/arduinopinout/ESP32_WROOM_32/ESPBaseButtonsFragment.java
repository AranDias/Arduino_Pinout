package com.example.arduinopinout.ESP32_WROOM_32;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;
import android.widget.EditText;

import androidx.fragment.app.Fragment;

import com.example.arduinopinout.DataBase.ESPBaseDB;
import com.example.arduinopinout.R;

public class ESPBaseButtonsFragment extends Fragment {
    ESPBaseDB data = new ESPBaseDB();

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

                if      (botao == R.id.ESPBaseButtonOk)         {listener.onInputBase(data.getBaseSearch(ESPBaseEditTextSearch.getText().toString()));}

                else if (botao == R.id.ESPBaseButtonGNDTL || botao == R.id.ESPBaseButtonGNDTR || botao == R.id.ESPBaseButtonGNDE)  {listener.onInputBase(data.getBaseSearch("GND"));}
                else if (botao == R.id.ESPBaseButtonVin)        {listener.onInputBase(data.getBaseSearch("Vin"));}
                else if (botao == R.id.ESPBaseButtonEN)         {listener.onInputBase(data.getBaseSearch("EN"));}
                else if (botao == R.id.ESPBaseButton36)         {listener.onInputBase(data.getBaseSearch("36"));}
                else if (botao == R.id.ESPBaseButton39)         {listener.onInputBase(data.getBaseSearch("39"));}
                else if (botao == R.id.ESPBaseButton34)         {listener.onInputBase(data.getBaseSearch("34"));}
                else if (botao == R.id.ESPBaseButton35)         {listener.onInputBase(data.getBaseSearch("35"));}
                else if (botao == R.id.ESPBaseButton32)         {listener.onInputBase(data.getBaseSearch("32"));}
                else if (botao == R.id.ESPBaseButton33)         {listener.onInputBase(data.getBaseSearch("33"));}
                else if (botao == R.id.ESPBaseButton25)         {listener.onInputBase(data.getBaseSearch("25"));}
                else if (botao == R.id.ESPBaseButton26)         {listener.onInputBase(data.getBaseSearch("26"));}
                else if (botao == R.id.ESPBaseButton27)         {listener.onInputBase(data.getBaseSearch("27"));}
                else if (botao == R.id.ESPBaseButton14)         {listener.onInputBase(data.getBaseSearch("14"));}
                else if (botao == R.id.ESPBaseButton12)         {listener.onInputBase(data.getBaseSearch("12"));}
                else if (botao == R.id.ESPBaseButton23)         {listener.onInputBase(data.getBaseSearch("23"));}
                else if (botao == R.id.ESPBaseButton22)         {listener.onInputBase(data.getBaseSearch("22"));}
                else if (botao == R.id.ESPBaseButton01)         {listener.onInputBase(data.getBaseSearch("01"));}
                else if (botao == R.id.ESPBaseButton03)         {listener.onInputBase(data.getBaseSearch("03"));}
                else if (botao == R.id.ESPBaseButton21)         {listener.onInputBase(data.getBaseSearch("21"));}
                else if (botao == R.id.ESPBaseButtonNC)         {listener.onInputBase(data.getBaseSearch("NC"));}
                else if (botao == R.id.ESPBaseButton19)         {listener.onInputBase(data.getBaseSearch("19"));}
                else if (botao == R.id.ESPBaseButton18)         {listener.onInputBase(data.getBaseSearch("18"));}
                else if (botao == R.id.ESPBaseButton05)         {listener.onInputBase(data.getBaseSearch("05"));}
                else if (botao == R.id.ESPBaseButton17)         {listener.onInputBase(data.getBaseSearch("17"));}
                else if (botao == R.id.ESPBaseButton16)         {listener.onInputBase(data.getBaseSearch("16"));}
                else if (botao == R.id.ESPBaseButton04)         {listener.onInputBase(data.getBaseSearch("04"));}
                else if (botao == R.id.ESPBaseButton00)         {listener.onInputBase(data.getBaseSearch("00"));}
                else if (botao == R.id.ESPBaseButton13)         {listener.onInputBase(data.getBaseSearch("13"));}
                else if (botao == R.id.ESPBaseButton09)         {listener.onInputBase(data.getBaseSearch("09"));}
                else if (botao == R.id.ESPBaseButton10)         {listener.onInputBase(data.getBaseSearch("10"));}
                else if (botao == R.id.ESPBaseButton11)         {listener.onInputBase(data.getBaseSearch("11"));}
                else if (botao == R.id.ESPBaseButton06)         {listener.onInputBase(data.getBaseSearch("06"));}
                else if (botao == R.id.ESPBaseButton07)         {listener.onInputBase(data.getBaseSearch("07"));}
                else if (botao == R.id.ESPBaseButton08)         {listener.onInputBase(data.getBaseSearch("08"));}
                else if (botao == R.id.ESPBaseButton15)         {listener.onInputBase(data.getBaseSearch("15"));}
                else if (botao == R.id.ESPBaseButton02)         {listener.onInputBase(data.getBaseSearch("02"));}
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