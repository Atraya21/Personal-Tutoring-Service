package com.example.cse3310.personaltutoringservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class VeiwreviewsPre extends AppCompatActivity {
    ListView mylist;
    ArrayAdapter adapter;
    ArrayList<String> myreviews = new ArrayList<>();
    int choice = 0;
    String name = null;
    boolean test = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_veiwreviews_pre);
    }
    public void seerevies(View view) {
        Tutor temp = new Tutor();
        mylist = (ListView) findViewById(R.id.Mylistview);
        FullData g = (FullData) getApplication();
        temp = g.getPrehiretutor();
        myreviews = temp.getReviewlist();
        adapter = new ArrayAdapter(VeiwreviewsPre.this, android.R.layout.simple_list_item_1, myreviews);
        mylist.setAdapter(adapter);
    }
    public void backtomain(View view){
        Intent nextpage = new Intent(VeiwreviewsPre.this, Prehirepage.class);
        startActivity(nextpage);
    }
}
