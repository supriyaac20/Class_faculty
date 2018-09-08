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
import android.widget.RadioGroup;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Dailyattendence extends AppCompatActivity {
    Button Donebutton,Editbutton;
    RadioGroup radioButton;
    FirebaseAuth firebaseAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dailyattendence);

        Donebutton = (Button) findViewById(R.id.doneid);
        Editbutton = (Button) findViewById(R.id.editid);
        radioButton = (RadioGroup) findViewById(R.id.radiogrp1id);

        firebaseAuth = FirebaseAuth.getInstance();

        Donebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Facultysetting2.class));
            }
        });

        Editbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Facultysetting2.class));
            }
        });


    }
}
