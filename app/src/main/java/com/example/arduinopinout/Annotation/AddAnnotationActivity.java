package com.example.arduinopinout.Annotation;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.arduinopinout.R;
import com.google.android.material.textfield.TextInputEditText;
//activity que vai abrir quando clicamos no flow action button
public class AddAnnotationActivity extends AppCompatActivity {

    private TextInputEditText   editAnnotation; //id onde estamos escrevendo nossa anotação (aula 4)
    private AnnotationBridge    thisAnnotation; //relacionado ao alteramento da anotação já existente

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addannotation);

        editAnnotation = findViewById(R.id.textAnotacao); //setando o xml com o java

        //abaixo vai recuperar a caso for edição

        thisAnnotation = (AnnotationBridge) getIntent().getSerializableExtra("anotacaoSelecionada"); //recuperamos os valores que foi criada para a activity

        if(thisAnnotation!=null){ //a anotação clicada vai ser exibida na tela de texto para alteração (null se o valor não for nulo)
            editAnnotation.setText(thisAnnotation.getAnnotationName()); //exibir a anotação que foi clicada para alterar
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_add_annotation,menu); //inflar o menu de salvar (aula 2)

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {//relacionado ao click do menu de salvar(aula 2)
//vai ser aqui onde vamos salvar nossas anotações (aula 4)
        //executar a ação salvar
        switch (item.getItemId()){
            case R.id.itemSalvar:

                AnnotationDAO annotationDAO = new AnnotationDAO(getApplicationContext()); //usamos para instanciar o annotationdao. usado para edição quanto incremento de uma nova tarefra

                if(thisAnnotation!=null){ //edição da anotação que foi clicada se casoi ela for diferente de nulo
                    String annotationName = editAnnotation.getText().toString(); //recupera oq foi digitado na caixa de texto
                    if(!annotationName.isEmpty()) { //entra nesse if se o nome da tarefa não estiver vazio
                        AnnotationBridge annotation = new AnnotationBridge();
                        annotation.setAnnotationName(annotationName); //novo nome da anotação
                        annotation.setId(thisAnnotation.getId());
                        annotationDAO.atualizar(annotation); //comando usado para atualizar as anotações
                        finish(); //fecha a anotação
                    }
                }else{ //comando que vai salvar uma nova anotação
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