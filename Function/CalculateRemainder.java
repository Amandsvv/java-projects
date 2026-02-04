public class CalculateRemainder {
    public static int remainder(int a, int b){
        return a % b;
    }
    public static void main(String[] args){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter two numbers to find the remainder: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(b != 0){
            int result = remainder(a, b);
            System.out.println("The remainder is: " + result);
        } else {
            System.out.println("Error: Division by zero is not allowed.");
        }
        sc.close();
    }
}
