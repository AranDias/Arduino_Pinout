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

public class ESPBaseFragment extends Fragment {
    private FragmentBaseListener listener;
    private EditText searchText;
    private Button buttonOk;

    public interface FragmentBaseListener {
        void onInputBase(CharSequence input);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View viewbase = inflater.inflate(R.layout.fragment_espbase, container, false);

        searchText = viewbase.findViewById(R.id.BaseSearch);
        buttonOk = viewbase.findViewById(R.id.BaseButtonOk);
        buttonOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View viewbase) {
                CharSequence input = searchText.getText();
                listener.onInputBase(input);
            }
        });
        return viewbase;
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
