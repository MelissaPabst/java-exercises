package school;


import java.util.Objects;

public class Student {

    public static final String FRESHMAN = "Freshman";
    public static final String SOPHOMORE = "Sophomore";
    public static final String JUNIOR = "Junior";
    public static final String SENIOR = "Senior";

    private static int nextStudentId = 1;
    private int studentId;
    private String name;
    private int numberOfCredits;
    private double gpa;
    private double qualityScore = 0.0;

    public Student(String name, int studentID, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentID;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId = nextStudentId + 1;
    }



    public void addGrade(int courseCredits, double grade) {
        //update the appropriate fields: numberOfCredits, gpa
        this.numberOfCredits = this.numberOfCredits + courseCredits;
        qualityScore = qualityScore + numberOfCredits * grade;
        gpa = Math.round((qualityScore / this.numberOfCredits) * 1000) / 1000;
    }

    public String getGradeLevel() {
        //determine the grade level of the student based on numberOfCredits

        if (this.getNumberOfCredits() < 30) {
            return FRESHMAN;
        } else if (this.getNumberOfCredits() >= 30 && this.getNumberOfCredits() < 60) {
            return SOPHOMORE;
        } else if (this.getNumberOfCredits() >= 60 && this.getNumberOfCredits() < 90) {
            return JUNIOR;
        } else if (this.getNumberOfCredits() >= 90) {
            return SENIOR;
        }

        return "Error";

    }

    //generated by intellij
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentId == student.studentId &&
                Objects.equals(name, student.name);
    }



    public String toString() {
        return "Student Name: " + name + "\n" +
                "Student ID: " + studentId + "\n" +
                "Credits: " + qualityScore + "\n" +
                "Quality Score: " + qualityScore + "\n" +
                "GPA: " + gpa;
    }

    // getters and setters

    public String getName() {
        return name;
    }

    public void setName(String aName) {
        name = aName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int aStudentId) {
        studentId = aStudentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }


    public static void main(String[] args) {

        Student student1 = new Student("Melissa", 1, 90, 4.0);
        Student student2 = new Student("Jane", 2);
        Student student3 = new Student("Ann");

        System.out.println(student3.toString());
    }
}
