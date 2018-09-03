package com.example.cse3310.personaltutoringservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Studentlogin extends AppCompatActivity {
    EditText UserName;
    EditText Password;
    boolean logintry = false;
    boolean logintry2 = false;
    String username = null;
    String password = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_studentlogin);
    }
    public void login(View view) {
        FullData data = (FullData) getApplication();
        UserName = (EditText) findViewById(R.id.L_etUserName);
        Password = (EditText) findViewById(R.id.L_etPassword);
        password = Password.getText().toString();
        username = UserName.getText().toString();
        data.studentlogin(username, password);
        logintry = data.getstudentlogin();


        if (logintry) {
            Intent nextpage = new Intent(Studentlogin.this, StudentHomepage.class);
            startActivity(nextpage);
        }
        else if(!logintry){
            Toast.makeText(this, "Error incorrect login or password", Toast.LENGTH_LONG).show();
        }
    }
}
