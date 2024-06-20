package br.com.people;

public class StudentAgain {
    private String student;
    private double mathGrade;
    private double biologyGrade;
    private double artGrade;

    //set
    public void setStudent(String student) {
        this.student = student;
    }
    public void setMathGrade(double mathGrade) {
        this.mathGrade = mathGrade;
    }
    public void setBiologyGrade(double biologyGrade) {
        this.biologyGrade = biologyGrade;
    }
    public void setArtGrade(double artGrade) {
        this.artGrade = artGrade;
    }

    //get
    public String getStudent() {
        return student;
    }
    public double getMathGrade() {
        return mathGrade;
    }
    public double getBiologyGrade() {
        return biologyGrade;
    }
    public double getArtGrade() {
        return artGrade;
    }

    public double calculateGrade() {
        return (mathGrade + biologyGrade + artGrade) / 3;

    }

    public static void main(String[] args) {
        StudentAgain student1 = new StudentAgain();
        StudentAgain student2 = new StudentAgain();

        student1.setStudent("Mei");
        student1.setMathGrade(9.5);
        student1.setBiologyGrade(6.3);
        student1.setArtGrade(5.5);

        student2.setStudent("Banguela");
        student2.setMathGrade(5.5);
        student2.setBiologyGrade(8.5);
        student2.setArtGrade(7.5);


        System.out.println("Student name: " + student1.getStudent() + "  | Mathematics: " + student1.getMathGrade() + " | Biology: " + student1.getBiologyGrade() + "  | Art: " + student1.getArtGrade() + " | Final Average: " + student1.calculateGrade());
        System.out.println();
        System.out.println("Student name: " + student2.getStudent() + "  | Mathematics: " + student2.getMathGrade() + " | Biology: " + student2.getBiologyGrade() + "  | Art: " + student2.getArtGrade() + " | Final Average: " + student2.calculateGrade());

    }
}
