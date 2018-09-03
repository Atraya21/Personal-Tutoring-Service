package com.example.cse3310.personaltutoringservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class TutorRegistration extends AppCompatActivity {
    String fname = null;
    String lname = null;
    String phone = null;
    String username = null;
    String email=null;
    String address=null;
    String password=null;
    ;

    EditText FirstName;
     EditText LastName;
     EditText UserName;
     EditText Phone;
     EditText Email;
     EditText Address;
     EditText Password;


            Tutor me = new Tutor(); // required
    AccountInfo info = new AccountInfo(); //required
    int category=9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutor_registration);


        final CheckBox Math= (CheckBox) findViewById(R.id.Math);
        final CheckBox Science= (CheckBox) findViewById(R.id.Science);
        final CheckBox English= (CheckBox) findViewById(R.id.English);
        final CheckBox Music= (CheckBox) findViewById(R.id.Music);
        final CheckBox Arts= (CheckBox) findViewById(R.id.Arts);


        Math.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                category=0;
            }
        });

        Science.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                category=1;
            }
        });

        English.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                category=2;
            }
        });

        Music.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                category=3;
            }
        });

        Arts.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                category=4;
            }
        });

    }
    public void Next(View view){
        String test1 = null;
        String test2 = null;
        FullData g = (FullData) getApplication();
         FirstName= (EditText) findViewById(R.id.T_etFirstName);
         LastName= (EditText) findViewById(R.id.T_etLastName);
         UserName= (EditText) findViewById(R.id.T_etID);
         Phone= (EditText) findViewById(R.id.T_etPhone);
         Email= (EditText) findViewById(R.id.T_etEmail);
         Address= (EditText) findViewById(R.id.T_etAddress);
         Password= (EditText) findViewById(R.id.T_etPassword);



        fname = FirstName.getText().toString();
        lname = LastName.getText().toString();
        phone= Phone.getText().toString();
        username=UserName.getText().toString();
        email=Email.getText().toString();
        address=Address.getText().toString();
        password=Password.getText().toString();




        g.setCourschoosen(category);
        me = g.gettemptutor();
        info.setLastname(lname);
        info.setFirstname(fname);
        info.setId(username);
        info.setPassword(password);

        info.setEmail(email);
        info.setPhonenumber(phone);

        me.setMyaccoutinfo(info);
        g.setTemptutor(me);
        me = g.gettemptutor();
        test1 = me.gettutorid();
        test2 = me.gettutorpassword();
        Intent nextpage = new Intent(TutorRegistration.this,Tutorbankinfo.class);
        startActivity(nextpage); // see how to change this

    }
}
