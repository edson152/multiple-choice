package com.example.multiplechoice;

public class Questionlibrary {
    private String mQuestions[] = {
            "1.China has a ____________?",
            "2.Where do we find the Great Wall of China ",
            "3.how long is the Great Wall of China ?",
            "4.how many legs do you have ?",
            "The Capital city of China is______ ?",
    };

    private String mChoices[][] = {
            {"King", "Queen", "PrimeMinister", "President"},
            {"Beijing", "Huairou District", "Tianjin", "Cina"},
            {"21,196km", "26,7km", "62km", "7457km"},
            {"2", "9", "6", "5"},
            {"Zheijang", "Beijing", "Rome ", "Cairo"},
    };


    private String mCorrectAnswer[] = {"President", "Huairou District", "21,196km", "2", "Beijing"};


    public String getQuestion(int a) {
        String question= mQuestions [a];
        return question;
    }

    public String getChoice1(int a) {
        String choice1 = mChoices[a][0];
        return choice1;
    }

    public String getChoice2(int a) {
        String choice2 = mChoices[a][1];
        return choice2;

    }

    public String getChoice3(int a) {
        String choice3 = mChoices[a][2];
        return choice3;
    }

    public String getChoice4(int a) {
        String choice4 = mChoices[a][3];
        return choice4;
    }


    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswer[a];
        return answer;
    }
}




