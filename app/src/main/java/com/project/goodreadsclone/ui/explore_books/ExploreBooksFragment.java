package com.project.goodreadsclone.ui.explore_books;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.project.goodreadsclone.R;

public class ExploreBooksFragment extends Fragment {

    private ExploreBooksViewModel exploreBooksViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        exploreBooksViewModel =
                ViewModelProviders.of(this).get(ExploreBooksViewModel.class);
        View root = inflater.inflate(R.layout.fragment_explore_books, container, false);
//        final TextView textView = root.findViewById(R.id.text_slideshow);
//        exploreBooksViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });
        return root;
    }
}