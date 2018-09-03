package com.example.cse3310.personaltutoringservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FinishEditScedule extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish_edit_scedule);
    }
    public void moreedits(View view){
        Intent nextpage = new Intent(FinishEditScedule.this,EditScedule.class);
        startActivity(nextpage);

    }
    public void finish(View view){
        Intent nextpage = new Intent(FinishEditScedule.this,TutorHomePage.class);
        startActivity(nextpage);

    }
}
