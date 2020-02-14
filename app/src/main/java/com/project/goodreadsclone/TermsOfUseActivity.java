package com.project.goodreadsclone;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;

public class TermsOfUseActivity extends AppCompatActivity {

    TextView policyTV ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terms_of_use);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        policyTV = findViewById(R.id.content_terms_of_use_tv_policy);

//        FloatingActionButton fab = findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });

        SpannableString policyString = new SpannableString("See also: Privacy Policy.");
//        ClickableSpan policySpan = new ClickableSpan() {
//            @Override
//            public void onClick(@NonNull View widget) {
//                startActivity(new Intent(getApplicationContext(),PrivacyActivity.class));
//        };
//        policyString.setSpan(policySpan,10,policyString.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
//        policyTV.setText(policyString);
//        policyTV.setMovementMethod(LinkMovementMethod.getInstance());

    }

}
