package src.basics.Strings;

public class StringMethodsDemo {
    public static void main() {
        String str = " java Programming ";
        System.out.println("Length : " + str.length());
        System.out.println("Char at 2 : " + str.charAt(2));
        System.out.println("Substring (5,16) : " + str.substring(5, 16));
        System.out.println("Lower case : " + str.toLowerCase());
        System.out.println("Upper case : " + str.toUpperCase());
        System.out.println("Trim : " + str.trim() + "'");
    }
}
