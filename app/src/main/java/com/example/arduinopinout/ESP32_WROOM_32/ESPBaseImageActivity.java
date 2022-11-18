package com.example.arduinopinout.ESP32_WROOM_32;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import androidx.navigation.ui.AppBarConfiguration;

import com.example.arduinopinout.databinding.ActivityEspbaseimageBinding;

public class ESPBaseImageActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityEspbaseimageBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityEspbaseimageBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}
