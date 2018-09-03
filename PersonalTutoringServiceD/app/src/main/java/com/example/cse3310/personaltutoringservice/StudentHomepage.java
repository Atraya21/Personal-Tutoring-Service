package com.example.cse3310.personaltutoringservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class StudentHomepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_homepage);
    }
    public void search(View view){
        Intent intend = new Intent(StudentHomepage.this,Search.class);
        startActivity(intend);

    }
    public void seeschedule(View view){
        Intent intend = new Intent(StudentHomepage.this,ViewStudentSchedule.class);
        startActivity(intend);

    }
    public void writereview(View view){
        Intent intend = new Intent(StudentHomepage.this,Review1.class);
        startActivity(intend);
    }
    public void logout(View view){
        FullData g = (FullData) getApplication();
        g.updatemainStudent();
        g.resetdata();
        Intent intend = new Intent(StudentHomepage.this,MainActivity.class);
        startActivity(intend);

    }
    public void viewinfo(View view){
        Intent intend = new Intent(StudentHomepage.this,StudentviewInfo.class);
        startActivity(intend);

    }

    public void makepaymentonclick(View view){
        Intent intend = new Intent(StudentHomepage.this,payment.class);
        startActivity(intend);
    }
}
