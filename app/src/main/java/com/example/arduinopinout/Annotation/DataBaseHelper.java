package com.example.arduinopinout.Annotation;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

public class DataBaseHelper extends SQLiteOpenHelper {

    public static int       VERSION =1;
    public static String    NOME_DB = "DB_TAREFAS";
    public static String    TABELA_ANOTACOES = "tarefas";

    public DataBaseHelper(@Nullable Context context) {
        super(context, NOME_DB, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String sql = "CREATE TABLE IF NOT EXISTS " + TABELA_ANOTACOES
                + " (id INTEGER PRIMARY KEY AUTOINCREMENT, " +
        " nome TEXT NOT NULL ); ";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        String sql = "DROP TABLE IF EXISTS " + TABELA_ANOTACOES + ";";
        db.execSQL(sql);
        onCreate(db);
    }
}
