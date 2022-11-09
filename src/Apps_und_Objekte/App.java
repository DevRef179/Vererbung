package Apps_und_Objekte;

public class App {
    public static void main(String[] args) {
        Student myStudent = new Student(
                "Refki",
                "Meholli",
                "Grundschule",
                2.4,
                57,
                false);

        System.out.println();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(myStudent.fName);

        Student myStudent2 = new Student(
                "Refugee",
                "Mann",
                "Hauptschule",
                1.4,
                55,
                false);

        System.out.println();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(myStudent2.fName);
    }
}
