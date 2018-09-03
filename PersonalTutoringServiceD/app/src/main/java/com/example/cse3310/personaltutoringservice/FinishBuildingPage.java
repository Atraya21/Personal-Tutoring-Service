package com.example.cse3310.personaltutoringservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FinishBuildingPage extends AppCompatActivity {
    int Istarttime = 0;
    int Ifinishtime = 0;
    int daychoose = 0;
    String starttime = null;
    String finishtime = null;
    Tutor me = new Tutor();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish_building_page);
    }
    public void clickmoreadds(View view){
        Schedule myscedule = new Schedule();
        FullData g = (FullData) getApplication();
        TimeBlock tempblock = new TimeBlock();
        Intent thispage = getIntent();
        daychoose = thispage.getIntExtra("Day",0);
        Istarttime = thispage.getIntExtra("intStarttime",0);
        Ifinishtime = thispage.getIntExtra("intfinishtime",0);
        starttime = thispage.getStringExtra("Starttime");
        finishtime = thispage.getStringExtra("Finishtime");
        tempblock.setIfinishtime(Ifinishtime);
        tempblock.setIstarttime(Istarttime);
        tempblock.setStarttime(starttime);
        tempblock.setFinishtime(finishtime);

        if(daychoose == 1){
            me = g.gettemptutor();
            myscedule = me.getMySchedule();
            myscedule.addTomonday(tempblock);
            me.setMySchedule(myscedule);
            g.setTemptutor(me);
        }
        else if(daychoose == 2){
            me = g.gettemptutor();
            myscedule = me.getMySchedule();
            myscedule.addTotuesday(tempblock);
            me.setMySchedule(myscedule);
            g.setTemptutor(me);
        }
        else if(daychoose == 3){
            me = g.gettemptutor();
            myscedule = me.getMySchedule();
            myscedule.addTowednesday(tempblock);
            me.setMySchedule(myscedule);
            g.setTemptutor(me);
        }
        else if(daychoose == 4){
            me = g.gettemptutor();
            myscedule = me.getMySchedule();
            myscedule.addTothursday(tempblock);
            me.setMySchedule(myscedule);
            g.setTemptutor(me);
        }
        else if(daychoose == 5){
            me = g.gettemptutor();
            myscedule = me.getMySchedule();
            myscedule.addTofriday(tempblock);
            me.setMySchedule(myscedule);
            g.setTemptutor(me);
        }
        else if(daychoose == 6){
            me = g.gettemptutor();
            myscedule = me.getMySchedule();
            myscedule.addTosaturday(tempblock);
            me.setMySchedule(myscedule);
            g.setTemptutor(me);
        }
        else if(daychoose == 7){
            me = g.gettemptutor();
            myscedule = me.getMySchedule();
            myscedule.addTosunday(tempblock);
            me.setMySchedule(myscedule);
            g.setTemptutor(me);
        }
        Intent nextpage4 = new Intent(FinishBuildingPage.this,BuildSchedule.class);
        startActivity(nextpage4);


    }
    public void clickfinish(View view){
        Schedule myscedule = new Schedule();
        int test = 5;
        FullData g = (FullData) getApplication();
        TimeBlock tempblock = new TimeBlock();
        Intent thispage = getIntent();
        daychoose = thispage.getIntExtra("Day",0);
        Istarttime = thispage.getIntExtra("intStarttime",0);
        Ifinishtime = thispage.getIntExtra("intfinishtime",0);
        starttime = thispage.getStringExtra("Starttime");
        finishtime = thispage.getStringExtra("Finishtime");
        tempblock.setIfinishtime(Ifinishtime);
        tempblock.setIstarttime(Istarttime);
        tempblock.setStarttime(starttime);
        tempblock.setFinishtime(finishtime);
        if(daychoose == 1){
            me = g.gettemptutor();
            myscedule = me.getMySchedule();
            myscedule.addTomonday(tempblock);
            me.setMySchedule(myscedule);
            g.setTemptutor(me);
        }
        else if(daychoose == 2){
            me = g.gettemptutor();
            myscedule = me.getMySchedule();
            myscedule.addTotuesday(tempblock);
            me.setMySchedule(myscedule);
            g.setTemptutor(me);
        }
        else if(daychoose == 3){
            me = g.gettemptutor();
            myscedule = me.getMySchedule();
            myscedule.addTowednesday(tempblock);
            me.setMySchedule(myscedule);
            g.setTemptutor(me);
        }
        else if(daychoose == 4){
            me = g.gettemptutor();
            myscedule = me.getMySchedule();
            myscedule.addTothursday(tempblock);
            me.setMySchedule(myscedule);
            g.setTemptutor(me);
        }
        else if(daychoose == 5){
            me = g.gettemptutor();
            myscedule = me.getMySchedule();
            myscedule.addTofriday(tempblock);
            me.setMySchedule(myscedule);
            g.setTemptutor(me);
        }
        else if(daychoose == 6){
            me = g.gettemptutor();
            myscedule = me.getMySchedule();
            myscedule.addTosaturday(tempblock);
            me.setMySchedule(myscedule);
            g.setTemptutor(me);
        }
        else if(daychoose == 7){
            me = g.gettemptutor();
            myscedule = me.getMySchedule();
            myscedule.addTosunday(tempblock);
            me.setMySchedule(myscedule);
            g.setTemptutor(me);
        }
        g.addtutor();
        Intent nextpage4 = new Intent(FinishBuildingPage.this,MainActivity.class);
        startActivity(nextpage4);






    }
}
