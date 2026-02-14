package com.example.ratatatcat;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.ViewFlipper;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SignUpActivity extends AppCompatActivity implements View.OnClickListener {

    private ViewFlipper viewFlipper;
    private TextView tvSwitchToLogIn, tvSwitchToSignUp;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sign_up);

        viewFlipper = findViewById(R.id.viewFlipper);

        tvSwitchToLogIn = findViewById(R.id.tvSwitchToLogIn);
        tvSwitchToLogIn.setOnClickListener(this);

        tvSwitchToSignUp = findViewById(R.id.tvSwitchToSignUp);
        tvSwitchToSignUp.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view == tvSwitchToLogIn){
            viewFlipper.showNext();
        }
        else if (view == tvSwitchToSignUp){
            viewFlipper.showPrevious();
        }
    }
}