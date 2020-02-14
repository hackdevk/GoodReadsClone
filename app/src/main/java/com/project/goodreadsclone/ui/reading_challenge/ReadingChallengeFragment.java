package com.project.goodreadsclone.ui.reading_challenge;

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

public class ReadingChallengeFragment extends Fragment {

    private ReadingChallengeViewModel readingChallengeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        readingChallengeViewModel =
                ViewModelProviders.of(this).get(ReadingChallengeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_challenge_progress, container, false);
        final TextView textView = root.findViewById(R.id.text_tools);
        readingChallengeViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}