public class CalculateProduct {
    public static int multiply(int a, int b){
        return a * b;
    }
    public static void main(String[] args){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter two numbers to multiply: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = multiply(a, b);
        System.out.println("The product is: " + result);
        sc.close();
    }
}
