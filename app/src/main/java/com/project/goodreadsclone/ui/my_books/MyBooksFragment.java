package com.project.goodreadsclone.ui.my_books;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.project.goodreadsclone.R;

public class MyBooksFragment extends Fragment {

    private MyBooksViewModel myBooksViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        myBooksViewModel =
                ViewModelProviders.of(this).get(MyBooksViewModel.class);
        View root = inflater.inflate(R.layout.fragment_my_books, container, false);
        final TextView textView = root.findViewById(R.id.text_gallery);
        myBooksViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}