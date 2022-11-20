package com.example.arduinopinout.Home_Others;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.ui.AppBarConfiguration;

import com.example.arduinopinout.R;
import com.example.arduinopinout.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;
    private Button ButtonESP38PIN;
    private Button ButtonESP30PIN;
    private Button ButtonESPBase;
    private Button ButtonAnotacoes;
    private Button ButtonInformacoes;
    private ImageButton ButtonLogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        /*setSupportActionBar(binding.toolbar);*/

        ButtonESP38PIN = findViewById(R.id.ButtonESP38PIN);
        ButtonESP30PIN = findViewById(R.id.ButtonESP30PIN);
        ButtonESPBase = findViewById(R.id.ButtonESPBase);
        ButtonLogo = findViewById(R.id.ButtonLogo);
        ButtonAnotacoes= findViewById(R.id.ButtonAnotacoes);
        ButtonInformacoes = findViewById(R.id.ButtonInformacoes);

        ButtonESP38PIN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ESP38Intent = new Intent("ESP38PIN");
                startActivity(ESP38Intent);
            }
        });

        ButtonESP30PIN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ESP30Intent = new Intent("ESP30PIN");
                startActivity(ESP30Intent);
            }
        });

        ButtonESPBase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BaseIntent = new Intent("ESPBASE");
                startActivity(BaseIntent);
            }
        });

        ButtonLogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent LogoIntent = new Intent("LOGOAPP");
                startActivity(LogoIntent);
            }
        });
        ButtonAnotacoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent AnnotationIntent = new Intent("COUNTRYLIST");
                startActivity(AnnotationIntent);
            }
        });
        ButtonInformacoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.espressif.com/en/products/socs/esp32")));
            }
        });
    }
}