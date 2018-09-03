package com.example.cse3310.personaltutoringservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Hire extends AppCompatActivity {
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
    Schedule meSched = new Schedule();
    TimeBlock edit = new TimeBlock();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hire);
    }
    public void clickedmonday(View view3){
        Tutor temp = new Tutor();
        mylist = (ListView) findViewById(R.id.Mylistview);
        Schedule tempschedule = new Schedule();
        FullData g = (FullData) getApplication();
        int test = 0;
        temp = g.getPrehiretutor();
        tempschedule = temp.getMySchedule();
        mondaylist = tempschedule.getmondaylisttut();
        adapter = new ArrayAdapter(Hire.this,android.R.layout.simple_list_item_1,mondaylist);
        mylist.setAdapter(adapter);
        mylist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                FullData g = (FullData) getApplication();
                choosentime = i;
                me = g.getPrehiretutor();
                meSched = me.getMySchedule();
                edit = meSched.getblockmonday(choosentime);
                meSched.monremove(choosentime);
                g.setEditblock(edit);
                g.setBlockdaychoice(1);
                me.setMySchedule(meSched);
                g.setPrehiretutor(me);
                Intent nextpage = new Intent(Hire.this,Hirep2.class);
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
        temp = g.getPrehiretutor();
        tempschedule = temp.getMySchedule();
        tuesdaylist = tempschedule.gettuesdaylisttut();
        adapter = new ArrayAdapter(Hire.this,android.R.layout.simple_list_item_1,tuesdaylist);
        mylist.setAdapter(adapter);
        mylist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                FullData g = (FullData) getApplication();
                choosentime = i;
                me = g.getPrehiretutor();
                meSched = me.getMySchedule();
                edit = meSched.getblocktues(choosentime);
                meSched.tuesremove(choosentime);
                g.setEditblock(edit);
                g.setBlockdaychoice(2);
                me.setMySchedule(meSched);
                g.setPrehiretutor(me);
                Intent nextpage = new Intent(Hire.this,Hirep2.class);
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
        temp = g.getPrehiretutor();
        tempschedule = temp.getMySchedule();
        wednesdaylist = tempschedule.getwedlisttut();
        adapter = new ArrayAdapter(Hire.this,android.R.layout.simple_list_item_1,wednesdaylist);
        mylist.setAdapter(adapter);
        mylist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                FullData g = (FullData) getApplication();
                choosentime = i;
                me = g.getPrehiretutor();
                meSched = me.getMySchedule();
                edit = meSched.getblockweds(choosentime);
                meSched.wedsremove(choosentime);
                g.setEditblock(edit);
                g.setBlockdaychoice(3);
                me.setMySchedule(meSched);
                g.setPrehiretutor(me);
                Intent nextpage = new Intent(Hire.this,Hirep2.class);
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
        temp = g.getPrehiretutor();
        tempschedule = temp.getMySchedule();
        thursdaylist = tempschedule.getthurslisttut();
        adapter = new ArrayAdapter(Hire.this,android.R.layout.simple_list_item_1,thursdaylist);
        mylist.setAdapter(adapter);
        mylist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                FullData g = (FullData) getApplication();
                choosentime = i;
                me = g.getPrehiretutor();
                meSched = me.getMySchedule();
                edit = meSched.getblockthurs(choosentime);
                meSched.thursremove(choosentime);
                g.setEditblock(edit);
                g.setBlockdaychoice(4);
                me.setMySchedule(meSched);
                g.setPrehiretutor(me);
                Intent nextpage = new Intent(Hire.this,Hirep2.class);
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
        temp = g.getPrehiretutor();
        tempschedule = temp.getMySchedule();
        fridaylist = tempschedule.getfridaylisttut();
        adapter = new ArrayAdapter(Hire.this,android.R.layout.simple_list_item_1,fridaylist);
        mylist.setAdapter(adapter);
        mylist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                FullData g = (FullData) getApplication();
                choosentime = i;
                me = g.getPrehiretutor();
                meSched = me.getMySchedule();
                edit = meSched.getblockfriday(choosentime);
                meSched.fridayremove(choosentime);
                g.setEditblock(edit);
                g.setBlockdaychoice(5);
                me.setMySchedule(meSched);
                g.setPrehiretutor(me);
                Intent nextpage = new Intent(Hire.this,Hirep2.class);
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
        temp = g.getPrehiretutor();
        tempschedule = temp.getMySchedule();
        saturdaylist = tempschedule.getsatlisttut();
        adapter = new ArrayAdapter(Hire.this,android.R.layout.simple_list_item_1,saturdaylist);
        mylist.setAdapter(adapter);
        mylist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                FullData g = (FullData) getApplication();
                choosentime = i;
                me = g.getPrehiretutor();
                meSched = me.getMySchedule();
                edit = meSched.getblocksat(choosentime);
                meSched.Satremove(choosentime);
                g.setEditblock(edit);
                g.setBlockdaychoice(6);
                me.setMySchedule(meSched);
                g.setPrehiretutor(me);
                Intent nextpage = new Intent(Hire.this,Hirep2.class);
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
        temp = g.getPrehiretutor();
        tempschedule = temp.getMySchedule();
        sundaylist = tempschedule.getsundaylisttut();
        adapter = new ArrayAdapter(Hire.this,android.R.layout.simple_list_item_1,sundaylist);
        mylist.setAdapter(adapter);
        mylist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                FullData g = (FullData) getApplication();
                choosentime = i;
                me = g.getPrehiretutor();
                meSched = me.getMySchedule();
                edit = meSched.getblocksunday(choosentime);
                meSched.Sundayemove(choosentime);
                g.setEditblock(edit);
                g.setBlockdaychoice(7);
                me.setMySchedule(meSched);
                g.setPrehiretutor(me);
                Intent nextpage = new Intent(Hire.this,Hirep2.class);
                startActivity(nextpage);
            }
        });

    }
}
