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

public class CategorySearch extends AppCompatActivity {
    ListView mylist;
    ArrayAdapter adapter;
    List cattuorlist = new ArrayList();
    Category temp = new Category();
    int test2 = 0;
    int coursepicked = 0;
    boolean test3 = false;
    String name = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_search);
    }
    public void mathsearch(View view){
        int x = 0;
        int b = 0;
        Category temp = new Category();
        FullData data = (FullData)getApplication();
        mylist = (ListView) findViewById(R.id.MylistView);
        temp = data.getcategory(x);
        b = temp.getTutorcounter();
        cattuorlist = temp.getturorlist();
        adapter = new ArrayAdapter(CategorySearch.this,android.R.layout.simple_list_item_1,cattuorlist);
        mylist.setAdapter(adapter);
        mylist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                FullData g = (FullData) getApplication();
                Tutor mytut = new Tutor();
                boolean test3 = false;
                test2 = i;
                coursepicked =0;
                g.setCourschoosen(coursepicked);
                g.setpretutor(test2);
                mytut = g.getPrehiretutor();
                name = mytut.gettutorname();
                test3 = g.gettutorfound();
                if(test3) {
                    Intent intend = new Intent(CategorySearch.this,Prehirepage.class);
                    startActivity(intend);
                }

            }
        });
    }
    public void scienesearch(View view){
        int x = 1;
        FullData data = (FullData)getApplication();
        mylist = (ListView) findViewById(R.id.MylistView);
        temp = data.getcategory(x);
        cattuorlist = temp.getturorlist();
        adapter = new ArrayAdapter(CategorySearch.this,android.R.layout.simple_list_item_1,cattuorlist);
        mylist.setAdapter(adapter);
        mylist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                FullData g = (FullData) getApplication();
                Tutor mytut = new Tutor();
                boolean test3 = false;
                test2 = i;
                coursepicked =1;
                g.setCourschoosen(coursepicked);
                g.setpretutor(test2);
                mytut = g.getPrehiretutor();
                name = mytut.gettutorname();
                test3 = g.gettutorfound();
                if(test3) {
                    Intent intend = new Intent(CategorySearch.this,Prehirepage.class);
                    startActivity(intend);

                }

            }
        });
    }
    public void Englishsearch(View view){
        int x = 2;
        FullData data = (FullData)getApplication();
        mylist = (ListView) findViewById(R.id.MylistView);
        temp = data.getcategory(x);
        cattuorlist = temp.getturorlist();
        adapter = new ArrayAdapter(CategorySearch.this,android.R.layout.simple_list_item_1,cattuorlist);
        mylist.setAdapter(adapter);
        mylist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                FullData g = (FullData) getApplication();
                Tutor mytut = new Tutor();
                boolean test3 = false;
                test2 = i;
                coursepicked =2;
                g.setCourschoosen(coursepicked);
                g.setpretutor(test2);
                mytut = g.getPrehiretutor();
                name = mytut.gettutorname();
                test3 = g.gettutorfound();
                if(test3) {
                    Intent intend = new Intent(CategorySearch.this,Prehirepage.class);
                    startActivity(intend);

                }

            }
        });

    }
    public void musicsearch(View view){
        int x = 3;
        FullData data = (FullData)getApplication();
        mylist = (ListView) findViewById(R.id.MylistView);
        temp = data.getcategory(x);
        cattuorlist = temp.getturorlist();
        adapter = new ArrayAdapter(CategorySearch.this,android.R.layout.simple_list_item_1,cattuorlist);
        mylist.setAdapter(adapter);
        mylist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                FullData g = (FullData) getApplication();
                Tutor mytut = new Tutor();
                boolean test3 = false;
                test2 = i;
                coursepicked =3;
                g.setCourschoosen(coursepicked);
                g.setpretutor(test2);
                mytut = g.getPrehiretutor();
                name = mytut.gettutorname();
                test3 = g.gettutorfound();
                if(test3) {
                    Intent intend = new Intent(CategorySearch.this,Prehirepage.class);
                    startActivity(intend);

                }

            }
        });
    }
    public void artssearch(View view){
        int x = 4;
        FullData data = (FullData)getApplication();
        mylist = (ListView) findViewById(R.id.MylistView);
        temp = data.getcategory(x);
        cattuorlist = temp.getturorlist();
        adapter = new ArrayAdapter(CategorySearch.this,android.R.layout.simple_list_item_1,cattuorlist);
        mylist.setAdapter(adapter);
        mylist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                FullData g = (FullData) getApplication();
                Tutor mytut = new Tutor();
                boolean test3 = false;
                test2 = i;
                coursepicked =4;
                g.setCourschoosen(coursepicked);
                g.setpretutor(test2);
                mytut = g.getPrehiretutor();
                name = mytut.gettutorname();
                test3 = g.gettutorfound();
                if(test3) {
                    Intent intend = new Intent(CategorySearch.this,Prehirepage.class);
                    startActivity(intend);

                }

            }
        });
    }
}
