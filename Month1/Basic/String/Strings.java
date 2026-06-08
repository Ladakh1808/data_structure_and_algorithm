import java.util.*;

public class Strings {
    public static void main(String args[]){
        String name = "Aniket";
        System.out.println(name);

        // String Methods
        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.startsWith("A"));
        System.out.println(name.endsWith("t"));
        System.out.println(name.charAt(0));
        System.out.println(name.indexOf("i"));
        System.out.println(name.lastIndexOf("i"));
        System.out.println(name.equals("Aniket"));
        System.out.println(name.equalsIgnoreCase("aniket"));

        // User Input
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(str);
    }
}
