package com.example.arduinopinout;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.arduinopinout.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;
    private Button ESP38;
    private Button ESP30;
    private Button Base;
    private ImageButton Logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        /*setSupportActionBar(binding.toolbar);*/

        ESP38 = findViewById(R.id.ButtonESP38PIN);
        ESP30 = findViewById(R.id.ButtonESP30PIN);
        Base = findViewById(R.id.ButtonESPBase);
        Logo = findViewById(R.id.ButtonLogo);

        ESP38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ESP38Intent = new Intent("ESP38PIN");
                startActivity(ESP38Intent);
            }
        });

        ESP30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ESP30Intent = new Intent("ESP30PIN");
                startActivity(ESP30Intent);
            }
        });

        Base.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BaseIntent = new Intent("ESPBASE");
                startActivity(BaseIntent);
            }
        });

        Logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BaseIntent = new Intent("LOGOAPP");
                startActivity(BaseIntent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}