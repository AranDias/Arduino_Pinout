package com.example.arduinopinout;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

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
