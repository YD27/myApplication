package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import java.lang.String;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String name,branch;
    int finalage,finalid;
    private EditText et1;
    private EditText et2;
    private EditText et3;
    private EditText et4;
    private Button btn;
    private RadioGroup rg;
    private RadioButton rs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button)findViewById(R.id.btn);
        et1=(EditText)findViewById(R.id.et1);
        et2=(EditText)findViewById(R.id.et2);
        et3=(EditText)findViewById(R.id.et3);
        et4=(EditText)findViewById(R.id.et4);
        rg=(RadioGroup)findViewById(R.id.rg);

        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                name=et1.getText().toString();
                branch=et3.getText().toString();
                finalid=Integer.valueOf(et2.getText().toString());
                finalage=Integer.valueOf(et4.getText().toString());
                int select =rg.getCheckedRadioButtonId();
                rs=(RadioButton)findViewById(select);

                Intent intent=new Intent(getApplicationContext(),second.class);
                intent.putExtra("name_key", name);
                intent.putExtra("branch_key", branch);
                intent.putExtra("id_key", finalid);
                intent.putExtra("age_key", finalage);
                intent.putExtra("gender_key", rs.getText());
                startActivity(intent);
               // Toast.makeText(getApplicationContext(),"Name:"+name+"\n"+"Id:"+finalid+"\n"+"Branch:"+branch+"\n"+"Age:"+finalage+"\n"+"Gender:"+rs.getText()+"",Toast.LENGTH_LONG).show();
            }
        });


    }


}
