package com.example.comicbook.Utils;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface PersonaService {

    @GET("persona")
    Call<List<Persona>> getPersonas();



}
