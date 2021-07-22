package exercises;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;



public class hashMapPractice {
    public static void main (String[] args){

        HashMap<Integer,String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter your students (or ENTER to finish):");

        // Get student names and grades
        do {

            System.out.print("Student: ");
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                System.out.print("Student ID: ");
                Integer newStudentID = input.nextInt();
                students.put(newStudentID , newStudent);

                // Read in the newline before looping back
                input.nextLine();
            }

        } while(!newStudent.equals(""));
        input.close();

        // Print class roster
        System.out.println("\nClass roster:");


        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getValue() + "'s ID is " + student.getKey());

        }


        System.out.println("Number of Students in class is " + students.size());
    }
}