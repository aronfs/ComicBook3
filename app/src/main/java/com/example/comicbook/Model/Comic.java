package com.example.comicbook.Model;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

public class Comic {


    private String Serial_Comic;
    private String Titulo;
    private String Editorial;
    private int Numero_tomo;
    private String Genero_Comic;
    private int Puntuacion;
    private String Descripcion;

    private static List<Comic> Lista = new ArrayList<Comic>();


    public Comic() {
    }

    public Comic(String serial_Comic, String titulo, String editorial, int numero_tomo, String genero_Comic, int puntuacion, String descripcion) {
        Serial_Comic = serial_Comic;
        Titulo = titulo;
        Editorial = editorial;
        Numero_tomo = numero_tomo;
        Genero_Comic = genero_Comic;
        Puntuacion = puntuacion;
        Descripcion = descripcion;
    }


    public void guardar(Context context){
        BaseComicSQLHelper baseComicSQLHelper = new BaseComicSQLHelper(context);
        String sql = "INSERT INTO comic (Serial_Comic, Titulo, Editorial, Numero_tomo, Genero_Comic, Puntuacion, Descripcion)";
        sql+="VALUES  ('"+getSerial_Comic()+"', '"+getTitulo()+"', '"+getEditorial()+"', "+getNumero_tomo()+", '"+getGenero_Comic()+"', "+getPuntuacion()+", '"+getDescripcion()+"') ";
        baseComicSQLHelper.noQuery(sql);
        baseComicSQLHelper.close();
        Lista.add(this);
    }



    public static List<Comic> getLista() {
        return Lista;
    }

    public String getSerial_Comic() {
        return Serial_Comic;
    }

    public void setSerial_Comic(String serial_Comic) {
        Serial_Comic = serial_Comic;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getEditorial() {
        return Editorial;
    }

    public void setEditorial(String editorial) {
        Editorial = editorial;
    }

    public int getNumero_tomo() {
        return Numero_tomo;
    }

    public void setNumero_tomo(int numero_tomo) {
        Numero_tomo = numero_tomo;
    }

    public String getGenero_Comic() {
        return Genero_Comic;
    }

    public void setGenero_Comic(String genero_Comic) {
        Genero_Comic = genero_Comic;
    }

    public int getPuntuacion() {
        return Puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        Puntuacion = puntuacion;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }
}
