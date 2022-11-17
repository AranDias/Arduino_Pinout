package com.example.arduinopinout.ESP32_DevKitC;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.arduinopinout.databinding.ActivityEsp38imageBinding;

public class ESP38ImageActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityEsp38imageBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityEsp38imageBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}