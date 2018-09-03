package com.example.cse3310.personaltutoringservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BuildSchedule extends AppCompatActivity {
    int daychoose = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_build_schedule);
    }

    public void clickedmonday(View view1){
        daychoose = 1;
        Intent nextpage1 = new Intent(BuildSchedule.this, StartTimePage.class);
        nextpage1.putExtra("Day",daychoose);
        startActivity(nextpage1);

    }

    public void clickedtues(View view1){
        daychoose = 2;
        Intent nextpage1 = new Intent(BuildSchedule.this, StartTimePage.class);
        nextpage1.putExtra("Day",daychoose);
        startActivity(nextpage1);

    }
    public void clickedweds(View view1) {
        daychoose = 3;
        Intent nextpage1 = new Intent(BuildSchedule.this, StartTimePage.class);
        nextpage1.putExtra("Day",daychoose);
        startActivity(nextpage1);

    }
    public void clickedthurs(View view1){
        daychoose = 4;
        Intent nextpage1 = new Intent(BuildSchedule.this, StartTimePage.class);
        nextpage1.putExtra("Day",daychoose);
        startActivity(nextpage1);

    }
    public void clickedfriday(View view1){
        daychoose = 5;
        Intent nextpage1 = new Intent(BuildSchedule.this, StartTimePage.class);
        nextpage1.putExtra("Day",daychoose);
        startActivity(nextpage1);

    }
    public void clickedsat(View view1){
        daychoose = 6;
        Intent nextpage1 = new Intent(BuildSchedule.this, StartTimePage.class);
        nextpage1.putExtra("Day",daychoose);
        startActivity(nextpage1);

    }
    public void clickedsunday(View view1) {
        daychoose = 7;
        Intent nextpage1 = new Intent(BuildSchedule.this, StartTimePage.class);
        nextpage1.putExtra("Day", daychoose);
        startActivity(nextpage1);
    }

    }