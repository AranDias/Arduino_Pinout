package com.example.arduinopinout.Annotation;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.arduinopinout.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class AnnotationHomeActivity extends AppCompatActivity {
    private AppBarConfiguration appBarConfiguration;

    private RecyclerView                recyclerView; //configuração do recycle view (aula 1)
    private AnnotationAdapter           annotationAdapter; //atributo do annotation adapter
    private List<AnnotationBridge>   listAnnotations = new ArrayList<>(); //lista de anotações
    private AnnotationBridge annotationSelected; //usado para excluir

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_annotationhome);

        recyclerView = findViewById(R.id.recyclerView); //conversão de variavel (aula 1)
//recalionado ao click do resciclwview
        recyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(getApplicationContext(),
                        recyclerView,
                        new RecyclerItemClickListener.OnItemClickListener() {
                            @Override
                            public void onItemClick(View view, int position) { //adicionar eventos (aula 2). atualiza anotação que já foi adicionada (aula 5)
                                AnnotationBridge annotationSelected = listAnnotations.get(position); //posição da anotação que vai ser alterada
                                //enviar anotações para a tela adicionar anotações
                                Intent intent = new Intent(AnnotationHomeActivity.this, AddAnnotationActivity.class); //enviar a anotação de uma tela para outra (tela de adiconar anotações)
                                intent.putExtra("anotacaoSelecionada",annotationSelected);//e por onde vamos recuperar a anotação que vai ser alterada em outra tela
                                startActivity(intent);
                            }

                            @Override
                            public void onLongItemClick(View view, int position) { //remover itens das tarefas (aula 2). remover anotações

                                annotationSelected = listAnnotations.get(position);//recuperar anotações que o usuario selecionou para deletar

                                AlertDialog.Builder dialog = new AlertDialog.Builder(AnnotationHomeActivity.this);//alerta o usuario para ele não remover po engano

                                dialog.setTitle("Deseja Excluir a Seguinte Anotação?");//texto alertando
                                dialog.setMessage(annotationSelected.getAnnotationName());

                                dialog.setPositiveButton("Sim", new DialogInterface.OnClickListener() { //sim para excluir anotação
                                    @Override
                                    public void onClick(DialogInterface dialogInterface, int i) {
                                        AnnotationDAO annotationDAO = new AnnotationDAO(getApplicationContext());
                                        annotationDAO.deletar(annotationSelected);
                                        LoadAnnotation();//vai carregar a lista de anotações para não aparecer o valor que foi excluido (texto que foi excluido)
                                    }
                                });

                                dialog.setNegativeButton("Não", null); //não excluir anotaçõão
                                dialog.create();//exibir a dialog de aviso
                                dialog.show();//exibir a dialog de aviso
                            }

                            @Override
                            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                            }
                        })
        );

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { //quando a pessoa clicar no botão vai chamar a outra activity onde vamos adicionar tarefas
                Intent intent = new Intent(getApplicationContext(), AddAnnotationActivity.class);
                startActivity(intent);//starta a activity
            }
        });
    }

    public void LoadAnnotation(){ //carregamento da lista de tarefas que serão exibidas (aula 1)

        listAnnotations.clear();

        AnnotationDAO annotationDAO = new AnnotationDAO(getApplicationContext()); //EXIBIR A LISTA DE TAREFAS QUE ESCREVI (AULA 4)
        listAnnotations = annotationDAO.listar();//EXIBIR A LISTA DE TAREFAS QUE ESCREVI(AULA 4)

        annotationAdapter = new AnnotationAdapter(listAnnotations); //configuração do tarefa adapter que vai passar uma lista de tarefas para o recycle view para serem exibidas. lista vai ser exibida nela
//listannotation no annotation adapter está pegando a lista de tarefas no banco de ddaos
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());//configurando o recicle view (aula 1)
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new DividerItemDecoration(getApplicationContext(), LinearLayout.VERTICAL));//vertical = informações na vertical
        recyclerView.setAdapter(annotationAdapter); //recycle view depende do adapter que é responsavel por carregar as tarefas
    }//na ultima linha o annotationadapter foi criado na classe annotationadapter

    protected void onStart(){
        LoadAnnotation();
        super.onStart();
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.itemSalvar) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}