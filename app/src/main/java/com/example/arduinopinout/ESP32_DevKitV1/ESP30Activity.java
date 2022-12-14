package com.example.arduinopinout.ESP32_DevKitV1;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.arduinopinout.Home_Others.ESPCommentFragment;
import com.example.arduinopinout.Home_Others.MainActivity;
import com.example.arduinopinout.R;
import com.example.arduinopinout.databinding.ActivityEsp30Binding;

public class ESP30Activity extends AppCompatActivity implements ESP30ButtonsFragment.Fragment30Listener{

    private ActivityEsp30Binding binding;
    private FragmentManager         fm = getSupportFragmentManager();
    private ESP30ButtonsFragment    fb = new ESP30ButtonsFragment();
    private ESPCommentFragment fc = new ESPCommentFragment();
    FragmentTransaction             t;

    @Override
    protected void onCreate(Bundle savedInstance){
        super.onCreate(savedInstance);

        binding = ActivityEsp30Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        t = fm.beginTransaction();
        t.add(R.id.ESP30ImageLayout, fb);
        t.addToBackStack(null);
        t.commit();

        t = fm.beginTransaction();
        t.add(R.id.ESP30CommentLayout, fc);
        t.addToBackStack(null);
        t.commit();
    }

    @Override
    public void onInput30(String input) {
        fc.updateEditText(input);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_boards, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        if(id == R.id.Mostrar_Tudo){
            Intent ESP30IMAGE = new Intent("ESP30IMAGE");
            startActivity(ESP30IMAGE);
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
