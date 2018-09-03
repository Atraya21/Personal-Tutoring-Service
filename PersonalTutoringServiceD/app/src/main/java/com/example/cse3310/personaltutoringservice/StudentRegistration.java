package com.example.cse3310.personaltutoringservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class StudentRegistration extends AppCompatActivity {
    String fname = null;
    String lname = null;
    String phone = null;
    String username = null;
    String email=null;
    String address=null;
    String password=null;


     EditText FirstName;
     EditText LastName;
     EditText UserName;
     EditText Phone;
     EditText Email;
     EditText Address;
     EditText Password;



    Student me = new Student();
    AccountInfo info = new AccountInfo();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_registration);

    }
    public void next(View view){

         FirstName= (EditText) findViewById(R.id.S_etFirstName);
         LastName= (EditText) findViewById(R.id.S_etLastName);
         UserName= (EditText) findViewById(R.id.S_etID);
         Phone= (EditText) findViewById(R.id.S_etPhone);
         Email= (EditText) findViewById(R.id.S_etEmail);
         Address= (EditText) findViewById(R.id.S_etAddress);
         Password= (EditText) findViewById(R.id.S_etPassword);


        FullData g = (FullData) getApplication();

        fname = FirstName.getText().toString();
        lname = LastName.getText().toString();
        phone= Phone.getText().toString();
        username=UserName.getText().toString();
        email=Email.getText().toString();
        address=Address.getText().toString();
        password=Password.getText().toString();



        me = g.getTempstudent();
        info.setLastname(fname);
        info.setLastname(lname);
        info.setId(username);
        info.setPassword(password);


        info.setEmail(email);
        info.setPhonenumber(phone);
        me.setMyaccoutinfo(info);
        g.setTempstudent(me);
        Intent nextpage = new Intent(StudentRegistration.this,Studentbankinfo.class);
        startActivity(nextpage);

    }
}
