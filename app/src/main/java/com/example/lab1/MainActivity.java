package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView questionView; //question
    TextView answerView;  //answer

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       questionView =(TextView)findViewById(R.id.flashcard_question);
       answerView = (TextView)findViewById(R.id.flashcard_answer);
       answerView.setVisibility(View.INVISIBLE); //hides the answer


        questionView.setOnClickListener(new View.OnClickListener() {
           @Override
           //removes the question when it is clicked and shows the answer instead
           public void onClick(View v) {
//               Intent intent = new Intent(MainActivity.this)
               if(questionView.getVisibility() == View.VISIBLE) {
                   questionView.setVisibility(View.GONE);
                   }

               if(answerView.getVisibility() == View.INVISIBLE){
                   answerView.setVisibility(View.VISIBLE);
               }

           }
       });
    }
}
