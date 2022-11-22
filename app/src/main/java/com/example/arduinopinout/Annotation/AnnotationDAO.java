package com.example.arduinopinout.Annotation;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class AnnotationDAO implements AnnotationDAOInterface {

    private SQLiteDatabase write_annotation;
    private SQLiteDatabase read_annotation;

    public AnnotationDAO(Context context) {
        DataBaseHelper db = new DataBaseHelper(context);
        write_annotation = db.getWritableDatabase();
        read_annotation = db.getReadableDatabase();
    }

    @Override
    public boolean salvar(AnnotationFunctions annotation) {

        ContentValues cv = new ContentValues();
        cv.put("nome",annotation.getAnnotationName());
        write_annotation.insert(DataBaseHelper.TABELA_ANOTACOES,null,cv);
        return true;
    }

    @Override
    public boolean atualizar(AnnotationFunctions annotation) {

        ContentValues cv = new ContentValues();
        cv.put("nome",annotation.getAnnotationName());
        String[] args = {annotation.getId().toString()};
        write_annotation.update(DataBaseHelper.TABELA_ANOTACOES,cv,"id=?",args);
        return true;
    }

    @Override
    public boolean deletar(AnnotationFunctions annotation) {
        String[] args = {annotation.getId().toString()};
        write_annotation.delete(DataBaseHelper.TABELA_ANOTACOES,"id=?",args);
        return true;
    }

    @Override
    public List<AnnotationFunctions> listar() {

        List<AnnotationFunctions> annotation_list = new ArrayList<>();

        String sql = "SELECT * FROM " + DataBaseHelper.TABELA_ANOTACOES + " ;";
        Cursor c = read_annotation.rawQuery(sql,null);

        while (c.moveToNext()){

            AnnotationFunctions annotation = new AnnotationFunctions();

            Long id = c.getLong(c.getColumnIndex("id"));
            String annotationName = c.getString(c.getColumnIndex("nome"));

            annotation.setId(id);
            annotation.setAnnotationName(annotationName);

            annotation_list.add(annotation);
        }
        return annotation_list;
    }
}
