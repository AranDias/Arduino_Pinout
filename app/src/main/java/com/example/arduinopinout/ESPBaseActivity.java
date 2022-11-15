package com.example.arduinopinout;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.example.arduinopinout.databinding.ActivityEspbaseBinding;

public class ESPBaseActivity extends AppCompatActivity implements ESPBaseButtonsFragment.FragmentBaseListener{

    private ActivityEspbaseBinding  binding;
    private FragmentManager         fm = getSupportFragmentManager();
    private ESPBaseButtonsFragment  fb = new ESPBaseButtonsFragment();
    private ESPCommentFragment      fc = new ESPCommentFragment();
    FragmentTransaction             t;

    @Override
    protected void onCreate(Bundle savedInstance){
        super.onCreate(savedInstance);

        binding = ActivityEspbaseBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        /*setContentView(R.layout.activity_espbase);*/

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
}
