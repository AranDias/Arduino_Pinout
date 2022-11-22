package com.example.arduinopinout.Annotation;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.arduinopinout.R;
import com.google.android.material.textfield.TextInputEditText;

public class AddAnnotationActivity extends AppCompatActivity {

    private TextInputEditText editTarefa;
    private AnnotationFunctions tarefaAtual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addannotation);

        editTarefa = findViewById(R.id.textTarefa);

        //recuperar a tarefa, caso seja edição
        tarefaAtual = (AnnotationFunctions) getIntent().getSerializableExtra("tarefaSelecionada");

        //configurar a tarefa clicada pra ser exibida na caixa de texto
        if(tarefaAtual!=null){
            editTarefa.setText(tarefaAtual.getAnnotationName());
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_adicionar_tarefa,menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.itemSalvar:
                //executar a ação salvar
                AnnotationDAO tarefaDAO = new AnnotationDAO(getApplicationContext());

                if(tarefaAtual!=null){//edicao da tarefa
                    String nomeTarefa = editTarefa.getText().toString();
                    if(!nomeTarefa.isEmpty()) {
                        AnnotationFunctions tarefa = new AnnotationFunctions();
                        tarefa.setNomeTarefa(nomeTarefa);
                        tarefa.setId(tarefaAtual.getId());

                        //atualizar o banco de dados
                        if(tarefaDAO.atualizar(tarefa)){
                            finish();
                            Toast.makeText(getApplicationContext(),
                                    "Sucesso ao atualizar a tarefa",
                                    Toast.LENGTH_SHORT).show();
                        }else{
                            Toast.makeText(getApplicationContext(),
                                    "Erro ao atualizar a tarefa",
                                    Toast.LENGTH_SHORT).show();
                        }

                    }
                }else{//salvar

                    String nomeTarefa = editTarefa.getText().toString();

                    if(!nomeTarefa.isEmpty()){
                        AnnotationFunctions tarefa = new AnnotationFunctions();
                        tarefa.setNomeTarefa(nomeTarefa);

                        if(tarefaDAO.salvar(tarefa)){
                            finish();
                            Toast.makeText(getApplicationContext(),
                                    "Sucesso ao salvar a tarefa",
                                    Toast.LENGTH_SHORT).show();
                        }else{
                            Toast.makeText(getApplicationContext(),
                                    "Erro ao salvar a tarefa",
                                    Toast.LENGTH_SHORT).show();
                        }
                    }
                }
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}