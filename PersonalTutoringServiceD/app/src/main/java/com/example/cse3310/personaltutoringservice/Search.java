package com.example.cse3310.personaltutoringservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Search extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
    }
    public void tutorseach(View view){
        Intent nextpage = new Intent(Search.this,TutorSearch.class);
        startActivity(nextpage);
    }
    public void categorysearch(View view){
        Intent nextpage = new Intent(Search.this,CategorySearch.class);
        startActivity(nextpage);

    }
}
