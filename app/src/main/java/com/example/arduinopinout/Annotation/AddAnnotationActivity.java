package com.example.arduinopinout.Annotation;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.arduinopinout.R;
import com.google.android.material.textfield.TextInputEditText;

public class AddAnnotationActivity extends AppCompatActivity {

    private TextInputEditText editAnnotation;
    private AnnotationFunctions thisannotation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addannotation);

        editAnnotation = findViewById(R.id.textTarefa);

        thisannotation = (AnnotationFunctions) getIntent().getSerializableExtra("tarefaSelecionada");

        if(thisannotation!=null){
            editAnnotation.setText(thisannotation.getAnnotationName());
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

                AnnotationDAO tarefaDAO = new AnnotationDAO(getApplicationContext());

                if(thisannotation!=null){//edicao da tarefa
                    String nomeTarefa = editAnnotation.getText().toString();
                    if(!nomeTarefa.isEmpty()) {
                        AnnotationFunctions tarefa = new AnnotationFunctions();
                        tarefa.setNomeTarefa(nomeTarefa);
                        tarefa.setId(thisannotation.getId());
                        tarefaDAO.atualizar(tarefa);
                        finish();
                    }
                }else{

                    String nomeTarefa = editAnnotation.getText().toString();

                    if(!nomeTarefa.isEmpty()){
                        AnnotationFunctions tarefa = new AnnotationFunctions();
                        tarefa.setNomeTarefa(nomeTarefa);
                        tarefaDAO.salvar(tarefa);
                        finish();
                    }
                }
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}