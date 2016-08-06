package com.anvil.mappr;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;


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
        toolbar.setTitle("Mappr");
        list= (ListView) findViewById(R.id.list_admin);
        Resources res=getResources();
        AdminActivities=res.getStringArray(R.array.AdminList);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,AdminActivities);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(position){
                    case 1:
                        Intent intt1=new Intent(this,CreatePoll.class);
                        startActivity(intt1);
                        break;
                    case 2:
                        Intent intt2=new Intent(this,Attendence.class);
                        startActivity(intt2);
                        break;
                    case 3:
                        Intent intt3=new Intent(this,StudentMakes.class);
                        startActivity(intt3);
                        break;
                    case 4:
                        Intent intt4=new Intent(this,StudentFees.class);
                        startActivity(intt4);
                        break;
                }
            }
        });
    }
}
