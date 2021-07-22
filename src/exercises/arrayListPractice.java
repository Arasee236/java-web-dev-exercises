package exercises;

import java.util.ArrayList;
import java.util.*;
//import java.util.s

public class arrayListPractice {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(2);
        numberList.add(54);
        numberList.add(56);
        numberList.add(45);
        numberList.add(23);
        numberList.add(71);
        numberList.add(8);
        numberList.add(26);
        numberList.add(9);
        numberList.add(17);
        numberList.add(33);

        System.out.println(sumEven(numberList));

        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] words = phrase.split(" ");
        List<String> wordList =  Arrays.asList(words);
       // wordList=
        System.out.println("Enter a word length: ");
        int numChars = input.nextInt();
        searchWord(wordList,numChars);

    }
    public static int sumEven(ArrayList<Integer> arr)
    {
        int total =0 ;
        for (int i : arr)
        {
            if(i%2 == 0){
                total += i;
            }
        }
        return total;
    }

    public static void searchWord(List<String> arr,int length)
    {
        for (String word : arr){
            if(word.length() == length){
                System.out.println(word);

            }
        }
    }
}
