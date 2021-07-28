package org.launchcode.java.studios.countingCharacters;

import java.util.*;
import java.io.*;

public class countChar {
    public static void main(String[] args) throws FileNotFoundException{

        Scanner input = new Scanner(System.in);
//      String passage = "If the product of two terms is zero then common sense says at least one of the two terms has to " +
//              "be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a " +
//              "form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, " +
//              "it’s pretty straightforward from there." ;
        //System.out.println("Enter the String : ");
        //String passage = input.nextLine();
        String passage = "";
        passage = new Scanner(new File("C:\\Users\\arase\\OneDrive\\Desktop\\coder_girl\\Java\\java-web-dev-exercises\\src\\org\\launchcode\\java\\studios\\datafile.txt")).useDelimiter("\\Z").next();
       // System.out.println(passage);


        String newPassage = passage.toLowerCase();
        newPassage = newPassage.replaceAll("[^a-zA-Z]", "");

        char[] charactersInString = newPassage.toCharArray();

        //Welcome to coder girl
        HashMap<Character, Integer> characters = new HashMap<>();
        int count = 0;
        List<String> t = new ArrayList<>();

        for (char letter : charactersInString) {

            //count = countCharacter(charactersInString, letter);
            if(characters.containsKey(letter)){
                Integer charCount = characters.get(letter);
                characters.put(letter, charCount + 1);
            }
            else{
                characters.put(letter, 1);
            }

        }


        for (Map.Entry<Character, Integer> character : characters.entrySet()) {
            System.out.println(character.getKey() + " : " + character.getValue());

        }

        input.close();

    }

//    public static int countCharacter(char[] arr, char character) {
//        int total = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == character) {
//                total += 1;
//            }
//        }
//        return total;
//    }
}
