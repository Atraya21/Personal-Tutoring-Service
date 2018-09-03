package com.example.cse3310.personaltutoringservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TypeofBuild extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_typeof_build);
    }
    public void tutorbuild(View view){
        Intent intend = new Intent(TypeofBuild.this,TutorRegistration.class);
        startActivity(intend);
    }
    public void studentbuild(View view){
        Intent intend = new Intent(TypeofBuild.this,StudentRegistration.class);
        startActivity(intend);
    }
}
