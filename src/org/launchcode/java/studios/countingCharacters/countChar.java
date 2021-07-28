package org.launchcode.java.studios.countingCharacters;

import java.util.*;
import java.io.*;

public class countChar {
    public static void main(String[] args) throws FileNotFoundException{

        Scanner input = new Scanner(System.in);

        String passage = "";
        passage = new Scanner(new File("C:\\Users\\arase\\OneDrive\\Desktop\\coder_girl\\Java\\java-web-dev-exercises\\src\\org\\launchcode\\java\\studios\\datafile.txt")).useDelimiter("\\Z").next();



        String newPassage = passage.toLowerCase();
        newPassage = newPassage.replaceAll("[^a-zA-Z]", "");

        char[] charactersInString = newPassage.toCharArray();


        HashMap<Character, Integer> characters = new HashMap<>();

        List<String> t = new ArrayList<>();

        for (char letter : charactersInString) {


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


}
