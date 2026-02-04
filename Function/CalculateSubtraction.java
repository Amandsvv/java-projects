public class CalculateSubtraction {
    public static int subtract(int a, int b){
        return a - b;
    }
    public static void main(String[] args){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter two numbers to subtract: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = subtract(a, b);
        System.out.println("The subtraction result is: " + result);
        sc.close();
    }
}
