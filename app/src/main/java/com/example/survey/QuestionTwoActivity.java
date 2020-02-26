package com.example.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class QuestionTwoActivity extends AppCompatActivity {
    Button btn_next2;
    RadioButton rb1,rb2,rb3,rb4,rb5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_two);
        btn_next2=(Button)findViewById(R.id.btn_next2);
        rb1=findViewById(R.id.radioGroup2_1);
        rb2=findViewById(R.id.radioGroup2_2);
        rb3=findViewById(R.id.radioGroup2_3);
        rb4=findViewById(R.id.radioGroup2_4);
        rb5=findViewById(R.id.radioGroup2_5);

        btn_next2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(rb1.isChecked()||rb2.isChecked()||rb3.isChecked()||rb4.isChecked()||rb5.isChecked()){
                    Intent intent=new Intent(QuestionTwoActivity.this,QuestionThreeActivity.class);
                    startActivity(intent);
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
