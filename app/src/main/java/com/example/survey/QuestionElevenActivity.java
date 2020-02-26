package com.example.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class QuestionElevenActivity extends AppCompatActivity {
    Button btn_next11;
    RadioButton rb1,rb2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_eleven);
        rb1=findViewById(R.id.radioGroup11_1);
        rb2=findViewById(R.id.radioGroup11_2);
        btn_next11=findViewById(R.id.btn_next11);
        btn_next11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(rb1.isChecked()||rb2.isChecked()){
                    Intent i= new Intent(QuestionElevenActivity.this,QuestionTwleveActivity.class);
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
