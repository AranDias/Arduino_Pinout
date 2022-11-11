package com.example.arduinopinout;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.arduinopinout.databinding.ActivityLogoBinding;

public class LogoActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityLogoBinding binding;

    //private Button Main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityLogoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        /*setSupportActionBar(binding.toolbar);*/

        //Main
    }
}