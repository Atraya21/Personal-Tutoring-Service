package com.example.cse3310.personaltutoringservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class EditScheduleRemove extends AppCompatActivity {
    ListView mylist;
    ArrayAdapter adapter;
    List mondaylist = new ArrayList();
    List tuesdaylist = new ArrayList();
    List wednesdaylist = new ArrayList();
    List thursdaylist = new ArrayList();
    List fridaylist = new ArrayList();
    List saturdaylist = new ArrayList();
    List sundaylist = new ArrayList();
    int choosentime = 0;
    Tutor me = new Tutor();
    Student me2 = new Student();
    Schedule meSched = new Schedule();
    Schedule meSched2 = new Schedule();
    TimeBlock b = new TimeBlock();
    boolean test1 = false;
    String check = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_schedule_remove);
    }
    public void clickedmonday(View view3){
        Tutor temp = new Tutor();
        mylist = (ListView) findViewById(R.id.Mylistview);
        Schedule tempschedule = new Schedule();
        FullData g = (FullData) getApplication();
        temp = g.getMainusertutor();
        tempschedule = temp.getMySchedule();
        mondaylist = tempschedule.getmondaylisttut();
        adapter = new ArrayAdapter(EditScheduleRemove.this,android.R.layout.simple_list_item_1,mondaylist);
        mylist.setAdapter(adapter);
        mylist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                FullData g = (FullData) getApplication();
                choosentime = i;
                me = g.getMainusertutor();
                meSched = me.getMySchedule();
                b = meSched.getblockmonday(i);
                check = b.getStudent();
                g.studentfind(check);
                test1 = g.getstudentcheck();
                meSched.monremove(choosentime);
                if(test1){
                    me2 = g.getEditstudent();
                    meSched2 = me2.getMySchedule();
                    meSched2.checkremovemonday(b);
                    me2.setMySchedule(meSched2);
                    g.setEditstudent(me2);
                }
                me.setMySchedule(meSched);
                g.setMainusertutor(me);
                Intent nextpage = new Intent(EditScheduleRemove.this,FinishEditScedule.class);
                startActivity(nextpage);

            }
        });

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
        adapter = new ArrayAdapter(EditScheduleRemove.this,android.R.layout.simple_list_item_1,tuesdaylist);
        mylist.setAdapter(adapter);
        mylist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                FullData g = (FullData) getApplication();
                choosentime = i;
                me = g.getMainusertutor();
                meSched = me.getMySchedule();
                b = meSched.getblockmonday(i);
                check = b.getStudent();
                g.studentfind(check);
                test1 = g.getstudentcheck();
                meSched.tuesremove(choosentime);
                if(test1){
                    me2 = g.getEditstudent();
                    meSched2 = me2.getMySchedule();
                    meSched2.checkremovtuesday(b);
                    me2.setMySchedule(meSched2);
                    g.setEditstudent(me2);
                }
                me.setMySchedule(meSched);
                g.setMainusertutor(me);
                Intent nextpage = new Intent(EditScheduleRemove.this,FinishEditScedule.class);
                startActivity(nextpage);

            }
        });

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
        adapter = new ArrayAdapter(EditScheduleRemove.this,android.R.layout.simple_list_item_1,wednesdaylist);
        mylist.setAdapter(adapter);
        mylist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                FullData g = (FullData) getApplication();
                choosentime = i;
                me = g.getMainusertutor();
                meSched = me.getMySchedule();
                b = meSched.getblockweds(i);
                check = b.getStudent();
                g.studentfind(check);
                test1 = g.getstudentcheck();
                meSched.wedsremove(choosentime);
                if(test1){
                    me2 = g.getEditstudent();
                    meSched2 = me2.getMySchedule();
                    meSched2.checkremoveweds(b);
                    me2.setMySchedule(meSched2);
                    g.setEditstudent(me2);
                }
                me.setMySchedule(meSched);
                g.setMainusertutor(me);
                Intent nextpage = new Intent(EditScheduleRemove.this,FinishEditScedule.class);
                startActivity(nextpage);

            }
        });
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
        adapter = new ArrayAdapter(EditScheduleRemove.this,android.R.layout.simple_list_item_1,thursdaylist);
        mylist.setAdapter(adapter);
        mylist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                FullData g = (FullData) getApplication();
                choosentime = i;
                me = g.getMainusertutor();
                meSched = me.getMySchedule();
                b = meSched.getblockthurs(i);
                check = b.getStudent();
                g.studentfind(check);
                test1 = g.getstudentcheck();
                meSched.thursremove(choosentime);
                if(test1){
                    me2 = g.getEditstudent();
                    meSched2 = me2.getMySchedule();
                    meSched2.checkremovthursday(b);
                    me2.setMySchedule(meSched2);
                    g.setEditstudent(me2);
                }
                me.setMySchedule(meSched);
                g.setMainusertutor(me);
                Intent nextpage = new Intent(EditScheduleRemove.this,FinishEditScedule.class);
                startActivity(nextpage);

            }
        });
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
        adapter = new ArrayAdapter(EditScheduleRemove.this,android.R.layout.simple_list_item_1,fridaylist);
        mylist.setAdapter(adapter);
        mylist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                FullData g = (FullData) getApplication();
                choosentime = i;
                me = g.getMainusertutor();
                meSched = me.getMySchedule();
                b = meSched.getblockfriday(i);
                check = b.getStudent();
                g.studentfind(check);
                test1 = g.getstudentcheck();
                meSched.fridayremove(choosentime);
                if(test1){
                    me2 = g.getEditstudent();
                    meSched2 = me2.getMySchedule();
                    meSched2.checkremovefriday(b);
                    me2.setMySchedule(meSched2);
                    g.setEditstudent(me2);
                }
                me.setMySchedule(meSched);
                g.setMainusertutor(me);
                Intent nextpage = new Intent(EditScheduleRemove.this,FinishEditScedule.class);
                startActivity(nextpage);

            }
        });
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
        adapter = new ArrayAdapter(EditScheduleRemove.this,android.R.layout.simple_list_item_1,saturdaylist);
        mylist.setAdapter(adapter);
        mylist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                FullData g = (FullData) getApplication();
                choosentime = i;
                me = g.getMainusertutor();
                meSched = me.getMySchedule();
                b = meSched.getblocksat(i);
                check = b.getStudent();
                g.studentfind(check);
                test1 = g.getstudentcheck();
                if(test1){
                    me2 = g.getEditstudent();
                    meSched2 = me2.getMySchedule();
                    meSched2.checkremovesat(b);
                    me2.setMySchedule(meSched2);
                    g.setEditstudent(me2);
                }
                meSched.Satremove(choosentime);
                me.setMySchedule(meSched);
                g.setMainusertutor(me);
                Intent nextpage = new Intent(EditScheduleRemove.this,FinishEditScedule.class);
                startActivity(nextpage);

            }
        });
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
        adapter = new ArrayAdapter(EditScheduleRemove.this,android.R.layout.simple_list_item_1,sundaylist);
        mylist.setAdapter(adapter);
        mylist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                FullData g = (FullData) getApplication();
                choosentime = i;
                me = g.getMainusertutor();
                meSched = me.getMySchedule();
                b = meSched.getblocksunday(i);
                check = b.getStudent();
                g.studentfind(check);
                test1 = g.getstudentcheck();
                meSched.Sundayemove(choosentime);
                if(test1){
                    me2 = g.getEditstudent();
                    meSched2 = me2.getMySchedule();
                    meSched2.checkremovesunday(b);
                    me2.setMySchedule(meSched2);
                    g.setEditstudent(me2);
                }
                me.setMySchedule(meSched);
                g.setMainusertutor(me);
                Intent nextpage = new Intent(EditScheduleRemove.this,FinishEditScedule.class);
                startActivity(nextpage);

            }
        });

    }

}
