public class CalculateDivision {
    public static int divide(int a, int b){
        return a / b;
    }
    public static void main(String[] args){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter two numbers to divide: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(b != 0){
            int result = divide(a, b);
            System.out.println("The division result is: " + result);
        } else {
            System.out.println("Error: Division by zero is not allowed.");
        }
        sc.close();
    }
}
