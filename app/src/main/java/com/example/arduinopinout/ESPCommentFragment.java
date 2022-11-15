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

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ESPCommentFragment extends Fragment {
    private TextView    commentText;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view30com = inflater.inflate(R.layout.fragment_espcomment, container, false);

        commentText = view30com.findViewById(R.id.ESPCommentIDXML);
        return view30com;
    }

    public void updateEditText(String texto_input) {
        commentText.setText(texto_input);
    }
}