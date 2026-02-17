package src.basics.Strings;

public class ImmutabilityDemo {
    public static void main() {
        String s = "hello";
        System.out.println("Original" + s);
        s = s + "World"; //Creates new Object

        System.out.println(s);
    }
}
