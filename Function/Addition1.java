package Function;

public class Addition1
{
    public static void add(int a, int b){
        System.out.println("The Sum is : "+ a+b);
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter Two Numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        //Calling the add Function

        add(a,b);
        sc.close();
    }
}
