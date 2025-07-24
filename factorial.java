import java.util.*;
public class factorial {
public static void main(String[] args) {
      Scanner s = new Scanner (System.in);
      System.out.println("enter number");
      int a= s.nextInt();
      int fact=1;
      
      while (a>0) {
            fact=fact*a;
            a--;
      }
      System.out.println(fact);
}      
}
