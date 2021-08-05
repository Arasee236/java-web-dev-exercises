package exercises.Student;

public class Student {

        private static int nextStudentId = 1;
        private String name;
        private int studentId;
        private int numberOfCredits;
        private double gpa;

        public Student(String name, int studentId,
                       int numberOfCredits, double gpa) {
            this.name = name;
            this.studentId = studentId;
            this.numberOfCredits = numberOfCredits;
            this.gpa = gpa;
        }

        public Student(String name, int studentId) {
            this(name, studentId, 0, 0);
        }

        public Student(String name) {
            this(name, nextStudentId);
            nextStudentId++;
        }

        public String studentInfo() {
            return (this.name + " has a GPA of: " + this.gpa);
        }

        public void addGrade(int courseCredits, double grade) {
            // Update the appropriate fields: numberOfCredits, gpa
                double totalQualityScore = this.gpa * this.numberOfCredits;
                totalQualityScore += courseCredits * grade;
                this.numberOfCredits += courseCredits;
                this.gpa = totalQualityScore/this.numberOfCredits;
            }


        public String getGradeLevel() {
            // Determine the grade level of the student based on numberOfCredits
            String gradeLevel;
            if(this.numberOfCredits < 30) {
                gradeLevel = "Freshman";
            }
             else if(this.numberOfCredits < 60){
                gradeLevel = "Sophomore";
                }
             else if(this.numberOfCredits < 90) {
                gradeLevel = "Junior";
            }
             else {
                gradeLevel = "Senior";
            }

             return gradeLevel;
        }

        /* getters and setters omitted */
        public void setStudentId(int studentId){
            this.studentId = studentId;
        }

    public void setNumberOfCredits(int numberOfCredits){
        this.numberOfCredits = numberOfCredits;
    }

    public void setGpa(double gpa){
        this.gpa = gpa;
    }

    public String getName(){
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    public String toString() {
        String studentReport = String.format("%s is a %s with %d credits and a GPA of %.2f", this.name, this.getGradeLevel(), this.getNumberOfCredits(), this.getGpa());
        return studentReport;
    }

    public boolean equals(Object toBeCompared) {
        if (toBeCompared == this) {
            return true;
        }

        if (toBeCompared == null) {
            return false;
        }

        if (toBeCompared.getClass() != getClass()) {
            return false;
        }
        Student theStudent = (Student) toBeCompared;
        return theStudent.getStudentId() == getStudentId();

    }
}
