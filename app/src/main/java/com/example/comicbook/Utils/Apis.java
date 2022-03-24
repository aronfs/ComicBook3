package com.example.comicbook.Utils;

public class Apis {

    public static final String URL_Persona= "http://192.168.18.3:8080/Persona";

    public static PersonaService getPersonasService(){
        return Persona.getPersona(URL_Persona).create(PersonaService.class);
    }
}
