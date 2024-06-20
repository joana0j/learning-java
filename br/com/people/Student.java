package br.com.people;

public class Student {
    String studentName;
    String studentBachelor;
    int studentAge;


    void studentDatasheet() {
        System.out.println("------ Student Information ------");
        System.out.println("Name: " + studentName);
        System.out.println("Age: " + studentAge);
        System.out.println("Bachelor: " + studentBachelor);
        System.out.println("---------------------------------");
    }

    public static void main(String[] args) {
        Student student501 = new Student();

        student501.studentName = "Joana";
        student501.studentAge = 23;
        student501.studentBachelor = "Information Systems";
        student501.studentDatasheet();

    }
}
