package com.project.goodreadsclone.ui.scan_books;

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

public class ScanBooksFragment extends Fragment {

    private ScanBooksViewModel scanBooksViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        scanBooksViewModel =
                ViewModelProviders.of(this).get(ScanBooksViewModel.class);
        View root = inflater.inflate(R.layout.fragment_scan_books, container, false);
//        final TextView textView = root.findViewById(R.id.text_share);
//        scanBooksViewModel.getText().observe(this, new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });
        return root;
    }
}