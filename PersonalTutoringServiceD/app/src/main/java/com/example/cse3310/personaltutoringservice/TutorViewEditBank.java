package com.example.cse3310.personaltutoringservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class TutorViewEditBank extends AppCompatActivity {

    String cardname = null;
    String cardnumber = null;
    String csvnumber = null;
    String zipcode = null;
    String cardtype = null;
    String sub1,sub2,sub3;
    int CardType=9;
    Tutor me = new Tutor();
    Bankinfo b = new Bankinfo();
    EditText CardName;
    EditText CardNumber;
    EditText CSVNumber;
    EditText ZipCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutor_view_edit_bank);
        FullData g = (FullData) getApplication();
        CardNumber = (EditText) findViewById(R.id.CardNumber);
        CSVNumber = (EditText) findViewById(R.id.CSVNumber);
        me = g.getMainusertutor();
        b = me.getMybankinfo();
        sub1 = b.getCardnumber();
        sub2 = b.getCSVsunumber();
        CardNumber.setText(sub1);
        CSVNumber.setText(sub2);
    }
    public void makeedit(View view) {
        FullData g = (FullData) getApplication();
        CardName = (EditText) findViewById(R.id.CardName);
        CardNumber = (EditText) findViewById(R.id.CardNumber);
        CSVNumber = (EditText) findViewById(R.id.CSVNumber);
        ZipCode = (EditText) findViewById(R.id.ZipCode);

        cardname = CardName.getText().toString();
        cardnumber = CardNumber.getText().toString();
        csvnumber = CSVNumber.getText().toString();
        zipcode = ZipCode.getText().toString();

        me = g.gettemptutor();
        if (CardType == 0) {
            cardtype = "Visa";
        } else if (CardType == 1) {
            cardtype = "MasterCard";
        } else if (CardType == 3) {
            cardtype = "Paypal";
        }
        me = g.getMainusertutor();
        b.setCardnumber(cardnumber);
        b.setCSVsunumber(csvnumber);
        b.setCardtype(cardtype);
        me.setMybankinfo(b);
        g.setMainusertutor(me);
        Intent nextpage = new Intent(TutorViewEditBank.this, TutorHomePage.class);
        startActivity(nextpage);
    }


    public void home(View view ){
        Intent nextpage = new Intent(TutorViewEditBank.this, TutorHomePage.class);
        startActivity(nextpage);
    }
}
