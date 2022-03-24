package com.example.comicbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.example.comicbook.Utils.Persona;
import com.example.comicbook.Utils.PersonaService;
import com.example.comicbook.ui.gallery.GalleryFragment;
import com.example.comicbook.ui.gallery.GalleryViewModel;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Login extends AppCompatActivity {

    PersonaService personaService;


    Button btningresar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btningresar = (Button) findViewById(R.id.btnIngresar);
        Ingresar();
    }


    public void Ingresar(){
        btningresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Login.this, MenuActivity.class);
                startActivity(i);
            }
        });
    }



    public void Registrarse (View view){
        Intent registro = new Intent(this, RegistroUsuario.class);
        startActivity(registro);
    }

}