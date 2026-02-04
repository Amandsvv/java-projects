package basics.Inheritance;
public class Student extends Person {
    private int marks;

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public void displayInfo() {
        personInfo();
        System.out.println("Student Marks: " + marks);
    }
}