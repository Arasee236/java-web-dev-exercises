package org.launchcode.java.studios.Quiz;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class CheckBox extends Question{

    private ArrayList<String> options;
    private ArrayList<String> correctAnswers;

        public  CheckBox(String aQuestion, int aPoints, ArrayList<String> aOptions, ArrayList<String> aCorrectAnswers) {
            super(aQuestion, aPoints);
            this.options = aOptions;
            this.correctAnswers = aCorrectAnswers;
        }


        @Override
        public void displayOptions() {
        for (String option : this.options) {
            System.out.println(option);
        }
    }

//    public boolean isCorrectAnswer(ArrayList<String> userAnswers) {
//        Collections.sort(userAnswers, String.CASE_INSENSITIVE_ORDER);
//        Collections.sort(this.correctAnswers,String.CASE_INSENSITIVE_ORDER);
//        return userAnswers.equals(this.correctAnswers);
//    }

    public boolean isCorrectAnswer(String userAnswer) {
        //if(this.correctAnswers.contains(userAnswer.toLowerCase())){
        if(this.correctAnswers.contains(userAnswer)){
            return true;
        }
        else {
            return false;
        }
   }

    @Override
    public int getAnswers() {
        Scanner input = new Scanner(System.in);
        ArrayList<String> userAnswersArray = new ArrayList<>();
        System.out.println("Enter the correct answers : ");
        String userAnswer = input.nextLine();
        while (!(userAnswer.equals("0"))) {
            if (!(options.stream().anyMatch(userAnswer::equalsIgnoreCase))) {
                System.out.println("Invalid input. Enter any one of the given options : ");
                userAnswer = input.nextLine();
            } else if (userAnswersArray.contains(userAnswer)) {
                System.out.println("You already entered that answer. Please select a new option or press 0 to finish this question: ");
                userAnswer = input.nextLine();
            } else {
                userAnswersArray.add(userAnswer);
                System.out.println("Select another option or press 0 to finish this question : ");
                userAnswer = input.nextLine();
            }
        }
        System.out.println("The correct answer is : " + this.correctAnswers);
        System.out.println("You entered : " + userAnswersArray);
        int score = 0;
        for(String answer : userAnswersArray){

            if (isCorrectAnswer(answer)) {
                    score= score+1;
            }
        }
        return score;
    }
}






















