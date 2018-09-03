package com.example.cse3310.personaltutoringservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ViewBankifno extends AppCompatActivity {

    String cardnumber = null;
    String cvcnumber = null;
    String cardtype = null;
    TextView Cardnubmer;
    TextView CVCnumber;
    TextView Cardype;

    Tutor temp = new Tutor();
    Bankinfo temp2 = new Bankinfo();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_bankifno);
        FullData g = (FullData) getApplication();
        Cardnubmer = (TextView) findViewById(R.id.T_cardnumber);
        CVCnumber= (TextView) findViewById(R.id.t_cvs);
        Cardype= (TextView) findViewById(R.id.T_cardtype);

        temp = g.getMainusertutor();
        temp2 = temp.getMybankinfo();
        cardnumber = temp2.getCardnumber();
        cardtype = temp2.getCardtype();
        cvcnumber = temp2.getCSVsunumber();


        Cardnubmer.setText(cardnumber);
        CVCnumber.setText(cvcnumber);
        Cardype.setText(cardtype);
    }
    public void TutorViewEditBank(View view){
        Intent intend = new Intent(ViewBankifno.this,TutorViewEditBank.class);
        startActivity(intend);

    }
    public void mainmenu(View view){
        Intent intend = new Intent(ViewBankifno.this,TutorHomePage.class);
        startActivity(intend);


    }
}
