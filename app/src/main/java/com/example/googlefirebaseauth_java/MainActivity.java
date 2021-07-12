package com.example.googlefirebaseauth_java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {
    EditText emailField, passwordField;
    Button registerButton;
    ProgressBar progressBar;
    FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        emailField = findViewById(R.id.editText);
        passwordField = findViewById(R.id.editText2);
        passwordField.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
        registerButton = findViewById(R.id.button);
        progressBar = findViewById(R.id.progressBar);

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = emailField.getText().toString();
                String password = passwordField.getText().toString();

                if (email.isEmpty()) {
                    emailField.setError("Please Enter Your Email.");
                    return;
                } else {
                    if (password.isEmpty()) {
                        passwordField.setError("Please Enter Your Password.");
                        return;
                    }
                }
                progressBar.setVisibility(View.VISIBLE);
            }
        });


    }
}