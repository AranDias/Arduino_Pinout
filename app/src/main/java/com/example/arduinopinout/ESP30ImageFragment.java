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

public class ESP30ImageFragment extends Fragment {
    private Fragment30Listener listener;
    private EditText searchText;

    private Button ENT, VP, VN, D34, D35, D32, D33, D25, D26, D27, D14, D12, D13, GNDL, Vin, EN;
    private Button D23, D22, TX0, RX0, D21, D19, D18, D5, TX2, RX2, D4, D2, D15, GNDR, V3V3, BOOT;

    public interface Fragment30Listener {
        void onInput30(String input);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view30image = inflater.inflate(R.layout.fragment_esp30image, container, false);

        ENT     = view30image.findViewById(R.id.ESP30ButtonENT);
        VP      = view30image.findViewById(R.id.ESP30ButtonVP);
        VN      = view30image.findViewById(R.id.ESP30ButtonVN);
        D34     = view30image.findViewById(R.id.ESP30ButtonD34);
        D35     = view30image.findViewById(R.id.ESP30ButtonD35);
        D32     = view30image.findViewById(R.id.ESP30ButtonD32);
        D33     = view30image.findViewById(R.id.ESP30ButtonD33);
        D25     = view30image.findViewById(R.id.ESP30ButtonD25);
        D26     = view30image.findViewById(R.id.ESP30ButtonD26);
        D27     = view30image.findViewById(R.id.ESP30ButtonD27);
        D14     = view30image.findViewById(R.id.ESP30ButtonD14);
        D12     = view30image.findViewById(R.id.ESP30ButtonD12);
        D13     = view30image.findViewById(R.id.ESP30ButtonD13);
        GNDL    = view30image.findViewById(R.id.ESP30ButtonGNDL);
        Vin     = view30image.findViewById(R.id.ESP30ButtonVin);
        EN      = view30image.findViewById(R.id.ESP30ButtonEN);
        D23     = view30image.findViewById(R.id.ESP30ButtonD23);
        D22     = view30image.findViewById(R.id.ESP30ButtonD22);
        TX0     = view30image.findViewById(R.id.ESP30ButtonTX0);
        RX0     = view30image.findViewById(R.id.ESP30ButtonRX0);
        D21     = view30image.findViewById(R.id.ESP30ButtonD21);
        D19     = view30image.findViewById(R.id.ESP30ButtonD19);
        D18     = view30image.findViewById(R.id.ESP30ButtonD18);
        D5      = view30image.findViewById(R.id.ESP30ButtonD5);
        TX2     = view30image.findViewById(R.id.ESP30ButtonTX2);
        RX2     = view30image.findViewById(R.id.ESP30ButtonRX2);
        D4      = view30image.findViewById(R.id.ESP30ButtonD4);
        D2      = view30image.findViewById(R.id.ESP30ButtonD2);
        D15     = view30image.findViewById(R.id.ESP30ButtonD15);
        GNDR    = view30image.findViewById(R.id.ESP30ButtonGNDR);
        V3V3    = view30image.findViewById(R.id.ESP30Button3V3);
        BOOT    = view30image.findViewById(R.id.ESP30ButtonBOOT);


        View.OnClickListener handler = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int botao = view.getId();

                switch (botao) {
                    case R.id.ESP30ButtonENT:       listener.onInput30("EN");  break;
                    case R.id.ESP30ButtonVP:        listener.onInput30("VP");  break;
                    case R.id.ESP30ButtonVN:        listener.onInput30("VN");  break;
                    case R.id.ESP30ButtonD34:       listener.onInput30("D34");  break;
                    case R.id.ESP30ButtonD35:       listener.onInput30("D35");  break;
                    case R.id.ESP30ButtonD32:       listener.onInput30("D32");  break;
                    case R.id.ESP30ButtonD33:       listener.onInput30("D33");  break;
                    case R.id.ESP30ButtonD25:       listener.onInput30("D25");  break;
                    case R.id.ESP30ButtonD26:       listener.onInput30("D26");  break;
                    case R.id.ESP30ButtonD27:       listener.onInput30("D27");  break;
                    case R.id.ESP30ButtonD14:       listener.onInput30("D14");  break;
                    case R.id.ESP30ButtonD12:       listener.onInput30("D12");  break;
                    case R.id.ESP30ButtonD13:       listener.onInput30("D13");  break;
                    case R.id.ESP30ButtonGNDL:      listener.onInput30("GND");  break;
                    case R.id.ESP30ButtonVin:       listener.onInput30("Vin");  break;
                    case R.id.ESP30ButtonEN:        listener.onInput30("EN");  break;
                    case R.id.ESP30ButtonD23:       listener.onInput30("D23");  break;
                    case R.id.ESP30ButtonD22:       listener.onInput30("D22");  break;
                    case R.id.ESP30ButtonTX0:       listener.onInput30("TX0");  break;
                    case R.id.ESP30ButtonRX0:       listener.onInput30("RX0");  break;
                    case R.id.ESP30ButtonD21:       listener.onInput30("D21");  break;
                    case R.id.ESP30ButtonD19:       listener.onInput30("D19");  break;
                    case R.id.ESP30ButtonD18:       listener.onInput30("D18");  break;
                    case R.id.ESP30ButtonD5:        listener.onInput30("D5");  break;
                    case R.id.ESP30ButtonTX2:       listener.onInput30("TX2");  break;
                    case R.id.ESP30ButtonRX2:       listener.onInput30("RX2");  break;
                    case R.id.ESP30ButtonD4:        listener.onInput30("D4");  break;
                    case R.id.ESP30ButtonD2:        listener.onInput30("D2");  break;
                    case R.id.ESP30ButtonD15:       listener.onInput30("D15");  break;
                    case R.id.ESP30ButtonGNDR:      listener.onInput30("GND");  break;
                    case R.id.ESP30Button3V3:       listener.onInput30("3V3");  break;
                    case R.id.ESP30ButtonBOOT:      listener.onInput30("BOOT");  break;
                    default:  listener.onInput30("Tente novamente");
                }
            }
        };
        ENT.setOnClickListener(handler);
        VP.setOnClickListener(handler);
        VN.setOnClickListener(handler);
        D34.setOnClickListener(handler);
        D35.setOnClickListener(handler);
        D32.setOnClickListener(handler);
        D33.setOnClickListener(handler);
        D25.setOnClickListener(handler);
        D26.setOnClickListener(handler);
        D27.setOnClickListener(handler);
        D14.setOnClickListener(handler);
        D12.setOnClickListener(handler);
        D13.setOnClickListener(handler);
        GNDL.setOnClickListener(handler);
        Vin.setOnClickListener(handler);
        EN.setOnClickListener(handler);
        D23.setOnClickListener(handler);
        D22.setOnClickListener(handler);
        TX0.setOnClickListener(handler);
        RX0.setOnClickListener(handler);
        D21.setOnClickListener(handler);
        D19.setOnClickListener(handler);
        D18.setOnClickListener(handler);
        D5.setOnClickListener(handler);
        TX2.setOnClickListener(handler);
        RX2.setOnClickListener(handler);
        D4.setOnClickListener(handler);
        D2.setOnClickListener(handler);
        D15.setOnClickListener(handler);
        GNDR.setOnClickListener(handler);
        V3V3.setOnClickListener(handler);
        BOOT.setOnClickListener(handler);

        return view30image;
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
