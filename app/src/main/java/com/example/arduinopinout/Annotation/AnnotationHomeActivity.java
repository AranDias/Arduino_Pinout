package com.example.arduinopinout.Annotation;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.Toast;

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

    private RecyclerView    recyclerView;
    private AnnotationAdapter tarefaAdapter;
    private List<AnnotationFunctions>    listaTarefas = new ArrayList<>();
    private AnnotationFunctions tarefaSelecionada;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_annotationhome);

        recyclerView = findViewById(R.id.recyclerView);

        recyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(getApplicationContext(),
                        recyclerView,
                        new RecyclerItemClickListener.OnItemClickListener() {
                            @Override
                            public void onItemClick(View view, int position) {
                                AnnotationFunctions tarefaSelecionada = listaTarefas.get(position);
                                Intent intent = new Intent(AnnotationHomeActivity.this, AddAnnotationActivity.class);
                                intent.putExtra("tarefaSelecionada",tarefaSelecionada);
                                startActivity(intent);
                            }

                            @Override
                            public void onLongItemClick(View view, int position) {

                                tarefaSelecionada = listaTarefas.get(position);

                                AlertDialog.Builder dialog = new AlertDialog.Builder(AnnotationHomeActivity.this);

                                dialog.setTitle("CONFIRMAR EXCLUSÃO");
                                dialog.setMessage("Deseja excluir a tarefa: " + tarefaSelecionada.getAnnotationName() + " ?");

                                dialog.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialogInterface, int i) {

                                        AnnotationDAO tarefaDAO = new AnnotationDAO(getApplicationContext());
                                        if(tarefaDAO.deletar(tarefaSelecionada)){
                                            LoadAnnotation();
                                            Toast.makeText(getApplicationContext(),
                                                    "Sucesso ao excluir a tarefa",
                                                    Toast.LENGTH_SHORT).show();
                                        }else{
                                            Toast.makeText(getApplicationContext(),
                                                    "Erro ao excluir a tarefa",
                                                    Toast.LENGTH_SHORT).show();
                                        }
                                    }
                                });

                                dialog.setNegativeButton("Não", null);
                                dialog.create();
                                dialog.show();
                            }

                            @Override
                            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                            }
                        })
                );

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), AddAnnotationActivity.class);
                startActivity(intent);
            }
        });
    }

    public void LoadAnnotation(){

        listaTarefas.clear();

        AnnotationDAO TarefaDAO = new AnnotationDAO(getApplicationContext());
        listaTarefas = TarefaDAO.listar();

        tarefaAdapter = new AnnotationAdapter(listaTarefas);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new DividerItemDecoration(getApplicationContext(), LinearLayout.VERTICAL));
        recyclerView.setAdapter(tarefaAdapter);
    }

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