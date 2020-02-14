package com.project.goodreadsclone.ui.best_books_of_year;

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

public class BestBooksOfYearFragment extends Fragment {

    private BestBooksOfYearViewModel bestBooksOfYearViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        bestBooksOfYearViewModel =
                ViewModelProviders.of(this).get(BestBooksOfYearViewModel.class);
        View root = inflater.inflate(R.layout.fragment_best_books, container, false);
        final TextView textView = root.findViewById(R.id.text_send);
        bestBooksOfYearViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}