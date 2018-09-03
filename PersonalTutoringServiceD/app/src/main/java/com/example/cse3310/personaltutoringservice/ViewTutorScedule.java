package com.example.cse3310.personaltutoringservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ViewTutorScedule extends AppCompatActivity {
    ListView mylist;
    ArrayAdapter adapter;
    List mondaylist = new ArrayList();
    List tuesdaylist = new ArrayList();
    List wednesdaylist = new ArrayList();
    List thursdaylist = new ArrayList();
    List fridaylist = new ArrayList();
    List saturdaylist = new ArrayList();
    List sundaylist = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_tutor_scedule);
    }
    public void clickedmonday(View view3){
        Tutor temp = new Tutor();
        mylist = (ListView) findViewById(R.id.Mylistview);
        Schedule tempschedule = new Schedule();
        FullData g = (FullData) getApplication();
        int test = 0;
        temp = g.getMainusertutor();
        tempschedule = temp.getMySchedule();
        mondaylist = tempschedule.getmondaylisttut();
        adapter = new ArrayAdapter(ViewTutorScedule.this,android.R.layout.simple_list_item_1,mondaylist);
        mylist.setAdapter(adapter);

    }
    public void clickedtuesday(View view){
        Tutor temp = new Tutor();
        mylist = (ListView) findViewById(R.id.Mylistview);
        Schedule tempschedule = new Schedule();
        FullData g = (FullData) getApplication();
        int test = 0;
        temp = g.getMainusertutor();
        tempschedule = temp.getMySchedule();
        tuesdaylist = tempschedule.gettuesdaylisttut();
        adapter = new ArrayAdapter(ViewTutorScedule.this,android.R.layout.simple_list_item_1,tuesdaylist);
        mylist.setAdapter(adapter);

    }
    public void clickedwednesday(View view){
        Tutor temp = new Tutor();
        mylist = (ListView) findViewById(R.id.Mylistview);
        Schedule tempschedule = new Schedule();
        FullData g = (FullData) getApplication();
        int test = 0;
        temp = g.getMainusertutor();
        tempschedule = temp.getMySchedule();
        wednesdaylist = tempschedule.getwedlisttut();
        adapter = new ArrayAdapter(ViewTutorScedule.this,android.R.layout.simple_list_item_1,wednesdaylist);
        mylist.setAdapter(adapter);
    }
    public void clickedthursday(View view){
        Tutor temp = new Tutor();
        mylist = (ListView) findViewById(R.id.Mylistview);
        Schedule tempschedule = new Schedule();
        FullData g = (FullData) getApplication();
        int test = 0;
        temp = g.getMainusertutor();
        tempschedule = temp.getMySchedule();
        thursdaylist = tempschedule.getthurslisttut();
        adapter = new ArrayAdapter(ViewTutorScedule.this,android.R.layout.simple_list_item_1,thursdaylist);
        mylist.setAdapter(adapter);
    }
    public void clickedFriday(View view){
        Tutor temp = new Tutor();
        mylist = (ListView) findViewById(R.id.Mylistview);
        Schedule tempschedule = new Schedule();
        FullData g = (FullData) getApplication();
        int test = 0;
        temp = g.getMainusertutor();
        tempschedule = temp.getMySchedule();
        fridaylist = tempschedule.getfridaylisttut();
        adapter = new ArrayAdapter(ViewTutorScedule.this,android.R.layout.simple_list_item_1,fridaylist);
        mylist.setAdapter(adapter);
    }
    public void clickedSaturday(View view){
        Tutor temp = new Tutor();
        mylist = (ListView) findViewById(R.id.Mylistview);
        Schedule tempschedule = new Schedule();
        FullData g = (FullData) getApplication();
        int test = 0;
        temp = g.getMainusertutor();
        tempschedule = temp.getMySchedule();
        saturdaylist = tempschedule.getsatlisttut();
        adapter = new ArrayAdapter(ViewTutorScedule.this,android.R.layout.simple_list_item_1,saturdaylist);
        mylist.setAdapter(adapter);
    }
    public void clikedSunday(View view){
        Tutor temp = new Tutor();
        mylist = (ListView) findViewById(R.id.Mylistview);
        Schedule tempschedule = new Schedule();
        FullData g = (FullData) getApplication();
        int test = 0;
        temp = g.getMainusertutor();
        tempschedule = temp.getMySchedule();
        sundaylist = tempschedule.getsundaylisttut();
        adapter = new ArrayAdapter(ViewTutorScedule.this,android.R.layout.simple_list_item_1,sundaylist);
        mylist.setAdapter(adapter);
    }
    public void editsced(View view){
        Intent nextpage = new Intent(ViewTutorScedule.this,EditScedule.class);
        startActivity(nextpage);
    }

}
