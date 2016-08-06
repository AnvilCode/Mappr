package com.anvil.mappr.Teacher;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.anvil.mappr.R;

/**
 * Created by RAJEEV YADAV on 8/6/2016.
 */
public class TeacherActivity extends AppCompatActivity {
    ListView list;
    String[] teacherActivities;
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.teacher);
        Toolbar toolbar= (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Teacher");
        getSupportActionBar().setHomeButtonEnabled(true);
        teacherActivities= getResources().getStringArray(R.array.TeacherActivities);
        list= (ListView) findViewById(R.id.listView);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,teacherActivities);
        list.setAdapter(arrayAdapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(position){
                    case 0:
                        Intent intt0=new Intent(getBaseContext(),Attendance.class);
                        startActivity(intt0);
                        break;
                    case 1:
                       // Intent intt3=new Intent(getBaseContext(),CreateClass.class);
                        //startActivity(intt3);
                        break;
                    case 3:
                        //Intent intt4=new Intent(getBaseContext(),CreatePoll.class);
                        //startActivity(intt4);
                        break;
                }
            }
        });
    }
}
