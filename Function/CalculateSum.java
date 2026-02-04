import java.util.Scanner;
public class CalculateSum{
    public static int sum(int a, int b){
        return a + b;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to sum: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = sum(a, b);
        System.out.println("The sum is: " + result);
        sc.close();
    }
}