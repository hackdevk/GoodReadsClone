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
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    TextView forgotTV;
    Button loginBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        FloatingActionButton fab = findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });

        loginBtn = findViewById(R.id.content_login_btn_login);
        forgotTV = findViewById(R.id.content_login_tv_forgot_pswd);

        //for setting the "forgot password" clickable string
        SpannableString forgotString = new SpannableString("Forgot your pasword?");
        ClickableSpan forgotSpan = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                startActivity(new Intent(LoginActivity.this,ForgotPasswordActivity.class));
            }
        };
        forgotString.setSpan(forgotSpan,0,forgotString.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        forgotTV.setText(forgotString);
        forgotTV.setMovementMethod(LinkMovementMethod.getInstance());

        //for the login button
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginIntent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(loginIntent);
            }
        });
    }

}
