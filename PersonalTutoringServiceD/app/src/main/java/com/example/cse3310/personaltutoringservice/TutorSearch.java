package com.example.cse3310.personaltutoringservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class TutorSearch extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private ArrayAdapter adapter;
    ArrayList<String> test = new ArrayList<>();
    int test2 = 0;
    String name = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutor_search);
        ListView list=(ListView) findViewById(R.id.theList);
        EditText theFilter = (EditText) findViewById(R.id.searchFilter);
        Log.d(TAG,"onCreate: Strated. ");
        FullData data = (FullData) getApplication();
        test = data.getnameslist();


        adapter = new ArrayAdapter(this, R.layout.list_item_layout, test);
        list.setAdapter(adapter);

        theFilter.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                (TutorSearch.this).adapter.getFilter().filter(charSequence);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                FullData g = (FullData) getApplication();
                boolean test3 = false;
                test2 = i;
                name = test.get(test2);
                g.findtutor(name);
                test3 = g.gettutorfound();
                if(test3) {
                    Intent intend = new Intent(TutorSearch.this,Prehirepage.class);
                    startActivity(intend);
                }

            }
        });
    }
}
