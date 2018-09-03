package com.example.cse3310.personaltutoringservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class Studentbankinfo extends AppCompatActivity {
    String cardname = null;
    String cardnumber = null;
    String csvnumber = null;
    String zipcode = null;
    int CardType=9;
    Student me = new Student();
    Bankinfo b = new Bankinfo();
    String cardtype = null;
    EditText CardName;
    EditText CardNumber;
    EditText CSVNumber;
    EditText ZipCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_studentbankinfo);


        final CheckBox Visa= (CheckBox) findViewById(R.id.Visa);
        final CheckBox MasterCard= (CheckBox) findViewById(R.id.MasterCard);
        final CheckBox Paypal= (CheckBox) findViewById(R.id.Paypal);

        Visa.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                CardType=0;
            }


        });

        MasterCard.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                CardType=1;
            }
        });

        Paypal.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                CardType=3;
            }
        });

    }

    public void finish(View view){
        FullData g = (FullData) getApplication();
        CardName= (EditText) findViewById(R.id.CardName);
        CardNumber= (EditText) findViewById(R.id.CardNumber);
        CSVNumber= (EditText) findViewById(R.id.CSVNumber);
        ZipCode= (EditText) findViewById(R.id.ZipCode);

        cardname = CardName.getText().toString();
        cardnumber= CardNumber.getText().toString();
        csvnumber= CSVNumber.getText().toString();
        zipcode= ZipCode.getText().toString();

        me = g.getTempstudent();
        if(CardType == 0){
            cardtype = "Visa";
        }
        else if(CardType == 1){
            cardtype = "MasterCard";
        }
        else if(CardType == 3){
            cardtype = "Paypal";
        }
        b.setCardnumber(cardnumber);
        b.setCSVsunumber(csvnumber);
        b.setCardtype(cardtype);
        me.setMybankinfo(b);
        g.setTempstudent(me);
        g.addstudent();
        Intent nextpage = new Intent(Studentbankinfo.this,MainActivity.class);
        startActivity(nextpage);

    }
}
