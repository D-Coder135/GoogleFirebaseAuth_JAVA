package com.example.googlefirebaseauth_java;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

public class WelcomePage extends AppCompatActivity {
    Button logoutButton;
    FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_page);
        logoutButton = findViewById(R.id.button5);
        firebaseAuth = FirebaseAuth.getInstance();

        logoutButton.setOnClickListener(v -> {
            firebaseAuth.signOut();
            Intent intent = new Intent(WelcomePage.this, MainActivity.class);
            startActivity(intent);
            finish();
        });
    }
}