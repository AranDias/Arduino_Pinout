package com.example.arduinopinout;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.EditText;

import androidx.fragment.app.Fragment;

public class ESPBaseCommentFragment extends Fragment {
    private TextView commentText;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View viewbasecom = inflater.inflate(R.layout.fragment_espbasecomment, container, false);

        commentText = viewbasecom.findViewById(R.id.ESPBaseCommentXML);
        return viewbasecom;
    }
    public void updateEditText(CharSequence newText) {
        commentText.setText(newText);
    }
}