package com.example.arduinopinout.ESP32_WROOM_32;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.arduinopinout.Home_Others.MainActivity;
import com.example.arduinopinout.databinding.ActivityEspbaseBinding;
import com.example.arduinopinout.Home_Others.ESPCommentFragment;
import com.example.arduinopinout.R;

public class ESPBaseActivity extends AppCompatActivity implements ESPBaseButtonsFragment.FragmentBaseListener{

    private ActivityEspbaseBinding binding;
    private FragmentManager         fm = getSupportFragmentManager();
    private ESPBaseButtonsFragment  fb = new ESPBaseButtonsFragment();
    private ESPCommentFragment fc = new ESPCommentFragment();
    FragmentTransaction             t;

    @Override
    protected void onCreate(Bundle savedInstance){
        super.onCreate(savedInstance);

        binding = ActivityEspbaseBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        t = fm.beginTransaction();
        t.add(R.id.ESPBaseImageLayout, fb);
        t.addToBackStack(null);
        t.commit();

        t = fm.beginTransaction();
        t.add(R.id.ESPBaseCommentLayout, fc);
        t.addToBackStack(null);
        t.commit();
    }

    @Override
    public void onInputBase(String input) {
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
            Intent ESPBASEIMAGE = new Intent("ESPBASEIMAGE");
            startActivity(ESPBASEIMAGE);
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

