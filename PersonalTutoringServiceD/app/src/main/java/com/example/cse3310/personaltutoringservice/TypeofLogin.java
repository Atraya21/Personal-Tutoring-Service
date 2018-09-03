package com.example.cse3310.personaltutoringservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TypeofLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_typeof_login);
    }
    public void tutorlogin(View view){
        Intent intend = new Intent(TypeofLogin.this,ActivityLogin.class);
        startActivity(intend);
    }
    public void student(View view){

        Intent intend = new Intent(TypeofLogin.this,Studentlogin.class);
        startActivity(intend);

    }
}
