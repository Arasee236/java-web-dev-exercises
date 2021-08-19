package org.launchcode.java.studios.Quiz;

import java.util.ArrayList;

public class Quiz {
    private ArrayList<Question> questionList = new ArrayList<>();
    private int userScore = 0;
    private int totalPoints = 0;

    public Quiz(ArrayList<Question> aQuestionList) {
        this.questionList = aQuestionList;
    }

    public void addQuestion(Question aQuestion){
        this.questionList.add(aQuestion);

    }

    public void runQuiz(ArrayList<Question> aQuestionList) {
        for (Question question : aQuestionList) {
            System.out.println("*************************************************************");
            question.displayQuestion();
            question.displayOptions();
            this.userScore += question.getAnswers();
            System.out.println("*************************************************************");
        }
    }

        public int calculateTotalPoints(ArrayList<Question> aQuestionList){
            for(Question question : aQuestionList){
                totalPoints += question.getPoints();
            }
            return totalPoints;
        }

        public void gradequiz(){
           // float percentageScore = ((this.userScore / this.totalPoints)*100);
            System.out.println("You Scored "+this.userScore + " out of " + this.totalPoints);
            System.out.println("Your Scoring Percentage is " + (this.userScore *100/ this.totalPoints));

        }


}



