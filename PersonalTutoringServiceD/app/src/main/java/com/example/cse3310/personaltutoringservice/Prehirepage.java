package com.example.cse3310.personaltutoringservice;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Prehirepage extends AppCompatActivity {


    Tutor temp = new Tutor();
    AccountInfo temp2 = new AccountInfo();
    String email=null;
    String phone = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prehirepage);
    }

    public void viewscedule(View view) {
        Intent intend = new Intent(Prehirepage.this, ViewschedulePre.class);
        startActivity(intend);


    }

    public void viewrevs(View view) {
        Intent intend = new Intent(Prehirepage.this, VeiwreviewsPre.class);
        startActivity(intend);
    }

    public void hiretutor(View view) { // gets student login
        FullData g = (FullData) getApplication();
        boolean test = false;
        test = g.getstudentlogin();
        if (test) {
            Intent intend = new Intent(Prehirepage.this, Hire.class);
            startActivity(intend);
        } else if (!test) {
            Toast.makeText(this, "Must be loged in to hire", Toast.LENGTH_LONG).show();
        }


    }

    public void info(View view) {

        Intent intend = new Intent(Prehirepage.this, PreViewinfo.class);
        startActivity(intend);


    }

    public void sendemail(View view) {
        FullData g = (FullData) getApplication();
        temp = g.getPrehiretutor();
        temp2 = temp.getMyaccoutinfo();
        email = temp2.getEmail();
        Intent intent = new Intent(Intent.ACTION_SEND); // can be for messages as well
        intent.setData(Uri.parse("mailto:"));
        String[] to = {email}; // to has to change to tutors name
        intent.putExtra(Intent.EXTRA_EMAIL, to);
        intent.putExtra(Intent.EXTRA_SUBJECT, "HIRE");
        intent.putExtra(Intent.EXTRA_TEXT, "Hi! I am Interested in Hiring you...");// account depends on your google account
        intent.setType("message/rfc822");// account depends on your google account
        Intent chooser = Intent.createChooser(intent, "Send Email");
        startActivity(chooser);
    }

    public void sendtext(View view) {
        FullData g = (FullData) getApplication();
        temp = g.getPrehiretutor();
        temp2 = temp.getMyaccoutinfo();
        phone = temp2.getPhonenumber();
        Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts("sms", phone, null));
        intent.putExtra(Intent.EXTRA_TEXT, "Hi! I am Interested in Hiring you...");
        Intent chooser= Intent.createChooser(intent, "Send Text");
        startActivity(chooser);
    }
}
