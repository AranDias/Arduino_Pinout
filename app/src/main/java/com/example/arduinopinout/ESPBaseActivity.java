package com.example.arduinopinout;

import android.os.Bundle;
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
public class ESPBaseActivity extends AppCompatActivity implements ESPBaseFragment.FragmentBaseListener{

    private ESPBaseFragment         fbase;
    private ESPBaseCommentFragment  fbasecom;

    @Override
    protected void onCreate(Bundle savedInstance){
        super.onCreate(savedInstance);
        setContentView(R.layout.activity_espbase);

        fbase       = new ESPBaseFragment();
        fbasecom    = new ESPBaseCommentFragment();

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.ESPBaseFrag, fbase)
                .replace(R.id.ESPBaseCommentFrag,fbasecom)
                .commit();
    }

    @Override
    public void onInputBase(CharSequence input) {
        fbasecom.updateEditText(input);
    }
}
