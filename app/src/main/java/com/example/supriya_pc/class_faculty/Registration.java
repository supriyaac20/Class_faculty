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
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import java.util.jar.Attributes;

public class Registration extends AppCompatActivity {
    ImageButton displayImage;
    EditText name,code,address,email,phone,accredation,selectlog;
    Button submit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        name = (EditText) findViewById(R.id.nameid);
        code = (EditText) findViewById(R.id.codeid);
        address = (EditText) findViewById(R.id.addressid);
        email = (EditText) findViewById(R.id.emailid);
        phone = (EditText) findViewById(R.id.phoneid);
        accredation = (EditText) findViewById(R.id.accredationid);
        selectlog = (EditText) findViewById(R.id.logoid);
        submit = (Button) findViewById(R.id.submitid);


        displayImage = (ImageButton) findViewById(R.id.cameraid);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Facultysetting2.class));
            }
        });
    }
}
