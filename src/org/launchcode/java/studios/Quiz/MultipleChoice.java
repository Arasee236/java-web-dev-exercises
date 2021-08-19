package org.launchcode.java.studios.Quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class MultipleChoice extends Question {
    private ArrayList<String> options;
    private String correctAnswer;

    public MultipleChoice(String aQuestion, int aPoints, ArrayList<String> aOptions, String aCorrectAnswer) {
        super(aQuestion, aPoints);
        this.options = aOptions;
        this.correctAnswer = aCorrectAnswer;
    }

    @Override
    public void displayOptions() {
        for (String option : this.options) {
            System.out.println(option);
        }
    }

    public boolean isCorrectAnswer(String userAnswer) {
        return (userAnswer.equalsIgnoreCase(this.correctAnswer));
    }

    @Override
    public int getAnswers() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the correct answer : ");
        String userAnswer = input.nextLine();
        while (!(options.stream().anyMatch(userAnswer::equalsIgnoreCase))) {
            System.out.println("Invalid input. Enter any one of the given options : ");
            userAnswer = input.nextLine();
        }
        System.out.println("The correct answer is : " + this.correctAnswer);
        System.out.println("You entered : " + userAnswer);
        if (isCorrectAnswer(userAnswer)) {
           // System.out.println("The answer is correct and you scored 1 point.");
            return 1;
        } else {
          //  System.out.println("The answer is wrong");
            return 0;
        }
    }
}










