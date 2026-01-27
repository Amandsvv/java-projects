public class Car{
    static void print(int n){
        if(n < 1) return;
        print(n-1);
        System.out.println(n);
    }

    public static void main(String[] args){
        System.out.println("Started");
        print(5);
    }
}