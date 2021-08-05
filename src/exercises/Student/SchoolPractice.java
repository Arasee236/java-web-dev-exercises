package exercises.Student;

public class SchoolPractice {

    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!

        Student Arasi = new Student("Arasi",1001,34,4.3);
        Arasi.addGrade(15,3.5);
        String gradeLevel = Arasi.getGradeLevel();
        System.out.println("The student is a "+ gradeLevel);
    }


}
