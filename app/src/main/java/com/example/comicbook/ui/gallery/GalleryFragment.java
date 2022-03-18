package com.example.comicbook.ui.gallery;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.comicbook.Model.Comic;
import com.example.comicbook.R;
import com.example.comicbook.databinding.FragmentGalleryBinding;

import java.util.ArrayList;
import java.util.List;

public class GalleryFragment extends Fragment {

    private FragmentGalleryBinding binding;






    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        GalleryViewModel galleryViewModel =
                new ViewModelProvider(this).get(GalleryViewModel.class);

        binding = FragmentGalleryBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textGallery;
        galleryViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);

       /* ListView listView = root.findViewById(R.id.listViewComic);
        List<Comic>  listac = Comic.getLista();
        ArrayList<String> listacomic= new ArrayList<String>();*/

/*
            listac.forEach((Comic comic) -> {
    listacomic.add(comic.getTitulo());
            });

        ArrayAdapter<String>arrayAdapter=new ArrayAdapter<String>(
                root.getContext(),
                android.R.layout.simple_list_item_1,
                listacomic
        );
        listView.setAdapter(arrayAdapter);*/

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}