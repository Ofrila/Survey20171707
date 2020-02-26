package com.example.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class QuestionSixActivity extends AppCompatActivity {
    Button btn_next6;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_six);
        btn_next6=findViewById(R.id.btn_next6);
        editText=findViewById(R.id.et_question6);

        btn_next6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if(editText.toString().isEmpty()){
                   Toast toast=Toast.makeText(getApplicationContext(),"Please input.",Toast.LENGTH_SHORT);
                   toast.setGravity(Gravity.CENTER,0,0);
                   toast.show();
               }
               else {
                   Intent i=new Intent(QuestionSixActivity.this,QuestionSevenActivity.class);
                   startActivity(i);
               }
            }
        });
    }
}
