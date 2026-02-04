public class Overloading_No{
    int sum(int a){
        return (a*3);
    }
    int sum(int a, int b){
        return (a+b);
    }
    double sum(int a, int b, int c ){
        return (double)(a+b+c);
    }

    public static void main(String[] args) {
        Overloading_No obj = new Overloading_No();
        System.out.println("Sum with one parameter: " + obj.sum(5));
        System.out.println("Sum with two parameters: " + obj.sum(5, 10));
        System.out.println("Sum with three parameters: " + obj.sum(5, 10, 15));
    }
}