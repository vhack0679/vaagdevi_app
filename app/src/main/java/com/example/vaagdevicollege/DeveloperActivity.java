package com.example.vaagdevicollege;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class DeveloperActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_developer);
        setupHyperlink();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Developers");



    }

    private void setupHyperlink() {
        TextView linkTextView = findViewById(R.id.vishal);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}