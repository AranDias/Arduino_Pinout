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
    private AnnotationFunctions thisAnnotation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addannotation);

        editAnnotation = findViewById(R.id.textAnotacao);

        thisAnnotation = (AnnotationFunctions) getIntent().getSerializableExtra("anotacaoSelecionada");

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

                if(thisAnnotation!=null){//edicao da tarefa
                    String nomeAnotacao = editAnnotation.getText().toString();
                    if(!nomeAnotacao.isEmpty()) {
                        AnnotationFunctions annotation = new AnnotationFunctions();
                        annotation.setAnnotationName(nomeAnotacao);
                        annotation.setId(thisAnnotation.getId());
                        annotationDAO.atualizar(annotation);
                        finish();
                    }
                }else{
                    String nomeAnotacao = editAnnotation.getText().toString();
                    if(!nomeAnotacao.isEmpty()){
                        AnnotationFunctions annotation = new AnnotationFunctions();
                        annotation.setAnnotationName(nomeAnotacao);
                        annotationDAO.salvar(annotation);
                        finish();
                    }
                }
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}