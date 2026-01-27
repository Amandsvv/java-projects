import java.util.*;

public class StudentIdCard {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Student Age: ");
        int age = sc.nextInt();
        System.out.print("Enter Student Program: ");
        String program = sc.next();
        System.out.println("Enter Student Registration Number: ");
        long regNo = sc.nextLong();

        if(age > 17 && (program.equals("MCA") || program.equals("MBA") || program.equals("BCA")) && String.valueOf(regNo).length() > 0 ){
            System.out.println("\nStudent ID Card Details:");
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Program: " + program);
            System.out.println("Registration Number: " + regNo);
        } else {
            System.out.println("Student is not eligible for an ID card.");
        }
        sc.close();
    }
}
