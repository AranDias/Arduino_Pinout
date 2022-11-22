package com.example.arduinopinout.Annotation;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class AnnotationDAO implements AnnotationDAOInterface {

    private SQLiteDatabase escreve;
    private SQLiteDatabase le;

    public AnnotationDAO(Context context) {
        DataBaseHelper db = new DataBaseHelper(context);
        escreve = db.getWritableDatabase();
        le = db.getReadableDatabase();
    }

    @Override
    public boolean salvar(AnnotationFunctions tarefa) {

        ContentValues cv = new ContentValues();
        cv.put("nome",tarefa.getAnnotationName());

        try{
            escreve.insert(DataBaseHelper.TABELA_TAREFAS,null,cv);
            Log.e("INFO","tarefa salva com sucesso");
        }catch(Exception e){
            Log.e("INFO","Erro ao salvar tarefa" + e.getMessage());
            return false;
        }

        return true;
    }

    @Override
    public boolean atualizar(AnnotationFunctions tarefa) {

        ContentValues cv = new ContentValues();
        cv.put("nome",tarefa.getAnnotationName());

        try{
            String[] args = {tarefa.getId().toString()};
            escreve.update(DataBaseHelper.TABELA_TAREFAS,cv,"id=?",args);
            Log.e("INFO","tarefa salva com sucesso");
        }catch(Exception e){
            Log.e("INFO","Erro ao salvar tarefa" + e.getMessage());
            return false;
        }

        return true;
    }

    @Override
    public boolean deletar(AnnotationFunctions tarefa) {
        try{
            String[] args = {tarefa.getId().toString()};
            escreve.delete(DataBaseHelper.TABELA_TAREFAS,"id=?",args);
            Log.e("INFO","tarefa removida com sucesso");
        }catch(Exception e){
            Log.e("INFO","Erro ao remover tarefa" + e.getMessage());
            return false;
        }


        return true;
    }

    @Override
    public List<AnnotationFunctions> listar() {

        List<AnnotationFunctions> tarefas = new ArrayList<>();

        String sql = "SELECT * FROM " + DataBaseHelper.TABELA_TAREFAS + " ;";
        Cursor c = le.rawQuery(sql,null);

        while (c.moveToNext()){

            AnnotationFunctions tarefa = new AnnotationFunctions();

            Long id = c.getLong(c.getColumnIndex("id"));
            String nomeTarefa = c.getString(c.getColumnIndex("nome"));

            tarefa.setId(id);
            tarefa.setNomeTarefa(nomeTarefa);

            tarefas.add(tarefa);
        }
        return tarefas;
    }
}
