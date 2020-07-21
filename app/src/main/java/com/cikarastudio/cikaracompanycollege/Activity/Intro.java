package com.cikarastudio.cikaracompanycollege.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.cikarastudio.cikaracompanycollege.R;

public class Intro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
        Button next_tutorial = findViewById(R.id.next_tutorial);
        next_tutorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(Intro.this, LoginActivity.class);
                startActivity(next);
                finish();
            }
        });
    }
}