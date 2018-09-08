package com.example.supriya_pc.class_faculty;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;


public class Class1 extends AppCompatActivity {
    Button dailyattendenceButton,hourlyattendenceButton;
    FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class1);

        dailyattendenceButton = (Button) findViewById(R.id.dailybtn);
        hourlyattendenceButton = (Button) findViewById(R.id.hourlybtn);

        firebaseAuth = FirebaseAuth.getInstance();

        dailyattendenceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Dailyattendence.class));
            }
        });

        hourlyattendenceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Dailyattendence.class));
            }
        });

    }
}
