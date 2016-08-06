package com.anvil.mappr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

import com.anvil.mappr.Admin.AdminActivity;
import com.anvil.mappr.Guardian.GuardianActivity;
import com.anvil.mappr.Student.StudentActivity;
import com.anvil.mappr.Teacher.TeacherActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1= (Button) findViewById(R.id.login);
        Button button2 = (Button) findViewById(R.id.signup);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logIn(v);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getBaseContext(),SignUp.class);
                startActivity(intent);
            }
        });

    }
    public void logIn(View view){
        Spinner sign=(Spinner)findViewById(R.id.spinner);
        String signupas = String.valueOf(sign.getSelectedItem());
        if (signupas.equals("Student")) {
             Intent intent=new Intent(this,StudentActivity.class);
             startActivity(intent);
        }
        else if(signupas.equals("Teacher")) {
             Intent intent=new Intent(this,TeacherActivity.class);
            startActivity(intent);
        }
        else if(signupas.equals("Admin")){
            Intent intent=new Intent(this,AdminActivity.class);
            startActivity(intent);
        }
        else if(signupas.equals("Guardian")){
              Intent intent=new Intent(this, GuardianActivity.class);
            startActivity(intent);
        }


    }

}
