public class Main {

    public static void main(String[] args) {
    StudentProfiel studentProfielA = new StudentProfiel("abdu","moh","maths",3.8,2022);
    StudentProfiel studentProfielB = new StudentProfiel("zak","alex","bilogy",3.9,2023);
    studentProfielA.incrementGraduationYear();
        System.out.println(studentProfielA.expectedGraduationYear);
    }

    }
