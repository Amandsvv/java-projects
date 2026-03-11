package src.basics.Strings;

public class StringBuilderDemo {
    public static void main() {

        StringBuilder s = new StringBuilder("Java");
        s.append(" programming");
        s.insert(0,"Welcome to ");
        s.replace(11,22, "OOPS");
        System.out.println(s.toString());
    }
}
