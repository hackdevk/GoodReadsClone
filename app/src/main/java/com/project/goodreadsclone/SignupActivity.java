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

public class SignupActivity extends AppCompatActivity {

    TextView policyTV;
    TextView signinTV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        policyTV = findViewById(R.id.activity_signup_choice_tv_policy2);
        signinTV = findViewById(R.id.activity_signup_choice_tv_signin);

//        FloatingActionButton fab = findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });

        //for the "policy and terms of service label"
        SpannableString policyString = new SpannableString("Terms of Service and Privacy Policy.");
        ClickableSpan policySpan = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                startActivity(new Intent(getApplicationContext(),TermsOfUseActivity.class));
            }
        };
        policyString.setSpan(policySpan,0,15, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        policyTV.setText(policyString);
        policyTV.setMovementMethod(LinkMovementMethod.getInstance());

        //for the signin label for going to the signin page
        SpannableString loginString = new SpannableString("Already a member? Sign in");
        ClickableSpan loginSpan = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                startActivity(new Intent(getApplicationContext(),LoginActivity.class));
            }
        };
        loginString.setSpan(policySpan,18,25, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        signinTV.setText(loginString);
        signinTV.setMovementMethod(LinkMovementMethod.getInstance());

    }

}
