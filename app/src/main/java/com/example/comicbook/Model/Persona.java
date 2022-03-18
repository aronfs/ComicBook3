package com.example.comicbook.Model;

public class Persona {

    private String Nick_Name;
    private String Nombre;
    private String Apellido;
    private String Correo;
    private String Password;

    public Persona() {
    }

    public Persona(String nick_Name, String nombre, String apellido, String correo, String password) {
        Nick_Name = nick_Name;
        Nombre = nombre;
        Apellido = apellido;
        Correo = correo;
        Password = password;
    }

    public String getNick_Name() {
        return Nick_Name;
    }

    public void setNick_Name(String nick_Name) {
        Nick_Name = nick_Name;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
