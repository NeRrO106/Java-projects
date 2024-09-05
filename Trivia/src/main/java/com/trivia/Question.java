package com.trivia;

public class Question{
    private String question;
    private String[] options;
    private int correctAnswer;

    public Question(String question, String[] options, int correctIndex){
        this.question = question;
        this.options = options;
        this.correctAnswer = correctIndex;
    }
    public String getQuestion(){
        return question;
    }

    public String[] getOptions(){
        return options;
    }

    public boolean isCorrect(int index){
        return correctAnswer == index;
    }
}
