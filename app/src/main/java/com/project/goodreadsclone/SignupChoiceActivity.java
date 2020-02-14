package com.project.goodreadsclone;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;

public class SignupChoiceActivity extends AppCompatActivity {
    TextView signupLoginLabel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_choice);

        signupLoginLabel = findViewById(R.id.activity_signup_choice_tv_login);

        //setting the clickable text for login
        SpannableString loginString = new SpannableString("Already a Goodreads member? Log In");
        ClickableSpan loginSpan = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                startActivity(new Intent(SignupChoiceActivity.this,LoginActivity.class));
            }
        };
        loginString.setSpan(loginSpan,28,34, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        signupLoginLabel.setText(loginString);
        signupLoginLabel.setMovementMethod(LinkMovementMethod.getInstance());


    }
}
