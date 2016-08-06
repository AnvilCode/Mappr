package com.anvil.mappr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.Spinner;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    Find expert=new Find();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void signup(){
        Spinner sign=(Spinner)findViewById(R.id.spinner);
        String signupas = String.valueOf(sign.getSelectedItem());
        List<String> brandsList = expert.getFruits(signupas);



    }
}
