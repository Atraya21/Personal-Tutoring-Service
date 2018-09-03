package com.example.cse3310.personaltutoringservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class FinishTimePage extends AppCompatActivity {
    String starttime = null;
    String finishtime = null;
    int intstarttime =0;
    int intfinihstime = 0;
    int daychoose = 0;
    Tutor me = new Tutor();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish_time_page);
    }
    public void click12amfinish(View view3){
        Schedule thescedule = new Schedule();
        FullData g = (FullData) getApplication();
        boolean test = true;
        me = g.gettemptutor();
        thescedule = me.getMySchedule();
        Intent theone = getIntent();
        daychoose = theone.getIntExtra("Day",0);
        starttime = theone.getStringExtra("Starttime");
        intstarttime = theone.getIntExtra("intStarttime",0);
        finishtime="12:00am";
        intfinihstime = 24;
        if(daychoose ==1){
            test = thescedule.checkfinishmonday(intfinihstime);
        }
        else if(daychoose == 2){
            test = thescedule.checkfinishtues(intfinihstime);
        }
        else if(daychoose == 3){

            test = thescedule.checkfinishweds(intfinihstime);
        }
        else if(daychoose == 4){

            test = thescedule.checkfinishthurs(intfinihstime);
        }
        else if(daychoose == 5){

            test = thescedule.checkfinishfriday(intfinihstime);
        }
        else if(daychoose == 6){

            test = thescedule.checkfinishsat(intfinihstime);
        }
        else if(daychoose == 7){

            test = thescedule.checkfinishsunday(intfinihstime);
        }
        if(!test){
            Toast.makeText(this,"Error conflicting times",Toast.LENGTH_LONG).show();
        }
        else {


            if (intfinihstime < intstarttime) {
                Toast.makeText(this, "Error must choose finish time\n later then start time", Toast.LENGTH_LONG).show();
            } else {
                Intent nextpage3 = new Intent(FinishTimePage.this, FinishBuildingPage.class);
                nextpage3.putExtra("Day", daychoose);
                nextpage3.putExtra("Starttime", starttime);
                nextpage3.putExtra("intStarttime", intstarttime);
                nextpage3.putExtra("Finishtime", finishtime);
                nextpage3.putExtra("intfinishtime", intfinihstime);
                startActivity(nextpage3);

            }
        }


    }

    public void click11amfinish(View view3){
        Schedule thescedule = new Schedule();
        FullData g = (FullData) getApplication();
        boolean test = true ;
        me = g.gettemptutor();
        thescedule = me.getMySchedule();
        Intent theone = getIntent();
        daychoose = theone.getIntExtra("Day",0);
        starttime = theone.getStringExtra("Starttime");
        intstarttime = theone.getIntExtra("intStarttime",0);
        finishtime="11:00am";
        intfinihstime = 11;
        if(daychoose ==1){
            test = thescedule.checkfinishmonday(intfinihstime);
        }
        else if(daychoose == 2){
            test = thescedule.checkfinishtues(intfinihstime);
        }
        else if(daychoose == 3){

            test = thescedule.checkfinishweds(intfinihstime);
        }
        else if(daychoose == 4){

            test = thescedule.checkfinishthurs(intfinihstime);
        }
        else if(daychoose == 5){

            test = thescedule.checkfinishfriday(intfinihstime);
        }
        else if(daychoose == 6){

            test = thescedule.checkfinishsat(intfinihstime);
        }
        else if(daychoose == 7){

            test = thescedule.checkfinishsunday(intfinihstime);
        }
        if(!test){
            Toast.makeText(this,"Error conflicting times",Toast.LENGTH_LONG).show();
        }
        else {
            if (intfinihstime < intstarttime) {
                Toast.makeText(this, "Error must choose finish time\n later then start time", Toast.LENGTH_LONG).show();
            } else {
                Intent nextpage3 = new Intent(FinishTimePage.this, FinishBuildingPage.class);
                nextpage3.putExtra("Day", daychoose);
                nextpage3.putExtra("Starttime", starttime);
                nextpage3.putExtra("intStarttime", intstarttime);
                nextpage3.putExtra("Finishtime", finishtime);
                nextpage3.putExtra("intfinishtime", intfinihstime);
                startActivity(nextpage3);

            }
        }

    }
    public void click10amfinish(View view3){
        Schedule thescedule = new Schedule();
        FullData g = (FullData) getApplication();
        boolean test = true;
        me = g.gettemptutor();
        thescedule = me.getMySchedule();
        Intent theone = getIntent();
        daychoose = theone.getIntExtra("Day",0);
        starttime = theone.getStringExtra("Starttime");
        intstarttime = theone.getIntExtra("intStarttime",0);
        finishtime="10:00am";
        intfinihstime = 10;
        if(daychoose ==1){
            test = thescedule.checkfinishmonday(intfinihstime);
        }
        else if(daychoose == 2){
            test = thescedule.checkfinishtues(intfinihstime);
        }
        else if(daychoose == 3){

            test = thescedule.checkfinishweds(intfinihstime);
        }
        else if(daychoose == 4){

            test = thescedule.checkfinishthurs(intfinihstime);
        }
        else if(daychoose == 5){

            test = thescedule.checkfinishfriday(intfinihstime);
        }
        else if(daychoose == 6){

            test = thescedule.checkfinishsat(intfinihstime);
        }
        else if(daychoose == 7){

            test = thescedule.checkfinishsunday(intfinihstime);
        }
        if(!test){
            Toast.makeText(this,"Error conflicting times",Toast.LENGTH_LONG).show();
        }
        else {
            if (intfinihstime < intstarttime) {
                Toast.makeText(this, "Error must choose finish time\n later then start time", Toast.LENGTH_LONG).show();
            } else {
                Intent nextpage3 = new Intent(FinishTimePage.this, FinishBuildingPage.class);
                nextpage3.putExtra("Day", daychoose);
                nextpage3.putExtra("Starttime", starttime);
                nextpage3.putExtra("intStarttime", intstarttime);
                nextpage3.putExtra("Finishtime", finishtime);
                nextpage3.putExtra("intfinishtime", intfinihstime);
                startActivity(nextpage3);

            }
        }

    }
    public void click9amfinish(View view3){
        Schedule thescedule = new Schedule();
        FullData g = (FullData) getApplication();
        boolean test = true;
        me = g.gettemptutor();
        thescedule = me.getMySchedule();
        Intent theone = getIntent();
        daychoose = theone.getIntExtra("Day",0);
        starttime = theone.getStringExtra("Starttime");
        intstarttime = theone.getIntExtra("intStarttime",0);
        finishtime="9:00am";
        intfinihstime = 9;
        if(daychoose ==1){
            test = thescedule.checkfinishmonday(intfinihstime);
        }
        else if(daychoose == 2){
            test = thescedule.checkfinishtues(intfinihstime);
        }
        else if(daychoose == 3){

            test = thescedule.checkfinishweds(intfinihstime);
        }
        else if(daychoose == 4){

            test = thescedule.checkfinishthurs(intfinihstime);
        }
        else if(daychoose == 5){

            test = thescedule.checkfinishfriday(intfinihstime);
        }
        else if(daychoose == 6){

            test = thescedule.checkfinishsat(intfinihstime);
        }
        else if(daychoose == 7){

            test = thescedule.checkfinishsunday(intfinihstime);
        }
        if(!test){
            Toast.makeText(this,"Error conflicting times",Toast.LENGTH_LONG).show();
        }
        else {
            if (intfinihstime < intstarttime) {
                Toast.makeText(this, "Error must choose finish time\n later then start time", Toast.LENGTH_LONG).show();
            } else {
                Intent nextpage3 = new Intent(FinishTimePage.this, FinishBuildingPage.class);
                nextpage3.putExtra("Day", daychoose);
                nextpage3.putExtra("Starttime", starttime);
                nextpage3.putExtra("intStarttime", intstarttime);
                nextpage3.putExtra("Finishtime", finishtime);
                nextpage3.putExtra("intfinishtime", intfinihstime);
                startActivity(nextpage3);

            }
        }

    }
    public void click8amfinish(View view3){
        Schedule thescedule = new Schedule();
        FullData g = (FullData) getApplication();
        boolean test = true;
        me = g.gettemptutor();
        thescedule = me.getMySchedule();
        Intent theone = getIntent();
        daychoose = theone.getIntExtra("Day",0);
        starttime = theone.getStringExtra("Starttime");
        intstarttime = theone.getIntExtra("intStarttime",0);
        finishtime="8:00am";
        intfinihstime = 8;
        if(daychoose ==1){
            test = thescedule.checkfinishmonday(intfinihstime);
        }
        else if(daychoose == 2){
            test = thescedule.checkfinishtues(intfinihstime);
        }
        else if(daychoose == 3){

            test = thescedule.checkfinishweds(intfinihstime);
        }
        else if(daychoose == 4){

            test = thescedule.checkfinishthurs(intfinihstime);
        }
        else if(daychoose == 5){

            test = thescedule.checkfinishfriday(intfinihstime);
        }
        else if(daychoose == 6){

            test = thescedule.checkfinishsat(intfinihstime);
        }
        else if(daychoose == 7){

            test = thescedule.checkfinishsunday(intfinihstime);
        }
        if(!test){
            Toast.makeText(this,"Error conflicting times",Toast.LENGTH_LONG).show();
        }
        else {

            if (intfinihstime < intstarttime) {
                Toast.makeText(this, "Error must choose finish time\n later then start time", Toast.LENGTH_LONG).show();
            } else {
                Intent nextpage3 = new Intent(FinishTimePage.this, FinishBuildingPage.class);
                nextpage3.putExtra("Day", daychoose);
                nextpage3.putExtra("Starttime", starttime);
                nextpage3.putExtra("intStarttime", intstarttime);
                nextpage3.putExtra("Finishtime", finishtime);
                nextpage3.putExtra("intfinishtime", intfinihstime);
                startActivity(nextpage3);

            }
        }

    }
    public void click7amfinish(View view3){
        Schedule thescedule = new Schedule();
        FullData g = (FullData) getApplication();
        boolean test = true;
        me = g.gettemptutor();
        thescedule = me.getMySchedule();
        Intent theone = getIntent();
        daychoose = theone.getIntExtra("Day",0);
        starttime = theone.getStringExtra("Starttime");
        intstarttime = theone.getIntExtra("intStarttime",0);
        finishtime="7:00am";
        intfinihstime = 7;
        if(daychoose ==1){
            test = thescedule.checkfinishmonday(intfinihstime);
        }
        else if(daychoose == 2){
            test = thescedule.checkfinishtues(intfinihstime);
        }
        else if(daychoose == 3){

            test = thescedule.checkfinishweds(intfinihstime);
        }
        else if(daychoose == 4){

            test = thescedule.checkfinishthurs(intfinihstime);
        }
        else if(daychoose == 5){

            test = thescedule.checkfinishfriday(intfinihstime);
        }
        else if(daychoose == 6){

            test = thescedule.checkfinishsat(intfinihstime);
        }
        else if(daychoose == 7){

            test = thescedule.checkfinishsunday(intfinihstime);
        }
        if(!test){
            Toast.makeText(this,"Error conflicting times",Toast.LENGTH_LONG).show();
        }
        else {
            if (intfinihstime < intstarttime) {
                Toast.makeText(this, "Error must choose finish time\n later then start time", Toast.LENGTH_LONG).show();
            } else {
                Intent nextpage3 = new Intent(FinishTimePage.this, FinishBuildingPage.class);
                nextpage3.putExtra("Day", daychoose);
                nextpage3.putExtra("Starttime", starttime);
                nextpage3.putExtra("intStarttime", intstarttime);
                nextpage3.putExtra("Finishtime", finishtime);
                nextpage3.putExtra("intfinishtime", intfinihstime);
                startActivity(nextpage3);

            }
        }

    }
    public void click6amfinish(View view3){
        Schedule thescedule = new Schedule();
        FullData g = (FullData) getApplication();
        boolean test = true;
        me = g.gettemptutor();
        thescedule = me.getMySchedule();
        Intent theone = getIntent();
        daychoose = theone.getIntExtra("Day",0);
        starttime = theone.getStringExtra("Starttime");
        intstarttime = theone.getIntExtra("intStarttime",0);
        finishtime="6:00am";
        intfinihstime = 6;
        if(daychoose ==1){
            test = thescedule.checkfinishmonday(intfinihstime);
        }
        else if(daychoose == 2){
            test = thescedule.checkfinishtues(intfinihstime);
        }
        else if(daychoose == 3){

            test = thescedule.checkfinishweds(intfinihstime);
        }
        else if(daychoose == 4){

            test = thescedule.checkfinishthurs(intfinihstime);
        }
        else if(daychoose == 5){

            test = thescedule.checkfinishfriday(intfinihstime);
        }
        else if(daychoose == 6){

            test = thescedule.checkfinishsat(intfinihstime);
        }
        else if(daychoose == 7){

            test = thescedule.checkfinishsunday(intfinihstime);
        }
        if(!test){
            Toast.makeText(this,"Error conflicting times",Toast.LENGTH_LONG).show();
        }
        else {
            if (intfinihstime < intstarttime) {
                Toast.makeText(this, "Error must choose finish time\n later then start time", Toast.LENGTH_LONG).show();
            } else {
                Intent nextpage3 = new Intent(FinishTimePage.this, FinishBuildingPage.class);
                nextpage3.putExtra("Day", daychoose);
                nextpage3.putExtra("Starttime", starttime);
                nextpage3.putExtra("intStarttime", intstarttime);
                nextpage3.putExtra("Finishtime", finishtime);
                nextpage3.putExtra("intfinishtime", intfinihstime);
                startActivity(nextpage3);

            }
        }

    }
    public void click5amfinish(View view3){
        Schedule thescedule = new Schedule();
        FullData g = (FullData) getApplication();
        boolean test = true;
        me = g.gettemptutor();
        thescedule = me.getMySchedule();
        Intent theone = getIntent();
        daychoose = theone.getIntExtra("Day",0);
        starttime = theone.getStringExtra("Starttime");
        intstarttime = theone.getIntExtra("intStarttime",0);
        finishtime="5:00am";
        intfinihstime = 5;
        if(daychoose ==1){
            test = thescedule.checkfinishmonday(intfinihstime);
        }
        else if(daychoose == 2){
            test = thescedule.checkfinishtues(intfinihstime);
        }
        else if(daychoose == 3){

            test = thescedule.checkfinishweds(intfinihstime);
        }
        else if(daychoose == 4){

            test = thescedule.checkfinishthurs(intfinihstime);
        }
        else if(daychoose == 5){

            test = thescedule.checkfinishfriday(intfinihstime);
        }
        else if(daychoose == 6){

            test = thescedule.checkfinishsat(intfinihstime);
        }
        else if(daychoose == 7){

            test = thescedule.checkfinishsunday(intfinihstime);
        }
        if(!test){
            Toast.makeText(this,"Error conflicting times",Toast.LENGTH_LONG).show();
        }
        else {
            if (intfinihstime < intstarttime) {
                Toast.makeText(this, "Error must choose finish time\n later then start time", Toast.LENGTH_LONG).show();
            } else {
                Intent nextpage3 = new Intent(FinishTimePage.this, FinishBuildingPage.class);
                nextpage3.putExtra("Day", daychoose);
                nextpage3.putExtra("Starttime", starttime);
                nextpage3.putExtra("intStarttime", intstarttime);
                nextpage3.putExtra("Finishtime", finishtime);
                nextpage3.putExtra("intfinishtime", intfinihstime);
                startActivity(nextpage3);

            }
        }

    }
    public void click4amfinish(View view3){
        Schedule thescedule = new Schedule();
        FullData g = (FullData) getApplication();
        boolean test = true;
        me = g.gettemptutor();
        thescedule = me.getMySchedule();
        Intent theone = getIntent();
        daychoose = theone.getIntExtra("Day",0);
        starttime = theone.getStringExtra("Starttime");
        intstarttime = theone.getIntExtra("intStarttime",0);
        finishtime="4:00am";
        intfinihstime = 4;
        if(daychoose ==1){
            test = thescedule.checkfinishmonday(intfinihstime);
        }
        else if(daychoose == 2){
            test = thescedule.checkfinishtues(intfinihstime);
        }
        else if(daychoose == 3){

            test = thescedule.checkfinishweds(intfinihstime);
        }
        else if(daychoose == 4){

            test = thescedule.checkfinishthurs(intfinihstime);
        }
        else if(daychoose == 5){

            test = thescedule.checkfinishfriday(intfinihstime);
        }
        else if(daychoose == 6){

            test = thescedule.checkfinishsat(intfinihstime);
        }
        else if(daychoose == 7){

            test = thescedule.checkfinishsunday(intfinihstime);
        }
        if(!test){
            Toast.makeText(this,"Error conflicting times",Toast.LENGTH_LONG).show();
        }
        else {
            if (intfinihstime < intstarttime) {
                Toast.makeText(this, "Error must choose finish time\n later then start time", Toast.LENGTH_LONG).show();
            } else {
                Intent nextpage3 = new Intent(FinishTimePage.this, FinishBuildingPage.class);
                nextpage3.putExtra("Day", daychoose);
                nextpage3.putExtra("Starttime", starttime);
                nextpage3.putExtra("intStarttime", intstarttime);
                nextpage3.putExtra("Finishtime", finishtime);
                nextpage3.putExtra("intfinishtime", intfinihstime);
                startActivity(nextpage3);

            }
        }

    }
    public void click3amfinish(View view3){
        Schedule thescedule = new Schedule();
        FullData g = (FullData) getApplication();
        boolean test = true;
        me = g.gettemptutor();
        thescedule = me.getMySchedule();
        Intent theone = getIntent();
        daychoose = theone.getIntExtra("Day",0);
        starttime = theone.getStringExtra("Starttime");
        intstarttime = theone.getIntExtra("intStarttime",0);
        finishtime="3:00am";
        intfinihstime = 3;
        if(daychoose ==1){
            test = thescedule.checkfinishmonday(intfinihstime);
        }
        else if(daychoose == 2){
            test = thescedule.checkfinishtues(intfinihstime);
        }
        else if(daychoose == 3){

            test = thescedule.checkfinishweds(intfinihstime);
        }
        else if(daychoose == 4){

            test = thescedule.checkfinishthurs(intfinihstime);
        }
        else if(daychoose == 5){

            test = thescedule.checkfinishfriday(intfinihstime);
        }
        else if(daychoose == 6){

            test = thescedule.checkfinishsat(intfinihstime);
        }
        else if(daychoose == 7){

            test = thescedule.checkfinishsunday(intfinihstime);
        }
        if(!test){
            Toast.makeText(this,"Error conflicting times",Toast.LENGTH_LONG).show();
        }
        else {
            if (intfinihstime < intstarttime) {
                Toast.makeText(this, "Error must choose finish time\n later then start time", Toast.LENGTH_LONG).show();
            } else {
                Intent nextpage3 = new Intent(FinishTimePage.this, FinishBuildingPage.class);
                nextpage3.putExtra("Day", daychoose);
                nextpage3.putExtra("Starttime", starttime);
                nextpage3.putExtra("intStarttime", intstarttime);
                nextpage3.putExtra("Finishtime", finishtime);
                nextpage3.putExtra("intfinishtime", intfinihstime);
                startActivity(nextpage3);

            }
        }

    }
    public void click2amfinish(View view3){
        Schedule thescedule = new Schedule();
        FullData g = (FullData) getApplication();
        boolean test = true;
        me = g.gettemptutor();
        thescedule = me.getMySchedule();
        Intent theone = getIntent();
        daychoose = theone.getIntExtra("Day",0);
        starttime = theone.getStringExtra("Starttime");
        intstarttime = theone.getIntExtra("intStarttime",0);
        finishtime="2:00am";
        intfinihstime = 2;
        if(daychoose ==1){
            test = thescedule.checkfinishmonday(intfinihstime);
        }
        else if(daychoose == 2){
            test = thescedule.checkfinishtues(intfinihstime);
        }
        else if(daychoose == 3){

            test = thescedule.checkfinishweds(intfinihstime);
        }
        else if(daychoose == 4){

            test = thescedule.checkfinishthurs(intfinihstime);
        }
        else if(daychoose == 5){

            test = thescedule.checkfinishfriday(intfinihstime);
        }
        else if(daychoose == 6){

            test = thescedule.checkfinishsat(intfinihstime);
        }
        else if(daychoose == 7){

            test = thescedule.checkfinishsunday(intfinihstime);
        }
        if(!test){
            Toast.makeText(this,"Error conflicting times",Toast.LENGTH_LONG).show();
        }
        else {
            if (intfinihstime < intstarttime) {
                Toast.makeText(this, "Error must choose finish time\n later then start time", Toast.LENGTH_LONG).show();
            } else {
                Intent nextpage3 = new Intent(FinishTimePage.this, FinishBuildingPage.class);
                nextpage3.putExtra("Day", daychoose);
                nextpage3.putExtra("Starttime", starttime);
                nextpage3.putExtra("intStarttime", intstarttime);
                nextpage3.putExtra("Finishtime", finishtime);
                nextpage3.putExtra("intfinishtime", intfinihstime);
                startActivity(nextpage3);

            }
        }

    }
    public void click1amfinish(View view3){
        Schedule thescedule = new Schedule();
        FullData g = (FullData) getApplication();
        boolean test = true;
        me = g.gettemptutor();
        thescedule = me.getMySchedule();
        Intent theone = getIntent();
        daychoose = theone.getIntExtra("Day",0);
        starttime = theone.getStringExtra("Starttime");
        intstarttime = theone.getIntExtra("intStarttime",0);
        finishtime="1:00am";
        intfinihstime = 1;
        if(daychoose ==1){
            test = thescedule.checkfinishmonday(intfinihstime);
        }
        else if(daychoose == 2){
            test = thescedule.checkfinishtues(intfinihstime);
        }
        else if(daychoose == 3){

            test = thescedule.checkfinishweds(intfinihstime);
        }
        else if(daychoose == 4){

            test = thescedule.checkfinishthurs(intfinihstime);
        }
        else if(daychoose == 5){

            test = thescedule.checkfinishfriday(intfinihstime);
        }
        else if(daychoose == 6){

            test = thescedule.checkfinishsat(intfinihstime);
        }
        else if(daychoose == 7){

            test = thescedule.checkfinishsunday(intfinihstime);
        }
        if(!test){
            Toast.makeText(this,"Error conflicting times",Toast.LENGTH_LONG).show();
        }
        else {
            if (intfinihstime < intstarttime) {
                Toast.makeText(this, "Error must choose finish time\n later then start time", Toast.LENGTH_LONG).show();
            } else {
                Intent nextpage3 = new Intent(FinishTimePage.this, FinishBuildingPage.class);
                nextpage3.putExtra("Day", daychoose);
                nextpage3.putExtra("Starttime", starttime);
                nextpage3.putExtra("intStarttime", intstarttime);
                nextpage3.putExtra("Finishtime", finishtime);
                nextpage3.putExtra("intfinishtime", intfinihstime);
                startActivity(nextpage3);

            }
        }

    }
    public void click12pmfinish(View view3){
        Schedule thescedule = new Schedule();
        FullData g = (FullData) getApplication();
        boolean test = true;
        me = g.gettemptutor();
        thescedule = me.getMySchedule();
        Intent theone = getIntent();
        daychoose = theone.getIntExtra("Day",0);
        starttime = theone.getStringExtra("Starttime");
        intstarttime = theone.getIntExtra("intStarttime",0);
        finishtime="12:00pm";
        intfinihstime = 12;
        if(daychoose ==1){
            test = thescedule.checkfinishmonday(intfinihstime);
        }
        else if(daychoose == 2){
            test = thescedule.checkfinishtues(intfinihstime);
        }
        else if(daychoose == 3){

            test = thescedule.checkfinishweds(intfinihstime);
        }
        else if(daychoose == 4){

            test = thescedule.checkfinishthurs(intfinihstime);
        }
        else if(daychoose == 5){

            test = thescedule.checkfinishfriday(intfinihstime);
        }
        else if(daychoose == 6){

            test = thescedule.checkfinishsat(intfinihstime);
        }
        else if(daychoose == 7){

            test = thescedule.checkfinishsunday(intfinihstime);
        }
        if(!test){
            Toast.makeText(this,"Error conflicting times",Toast.LENGTH_LONG).show();
        }
        else {
            if (intfinihstime < intstarttime) {
                Toast.makeText(this, "Error must choose finish time\n later then start time", Toast.LENGTH_LONG).show();
            } else {
                Intent nextpage3 = new Intent(FinishTimePage.this, FinishBuildingPage.class);
                nextpage3.putExtra("Day", daychoose);
                nextpage3.putExtra("Starttime", starttime);
                nextpage3.putExtra("intStarttime", intstarttime);
                nextpage3.putExtra("Finishtime", finishtime);
                nextpage3.putExtra("intfinishtime", intfinihstime);
                startActivity(nextpage3);

            }
        }

    }
    public void click11pmfinish(View view3){
        Schedule thescedule = new Schedule();
        FullData g = (FullData) getApplication();
        boolean test = true;
        me = g.gettemptutor();
        thescedule = me.getMySchedule();
        Intent theone = getIntent();
        daychoose = theone.getIntExtra("Day",0);
        starttime = theone.getStringExtra("Starttime");
        intstarttime = theone.getIntExtra("intStarttime",0);
        finishtime="11:00pm";
        intfinihstime = 23;
        if(daychoose ==1){
            test = thescedule.checkfinishmonday(intfinihstime);
        }
        else if(daychoose == 2){
            test = thescedule.checkfinishtues(intfinihstime);
        }
        else if(daychoose == 3){

            test = thescedule.checkfinishweds(intfinihstime);
        }
        else if(daychoose == 4){

            test = thescedule.checkfinishthurs(intfinihstime);
        }
        else if(daychoose == 5){

            test = thescedule.checkfinishfriday(intfinihstime);
        }
        else if(daychoose == 6){

            test = thescedule.checkfinishsat(intfinihstime);
        }
        else if(daychoose == 7){

            test = thescedule.checkfinishsunday(intfinihstime);
        }
        if(!test){
            Toast.makeText(this,"Error conflicting times",Toast.LENGTH_LONG).show();
        }
        else {

            if (intfinihstime < intstarttime) {
                Toast.makeText(this, "Error must choose finish time\n later then start time", Toast.LENGTH_LONG).show();
            } else {
                Intent nextpage3 = new Intent(FinishTimePage.this, FinishBuildingPage.class);
                nextpage3.putExtra("Day", daychoose);
                nextpage3.putExtra("Starttime", starttime);
                nextpage3.putExtra("intStarttime", intstarttime);
                nextpage3.putExtra("Finishtime", finishtime);
                nextpage3.putExtra("intfinishtime", intfinihstime);
                startActivity(nextpage3);

            }
        }

    }
    public void click10pmfinish(View view3){
        Schedule thescedule = new Schedule();
        FullData g = (FullData) getApplication();
        boolean test = true;
        me = g.gettemptutor();
        thescedule = me.getMySchedule();
        Intent theone = getIntent();
        daychoose = theone.getIntExtra("Day",0);
        starttime = theone.getStringExtra("Starttime");
        intstarttime = theone.getIntExtra("intStarttime",0);
        finishtime="10:00pm";
        intfinihstime = 22;
        if(daychoose ==1){
            test = thescedule.checkfinishmonday(intfinihstime);
        }
        else if(daychoose == 2){
            test = thescedule.checkfinishtues(intfinihstime);
        }
        else if(daychoose == 3){

            test = thescedule.checkfinishweds(intfinihstime);
        }
        else if(daychoose == 4){

            test = thescedule.checkfinishthurs(intfinihstime);
        }
        else if(daychoose == 5){

            test = thescedule.checkfinishfriday(intfinihstime);
        }
        else if(daychoose == 6){

            test = thescedule.checkfinishsat(intfinihstime);
        }
        else if(daychoose == 7){

            test = thescedule.checkfinishsunday(intfinihstime);
        }
        if(!test){
            Toast.makeText(this,"Error conflicting times",Toast.LENGTH_LONG).show();
        }
        else {

            if (intfinihstime < intstarttime) {
                Toast.makeText(this, "Error must choose finish time\n later then start time", Toast.LENGTH_LONG).show();
            } else {
                Intent nextpage3 = new Intent(FinishTimePage.this, FinishBuildingPage.class);
                nextpage3.putExtra("Day", daychoose);
                nextpage3.putExtra("Starttime", starttime);
                nextpage3.putExtra("intStarttime", intstarttime);
                nextpage3.putExtra("Finishtime", finishtime);
                nextpage3.putExtra("intfinishtime", intfinihstime);
                startActivity(nextpage3);

            }
        }

    }
    public void click9pmfinish(View view3){
        Schedule thescedule = new Schedule();
        FullData g = (FullData) getApplication();
        boolean test = true;
        me = g.gettemptutor();
        thescedule = me.getMySchedule();
        Intent theone = getIntent();
        daychoose = theone.getIntExtra("Day",0);
        starttime = theone.getStringExtra("Starttime");
        intstarttime = theone.getIntExtra("intStarttime",0);
        finishtime="9:00pm";
        intfinihstime = 21;
        if(daychoose ==1){
            test = thescedule.checkfinishmonday(intfinihstime);
        }
        else if(daychoose == 2){
            test = thescedule.checkfinishtues(intfinihstime);
        }
        else if(daychoose == 3){

            test = thescedule.checkfinishweds(intfinihstime);
        }
        else if(daychoose == 4){

            test = thescedule.checkfinishthurs(intfinihstime);
        }
        else if(daychoose == 5){

            test = thescedule.checkfinishfriday(intfinihstime);
        }
        else if(daychoose == 6){

            test = thescedule.checkfinishsat(intfinihstime);
        }
        else if(daychoose == 7){

            test = thescedule.checkfinishsunday(intfinihstime);
        }
        if(!test){
            Toast.makeText(this,"Error conflicting times",Toast.LENGTH_LONG).show();
        }
        else {
            if (intfinihstime < intstarttime) {
                Toast.makeText(this, "Error must choose finish time\n later then start time", Toast.LENGTH_LONG).show();
            } else {
                Intent nextpage3 = new Intent(FinishTimePage.this, FinishBuildingPage.class);
                nextpage3.putExtra("Day", daychoose);
                nextpage3.putExtra("Starttime", starttime);
                nextpage3.putExtra("intStarttime", intstarttime);
                nextpage3.putExtra("Finishtime", finishtime);
                nextpage3.putExtra("intfinishtime", intfinihstime);
                startActivity(nextpage3);

            }
        }

    }
    public void click8pmfinish(View view3){
        Schedule thescedule = new Schedule();
        FullData g = (FullData) getApplication();
        boolean test = true;
        me = g.gettemptutor();
        thescedule = me.getMySchedule();
        Intent theone = getIntent();
        daychoose = theone.getIntExtra("Day",0);
        starttime = theone.getStringExtra("Starttime");
        intstarttime = theone.getIntExtra("intStarttime",0);
        finishtime="8:00pm";
        intfinihstime = 20;
        if(daychoose ==1){
            test = thescedule.checkfinishmonday(intfinihstime);
        }
        else if(daychoose == 2){
            test = thescedule.checkfinishtues(intfinihstime);
        }
        else if(daychoose == 3){

            test = thescedule.checkfinishweds(intfinihstime);
        }
        else if(daychoose == 4){

            test = thescedule.checkfinishthurs(intfinihstime);
        }
        else if(daychoose == 5){

            test = thescedule.checkfinishfriday(intfinihstime);
        }
        else if(daychoose == 6){

            test = thescedule.checkfinishsat(intfinihstime);
        }
        else if(daychoose == 7){

            test = thescedule.checkfinishsunday(intfinihstime);
        }
        if(!test){
            Toast.makeText(this,"Error conflicting times",Toast.LENGTH_LONG).show();
        }
        else {
            if (intfinihstime < intstarttime) {
                Toast.makeText(this, "Error must choose finish time\n later then start time", Toast.LENGTH_LONG).show();
            } else {
                Intent nextpage3 = new Intent(FinishTimePage.this, FinishBuildingPage.class);
                nextpage3.putExtra("Day", daychoose);
                nextpage3.putExtra("Starttime", starttime);
                nextpage3.putExtra("intStarttime", intstarttime);
                nextpage3.putExtra("Finishtime", finishtime);
                nextpage3.putExtra("intfinishtime", intfinihstime);
                startActivity(nextpage3);

            }
        }

    }
    public void click7pmfinish(View view3){
        Schedule thescedule = new Schedule();
        FullData g = (FullData) getApplication();
        boolean test = true;
        me = g.gettemptutor();
        thescedule = me.getMySchedule();
        Intent theone = getIntent();
        daychoose = theone.getIntExtra("Day",0);
        starttime = theone.getStringExtra("Starttime");
        intstarttime = theone.getIntExtra("intStarttime",0);
        finishtime="7:00pm";
        intfinihstime = 19;
        if(daychoose ==1){
            test = thescedule.checkfinishmonday(intfinihstime);
        }
        else if(daychoose == 2){
            test = thescedule.checkfinishtues(intfinihstime);
        }
        else if(daychoose == 3){

            test = thescedule.checkfinishweds(intfinihstime);
        }
        else if(daychoose == 4){

            test = thescedule.checkfinishthurs(intfinihstime);
        }
        else if(daychoose == 5){

            test = thescedule.checkfinishfriday(intfinihstime);
        }
        else if(daychoose == 6){

            test = thescedule.checkfinishsat(intfinihstime);
        }
        else if(daychoose == 7){

            test = thescedule.checkfinishsunday(intfinihstime);
        }
        if(!test){
            Toast.makeText(this,"Error conflicting times",Toast.LENGTH_LONG).show();
        }
        else {
            if (intfinihstime < intstarttime) {
                Toast.makeText(this, "Error must choose finish time\n later then start time", Toast.LENGTH_LONG).show();
            } else {
                Intent nextpage3 = new Intent(FinishTimePage.this, FinishBuildingPage.class);
                nextpage3.putExtra("Day", daychoose);
                nextpage3.putExtra("Starttime", starttime);
                nextpage3.putExtra("intStarttime", intstarttime);
                nextpage3.putExtra("Finishtime", finishtime);
                nextpage3.putExtra("intfinishtime", intfinihstime);
                startActivity(nextpage3);

            }
        }

    }
    public void click6pmfinish(View view3){
        Schedule thescedule = new Schedule();
        FullData g = (FullData) getApplication();
        boolean test = true;
        me = g.gettemptutor();
        thescedule = me.getMySchedule();
        Intent theone = getIntent();
        daychoose = theone.getIntExtra("Day",0);
        starttime = theone.getStringExtra("Starttime");
        intstarttime = theone.getIntExtra("intStarttime",0);
        finishtime="6:00pm";
        intfinihstime = 18;
        if(daychoose ==1){
            test = thescedule.checkfinishmonday(intfinihstime);
        }
        else if(daychoose == 2){
            test = thescedule.checkfinishtues(intfinihstime);
        }
        else if(daychoose == 3){

            test = thescedule.checkfinishweds(intfinihstime);
        }
        else if(daychoose == 4){

            test = thescedule.checkfinishthurs(intfinihstime);
        }
        else if(daychoose == 5){

            test = thescedule.checkfinishfriday(intfinihstime);
        }
        else if(daychoose == 6){

            test = thescedule.checkfinishsat(intfinihstime);
        }
        else if(daychoose == 7){

            test = thescedule.checkfinishsunday(intfinihstime);
        }
        if(!test){
            Toast.makeText(this,"Error conflicting times",Toast.LENGTH_LONG).show();
        }
        else {
            if (intfinihstime < intstarttime) {
                Toast.makeText(this, "Error must choose finish time\n later then start time", Toast.LENGTH_LONG).show();
            } else {
                Intent nextpage3 = new Intent(FinishTimePage.this, FinishBuildingPage.class);
                nextpage3.putExtra("Day", daychoose);
                nextpage3.putExtra("Starttime", starttime);
                nextpage3.putExtra("intStarttime", intstarttime);
                nextpage3.putExtra("Finishtime", finishtime);
                nextpage3.putExtra("intfinishtime", intfinihstime);
                startActivity(nextpage3);

            }
        }

    }
    public void click5pmfinish(View view3){
        Schedule thescedule = new Schedule();
        FullData g = (FullData) getApplication();
        boolean test = true;
        me = g.gettemptutor();
        thescedule = me.getMySchedule();
        Intent theone = getIntent();
        daychoose = theone.getIntExtra("Day",0);
        starttime = theone.getStringExtra("Starttime");
        intstarttime = theone.getIntExtra("intStarttime",0);
        finishtime="5:00pm";
        intfinihstime = 17;
        if(daychoose ==1){
            test = thescedule.checkfinishmonday(intfinihstime);
        }
        else if(daychoose == 2){
            test = thescedule.checkfinishtues(intfinihstime);
        }
        else if(daychoose == 3){

            test = thescedule.checkfinishweds(intfinihstime);
        }
        else if(daychoose == 4){

            test = thescedule.checkfinishthurs(intfinihstime);
        }
        else if(daychoose == 5){

            test = thescedule.checkfinishfriday(intfinihstime);
        }
        else if(daychoose == 6){

            test = thescedule.checkfinishsat(intfinihstime);
        }
        else if(daychoose == 7){

            test = thescedule.checkfinishsunday(intfinihstime);
        }
        if(!test){
            Toast.makeText(this,"Error conflicting times",Toast.LENGTH_LONG).show();
        }
        else {
            if (intfinihstime < intstarttime) {
                Toast.makeText(this, "Error must choose finish time\n later then start time", Toast.LENGTH_LONG).show();
            } else {
                Intent nextpage3 = new Intent(FinishTimePage.this, FinishBuildingPage.class);
                nextpage3.putExtra("Day", daychoose);
                nextpage3.putExtra("Starttime", starttime);
                nextpage3.putExtra("intStarttime", intstarttime);
                nextpage3.putExtra("Finishtime", finishtime);
                nextpage3.putExtra("intfinishtime", intfinihstime);
                startActivity(nextpage3);

            }
        }

    }
    public void click4pmfinish(View view3){
        Schedule thescedule = new Schedule();
        FullData g = (FullData) getApplication();
        boolean test = true;
        me = g.gettemptutor();
        thescedule = me.getMySchedule();
        Intent theone = getIntent();
        daychoose = theone.getIntExtra("Day",0);
        starttime = theone.getStringExtra("Starttime");
        intstarttime = theone.getIntExtra("intStarttime",0);
        finishtime="4:00pm";
        intfinihstime = 16;
        if(daychoose ==1){
            test = thescedule.checkfinishmonday(intfinihstime);
        }
        else if(daychoose == 2){
            test = thescedule.checkfinishtues(intfinihstime);
        }
        else if(daychoose == 3){

            test = thescedule.checkfinishweds(intfinihstime);
        }
        else if(daychoose == 4){

            test = thescedule.checkfinishthurs(intfinihstime);
        }
        else if(daychoose == 5){

            test = thescedule.checkfinishfriday(intfinihstime);
        }
        else if(daychoose == 6){

            test = thescedule.checkfinishsat(intfinihstime);
        }
        else if(daychoose == 7){

            test = thescedule.checkfinishsunday(intfinihstime);
        }
        if(!test){
            Toast.makeText(this,"Error conflicting times",Toast.LENGTH_LONG).show();
        }
        else {
            if (intfinihstime < intstarttime) {
                Toast.makeText(this, "Error must choose finish time\n later then start time", Toast.LENGTH_LONG).show();
            } else {
                Intent nextpage3 = new Intent(FinishTimePage.this, FinishBuildingPage.class);
                nextpage3.putExtra("Day", daychoose);
                nextpage3.putExtra("Starttime", starttime);
                nextpage3.putExtra("intStarttime", intstarttime);
                nextpage3.putExtra("Finishtime", finishtime);
                nextpage3.putExtra("intfinishtime", intfinihstime);
                startActivity(nextpage3);

            }
        }

    }
    public void click3pmfinish(View view3){
        Schedule thescedule = new Schedule();
        FullData g = (FullData) getApplication();
        boolean test = true;
        me = g.gettemptutor();
        thescedule = me.getMySchedule();
        Intent theone = getIntent();
        daychoose = theone.getIntExtra("Day",0);
        starttime = theone.getStringExtra("Starttime");
        intstarttime = theone.getIntExtra("intStarttime",0);
        finishtime="3:00pm";
        intfinihstime = 15;
        if(daychoose ==1){
            test = thescedule.checkfinishmonday(intfinihstime);
        }
        else if(daychoose == 2){
            test = thescedule.checkfinishtues(intfinihstime);
        }
        else if(daychoose == 3){

            test = thescedule.checkfinishweds(intfinihstime);
        }
        else if(daychoose == 4){

            test = thescedule.checkfinishthurs(intfinihstime);
        }
        else if(daychoose == 5){

            test = thescedule.checkfinishfriday(intfinihstime);
        }
        else if(daychoose == 6){

            test = thescedule.checkfinishsat(intfinihstime);
        }
        else if(daychoose == 7){

            test = thescedule.checkfinishsunday(intfinihstime);
        }
        if(!test){
            Toast.makeText(this,"Error conflicting times",Toast.LENGTH_LONG).show();
        }
        else {
            if (intfinihstime < intstarttime) {
                Toast.makeText(this, "Error must choose finish time\n later then start time", Toast.LENGTH_LONG).show();
            } else {
                Intent nextpage3 = new Intent(FinishTimePage.this, FinishBuildingPage.class);
                nextpage3.putExtra("Day", daychoose);
                nextpage3.putExtra("Starttime", starttime);
                nextpage3.putExtra("intStarttime", intstarttime);
                nextpage3.putExtra("Finishtime", finishtime);
                nextpage3.putExtra("intfinishtime", intfinihstime);
                startActivity(nextpage3);

            }
        }

    }
    public void click2pmfinish(View view3) {
        Schedule thescedule = new Schedule();
        FullData g = (FullData) getApplication();
        boolean test = true;
        me = g.gettemptutor();
        thescedule = me.getMySchedule();
        Intent theone = getIntent();
        daychoose = theone.getIntExtra("Day", 0);
        starttime = theone.getStringExtra("Starttime");
        intstarttime = theone.getIntExtra("intStarttime", 0);
        finishtime = "2:00pm";
        intfinihstime = 14;
        if (daychoose == 1) {
            test = thescedule.checkfinishmonday(intfinihstime);
        } else if (daychoose == 2) {
            test = thescedule.checkfinishtues(intfinihstime);
        } else if (daychoose == 3) {

            test = thescedule.checkfinishweds(intfinihstime);
        } else if (daychoose == 4) {

            test = thescedule.checkfinishthurs(intfinihstime);
        } else if (daychoose == 5) {

            test = thescedule.checkfinishfriday(intfinihstime);
        } else if (daychoose == 6) {

            test = thescedule.checkfinishsat(intfinihstime);
        } else if (daychoose == 7) {

            test = thescedule.checkfinishsunday(intfinihstime);
        }
        if (!test) {
            Toast.makeText(this, "Error conflicting times", Toast.LENGTH_LONG).show();
        } else {
            if (intfinihstime < intstarttime) {
                Toast.makeText(this, "Error must choose finish time\n later then start time", Toast.LENGTH_LONG).show();
            } else {
                Intent nextpage3 = new Intent(FinishTimePage.this, FinishBuildingPage.class);
                nextpage3.putExtra("Day", daychoose);
                nextpage3.putExtra("Starttime", starttime);
                nextpage3.putExtra("intStarttime", intstarttime);
                nextpage3.putExtra("Finishtime", finishtime);
                nextpage3.putExtra("intfinishtime", intfinihstime);
                startActivity(nextpage3);

            }


        }
    }
    public void click1pmfinish(View view3){
        Schedule thescedule = new Schedule();
        FullData g = (FullData) getApplication();
        boolean test = true;
        me = g.gettemptutor();
        thescedule = me.getMySchedule();
        Intent theone = getIntent();
        daychoose = theone.getIntExtra("Day",0);
        starttime = theone.getStringExtra("Starttime");
        intstarttime = theone.getIntExtra("intStarttime",0);
        finishtime="1:00pm";
        intfinihstime = 13;
        if(daychoose ==1){
            test = thescedule.checkfinishmonday(intfinihstime);
        }
        else if(daychoose == 2){
            test = thescedule.checkfinishtues(intfinihstime);
        }
        else if(daychoose == 3){

            test = thescedule.checkfinishweds(intfinihstime);
        }
        else if(daychoose == 4){

            test = thescedule.checkfinishthurs(intfinihstime);
        }
        else if(daychoose == 5){

            test = thescedule.checkfinishfriday(intfinihstime);
        }
        else if(daychoose == 6){

            test = thescedule.checkfinishsat(intfinihstime);
        }
        else if(daychoose == 7){

            test = thescedule.checkfinishsunday(intfinihstime);
        }
        if(!test){
            Toast.makeText(this,"Error conflicting times",Toast.LENGTH_LONG).show();
        }
        else {
            if (intfinihstime < intstarttime) {
                Toast.makeText(this, "Error must choose finish time\n later then start time", Toast.LENGTH_LONG).show();
            } else {
                Intent nextpage3 = new Intent(FinishTimePage.this, FinishBuildingPage.class);
                nextpage3.putExtra("Day", daychoose);
                nextpage3.putExtra("Starttime", starttime);
                nextpage3.putExtra("intStarttime", intstarttime);
                nextpage3.putExtra("Finishtime", finishtime);
                nextpage3.putExtra("intfinishtime", intfinihstime);
                startActivity(nextpage3);

            }
        }

    }

}
