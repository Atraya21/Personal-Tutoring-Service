package com.example.cse3310.personaltutoringservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class TutorEdittext extends AppCompatActivity {
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
    Tutor temp = new Tutor();
    AccountInfo temp2 = new AccountInfo();
    AccountInfo info = new AccountInfo();
    Tutor me = new Tutor();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutor_edittext);
        FullData g = (FullData) getApplication();
        FirstName= (EditText) findViewById(R.id.T_etFirstName);
        LastName= (EditText) findViewById(R.id.T_etLastName);
        UserName= (EditText) findViewById(R.id.T_etID);
        Phone= (EditText) findViewById(R.id.T_etPhone);
        Email= (EditText) findViewById(R.id.T_etEmail);
        Address= (EditText) findViewById(R.id.T_etAddress);
        Password= (EditText) findViewById(R.id.T_etPassword);
        temp = g.getMainusertutor();
        temp2 = temp.getMyaccoutinfo();
        fname = temp2.getFirstname();
        lname = temp2.getLastname();
        phone = temp2.getPhonenumber();
        email = temp2.getEmail();
        address = temp2.getAddress();
        username = temp2.getId();
        password = temp2.getPassword();
        FirstName.setText(fname);
        LastName.setText(lname);
        UserName.setText(username);
        Phone.setText(phone);
        Email.setText(email);
        Address.setText(address);
        Password.setText(password);

    }

    public void Next(View view) {
        String test1 = null;
        String test2 = null;
        FullData g = (FullData) getApplication();
        FirstName = (EditText) findViewById(R.id.T_etFirstName);
        LastName = (EditText) findViewById(R.id.T_etLastName);
        UserName = (EditText) findViewById(R.id.T_etID);
        Phone = (EditText) findViewById(R.id.T_etPhone);
        Email = (EditText) findViewById(R.id.T_etEmail);
        Address = (EditText) findViewById(R.id.T_etAddress);
        Password = (EditText) findViewById(R.id.T_etPassword);

        fname = FirstName.getText().toString();
        lname = LastName.getText().toString();
        phone = Phone.getText().toString();
        username = UserName.getText().toString();
        email = Email.getText().toString();
        address = Address.getText().toString();
        password = Password.getText().toString();


        me = g.getMainusertutor();
        info.setLastname(lname);
        info.setFirstname(fname);
        info.setId(username);
        info.setPassword(password);
        info.setEmail(email);
        info.setPhonenumber(phone);
        me.setMyaccoutinfo(info);
        g.setMainusertutor(me);
        Intent nextpage = new Intent(TutorEdittext.this,TutorHomePage.class);
        startActivity(nextpage);
    }
    public void home(View view){
        Intent intend = new Intent(TutorEdittext.this,TutorHomePage.class);
        startActivity(intend);
    }
}
