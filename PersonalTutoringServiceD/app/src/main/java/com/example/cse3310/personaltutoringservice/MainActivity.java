package com.example.cse3310.personaltutoringservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void start(View view){
        FullData g = (FullData) getApplication();
        g.startdata();
        Intent nextpage = new Intent(MainActivity.this,Search.class);
        startActivity(nextpage);
    }
    public void build(View view){
        FullData g = (FullData) getApplication();
        g.startdata();
        Intent intend = new Intent(MainActivity.this,TypeofBuild.class);
        startActivity(intend);
    }
    public void login(View view){
        FullData g = (FullData) getApplication();
        g.startdata();
        Intent intend = new Intent(MainActivity.this,TypeofLogin.class);
        startActivity(intend);
    }
}
