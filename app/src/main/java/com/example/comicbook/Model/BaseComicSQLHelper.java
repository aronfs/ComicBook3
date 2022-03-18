package com.example.comicbook.Model;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


public class BaseComicSQLHelper extends SQLiteOpenHelper {


    private static final String BASE_DATOS = "BaseComic.sqlite";

Context miContext;
    public BaseComicSQLHelper(@Nullable Context context) {
        super(context, BASE_DATOS, null, 3);
        miContext=context;
        //copiar la base al dispositivo
        copiarBase();



    }

    private void copiarBase(){
       File archivoDispositivo = miContext.getDatabasePath(BASE_DATOS);
        try {
            InputStream inputStream=miContext.getAssets().open(BASE_DATOS);
            OutputStream outputStream = new FileOutputStream(archivoDispositivo);
            byte[] buffer = new byte[1024];
            int largo = 0;
            while((largo=inputStream.read(buffer))>0){
                outputStream.write(buffer, 0, largo);
            }
            outputStream.flush();
            outputStream.close();
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


    public void noQuery(String sql){
        this.getWritableDatabase().execSQL(sql);
    }

    public Cursor query (String sql){
        return this.getReadableDatabase().rawQuery(sql, null);
    }
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
