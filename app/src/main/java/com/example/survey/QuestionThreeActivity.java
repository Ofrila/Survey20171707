package com.example.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class QuestionThreeActivity extends AppCompatActivity {
    Button btn_next3;
    RadioButton rb1,rb2,rb3,rb4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_three);
        btn_next3=(Button)findViewById(R.id.btn_next3);
        rb1=findViewById(R.id.radioGroup3_1);
        rb2=findViewById(R.id.radioGroup3_2);
        rb3=findViewById(R.id.radioGroup3_3);
        rb4=findViewById(R.id.radioGroup3_4);
        btn_next3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(rb1.isChecked()||rb2.isChecked()||rb3.isChecked()||rb4.isChecked()){
                    Intent i=new Intent(QuestionThreeActivity.this,QuestionFourActivity.class);
                    startActivity(i);
                }
                else{
                    Toast toast=Toast.makeText(getApplicationContext(),"Please select one.",Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER,0,0);
                    toast.show();
                }

            }
        });
    }
}
