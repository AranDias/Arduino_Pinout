package com.example.arduinopinout;

import android.os.Bundle;
import android.view.Menu;
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
public class ESP30Activity extends AppCompatActivity implements ESP30ImageFragment.Fragment30Listener{

    private ESP30ImageFragment      fimage;
    private ESPCommentFragment    fcom;

    @Override
    protected void onCreate(Bundle savedInstance){
        super.onCreate(savedInstance);
        setContentView(R.layout.activity_esp30);

        fimage  = new ESP30ImageFragment();
        fcom    = new ESPCommentFragment();

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.ESP30ImageLayout, fimage)
                .replace(R.id.ESP30CommentLayout,fcom)
                .commit();
    }

    @Override
    public void onInput30(String input) {
        fcom.updateEditText(input);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_boards, menu);
        return true;
    }
}