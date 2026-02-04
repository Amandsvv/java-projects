package basics.Inheritance;

public class InheritanceDemo {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Alice";
        student.age = 20;
        student.setMarks(95);
        student.displayInfo();
        
        Person p = new Person();
        p.name = "Bob";
        p.age = 45;
        p.personInfo(); 
    }
}