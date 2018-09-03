package com.example.cse3310.personaltutoringservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class TutorHomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutor_home_page);
    }
    public void vewsced(View view){
        Intent intend = new Intent(TutorHomePage.this,ViewTutorScedule.class);
        startActivity(intend);

    }
    public void viewreview(View view){
        Intent intend = new Intent(TutorHomePage.this,Viewreviewsmain.class);
        startActivity(intend);

    }
    public void logout(View view){
        FullData g = (FullData) getApplication();
        g.updateMainTutor();
        g.resetdata();
        Intent intend = new Intent(TutorHomePage.this,MainActivity.class);
        startActivity(intend);

    }
    public void checkclick(View view){
        FullData g = (FullData) getApplication();
        Tutor me = new Tutor();
        String test = null;
        me = g.getMainusertutor();
        test = me.gettutorid();
        Toast.makeText(this,"mainid: " + test,Toast.LENGTH_LONG).show();

    }

    public void viewinfo(View view){
        Intent intend = new Intent(TutorHomePage.this,Tutorinfoview.class);
        startActivity(intend);

    }
}
