package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView t9=(TextView)findViewById(R.id.t9);
        TextView t8=(TextView)findViewById(R.id.t8);
        TextView t7 = (TextView) findViewById(R.id.t7);
        TextView t10= (TextView) findViewById(R.id.t10);
        TextView t11= (TextView) findViewById(R.id.t11);

        Intent intent=getIntent();
        String name = intent.getStringExtra("name_key");
        String branch=intent.getStringExtra("branch_key");
        String gender=intent.getStringExtra("gender_key");
        int id=intent.getIntExtra("id_key",0);
        int age=intent.getIntExtra("age_key",0);
        t7.setText(name);
        t9.setText(branch);
        t11.setText(gender);
        t8.setText(id+"");
        t10.setText(age+"");
    }

}
