package com.example.ratatatcat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnSignUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        btnSignUp = findViewById(R.id.btnSignUp);
        btnSignUp.setOnClickListener(this);

}

    @Override
    public void onClick(View view) {
        if(view == btnSignUp){
            Intent i = new Intent(this, SignUpActivity.class);
            startActivity(i);
        }
        }
    }