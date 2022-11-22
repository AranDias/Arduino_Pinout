package com.example.arduinopinout.Annotation;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.arduinopinout.R;
import com.google.android.material.textfield.TextInputEditText;

public class AddAnnotationActivity extends AppCompatActivity {

    private TextInputEditText   editAnnotation;
    private AnnotationBridge    thisAnnotation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addannotation);

        editAnnotation = findViewById(R.id.textAnotacao);

        thisAnnotation = (AnnotationBridge) getIntent().getSerializableExtra("anotacaoSelecionada");

        if(thisAnnotation!=null){
            editAnnotation.setText(thisAnnotation.getAnnotationName());
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_add_annotation,menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.itemSalvar:

                AnnotationDAO annotationDAO = new AnnotationDAO(getApplicationContext());

                if(thisAnnotation!=null){
                    String annotationName = editAnnotation.getText().toString();
                    if(!annotationName.isEmpty()) {
                        AnnotationBridge annotation = new AnnotationBridge();
                        annotation.setAnnotationName(annotationName);
                        annotation.setId(thisAnnotation.getId());
                        annotationDAO.atualizar(annotation);
                        finish();
                    }
                }else{
                    String annotationName = editAnnotation.getText().toString();
                    if(!annotationName.isEmpty()){
                        AnnotationBridge annotation = new AnnotationBridge();
                        annotation.setAnnotationName(annotationName);
                        annotationDAO.salvar(annotation);
                        finish();
                    }
                }
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}