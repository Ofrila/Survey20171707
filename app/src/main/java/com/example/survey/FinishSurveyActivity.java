package com.example.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FinishSurveyActivity extends AppCompatActivity {
     Button finish;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.finish_survey);
        finish=findViewById(R.id.btn_finish);
       finish.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent i=new Intent(FinishSurveyActivity.this,MainActivity.class);
               startActivity(i);
           }
       });
    }
}
