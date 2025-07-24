import java.util.Scanner;

public class strings {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        String S = "shreeram narkhede";
        String Se = "shreeram narkhede";
      
        System.out.println( S.replace( 's', 'O'));
        System.out.println(S.toUpperCase());
        System.out.println(S.toLowerCase());

        System.out.println(S.equalsIgnoreCase(Se));

        System.out.println(S.charAt(7));
        System.out.println(S.charAt(0));

        char e = 'e';

        System.out.println(S.length());
        System.out.println(S.endsWith("de"));
        System.out.println(S.substring( 0, 7));
        System.out.println(S.lastIndexOf("ram",7));
        s1.close();

    }
}
