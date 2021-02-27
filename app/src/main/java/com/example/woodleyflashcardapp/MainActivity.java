package com.example.woodleyflashcardapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView questionTextView = findViewById(R.id.flashcard_question);
        TextView answerTextView = findViewById(R.id.flashcard_answer);
        TextView answers1 = findViewById(R.id.answer1);
        TextView answers2 = findViewById(R.id.answer2);
        TextView answers3 = findViewById(R.id.answer3);
        ImageView eyebutton = findViewById(R.id.toggle_choices_visibility);


        eyebutton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                boolean isShowingAnswers = true;
                eyebutton.setImageResource(R.drawable.eyeoff);
                if (isShowingAnswers) {
                    answers1.setVisibility(View.VISIBLE);
                    answers2.setVisibility(View.VISIBLE);
                    answers3.setVisibility(View.VISIBLE);
                    eyebutton.setImageResource(R.drawable.eyeoff);
                    isShowingAnswers = false;

                } if (!isShowingAnswers){
                    answers1.setVisibility(View.INVISIBLE);
                    answers2.setVisibility(View.INVISIBLE);
                    answers3.setVisibility(View.INVISIBLE);
                    eyebutton.setImageResource(R.drawable.eyeon);

                }


            }
        });





        questionTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                questionTextView.setVisibility(View.INVISIBLE);
                answerTextView.setVisibility(View.VISIBLE);

            }
        });
        answerTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                questionTextView.setVisibility(View.VISIBLE);
                answerTextView.setVisibility(View.INVISIBLE);
            }
        });

        // Change answers background color to verify if true or false

        answers1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              findViewById(R.id.answer1).setBackgroundColor(getResources().getColor(R.color.my_red_color));

            }
        });
        answers2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.answer2).setBackgroundColor(getResources().getColor(R.color.my_red_color));

            }
        });
        answers3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.answer3).setBackgroundColor(getResources().getColor(R.color.my_green_color));

            }
        });


    }
}