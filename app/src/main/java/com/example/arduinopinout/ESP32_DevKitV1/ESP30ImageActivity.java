package com.example.arduinopinout.ESP32_DevKitV1;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import androidx.navigation.ui.AppBarConfiguration;

import com.example.arduinopinout.databinding.ActivityEsp30imageBinding;

public class ESP30ImageActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityEsp30imageBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityEsp30imageBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}