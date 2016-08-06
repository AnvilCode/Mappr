package com.anvil.mappr.Admin;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.anvil.mappr.R;
import com.anvil.mappr.Teacher.Attendance;


/**
 * Created by RAJEEV YADAV on 8/6/2016.
 */
public class AdminActivity extends AppCompatActivity{
  ListView list;
    String[] AdminActivities;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_activity);
        Toolbar toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);
        toolbar.setTitle("Admin");
        list=(ListView) findViewById(R.id.listView);
        Resources res=getResources();
        AdminActivities=res.getStringArray(R.array.AdminList);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,AdminActivities);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(position){
                    case 0:
                        Intent intt1=new Intent(getBaseContext(),CreatePoll.class);
                        startActivity(intt1);
                        break;
                    case 1:
                        Intent intt2=new Intent(getBaseContext(),Attendance.class);
                        startActivity(intt2);
                        break;
                    case 2:
                        Intent intt3=new Intent(getBaseContext(),StudentMarks.class);
                        startActivity(intt3);
                        break;
                    case 3:
                        Intent intt4=new Intent(getBaseContext(),StudentFee.class);
                        startActivity(intt4);
                        break;
                }
            }
        });
    }
}
