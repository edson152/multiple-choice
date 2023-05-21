package com.example.multiplechoice;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

@SuppressWarnings("ALL")
public class MainActivity extends AppCompatActivity {
Vibrator vibrator;
    private Questionlibrary mQuestionlibrary =new Questionlibrary();

    private TextView mScoreView;
    private TextView mfinalScore;
    private TextView mQuestionView;
    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;
    private Button mButtonChoice4;

    private  String mAnswer;
    private int mScore=0;
    private int mQuestionNumber=0;
    private TextView myScore;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);






        mScoreView = (TextView) findViewById(R.id.score);
        mQuestionView = (TextView) findViewById(R.id.question);
        mButtonChoice1 = (Button) findViewById(R.id.choice1);
        mButtonChoice2 = (Button) findViewById(R.id.choice2);
        mButtonChoice3 = (Button) findViewById(R.id.choice3);
        mButtonChoice4 = (Button) findViewById(R.id.choice4);


 updateQuestion();

        mButtonChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mButtonChoice1.getText() == mAnswer) {
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();





                    Toast.makeText(MainActivity.this,"*" ,Toast.LENGTH_SHORT).show();


                } else {
                    Toast.makeText(MainActivity.this," incorrect ",Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });
        mButtonChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mButtonChoice2.getText() == mAnswer) {
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();

                    Toast.makeText(MainActivity.this,"*" ,Toast.LENGTH_SHORT).show();


                } else {
                    Toast.makeText(MainActivity.this," incorrect ",Toast.LENGTH_SHORT).show();
                    updateQuestion();



                }
            }
        });     mButtonChoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mButtonChoice3.getText() == mAnswer) {
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();
                    Toast.makeText(MainActivity.this,"*" ,Toast.LENGTH_SHORT).show();


                } else {
                    Toast.makeText(MainActivity.this," incorrect ",Toast.LENGTH_SHORT).show();
                    updateQuestion();


                }
            }
        });     mButtonChoice4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mButtonChoice4.getText() == mAnswer) {
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();
                    Toast.makeText(MainActivity.this,"*" ,Toast.LENGTH_SHORT).show();


                } else {
                    Toast.makeText(MainActivity.this," incorrect ",Toast.LENGTH_SHORT).show();
                    updateQuestion();


                }
            }
        });

    }
    private void updateQuestion(){


        mQuestionView.setText(mQuestionlibrary.getQuestion(mQuestionNumber));
        mButtonChoice1.setText(mQuestionlibrary.getChoice1(mQuestionNumber));
        mButtonChoice2.setText(mQuestionlibrary.getChoice2(mQuestionNumber));
        mButtonChoice3.setText(mQuestionlibrary.getChoice3(mQuestionNumber));
        mButtonChoice4.setText(mQuestionlibrary.getChoice4(mQuestionNumber));

        mAnswer=mQuestionlibrary.getCorrectAnswer(mQuestionNumber);
        mQuestionNumber++;

    }
    public void updateScore(int point) {
        mScoreView.setText("" + mScore);
        return;

    }
public TextView getScore(int point){
        mfinalScore=mScoreView;
        return mfinalScore;
}

}

