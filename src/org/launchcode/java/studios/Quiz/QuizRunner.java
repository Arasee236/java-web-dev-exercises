package org.launchcode.java.studios.Quiz;

import java.util.ArrayList;
import java.util.Arrays;

public class QuizRunner {
    public static void main(String[] args){
        ArrayList<Question> questionList = new ArrayList<>();

        String aQuestion1 = "Polymorphism refers to : ";
        ArrayList<String> options1 = new ArrayList<String>(Arrays.asList("One object inheriting another","An abstract class with many classes extending from it","The practice of storing an object of one type in a variable of another type","Shapeshifting"));
        MultipleChoice question1 = new MultipleChoice(aQuestion1,1,options1,"The practice of storing an object of one type in a variable of another type");
        questionList.add(question1);

        String aQuestion2 = "What are the pillars of object oriented programming : ";
        ArrayList<String> options2 = new ArrayList<String>(Arrays.asList("Encapsulation", "Documentation","Abstraction","Unit Testing", "Inheritance" ,"Polymorphism"));
        ArrayList<String> correctAnswers = new ArrayList<String>(Arrays.asList("Encapsulation", "Abstraction", "Inheritance", "Polymorphism"));
        CheckBox question2 = new CheckBox(aQuestion2,4,options2,correctAnswers);
        questionList.add(question2);

        String aQuestion3 = "A class derived from an abstract class must implement all of the abstract methods it inherits.";
        ArrayList<String> options3 = new ArrayList<String>(Arrays.asList("true" , "false"));
        TrueOrFalse question3 = new TrueOrFalse(aQuestion3,1,options3,"false");
        questionList.add(question3);

        Quiz newQuiz = new Quiz(questionList);
        newQuiz.runQuiz(questionList);
        newQuiz.calculateTotalPoints(questionList);
        newQuiz.gradequiz();
    }
}
