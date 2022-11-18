package com.example.arduinopinout.ESP32_DevKitC;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.arduinopinout.Home_Others.MainActivity;
import com.example.arduinopinout.databinding.ActivityEsp38Binding;
import com.example.arduinopinout.Home_Others.ESPCommentFragment;
import com.example.arduinopinout.R;

public class ESP38Activity extends AppCompatActivity implements ESP38ButtonsFragment.Fragment38Listener{

    private ActivityEsp38Binding binding;
    private FragmentManager         fm = getSupportFragmentManager();
    private ESP38ButtonsFragment  fb = new ESP38ButtonsFragment();
    private ESPCommentFragment fc = new ESPCommentFragment();
    FragmentTransaction             t;

    @Override
    protected void onCreate(Bundle savedInstance){
        super.onCreate(savedInstance);

        binding = ActivityEsp38Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        t = fm.beginTransaction();
        t.add(R.id.ESP38ImageLayout, fb);
        t.addToBackStack(null);
        t.commit();

        t = fm.beginTransaction();
        t.add(R.id.ESP38CommentLayout, fc);
        t.addToBackStack(null);
        t.commit();
    }

    @Override
    public void onInput38(String input) {
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
            Intent ESP38IMAGE = new Intent("ESP38IMAGE");
            startActivity(ESP38IMAGE);
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
