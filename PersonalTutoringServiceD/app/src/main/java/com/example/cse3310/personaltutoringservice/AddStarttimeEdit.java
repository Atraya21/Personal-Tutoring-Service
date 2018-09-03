package com.example.cse3310.personaltutoringservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class AddStarttimeEdit extends AppCompatActivity {
    int timech = 0;
    String timechoose = null;
    int daychoosen = 0;
    Tutor me = new Tutor();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_starttime_edit);
    }
    public void clicked12am(View view2){
        Schedule thescedule = new Schedule();
        FullData g = (FullData) getApplication();
        boolean test = false;
        Intent theone = getIntent();
        me = g.getMainusertutor();
        thescedule = me.getMySchedule();
        daychoosen = theone.getIntExtra("Day",0);
        timech = 24;
        timechoose ="12:00am";

        if(daychoosen ==1){
            test = thescedule.checkstartmonday(timech);
        }
        else if(daychoosen == 2){
            test = thescedule.checkstartues(timech);
        }
        else if(daychoosen == 3){

            test = thescedule.checkstartweds(timech);
        }
        else if(daychoosen == 4){

            test = thescedule.checkstartthurs(timech);
        }
        else if(daychoosen == 5){

            test = thescedule.checkstartfriday(timech);
        }
        else if(daychoosen == 6){

            test = thescedule.checkstartSat(timech);
        }
        else if(daychoosen == 7){

            test = thescedule.checkstartsunday(timech);
        }
        if(!test){
            Toast.makeText(this,"Error conflicting times",Toast.LENGTH_LONG).show();
        }
        else {
            Intent nextpage2 = new Intent(AddStarttimeEdit.this, AddfinishtimeEdit.class);
            nextpage2.putExtra("Day", daychoosen);
            nextpage2.putExtra("Starttime", timechoose);
            nextpage2.putExtra("intStarttime", timech);
            startActivity(nextpage2);
        }

    }

    public void clicked11am(View view2){
        Schedule thescedule = new Schedule();
        FullData g = (FullData) getApplication();
        boolean test = true;
        me = g.getMainusertutor();
        thescedule = me.getMySchedule();
        Intent theone = getIntent();
        daychoosen = theone.getIntExtra("Day",0);
        timech = 11;
        timechoose ="11:00am";

        if(daychoosen ==1){
            test = thescedule.checkstartmonday(timech);
        }
        else if(daychoosen == 2){
            test = thescedule.checkstartues(timech);
        }
        else if(daychoosen == 3){

            test = thescedule.checkstartweds(timech);
        }
        else if(daychoosen == 4){

            test = thescedule.checkstartthurs(timech);
        }
        else if(daychoosen == 5){

            test = thescedule.checkstartfriday(timech);
        }
        else if(daychoosen == 6){

            test = thescedule.checkstartSat(timech);
        }
        else if(daychoosen == 7){

            test = thescedule.checkstartsunday(timech);
        }
        if(!test){
            Toast.makeText(this,"Error conflicting times",Toast.LENGTH_LONG).show();
        }
        else {
            Intent nextpage2 = new Intent(AddStarttimeEdit.this, AddfinishtimeEdit.class);
            nextpage2.putExtra("Day", daychoosen);
            nextpage2.putExtra("Starttime", timechoose);
            nextpage2.putExtra("intStarttime", timech);
            startActivity(nextpage2);
        }

    }
    public void clicked10am(View view2){
        Schedule thescedule = new Schedule();
        FullData g = (FullData) getApplication();
        boolean test = true;
        me = g.getMainusertutor();
        thescedule = me.getMySchedule();
        Intent theone = getIntent();
        daychoosen = theone.getIntExtra("Day",0);
        timech = 10;
        timechoose ="10:00am";
        if(daychoosen ==1){
            test = thescedule.checkstartmonday(timech);
        }
        else if(daychoosen == 2){
            test = thescedule.checkstartues(timech);
        }
        else if(daychoosen == 3){

            test = thescedule.checkstartweds(timech);
        }
        else if(daychoosen == 4){

            test = thescedule.checkstartthurs(timech);
        }
        else if(daychoosen == 5){

            test = thescedule.checkstartfriday(timech);
        }
        else if(daychoosen == 6){

            test = thescedule.checkstartSat(timech);
        }
        else if(daychoosen == 7){

            test = thescedule.checkstartsunday(timech);
        }

        if(!test){
            Toast.makeText(this,"Error conflicting times",Toast.LENGTH_LONG).show();
        }
        else {
            Intent nextpage2 = new Intent(AddStarttimeEdit.this, AddfinishtimeEdit.class);
            nextpage2.putExtra("Day", daychoosen);
            nextpage2.putExtra("Starttime", timechoose);
            nextpage2.putExtra("intStarttime", timech);
            startActivity(nextpage2);
        }

    }
    public void clicked9am(View view2){
        Schedule thescedule = new Schedule();
        FullData g = (FullData) getApplication();
        boolean test = true;
        me = g.getMainusertutor();
        thescedule = me.getMySchedule();
        Intent theone = getIntent();
        daychoosen = theone.getIntExtra("Day",0);
        timech = 9;
        timechoose ="9:00am";
        if(daychoosen ==1){
            test = thescedule.checkstartmonday(timech);
        }
        else if(daychoosen == 2){
            test = thescedule.checkstartues(timech);
        }
        else if(daychoosen == 3){

            test = thescedule.checkstartweds(timech);
        }
        else if(daychoosen == 4){

            test = thescedule.checkstartthurs(timech);
        }
        else if(daychoosen == 5){

            test = thescedule.checkstartfriday(timech);
        }
        else if(daychoosen == 6){

            test = thescedule.checkstartSat(timech);
        }
        else if(daychoosen == 7){

            test = thescedule.checkstartsunday(timech);
        }
        if(!test){
            Toast.makeText(this,"Error conflicting times",Toast.LENGTH_LONG).show();
        }
        else {
            Intent nextpage2 = new Intent(AddStarttimeEdit.this, AddfinishtimeEdit.class);
            nextpage2.putExtra("Day", daychoosen);
            nextpage2.putExtra("Starttime", timechoose);
            nextpage2.putExtra("intStarttime", timech);
            startActivity(nextpage2);
        }

    }
    public void clicked8am(View view2){
        Schedule thescedule = new Schedule();
        FullData g = (FullData) getApplication();
        boolean test = true;
        me = g.getMainusertutor();
        thescedule = me.getMySchedule();
        Intent theone = getIntent();
        daychoosen = theone.getIntExtra("Day",0);
        timech = 8;
        timechoose ="8:00am";
        if(daychoosen ==1){
            test = thescedule.checkstartmonday(timech);
        }
        else if(daychoosen == 2){
            test = thescedule.checkstartues(timech);
        }
        else if(daychoosen == 3){

            test = thescedule.checkstartweds(timech);
        }
        else if(daychoosen == 4){

            test = thescedule.checkstartthurs(timech);
        }
        else if(daychoosen == 5){

            test = thescedule.checkstartfriday(timech);
        }
        else if(daychoosen == 6){

            test = thescedule.checkstartSat(timech);
        }
        else if(daychoosen == 7){

            test = thescedule.checkstartsunday(timech);
        }
        if(!test){
            Toast.makeText(this,"Error conflicting times",Toast.LENGTH_LONG).show();
        }
        else {
            Intent nextpage2 = new Intent(AddStarttimeEdit.this, AddfinishtimeEdit.class);
            nextpage2.putExtra("Day", daychoosen);
            nextpage2.putExtra("Starttime", timechoose);
            nextpage2.putExtra("intStarttime", timech);
            startActivity(nextpage2);
        }

    }
    public void clicked7am(View view2){
        Schedule thescedule = new Schedule();
        FullData g = (FullData) getApplication();
        boolean test = true;
        me = g.getMainusertutor();
        thescedule = me.getMySchedule();
        Intent theone = getIntent();
        daychoosen = theone.getIntExtra("Day",0);
        timech = 7;
        timechoose ="7:00am";
        if(daychoosen ==1){
            test = thescedule.checkstartmonday(timech);
        }
        else if(daychoosen == 2){
            test = thescedule.checkstartues(timech);
        }
        else if(daychoosen == 3){

            test = thescedule.checkstartweds(timech);
        }
        else if(daychoosen == 4){

            test = thescedule.checkstartthurs(timech);
        }
        else if(daychoosen == 5){

            test = thescedule.checkstartfriday(timech);
        }
        else if(daychoosen == 6){

            test = thescedule.checkstartSat(timech);
        }
        else if(daychoosen == 7){

            test = thescedule.checkstartsunday(timech);
        }
        if(!test){
            Toast.makeText(this,"Error conflicting times",Toast.LENGTH_LONG).show();
        }
        else {
            Intent nextpage2 = new Intent(AddStarttimeEdit.this, AddfinishtimeEdit.class);
            nextpage2.putExtra("Day", daychoosen);
            nextpage2.putExtra("Starttime", timechoose);
            nextpage2.putExtra("intStarttime", timech);
            startActivity(nextpage2);
        }

    }
    public void clicked6am(View view2){
        Schedule thescedule = new Schedule();
        FullData g = (FullData) getApplication();
        boolean test = true;
        me = g.getMainusertutor();
        thescedule = me.getMySchedule();
        Intent theone = getIntent();
        daychoosen = theone.getIntExtra("Day",0);
        timech = 6;
        timechoose ="6:00am";
        if(daychoosen ==1){
            test = thescedule.checkstartmonday(timech);
        }
        else if(daychoosen == 2){
            test = thescedule.checkstartues(timech);
        }
        else if(daychoosen == 3){

            test = thescedule.checkstartweds(timech);
        }
        else if(daychoosen == 4){

            test = thescedule.checkstartthurs(timech);
        }
        else if(daychoosen == 5){

            test = thescedule.checkstartfriday(timech);
        }
        else if(daychoosen == 6){

            test = thescedule.checkstartSat(timech);
        }
        else if(daychoosen == 7){

            test = thescedule.checkstartsunday(timech);
        }
        if(!test){
            Toast.makeText(this,"Error conflicting times",Toast.LENGTH_LONG).show();
        }
        else {
            Intent nextpage2 = new Intent(AddStarttimeEdit.this, AddfinishtimeEdit.class);
            nextpage2.putExtra("Day", daychoosen);
            nextpage2.putExtra("Starttime", timechoose);
            nextpage2.putExtra("intStarttime", timech);
            startActivity(nextpage2);
        }

    }
    public void clicked5am(View view2){
        Schedule thescedule = new Schedule();
        FullData g = (FullData) getApplication();
        boolean test = true;
        me = g.getMainusertutor();
        thescedule = me.getMySchedule();
        Intent theone = getIntent();
        daychoosen = theone.getIntExtra("Day",0);
        timech = 5;
        timechoose ="5:00am";
        if(daychoosen ==1){
            test = thescedule.checkstartmonday(timech);
        }
        else if(daychoosen == 2){
            test = thescedule.checkstartues(timech);
        }
        else if(daychoosen == 3){

            test = thescedule.checkstartweds(timech);
        }
        else if(daychoosen == 4){

            test = thescedule.checkstartthurs(timech);
        }
        else if(daychoosen == 5){

            test = thescedule.checkstartfriday(timech);
        }
        else if(daychoosen == 6){

            test = thescedule.checkstartSat(timech);
        }
        else if(daychoosen == 7){

            test = thescedule.checkstartsunday(timech);
        }
        if(!test){
            Toast.makeText(this,"Error conflicting times",Toast.LENGTH_LONG).show();
        }
        else {
            Intent nextpage2 = new Intent(AddStarttimeEdit.this, AddfinishtimeEdit.class);
            nextpage2.putExtra("Day", daychoosen);
            nextpage2.putExtra("Starttime", timechoose);
            nextpage2.putExtra("intStarttime", timech);
            startActivity(nextpage2);
        }

    }
    public void clicked4am(View view2){
        Schedule thescedule = new Schedule();
        FullData g = (FullData) getApplication();
        boolean test = true;
        me = g.getMainusertutor();
        thescedule = me.getMySchedule();
        Intent theone = getIntent();
        daychoosen = theone.getIntExtra("Day",0);
        timech = 4;
        timechoose ="4:00am";
        if(daychoosen ==1){
            test = thescedule.checkstartmonday(timech);
        }
        else if(daychoosen == 2){
            test = thescedule.checkstartues(timech);
        }
        else if(daychoosen == 3){

            test = thescedule.checkstartweds(timech);
        }
        else if(daychoosen == 4){

            test = thescedule.checkstartthurs(timech);
        }
        else if(daychoosen == 5){

            test = thescedule.checkstartfriday(timech);
        }
        else if(daychoosen == 6){

            test = thescedule.checkstartSat(timech);
        }
        else if(daychoosen == 7){

            test = thescedule.checkstartsunday(timech);
        }
        if(!test){
            Toast.makeText(this,"Error conflicting times",Toast.LENGTH_LONG).show();
        }
        else {
            Intent nextpage2 = new Intent(AddStarttimeEdit.this, AddfinishtimeEdit.class);
            nextpage2.putExtra("Day", daychoosen);
            nextpage2.putExtra("Starttime", timechoose);
            nextpage2.putExtra("intStarttime", timech);
            startActivity(nextpage2);
        }

    }
    public void clicked3am(View view2){
        Schedule thescedule = new Schedule();
        FullData g = (FullData) getApplication();
        boolean test = true;
        me = g.getMainusertutor();
        thescedule = me.getMySchedule();
        Intent theone = getIntent();
        daychoosen = theone.getIntExtra("Day",0);
        timech = 3;
        timechoose ="3:00am";
        if(daychoosen ==1){
            test = thescedule.checkstartmonday(timech);
        }
        else if(daychoosen == 2){
            test = thescedule.checkstartues(timech);
        }
        else if(daychoosen == 3){

            test = thescedule.checkstartweds(timech);
        }
        else if(daychoosen == 4){

            test = thescedule.checkstartthurs(timech);
        }
        else if(daychoosen == 5){

            test = thescedule.checkstartfriday(timech);
        }
        else if(daychoosen == 6){

            test = thescedule.checkstartSat(timech);
        }
        else if(daychoosen == 7){

            test = thescedule.checkstartsunday(timech);
        }
        if(!test){
            Toast.makeText(this,"Error conflicting times",Toast.LENGTH_LONG).show();
        }
        else {
            Intent nextpage2 = new Intent(AddStarttimeEdit.this, AddfinishtimeEdit.class);
            nextpage2.putExtra("Day", daychoosen);
            nextpage2.putExtra("Starttime", timechoose);
            nextpage2.putExtra("intStarttime", timech);
            startActivity(nextpage2);
        }

    }
    public void clicked2am(View view2){
        Schedule thescedule = new Schedule();
        FullData g = (FullData) getApplication();
        boolean test = true;
        me = g.getMainusertutor();
        thescedule = me.getMySchedule();
        Intent theone = getIntent();
        daychoosen = theone.getIntExtra("Day",0);
        timech = 2;
        timechoose ="2:00am";
        if(daychoosen ==1){
            test = thescedule.checkstartmonday(timech);
        }
        else if(daychoosen == 2){
            test = thescedule.checkstartues(timech);
        }
        else if(daychoosen == 3){

            test = thescedule.checkstartweds(timech);
        }
        else if(daychoosen == 4){

            test = thescedule.checkstartthurs(timech);
        }
        else if(daychoosen == 5){

            test = thescedule.checkstartfriday(timech);
        }
        else if(daychoosen == 6){

            test = thescedule.checkstartSat(timech);
        }
        else if(daychoosen == 7){

            test = thescedule.checkstartsunday(timech);
        }
        if(!test){
            Toast.makeText(this,"Error conflicting times",Toast.LENGTH_LONG).show();
        }
        else {
            Intent nextpage2 = new Intent(AddStarttimeEdit.this, AddfinishtimeEdit.class);
            nextpage2.putExtra("Day", daychoosen);
            nextpage2.putExtra("Starttime", timechoose);
            nextpage2.putExtra("intStarttime", timech);
            startActivity(nextpage2);
        }

    }
    public void clicked1am(View view2){
        Schedule thescedule = new Schedule();
        FullData g = (FullData) getApplication();
        Intent theone = getIntent();
        boolean test = true;
        me = g.getMainusertutor();
        thescedule = me.getMySchedule();
        daychoosen = theone.getIntExtra("Day",0);
        timech = 1;
        timechoose ="1:00am";
        if(daychoosen ==1){
            test = thescedule.checkstartmonday(timech);
        }
        else if(daychoosen == 2){
            test = thescedule.checkstartues(timech);
        }
        else if(daychoosen == 3){

            test = thescedule.checkstartweds(timech);
        }
        else if(daychoosen == 4){

            test = thescedule.checkstartthurs(timech);
        }
        else if(daychoosen == 5){

            test = thescedule.checkstartfriday(timech);
        }
        else if(daychoosen == 6){

            test = thescedule.checkstartSat(timech);
        }
        else if(daychoosen == 7){

            test = thescedule.checkstartsunday(timech);
        }
        if(!test){
            Toast.makeText(this,"Error conflicting times",Toast.LENGTH_LONG).show();
        }
        else {
            Intent nextpage2 = new Intent(AddStarttimeEdit.this, AddfinishtimeEdit.class);
            nextpage2.putExtra("Day", daychoosen);
            nextpage2.putExtra("Starttime", timechoose);
            nextpage2.putExtra("intStarttime", timech);
            startActivity(nextpage2);
        }

    }
    public void clicked12pm(View view2){
        Schedule thescedule = new Schedule();
        FullData g = (FullData) getApplication();
        boolean test = true;
        me = g.getMainusertutor();
        thescedule = me.getMySchedule();
        Intent theone = getIntent();
        daychoosen = theone.getIntExtra("Day",0);
        timech = 12;
        timechoose ="12:00pm";
        if(daychoosen ==1){
            test = thescedule.checkstartmonday(timech);
        }
        else if(daychoosen == 2){
            test = thescedule.checkstartues(timech);
        }
        else if(daychoosen == 3){

            test = thescedule.checkstartweds(timech);
        }
        else if(daychoosen == 4){

            test = thescedule.checkstartthurs(timech);
        }
        else if(daychoosen == 5){

            test = thescedule.checkstartfriday(timech);
        }
        else if(daychoosen == 6){

            test = thescedule.checkstartSat(timech);
        }
        else if(daychoosen == 7){

            test = thescedule.checkstartsunday(timech);
        }
        if(!test){
            Toast.makeText(this,"Error conflicting times",Toast.LENGTH_LONG).show();
        }
        else {
            Intent nextpage2 = new Intent(AddStarttimeEdit.this, AddfinishtimeEdit.class);
            nextpage2.putExtra("Day", daychoosen);
            nextpage2.putExtra("Starttime", timechoose);
            nextpage2.putExtra("intStarttime", timech);
            startActivity(nextpage2);
        }

    }
    public void clicked11pm(View view2){
        Schedule thescedule = new Schedule();
        FullData g = (FullData) getApplication();
        boolean test = true;
        me = g.getMainusertutor();
        thescedule = me.getMySchedule();
        Intent theone = getIntent();
        daychoosen = theone.getIntExtra("Day",0);
        timech = 23;
        timechoose ="11:00pm";
        if(daychoosen ==1){
            test = thescedule.checkstartmonday(timech);
        }
        else if(daychoosen == 2){
            test = thescedule.checkstartues(timech);
        }
        else if(daychoosen == 3){

            test = thescedule.checkstartweds(timech);
        }
        else if(daychoosen == 4){

            test = thescedule.checkstartthurs(timech);
        }
        else if(daychoosen == 5){

            test = thescedule.checkstartfriday(timech);
        }
        else if(daychoosen == 6){

            test = thescedule.checkstartSat(timech);
        }
        else if(daychoosen == 7){

            test = thescedule.checkstartsunday(timech);
        }
        if(!test){
            Toast.makeText(this,"Error conflicting times",Toast.LENGTH_LONG).show();
        }
        else {
            Intent nextpage2 = new Intent(AddStarttimeEdit.this, AddfinishtimeEdit.class);
            nextpage2.putExtra("Day", daychoosen);
            nextpage2.putExtra("Starttime", timechoose);
            nextpage2.putExtra("intStarttime", timech);
            startActivity(nextpage2);
        }

    }
    public void clicked10pm(View view2){
        Schedule thescedule = new Schedule();
        FullData g = (FullData) getApplication();
        boolean test = true;
        me = g.getMainusertutor();
        thescedule = me.getMySchedule();
        Intent theone = getIntent();
        daychoosen = theone.getIntExtra("Day",0);
        timech = 22;
        timechoose ="10:00pm";
        if(daychoosen ==1){
            test = thescedule.checkstartmonday(timech);
        }
        else if(daychoosen == 2){
            test = thescedule.checkstartues(timech);
        }
        else if(daychoosen == 3){

            test = thescedule.checkstartweds(timech);
        }
        else if(daychoosen == 4){

            test = thescedule.checkstartthurs(timech);
        }
        else if(daychoosen == 5){

            test = thescedule.checkstartfriday(timech);
        }
        else if(daychoosen == 6){

            test = thescedule.checkstartSat(timech);
        }
        else if(daychoosen == 7){

            test = thescedule.checkstartsunday(timech);
        }
        if(!test){
            Toast.makeText(this,"Error conflicting times",Toast.LENGTH_LONG).show();
        }
        else {
            Intent nextpage2 = new Intent(AddStarttimeEdit.this, AddfinishtimeEdit.class);
            nextpage2.putExtra("Day", daychoosen);
            nextpage2.putExtra("Starttime", timechoose);
            nextpage2.putExtra("intStarttime", timech);
            startActivity(nextpage2);
        }

    }
    public void clicked9pm(View view2){
        Schedule thescedule = new Schedule();
        FullData g = (FullData) getApplication();
        boolean test = true;
        me = g.getMainusertutor();
        thescedule = me.getMySchedule();
        Intent theone = getIntent();
        daychoosen = theone.getIntExtra("Day",0);
        timech = 21;
        timechoose ="9:00pm";
        if(daychoosen ==1){
            test = thescedule.checkstartmonday(timech);
        }
        else if(daychoosen == 2){
            test = thescedule.checkstartues(timech);
        }
        else if(daychoosen == 3){

            test = thescedule.checkstartweds(timech);
        }
        else if(daychoosen == 4){

            test = thescedule.checkstartthurs(timech);
        }
        else if(daychoosen == 5){

            test = thescedule.checkstartfriday(timech);
        }
        else if(daychoosen == 6){

            test = thescedule.checkstartSat(timech);
        }
        else if(daychoosen == 7){

            test = thescedule.checkstartsunday(timech);
        }
        if(!test){
            Toast.makeText(this,"Error conflicting times",Toast.LENGTH_LONG).show();
        }
        else {
            Intent nextpage2 = new Intent(AddStarttimeEdit.this, AddfinishtimeEdit.class);
            nextpage2.putExtra("Day", daychoosen);
            nextpage2.putExtra("Starttime", timechoose);
            nextpage2.putExtra("intStarttime", timech);
            startActivity(nextpage2);
        }

    }
    public void clicked8pm(View view2){
        Schedule thescedule = new Schedule();
        FullData g = (FullData) getApplication();
        boolean test = true;
        me = g.getMainusertutor();
        thescedule = me.getMySchedule();
        Intent theone = getIntent();
        daychoosen = theone.getIntExtra("Day",0);
        timech = 20;
        timechoose ="8:00pm";
        if(daychoosen ==1){
            test = thescedule.checkstartmonday(timech);
        }
        else if(daychoosen == 2){
            test = thescedule.checkstartues(timech);
        }
        else if(daychoosen == 3){

            test = thescedule.checkstartweds(timech);
        }
        else if(daychoosen == 4){

            test = thescedule.checkstartthurs(timech);
        }
        else if(daychoosen == 5){

            test = thescedule.checkstartfriday(timech);
        }
        else if(daychoosen == 6){

            test = thescedule.checkstartSat(timech);
        }
        else if(daychoosen == 7){

            test = thescedule.checkstartsunday(timech);
        }
        if(!test){
            Toast.makeText(this,"Error conflicting times",Toast.LENGTH_LONG).show();
        }
        else {
            Intent nextpage2 = new Intent(AddStarttimeEdit.this, AddfinishtimeEdit.class);
            nextpage2.putExtra("Day", daychoosen);
            nextpage2.putExtra("Starttime", timechoose);
            nextpage2.putExtra("intStarttime", timech);
            startActivity(nextpage2);
        }

    }
    public void clicked7pm(View view2){
        Schedule thescedule = new Schedule();
        FullData g = (FullData) getApplication();
        boolean test = true;
        me = g.getMainusertutor();
        thescedule = me.getMySchedule();
        Intent theone = getIntent();
        daychoosen = theone.getIntExtra("Day",0);
        timech = 19;
        timechoose ="7:00pm";
        if(daychoosen ==1){
            test = thescedule.checkstartmonday(timech);
        }
        else if(daychoosen == 2){
            test = thescedule.checkstartues(timech);
        }
        else if(daychoosen == 3){

            test = thescedule.checkstartweds(timech);
        }
        else if(daychoosen == 4){

            test = thescedule.checkstartthurs(timech);
        }
        else if(daychoosen == 5){

            test = thescedule.checkstartfriday(timech);
        }
        else if(daychoosen == 6){

            test = thescedule.checkstartSat(timech);
        }
        else if(daychoosen == 7){

            test = thescedule.checkstartsunday(timech);
        }
        if(!test){
            Toast.makeText(this,"Error conflicting times",Toast.LENGTH_LONG).show();
        }
        else {
            Intent nextpage2 = new Intent(AddStarttimeEdit.this, AddfinishtimeEdit.class);
            nextpage2.putExtra("Day", daychoosen);
            nextpage2.putExtra("Starttime", timechoose);
            nextpage2.putExtra("intStarttime", timech);
            startActivity(nextpage2);
        }

    }
    public void clicked6pm(View view2){
        Schedule thescedule = new Schedule();
        FullData g = (FullData) getApplication();
        boolean test = true;
        me = g.getMainusertutor();
        thescedule = me.getMySchedule();
        Intent theone = getIntent();
        daychoosen = theone.getIntExtra("Day",0);
        timech = 18;
        timechoose ="6:00pm";
        if(daychoosen ==1){
            test = thescedule.checkstartmonday(timech);
        }
        else if(daychoosen == 2){
            test = thescedule.checkstartues(timech);
        }
        else if(daychoosen == 3){

            test = thescedule.checkstartweds(timech);
        }
        else if(daychoosen == 4){

            test = thescedule.checkstartthurs(timech);
        }
        else if(daychoosen == 5){

            test = thescedule.checkstartfriday(timech);
        }
        else if(daychoosen == 6){

            test = thescedule.checkstartSat(timech);
        }
        else if(daychoosen == 7){

            test = thescedule.checkstartsunday(timech);
        }
        if(!test){
            Toast.makeText(this,"Error conflicting times",Toast.LENGTH_LONG).show();
        }
        else {
            Intent nextpage2 = new Intent(AddStarttimeEdit.this, AddfinishtimeEdit.class);
            nextpage2.putExtra("Day", daychoosen);
            nextpage2.putExtra("Starttime", timechoose);
            nextpage2.putExtra("intStarttime", timech);
            startActivity(nextpage2);
        }

    }
    public void clicked5pm(View view2){
        Schedule thescedule = new Schedule();
        FullData g = (FullData) getApplication();
        boolean test = true;
        me = g.getMainusertutor();
        thescedule = me.getMySchedule();
        Intent theone = getIntent();
        daychoosen = theone.getIntExtra("Day",0);
        timech = 17;
        timechoose ="5:00pm";
        if(daychoosen ==1){
            test = thescedule.checkstartmonday(timech);
        }
        else if(daychoosen == 2){
            test = thescedule.checkstartues(timech);
        }
        else if(daychoosen == 3){

            test = thescedule.checkstartweds(timech);
        }
        else if(daychoosen == 4){

            test = thescedule.checkstartthurs(timech);
        }
        else if(daychoosen == 5){

            test = thescedule.checkstartfriday(timech);
        }
        else if(daychoosen == 6){

            test = thescedule.checkstartSat(timech);
        }
        else if(daychoosen == 7){

            test = thescedule.checkstartsunday(timech);
        }
        if(!test){
            Toast.makeText(this,"Error conflicting times",Toast.LENGTH_LONG).show();
        }
        else {
            Intent nextpage2 = new Intent(AddStarttimeEdit.this, AddfinishtimeEdit.class);
            nextpage2.putExtra("Day", daychoosen);
            nextpage2.putExtra("Starttime", timechoose);
            nextpage2.putExtra("intStarttime", timech);
            startActivity(nextpage2);
        }

    }
    public void clicked4pm(View view2){
        Schedule thescedule = new Schedule();
        FullData g = (FullData) getApplication();
        boolean test = true;
        me = g.getMainusertutor();
        thescedule = me.getMySchedule();
        Intent theone = getIntent();
        daychoosen = theone.getIntExtra("Day",0);
        timech = 16;
        timechoose ="4:00pm";
        if(daychoosen ==1){
            test = thescedule.checkstartmonday(timech);
        }
        else if(daychoosen == 2){
            test = thescedule.checkstartues(timech);
        }
        else if(daychoosen == 3){

            test = thescedule.checkstartweds(timech);
        }
        else if(daychoosen == 4){

            test = thescedule.checkstartthurs(timech);
        }
        else if(daychoosen == 5){

            test = thescedule.checkstartfriday(timech);
        }
        else if(daychoosen == 6){

            test = thescedule.checkstartSat(timech);
        }
        else if(daychoosen == 7){

            test = thescedule.checkstartsunday(timech);
        }
        if(!test){
            Toast.makeText(this,"Error conflicting times",Toast.LENGTH_LONG).show();
        }
        else {
            Intent nextpage2 = new Intent(AddStarttimeEdit.this, AddfinishtimeEdit.class);
            nextpage2.putExtra("Day", daychoosen);
            nextpage2.putExtra("Starttime", timechoose);
            nextpage2.putExtra("intStarttime", timech);
            startActivity(nextpage2);
        }

    }
    public void clicked3pm(View view2){
        Schedule thescedule = new Schedule();
        FullData g = (FullData) getApplication();
        boolean test = true;
        me = g.getMainusertutor();
        thescedule = me.getMySchedule();
        Intent theone = getIntent();
        daychoosen = theone.getIntExtra("Day",0);
        timech = 15;
        timechoose ="3:00pm";
        if(daychoosen ==1){
            test = thescedule.checkstartmonday(timech);
        }
        else if(daychoosen == 2){
            test = thescedule.checkstartues(timech);
        }
        else if(daychoosen == 3){

            test = thescedule.checkstartweds(timech);
        }
        else if(daychoosen == 4){

            test = thescedule.checkstartthurs(timech);
        }
        else if(daychoosen == 5){

            test = thescedule.checkstartfriday(timech);
        }
        else if(daychoosen == 6){

            test = thescedule.checkstartSat(timech);
        }
        else if(daychoosen == 7){

            test = thescedule.checkstartsunday(timech);
        }
        if(!test){
            Toast.makeText(this,"Error conflicting times",Toast.LENGTH_LONG).show();
        }
        else {
            Intent nextpage2 = new Intent(AddStarttimeEdit.this, AddfinishtimeEdit.class);
            nextpage2.putExtra("Day", daychoosen);
            nextpage2.putExtra("Starttime", timechoose);
            nextpage2.putExtra("intStarttime", timech);
            startActivity(nextpage2);
        }

    }
    public void clicked2pm(View view2){

        Schedule thescedule = new Schedule();
        FullData g = (FullData) getApplication();
        boolean test = true;
        me = g.getMainusertutor();
        thescedule = me.getMySchedule();
        Intent theone = getIntent();
        daychoosen = theone.getIntExtra("Day",0);
        timech = 14;
        timechoose ="2:00pm";
        if(daychoosen ==1){
            test = thescedule.checkstartmonday(timech);
        }
        else if(daychoosen == 2){
            test = thescedule.checkstartues(timech);
        }
        else if(daychoosen == 3){

            test = thescedule.checkstartweds(timech);
        }
        else if(daychoosen == 4){

            test = thescedule.checkstartthurs(timech);
        }
        else if(daychoosen == 5){

            test = thescedule.checkstartfriday(timech);
        }
        else if(daychoosen == 6){

            test = thescedule.checkstartSat(timech);
        }
        else if(daychoosen == 7){

            test = thescedule.checkstartsunday(timech);
        }
        if(!test){
            Toast.makeText(this,"Error conflicting times",Toast.LENGTH_LONG).show();
        }
        else {
            Intent nextpage2 = new Intent(AddStarttimeEdit.this, AddfinishtimeEdit.class);
            nextpage2.putExtra("Day", daychoosen);
            nextpage2.putExtra("Starttime", timechoose);
            nextpage2.putExtra("intStarttime", timech);
            startActivity(nextpage2);
        }

    }
    public void clicked1pm(View view2){

        Schedule thescedule = new Schedule();
        FullData g = (FullData) getApplication();
        boolean test = true;
        me = g.getMainusertutor();
        thescedule = me.getMySchedule();
        Intent theone = getIntent();
        daychoosen = theone.getIntExtra("Day",0);
        timech = 13;
        timechoose ="1:00pm";
        if(daychoosen == 1){
            test = thescedule.checkstartmonday(timech);
        }
        else if(daychoosen == 2){
            test = thescedule.checkstartues(timech);
        }
        else if(daychoosen == 3){

            test = thescedule.checkstartweds(timech);
        }
        else if(daychoosen == 4){

            test = thescedule.checkstartthurs(timech);
        }
        else if(daychoosen == 5){

            test = thescedule.checkstartfriday(timech);
        }
        else if(daychoosen == 6){

            test = thescedule.checkstartSat(timech);
        }
        else if(daychoosen == 7){

            test = thescedule.checkstartsunday(timech);
        }

        if(!test){
            Toast.makeText(this,"Error conflicting times",Toast.LENGTH_LONG).show();
        }
        else {
            Intent nextpage2 = new Intent(AddStarttimeEdit.this, AddfinishtimeEdit.class);
            nextpage2.putExtra("Day", daychoosen);
            nextpage2.putExtra("Starttime", timechoose);
            nextpage2.putExtra("intStarttime", timech);
            startActivity(nextpage2);
        }

    }
}
