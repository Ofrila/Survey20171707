package com.example.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class QuestionEightActivity extends AppCompatActivity {
    Button btn_next8;
    RadioButton rb1,rb2,rb3,rb4,rb5,rb6,rb7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_eight);
        btn_next8=findViewById(R.id.btn_next8);
        rb1=findViewById(R.id.radioGroup8_1);
        rb2=findViewById(R.id.radioGroup8_2);
        rb3=findViewById(R.id.radioGroup8_3);
        rb4=findViewById(R.id.radioGroup8_4);
        rb5=findViewById(R.id.radioGroup8_5);
        rb6=findViewById(R.id.radioGroup8_6);
        rb7=findViewById(R.id.radioGroup8_7);
        btn_next8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(rb1.isChecked()||rb2.isChecked()||rb3.isChecked()||rb4.isChecked()||rb5.isChecked()||rb6.isChecked()||rb7.isChecked()){
                    Intent i=new Intent(QuestionEightActivity.this,QuestionNineActivity.class);
                    startActivity(i);
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
