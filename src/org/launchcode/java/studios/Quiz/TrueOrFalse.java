package org.launchcode.java.studios.Quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class TrueOrFalse extends Question{
    private ArrayList<String> options;
    String correctAnswer;

    public TrueOrFalse(String aQuestion, int aPoints, ArrayList<String> aOptions, String aCorrectAnswer){
        super(aQuestion,aPoints);
        this.options = aOptions;
        this.correctAnswer= aCorrectAnswer;
    }

    @Override
    public void displayOptions(){
        for(String option : this.options){
            System.out.println(option);
        }
    }

    public boolean isCorrectAnswer(String userAnswer){
        return (userAnswer.equalsIgnoreCase(correctAnswer));
    }

    @Override
    public int getAnswers(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the correct answer : ");
        String userAnswer = input.next();
       // while((userAnswer.toLowerCase() != "true") || (userAnswer.toLowerCase() != "false")){
        while (!(options.stream().anyMatch(userAnswer::equalsIgnoreCase))) {
            System.out.println("Invalid input. Enter either True or False : ");
            userAnswer = input.next();
        }
        System.out.println("The correct answer is : " + this.correctAnswer);
        System.out.println("You entered : " + userAnswer);
        if(isCorrectAnswer(userAnswer)){
         //   System.out.println("The answer is correct and you scored 1 point.");
            return 1;
        }
        else {
         //   System.out.println("The answer is wrong");
            return 0;
        }
    }

}
