package org.launchcode.java.studios.Quiz;

public abstract class Question {

    private String question;
    private int points;

    public Question(String aQuestion, int aPoints){
        this.question = aQuestion;
        this.points = aPoints;
    }


    public void displayQuestion(){
        System.out.println(this.question);
    }

    public int getPoints(){
        return points;
    }

    public void setPoints(int aPoints){
        this.points = aPoints;
    }

    public abstract void displayOptions();
    public abstract int getAnswers();
}
