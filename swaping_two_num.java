import java.util.Scanner;
public class swaping_two_num {
      public static void main(String[] args) {
            int a,b,c;
            Scanner s1= new Scanner(System.in);
            System.out.println("enter value a,b ");
            a=s1.nextInt();
            b=s1.nextInt();
            System.out.println("value of a is "+a);
            System.out.println("value of b is "+b);
            c=b;
            b=a;
            a=c;
            System.out.println("\n\n\nvalue of a is "+a);
            System.out.println("value of b is "+b);      
      }      
}
