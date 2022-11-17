package com.example.arduinopinout.ESP32_DevKitC;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;
import android.widget.EditText;

import androidx.fragment.app.Fragment;

import com.example.arduinopinout.DataBase.ESP38DB;
import com.example.arduinopinout.R;

public class ESP38ButtonsFragment extends Fragment {
    ESP38DB data = new ESP38DB();

    private Fragment38Listener listener;
    private EditText ESP38EditTextSearch;
    private Button   ESP38ButtonOk;

    private Button      ESP38Button3V3, ESP38ButtonENT, ESP38Button36, ESP38Button39, ESP38Button34, ESP38Button35, ESP38Button32, ESP38Button33, ESP38Button25, ESP38Button26, ESP38Button27, ESP38Button14, ESP38Button12, ESP38ButtonGNDL, ESP38Button13, ESP38Button09, ESP38Button10, ESP38Button11, ESP38ButtonVin, ESP38ButtonENE;
    private Button      ESP38ButtonGNDT, ESP38Button23, ESP38Button22, ESP38Button01, ESP38Button03, ESP38Button21,ESP38ButtonGNDR, ESP38Button19, ESP38Button18, ESP38Button05, ESP38Button17, ESP38Button16, ESP38Button04, ESP38Button00, ESP38Button02, ESP38Button15, ESP38Button08, ESP38Button07, ESP38Button06, ESP38ButtonBOOT;

    public interface Fragment38Listener {
        void onInput38(String input);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view38buttons = inflater.inflate(R.layout.fragment_esp38buttons, container, false);

        ESP38EditTextSearch  = view38buttons.findViewById(R.id.ESP38EditTextSearch);
        ESP38ButtonOk    = view38buttons.findViewById(R.id.ESP38ButtonOk);

        ESP38Button3V3  = view38buttons.findViewById(R.id.ESP38Button3V3);
        ESP38ButtonENT  = view38buttons.findViewById(R.id.ESP38ButtonENT);
        ESP38Button36   = view38buttons.findViewById(R.id.ESP38Button36);
        ESP38Button39   = view38buttons.findViewById(R.id.ESP38Button39);
        ESP38Button34   = view38buttons.findViewById(R.id.ESP38Button34);
        ESP38Button35   = view38buttons.findViewById(R.id.ESP38Button35);
        ESP38Button32   = view38buttons.findViewById(R.id.ESP38Button32);
        ESP38Button33   = view38buttons.findViewById(R.id.ESP38Button33);
        ESP38Button25   = view38buttons.findViewById(R.id.ESP38Button25);
        ESP38Button26   = view38buttons.findViewById(R.id.ESP38Button26);
        ESP38Button27   = view38buttons.findViewById(R.id.ESP38Button27);
        ESP38Button14   = view38buttons.findViewById(R.id.ESP38Button14);
        ESP38Button12   = view38buttons.findViewById(R.id.ESP38Button12);
        ESP38ButtonGNDL = view38buttons.findViewById(R.id.ESP38ButtonGNDL);
        ESP38Button13   = view38buttons.findViewById(R.id.ESP38Button13);
        ESP38Button09   = view38buttons.findViewById(R.id.ESP38Button09);
        ESP38Button10   = view38buttons.findViewById(R.id.ESP38Button10);
        ESP38Button11   = view38buttons.findViewById(R.id.ESP38Button11);
        ESP38ButtonVin  = view38buttons.findViewById(R.id.ESP38ButtonVin);
        ESP38ButtonENE  = view38buttons.findViewById(R.id.ESP38ButtonENE);

        ESP38ButtonGNDT = view38buttons.findViewById(R.id.ESP38ButtonGNDT);
        ESP38Button23   = view38buttons.findViewById(R.id.ESP38Button23);
        ESP38Button22   = view38buttons.findViewById(R.id.ESP38Button22);
        ESP38Button01   = view38buttons.findViewById(R.id.ESP38Button01);
        ESP38Button03   = view38buttons.findViewById(R.id.ESP38Button03);
        ESP38Button21   = view38buttons.findViewById(R.id.ESP38Button21);
        ESP38ButtonGNDR = view38buttons.findViewById(R.id.ESP38ButtonGNDR);
        ESP38Button19   = view38buttons.findViewById(R.id.ESP38Button19);
        ESP38Button18   = view38buttons.findViewById(R.id.ESP38Button18);
        ESP38Button05   = view38buttons.findViewById(R.id.ESP38Button05);
        ESP38Button17   = view38buttons.findViewById(R.id.ESP38Button17);
        ESP38Button16   = view38buttons.findViewById(R.id.ESP38Button16);
        ESP38Button04   = view38buttons.findViewById(R.id.ESP38Button04);
        ESP38Button00   = view38buttons.findViewById(R.id.ESP38Button00);
        ESP38Button02   = view38buttons.findViewById(R.id.ESP38Button02);
        ESP38Button15   = view38buttons.findViewById(R.id.ESP38Button15);
        ESP38Button08   = view38buttons.findViewById(R.id.ESP38Button08);
        ESP38Button07   = view38buttons.findViewById(R.id.ESP38Button07);
        ESP38Button06   = view38buttons.findViewById(R.id.ESP38Button06);
        ESP38ButtonBOOT = view38buttons.findViewById(R.id.ESP38ButtonBOOT);

        View.OnClickListener handler = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int botao = view.getId();

                if      (botao == R.id.ESP38ButtonOk)         {listener.onInput38(data.get38Search(ESP38EditTextSearch.getText().toString()));}

                else if (botao == R.id.ESP38ButtonGNDL || botao == R.id.ESP38ButtonGNDR || botao == R.id.ESP38ButtonGNDT)  {listener.onInput38(data.get38Search("GND"));}
                else if (botao == R.id.ESP38ButtonENT || botao == R.id.ESP38ButtonENE)         {listener.onInput38(data.get38Search("EN"));}
                else if (botao == R.id.ESP38ButtonVin)        {listener.onInput38(data.get38Search("Vin"));}
                else if (botao == R.id.ESP38ButtonBOOT)       {listener.onInput38(data.get38Search("BOOT"));}

                else if (botao == R.id.ESP38Button36)         {listener.onInput38(data.get38Search("36"));}
                else if (botao == R.id.ESP38Button39)         {listener.onInput38(data.get38Search("39"));}
                else if (botao == R.id.ESP38Button34)         {listener.onInput38(data.get38Search("34"));}
                else if (botao == R.id.ESP38Button35)         {listener.onInput38(data.get38Search("35"));}
                else if (botao == R.id.ESP38Button32)         {listener.onInput38(data.get38Search("32"));}
                else if (botao == R.id.ESP38Button33)         {listener.onInput38(data.get38Search("33"));}
                else if (botao == R.id.ESP38Button25)         {listener.onInput38(data.get38Search("25"));}
                else if (botao == R.id.ESP38Button26)         {listener.onInput38(data.get38Search("26"));}
                else if (botao == R.id.ESP38Button27)         {listener.onInput38(data.get38Search("27"));}
                else if (botao == R.id.ESP38Button14)         {listener.onInput38(data.get38Search("14"));}
                else if (botao == R.id.ESP38Button12)         {listener.onInput38(data.get38Search("12"));}
                else if (botao == R.id.ESP38Button13)         {listener.onInput38(data.get38Search("13"));}
                else if (botao == R.id.ESP38Button09)         {listener.onInput38(data.get38Search("09"));}
                else if (botao == R.id.ESP38Button10)         {listener.onInput38(data.get38Search("10"));}
                else if (botao == R.id.ESP38Button11)         {listener.onInput38(data.get38Search("11"));}

                else if (botao == R.id.ESP38Button23)         {listener.onInput38(data.get38Search("23"));}
                else if (botao == R.id.ESP38Button22)         {listener.onInput38(data.get38Search("22"));}
                else if (botao == R.id.ESP38Button01)         {listener.onInput38(data.get38Search("01"));}
                else if (botao == R.id.ESP38Button03)         {listener.onInput38(data.get38Search("03"));}
                else if (botao == R.id.ESP38Button21)         {listener.onInput38(data.get38Search("21"));}
                else if (botao == R.id.ESP38Button19)         {listener.onInput38(data.get38Search("19"));}
                else if (botao == R.id.ESP38Button18)         {listener.onInput38(data.get38Search("18"));}
                else if (botao == R.id.ESP38Button05)         {listener.onInput38(data.get38Search("05"));}
                else if (botao == R.id.ESP38Button17)         {listener.onInput38(data.get38Search("17"));}
                else if (botao == R.id.ESP38Button16)         {listener.onInput38(data.get38Search("16"));}
                else if (botao == R.id.ESP38Button04)         {listener.onInput38(data.get38Search("04"));}
                else if (botao == R.id.ESP38Button00)         {listener.onInput38(data.get38Search("00"));}
                else if (botao == R.id.ESP38Button02)         {listener.onInput38(data.get38Search("02"));}
                else if (botao == R.id.ESP38Button15)         {listener.onInput38(data.get38Search("15"));}
                else if (botao == R.id.ESP38Button08)         {listener.onInput38(data.get38Search("08"));}
                else if (botao == R.id.ESP38Button07)         {listener.onInput38(data.get38Search("07"));}
                else if (botao == R.id.ESP38Button06)         {listener.onInput38(data.get38Search("06"));}
            }
        };
        ESP38ButtonOk.setOnClickListener(handler);

        ESP38Button3V3  .setOnClickListener(handler);
        ESP38ButtonENT  .setOnClickListener(handler);
        ESP38Button36   .setOnClickListener(handler);
        ESP38Button39   .setOnClickListener(handler);
        ESP38Button34   .setOnClickListener(handler);
        ESP38Button35   .setOnClickListener(handler);
        ESP38Button32   .setOnClickListener(handler);
        ESP38Button33   .setOnClickListener(handler);
        ESP38Button25   .setOnClickListener(handler);
        ESP38Button26   .setOnClickListener(handler);
        ESP38Button27   .setOnClickListener(handler);
        ESP38Button14   .setOnClickListener(handler);
        ESP38Button12   .setOnClickListener(handler);
        ESP38ButtonGNDL .setOnClickListener(handler);
        ESP38Button13   .setOnClickListener(handler);
        ESP38Button09   .setOnClickListener(handler);
        ESP38Button10   .setOnClickListener(handler);
        ESP38Button11   .setOnClickListener(handler);
        ESP38ButtonVin  .setOnClickListener(handler);
        ESP38ButtonENE  .setOnClickListener(handler);

        ESP38ButtonGNDT .setOnClickListener(handler);
        ESP38Button23   .setOnClickListener(handler);
        ESP38Button22   .setOnClickListener(handler);
        ESP38Button01   .setOnClickListener(handler);
        ESP38Button03   .setOnClickListener(handler);
        ESP38Button21   .setOnClickListener(handler);
        ESP38ButtonGNDR .setOnClickListener(handler);
        ESP38Button19   .setOnClickListener(handler);
        ESP38Button18   .setOnClickListener(handler);
        ESP38Button05   .setOnClickListener(handler);
        ESP38Button17   .setOnClickListener(handler);
        ESP38Button16   .setOnClickListener(handler);
        ESP38Button04   .setOnClickListener(handler);
        ESP38Button00   .setOnClickListener(handler);
        ESP38Button02   .setOnClickListener(handler);
        ESP38Button15   .setOnClickListener(handler);
        ESP38Button08   .setOnClickListener(handler);
        ESP38Button07   .setOnClickListener(handler);
        ESP38Button06   .setOnClickListener(handler);
        ESP38ButtonBOOT .setOnClickListener(handler);

        return view38buttons;
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