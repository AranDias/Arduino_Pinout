package com.example.arduinopinout;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.arduinopinout.databinding.ActivityEsp38Binding;

public class ESP38Activity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityEsp38Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityEsp38Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        /*setSupportActionBar(binding.toolbar);*/
    }

}