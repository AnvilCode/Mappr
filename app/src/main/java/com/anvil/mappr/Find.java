package com.anvil.mappr;

import android.content.Intent;

import java.util.ArrayList;
import java.util.List;


public class Find {
    List<String> getFruits(String color) {
        List<String>fruits = new ArrayList<String>();
        if (color.equals("Student")) {
           // Intent intent=new Intent(this,StudentActivity.class);

        }
        else if(color.equals("Teacher")) {
          //  Intent intent=new Intent(this,TeacherActivity.class);
        }
        else if(color.equals("Institute")){
            //Intent intent=new Intent(this,InstituteActivity.class);
        }
        else if(color.equals("Admin")){
            Intent intent=new Intent(this,AdminActivity.class);
        }
        else if(color.equals("Parent")){
          //  Intent intent=new Intent(this,ParentActivity.class);
        }
        return fruits;
    }
}
