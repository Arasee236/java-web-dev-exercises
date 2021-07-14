package exercises;
import java.util.Locale;
import java.util.Scanner;

public class searchWord {
    public static void main(String[] args){
        String passage = "Alice was beginning to get very tired of sitting by her sister on the bank, and " +
                "of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, 'and what is the use of a book,' " +
                "thought Alice 'without pictures or conversation?'";

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word to search : ");
        String searchTerm = input.nextLine();

        int length = searchTerm.length();

        int index = passage.toLowerCase().indexOf(searchTerm.toLowerCase());

        if(index == -1){
            System.out.println(searchTerm + " is not found in the passage.");
        }
        else{
            System.out.println(searchTerm+ " first appears at index " +index + " and the length of the given search term is " + length +".");
        }
        String modifiedPassage = passage.replace(searchTerm,"");
        System.out.println("The modified passage is : " +modifiedPassage );

    }
}
