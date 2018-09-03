package com.example.cse3310.personaltutoringservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Tutorinfoview extends AppCompatActivity {
    String fname = null;
    String lname = null;
    String phone = null;
    String username = null;
    String email=null;
    String address=null;
    String password=null;
    TextView FirstName;
    TextView LastName;
    TextView UserName;
    TextView Phone;
    TextView Email;
    TextView Address;
    Tutor temp = new Tutor();
    AccountInfo temp2 = new AccountInfo();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorinfoview);

        FullData g = (FullData) getApplication();
        FirstName = (TextView) findViewById(R.id.T_firstname);
        LastName= (TextView) findViewById(R.id.T_lastname);
        UserName= (TextView) findViewById(R.id.t_id);
        Phone= (TextView) findViewById(R.id.t_phone);
        Email= (TextView) findViewById(R.id.t_email);
        Address= (TextView) findViewById(R.id.t_adress);
        temp = g.getMainusertutor();
        temp2 = temp.getMyaccoutinfo();
        fname = temp2.getFirstname();
        lname = temp2.getLastname();
        phone = temp2.getPhonenumber();
        email = temp2.getEmail();
        address = temp2.getAddress();
        username = temp2.getId();

        FirstName.setText(fname);
        LastName.setText(lname);
        UserName.setText(username);
        Phone.setText(phone);
        Email.setText(email);
        Address.setText(address);

    }
    public void edittext(View view){

        Intent intend = new Intent(Tutorinfoview.this,TutorEdittext.class);
        startActivity(intend);


    }
    public void viewbank(View view){
        Intent intend = new Intent(Tutorinfoview.this,ViewBankifno.class);
        startActivity(intend);


    }

}
