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
public class ESPBaseActivity extends AppCompatActivity implements ESPBaseImageFragment.FragmentBaseListener{

    private ESPBaseImageFragment    fimage;
    private ESPCommentFragment      fcom;

    @Override
    protected void onCreate(Bundle savedInstance){
        super.onCreate(savedInstance);
        setContentView(R.layout.activity_espbase);

        fimage  = new ESPBaseImageFragment();
        fcom    = new ESPCommentFragment();

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.ESPBaseImageLayout, fimage)
                .replace(R.id.ESPBaseCommentLayout,fcom)
                .commit();
    }

    @Override
    public void onInputBase(String input) {
        fcom.updateEditText(input);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_boards, menu);
        return true;
    }
}
