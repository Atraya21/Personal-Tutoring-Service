package com.example.cse3310.personaltutoringservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class EditScedule extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_scedule);
    }
    public void remove(View view){
        Intent nextpage = new Intent(EditScedule.this,EditScheduleRemove.class);
        startActivity(nextpage);
    }
    public void addtime(View view){
        Intent nextpage = new Intent(EditScedule.this,Adddaychoose.class);
        startActivity(nextpage);
    }
}
