package com.example.arduinopinout.Home_Others;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.ui.AppBarConfiguration;
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
    }
}