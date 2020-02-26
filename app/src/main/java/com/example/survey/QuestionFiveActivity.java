package com.example.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class QuestionFiveActivity extends AppCompatActivity {
    Button btn_next5;
    CheckBox cb1,cb2,cb3,cb4,cb5,cb6,cb7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_five);
        btn_next5=findViewById(R.id.btn_next5);
        cb1=findViewById(R.id.cb_5_1);
        cb2=findViewById(R.id.cb_5_2);
        cb3=findViewById(R.id.cb_5_3);
        cb4=findViewById(R.id.cb_5_4);
        cb5=findViewById(R.id.cb_5_5);
        cb6=findViewById(R.id.cb_5_6);
        cb7=findViewById(R.id.cb_5_7);
        btn_next5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cb1.isChecked()||cb2.isChecked()||cb3.isChecked()||cb4.isChecked()||cb5.isChecked()||cb6.isChecked()||cb7.isChecked()){
                    Intent intent=new Intent(QuestionFiveActivity.this,QuestionSixActivity.class);
                    startActivity(intent);
                }

                else {
                    Toast toast=Toast.makeText(getApplicationContext(),"Please select one.",Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER,0,0);
                    toast.show();
                }




            }
        });
    }
}
