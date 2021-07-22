package org.launchcode.java.studios.countingCharacters;
import java.util.*;

public class countChar {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
//      String passage = "If the product of two terms is zero then common sense says at least one of the two terms has to " +
//              "be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a " +
//              "form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, " +
//              "it’s pretty straightforward from there." ;
        System.out.println("Enter the String : ");
        String passage = input.nextLine();
        String newPassage = passage.toLowerCase();
        newPassage= newPassage.replaceAll("[^a-zA-Z]", "");

        char[] charactersInString = newPassage.toCharArray();

        HashMap<Character,Integer> characters = new HashMap<>();
        int count = 0;

        for (char letter : charactersInString) {

                count = countCharacter(charactersInString, letter);
                characters.put(letter, count);

        }
//        System.out.println("The given passage is : " + passage);
//        System.out.println("The modified passage is : " + newPassage);

        for (Map.Entry<Character, Integer> character : characters.entrySet()) {
            System.out.println(character.getKey() + " : " + character.getValue());

        }

        input.close();

    }

    public static int countCharacter(char[] arr , char character) {
        int total = 0;
        for (int i = 0; i < arr.length ; i++) {
         if (arr[i] == character ){
             total += 1;
         }
        }
        return total;
    }
}
