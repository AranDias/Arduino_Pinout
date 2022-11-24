package com.example.arduinopinout.Annotation;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;
//metodos para salvar, listar ou deletar nossas tarefas
public class AnnotationDAO implements AnnotationDAOInterface { //implementamos aqueles metodos

    private SQLiteDatabase write_annotation; //atributo para escrever dados na tabela de dados (aula 4)
    private SQLiteDatabase read_annotation;//atributo para escrever dados na tabela de dados (aula 4)

    public AnnotationDAO(Context context) { //construtor para fazer os metodos (aula 4)
        DataBaseHelper db = new DataBaseHelper(context);
        write_annotation = db.getWritableDatabase(); //estampos recuperando o metodo que nos permite escrever na base de dados
        read_annotation = db.getReadableDatabase();//estampos recuperando o metodo que nos permite ler na base de dados
    }

    @Override
    public boolean salvar(AnnotationBridge annotation) {

        ContentValues cv = new ContentValues(); //salvar dados na tabela
        cv.put("nome",annotation.getAnnotationName()); //salvar dados na tabela
        write_annotation.insert(DataBaseHelper.TABELA_ANOTACOES,null,cv); //escrevendo na tabela. Já o null é para salvar caso a pessoa digite alguma coisa
        return true;
    }

    @Override
    public boolean atualizar(AnnotationBridge annotation) { //metodo que vai atualizar as tarefas

        ContentValues cv = new ContentValues();
        cv.put("nome",annotation.getAnnotationName());
        String[] args = {annotation.getId().toString()}; //vamos passar strins como parametro
        write_annotation.update(DataBaseHelper.TABELA_ANOTACOES,cv,"id=?",args);//comando usado para escrever (atualizar tabela)
        return true;
    }

    @Override
    public boolean deletar(AnnotationBridge annotation) { //deletar tarefa (metodo)
        String[] args = {annotation.getId().toString()};
        write_annotation.delete(DataBaseHelper.TABELA_ANOTACOES,"id=?",args);//vai deletar no banco de dados
        return true;
    }

    @Override
    public List<AnnotationBridge> listar() { //EXIBIR A LISTA DE TAREFAS QUE ESCREVI (AULA 4)

        List<AnnotationBridge> annotation_list = new ArrayList<>(); //LISTA DE TAREFAS

        String sql = "SELECT * FROM " + DataBaseHelper.TABELA_ANOTACOES + " ;"; //RECUPERA A LISTA DE TAREFAS PARA EXIBILAS (AULA 4)
        Cursor c = read_annotation.rawQuery(sql,null);

        while (c.moveToNext()){ //ESTRUTURA DE REPETIÇÃO PARA MOVER O CURSOR

            AnnotationBridge annotation = new AnnotationBridge(); //INSTANCIA DO Annotationbridge

            Long id = c.getLong(c.getColumnIndex("id"));
            String annotationName = c.getString(c.getColumnIndex("nome")); //exibição do nome (valor) = aula 4

            annotation.setId(id); //passar o parametro id
            annotation.setAnnotationName(annotationName); //passar o parametro name

            annotation_list.add(annotation);//adicionamento de tarefas
        }
        return annotation_list;
    }
}
