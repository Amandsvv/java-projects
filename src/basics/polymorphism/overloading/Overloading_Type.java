public class Overloading_Type{
    long sum(int a){
        return (long)(a*100000);
    }
    long sum(int a, long b){
        return (long)(a+b);
    }
    long sum(long a, long b ){
        return (long)(a+b);
    }

    public static void main(String[] args) {
        Overloading_Type obj = new Overloading_Type();
        System.out.println("Sum with one int parameter: " + obj.sum(5));
        System.out.println("Sum with int and long parameters: " + obj.sum(5, 100000L));
        System.out.println("Sum with two long parameters: " + obj.sum(100000L, 200000L));
    }
}