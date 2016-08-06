package com.anvil.mappr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button= (Button) findViewById(R.id.signup);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signup(v);
            }
        });
        Button b1=(Button)findViewById(R.id.login);
        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                log(v);
            }
        });
    }
    public void signup(View view){
        Spinner sign=(Spinner)findViewById(R.id.spinner);
        String signupas = String.valueOf(sign.getSelectedItem());
        if (signupas.equals("Student")) {
            // Intent intent=new Intent(this,StudentActivity.class);

        }
        else if(signupas.equals("Teacher")) {
            //  Intent intent=new Intent(this,TeacherActivity.class);
        }
        else if(signupas.equals("Institute")){
            //Intent intent=new Intent(this,InstituteActivity.class);
        }
        else if(signupas.equals("Admin")){
            Intent intent=new Intent(this,AdminActivity.class);
            startActivity(intent);
        }
        else if(signupas.equals("Parent")){
            //  Intent intent=new Intent(this,ParentActivity.class);
        }



    }
    public void log(View view){
        Spinner sign=(Spinner)findViewById(R.id.spinner);
        String signupas = String.valueOf(sign.getSelectedItem());
        if (signupas.equals("Student")) {
            // Intent intent=new Intent(this,StudentActivity.class);

        }
        else if(signupas.equals("Teacher")) {
            //  Intent intent=new Intent(this,TeacherActivity.class);
        }
        else if(signupas.equals("Institute")){
            //Intent intent=new Intent(this,InstituteActivity.class);
        }
        else if(signupas.equals("Admin")){
            Intent intent=new Intent(this,AdminActivity.class);
            startActivity(intent);
        }
        else if(signupas.equals("Parent")){
            //  Intent intent=new Intent(this,ParentActivity.class);
        }
    }
}
