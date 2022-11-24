package com.example.arduinopinout.Annotation;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;
//classe responsavel por abrigar nosso bnco de dados (aula 3-isso inteiro)
public class DataBaseHelper extends SQLiteOpenHelper {

    public static int       VERSION =1; //versão do app(oncreate)
    public static String    NOME_DB = "DB_ANOTACOES"; //nome do banco de dados
    public static String    TABELA_ANOTACOES = "annotation"; //nome da tabela

    public DataBaseHelper(@Nullable Context context) {
        super(context, NOME_DB, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) { //pessoa instala o app pela primeira vez (3 aula)

        String sql = "CREATE TABLE IF NOT EXISTS " + TABELA_ANOTACOES //creação de tabela caso ela não exista
                + " (id INTEGER PRIMARY KEY AUTOINCREMENT, " + //campo vai ser incremebtado automaticamente
                " nome TEXT NOT NULL ); "; // nome da terefa que não pode ser nulo (text muito caracteres)
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) { //pessoa so vai atualizar o app
        String sql = "DROP TABLE IF EXISTS " + TABELA_ANOTACOES + ";";
        db.execSQL(sql);
        onCreate(db);
    }
}

