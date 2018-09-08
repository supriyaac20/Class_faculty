package com.example.supriya_pc.class_faculty;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
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


public class Facultysetting2 extends AppCompatActivity {
    ImageButton  profileImage,notificationImage,settingsImage,attendenceImage,rosterImage,notesImage,groupImage,assignmentImage;
    FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facultysetting2);

        ImageButton profileImage = (ImageButton) findViewById(R.id.profileId);
        ImageButton notificationImage = (ImageButton) findViewById(R.id.notificationid);
        ImageButton settingsImage = (ImageButton) findViewById(R.id.settingsid);
        ImageButton attendenceImage = (ImageButton) findViewById(R.id.attendenceid);
        ImageButton rosterImage = (ImageButton) findViewById(R.id.rosterid);
        ImageButton notesImage = (ImageButton) findViewById(R.id.notesid);
        ImageButton groupImage = (ImageButton) findViewById(R.id.groupid);
        ImageButton assignmentImage = (ImageButton) findViewById(R.id.assignmentid);

        firebaseAuth = FirebaseAuth.getInstance();

        profileImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Facultydetails.class));
            }
        });

        notificationImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Facultynotification.class));
            }
        });

        settingsImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Settings.class));
            }
        });
        attendenceImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Attendence.class));
            }
        });

        rosterImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Dailyroster.class));
            }
        });
        notesImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Notes.class));
            }
        });
        groupImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Groups.class));
            }
        });

        assignmentImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Assignments.class));
            }
        });
    }
}
