package com.example.comicbook.ui.slideshow;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.comicbook.Model.Comic;


import com.example.comicbook.R;
import com.example.comicbook.databinding.FragmentSlideshowBinding;

public class SlideshowFragment extends Fragment {

    private FragmentSlideshowBinding binding;
    private View root;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        SlideshowViewModel slideshowViewModel =
                new ViewModelProvider(this).get(SlideshowViewModel.class);

        binding = FragmentSlideshowBinding.inflate(inflater, container, false);
         root = binding.getRoot();

        final TextView textView = binding.textSlideshow;
        slideshowViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);


        Button btnAceptar= root.findViewById(R.id.btnAceptar);

        btnAceptar.setOnClickListener(aceptar);

        return root;//fin del fragmento
    }


    //Metodos
    View.OnClickListener aceptar= new View.OnClickListener() {


        @Override
        public void onClick(View view) {

            EditText editTextSerial = root.findViewById(R.id.editTextSerialComic);
            EditText editTextTitulo = root.findViewById(R.id.editTextTitulo);
            EditText editTextDescripcion = root.findViewById(R.id.editTextDescripcion);
            EditText editTextNumeroTomo = root.findViewById(R.id.editTextNumeroTomo);
            EditText editTextPuntuacion = root.findViewById(R.id.editTextPuntacion);
            EditText editTextEditorial = root.findViewById(R.id.editTextEditorial);
            Spinner spinnerGE = root.findViewById(R.id.SpnSelecionGeneroComic);
          //Instancia de la clase
            Comic c = new Comic();

            c.setSerial_Comic(editTextSerial.getText().toString());
            c.setTitulo(editTextTitulo.getText().toString());
            c.setEditorial(editTextEditorial.getText().toString());
            c.setNumero_tomo(editTextNumeroTomo.getText().length());
            c.setPuntuacion(editTextPuntuacion.getText().length());
            c.setDescripcion(editTextDescripcion.getText().toString());
            c.setGenero_Comic(spinnerGE.getSelectedItem().toString());

            c.guardar(getContext());


            Toast.makeText(view.getContext(), "Comic Agregado Correctamente", Toast.LENGTH_LONG).show();
        }
    };





    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }







}