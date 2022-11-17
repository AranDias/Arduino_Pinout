package com.example.arduinopinout.ESP32_DevKitV1;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

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