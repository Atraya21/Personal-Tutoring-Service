package com.example.cse3310.personaltutoringservice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ViewStudentSchedule extends AppCompatActivity {
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
        setContentView(R.layout.activity_view_student_schedule);
    }
    public void clickedmonday(View view3){
        Student temp = new Student();
        mylist = (ListView) findViewById(R.id.Mylistview);
        Schedule tempschedule = new Schedule();
        FullData g = (FullData) getApplication();
        int test = 0;
        temp = g.getMainuserstudent();
        tempschedule = temp.getMySchedule();
        mondaylist = tempschedule.getmondaylistst();
        adapter = new ArrayAdapter(ViewStudentSchedule.this,android.R.layout.simple_list_item_1,mondaylist);
        mylist.setAdapter(adapter);

    }
    public void clickedtuesday(View view){
        Student temp = new Student();
        mylist = (ListView) findViewById(R.id.Mylistview);
        Schedule tempschedule = new Schedule();
        FullData g = (FullData) getApplication();
        int test = 0;
        temp = g.getMainuserstudent();
        tempschedule = temp.getMySchedule();
        tuesdaylist = tempschedule.gettuesdaylistst();
        adapter = new ArrayAdapter(ViewStudentSchedule.this,android.R.layout.simple_list_item_1,tuesdaylist);
        mylist.setAdapter(adapter);

    }
    public void clickedwednesday(View view){
        Student temp = new Student();
        mylist = (ListView) findViewById(R.id.Mylistview);
        Schedule tempschedule = new Schedule();
        FullData g = (FullData) getApplication();
        int test = 0;
        temp = g.getMainuserstudent();
        tempschedule = temp.getMySchedule();
        wednesdaylist = tempschedule.getwedlistst();
        adapter = new ArrayAdapter(ViewStudentSchedule.this,android.R.layout.simple_list_item_1,wednesdaylist);
        mylist.setAdapter(adapter);
    }
    public void clickedthursday(View view){
        Student temp = new Student();
        mylist = (ListView) findViewById(R.id.Mylistview);
        Schedule tempschedule = new Schedule();
        FullData g = (FullData) getApplication();
        int test = 0;
        temp = g.getMainuserstudent();
        tempschedule = temp.getMySchedule();
        thursdaylist = tempschedule.getthurslistst();
        adapter = new ArrayAdapter(ViewStudentSchedule.this,android.R.layout.simple_list_item_1,thursdaylist);
        mylist.setAdapter(adapter);
    }
    public void clickedFriday(View view){
        Student temp = new Student();
        mylist = (ListView) findViewById(R.id.Mylistview);
        Schedule tempschedule = new Schedule();
        FullData g = (FullData) getApplication();
        int test = 0;
        temp = g.getMainuserstudent();
        tempschedule = temp.getMySchedule();
        fridaylist = tempschedule.getfridaylistst();
        adapter = new ArrayAdapter(ViewStudentSchedule.this,android.R.layout.simple_list_item_1,fridaylist);
        mylist.setAdapter(adapter);
    }
    public void clickedSaturday(View view){
        Student temp = new Student();
        mylist = (ListView) findViewById(R.id.Mylistview);
        Schedule tempschedule = new Schedule();
        FullData g = (FullData) getApplication();
        int test = 0;
        temp = g.getMainuserstudent();
        tempschedule = temp.getMySchedule();
        saturdaylist = tempschedule.getsatlistst();
        adapter = new ArrayAdapter(ViewStudentSchedule.this,android.R.layout.simple_list_item_1,saturdaylist);
        mylist.setAdapter(adapter);
    }
    public void clikedSunday(View view){
        Student temp = new Student();
        mylist = (ListView) findViewById(R.id.Mylistview);
        Schedule tempschedule = new Schedule();
        FullData g = (FullData) getApplication();
        int test = 0;
        temp = g.getMainuserstudent();
        tempschedule = temp.getMySchedule();
        sundaylist = tempschedule.getsundaylistst();
        adapter = new ArrayAdapter(ViewStudentSchedule.this,android.R.layout.simple_list_item_1,sundaylist);
        mylist.setAdapter(adapter);
    }
}
