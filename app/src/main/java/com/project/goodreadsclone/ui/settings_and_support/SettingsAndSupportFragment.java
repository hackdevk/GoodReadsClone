package com.project.goodreadsclone.ui.settings_and_support;

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

public class SettingsAndSupportFragment extends Fragment {

    private SettingsAndSupportViewModel settingsAndSupportViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        settingsAndSupportViewModel =
                ViewModelProviders.of(this).get(SettingsAndSupportViewModel.class);
        View root = inflater.inflate(R.layout.fragment_settings_and_support, container, false);
        final TextView textView = root.findViewById(R.id.text_share);
        settingsAndSupportViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}