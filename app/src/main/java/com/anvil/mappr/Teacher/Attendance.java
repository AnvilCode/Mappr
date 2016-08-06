package com.anvil.mappr.Teacher;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.anvil.mappr.R;

/**
 * Created by RAJEEV YADAV on 8/6/2016.
 */
public class Attendance extends AppCompatActivity {
  String[] rollno;
    ListView list;
    Resources res;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.attendance);
        res=getResources();
        rollno=getResources().getStringArray(R.array.RollNo);
        list= (ListView) findViewById(R.id.list);
        myAdapter adapter=new myAdapter(this,rollno);
        list.setAdapter(adapter);
    }

}

class  myAdapter extends ArrayAdapter<String>
{
    Context context;
    String[] roll;
    myAdapter(Context c,String[] roll)
    {
super(c,R.layout.single_attendance_layout,R.id.roll_no);
        context=c;
        this.roll=roll;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row= inflater.inflate(R.layout.single_attendance_layout,parent,false);
        TextView rollArray= (TextView) row.findViewById(R.id.roll_no);
        rollArray.setText(roll[position]);
        return row;
    }
}
