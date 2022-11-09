package Apps_und_Objekte;

public class Student {
    String fName, lName, major;
    double gpa;
    int alter;
    boolean onProbation;

    public Student(String fName,
                   String lName,
                   String major,
                   double gpa,
                   int alter,
                   boolean onProbation) {
        this.fName = fName;
        this.lName = lName;
        this.major = major;
        this.gpa = gpa;
        this.alter = alter;
        this.onProbation = onProbation;
    }



}
