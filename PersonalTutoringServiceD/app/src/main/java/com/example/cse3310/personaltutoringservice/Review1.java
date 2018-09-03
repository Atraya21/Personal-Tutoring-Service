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

public class Review1 extends AppCompatActivity {
    ListView mylist;
    ArrayAdapter adapter;
    ArrayList<String> namelist = new ArrayList<>();
    int choice = 0;
    String name = null;
    boolean test = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review1);
    }
    public void seetutors(View view){
        Student temp = new Student();
        mylist = (ListView) findViewById(R.id.Mylistview);
        FullData g = (FullData) getApplication();
        temp = g.getMainuserstudent();
        namelist = temp.getturornamelist();
        adapter = new ArrayAdapter(Review1.this,android.R.layout.simple_list_item_1,namelist);
        mylist.setAdapter(adapter);
        mylist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                FullData g = (FullData) getApplication();
                choice = i;
                name = namelist.get(choice);
                g.findtutor(name);
                test = g.gettutorfound();
                if(test) {

                    Intent nextpage = new Intent(Review1.this, WriteReview.class);
                    startActivity(nextpage);
                }

            }
        });
    }
}
