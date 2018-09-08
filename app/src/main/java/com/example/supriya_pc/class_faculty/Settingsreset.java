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


public class Settingsreset extends AppCompatActivity {
    EditText enterpwd1,enternewpwd1,confirmpwd1;
    Button submit1;
FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settingsreset);

        enterpwd1 = (EditText) findViewById(R.id.enterpwd);
        enternewpwd1 = (EditText) findViewById(R.id.enternewpwd);
        confirmpwd1 = (EditText) findViewById(R.id.confirmpwd);
        submit1 = (Button) findViewById(R.id.submitpwd);

        firebaseAuth = FirebaseAuth.getInstance();

        submit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String Enterpwd1 = enterpwd1.getText().toString();
                String Enternewpwd1 = enternewpwd1.getText().toString();
                String Confirmpwd1 = confirmpwd1.getText().toString();

                if(TextUtils.isEmpty(Enterpwd1)){
                    Toast.makeText(getApplicationContext(),"Please fill in the required fields",Toast.LENGTH_SHORT).show();
                }

                if(TextUtils.isEmpty(Enternewpwd1)){
                    Toast.makeText(getApplicationContext(),"Please fill in the required fields",Toast.LENGTH_SHORT).show();
                }

                if(TextUtils.isEmpty(Confirmpwd1)){
                    Toast.makeText(getApplicationContext(),"Please fill in the required fields",Toast.LENGTH_SHORT).show();
                }

                if(enternewpwd1.equals(confirmpwd1)){
                    Toast.makeText(getApplicationContext(),"Password successfully changed",Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(getApplicationContext(),Settings.class));
                }
                else {
                    Toast.makeText(getApplicationContext(),"Wrong password",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
