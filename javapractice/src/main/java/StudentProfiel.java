public class StudentProfiel {
    String firstName;
    String lastName;
    String declardMajor;
    double gpa;
    int expectedGraduationYear;

    public StudentProfiel(String firstName, String lastName, String declardMajor, double gpa, int expectedGraduationYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.declardMajor = declardMajor;
        this.gpa = gpa;
        this.expectedGraduationYear = expectedGraduationYear;
    }

    public void incrementGraduationYear(){
        this.expectedGraduationYear = this.expectedGraduationYear + 1;
    }
}
