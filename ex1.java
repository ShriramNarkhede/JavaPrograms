import java.util.Scanner;

public class ex1 {
   public static void main(String[] args) {
      int num,fact=1;
      Scanner s= new Scanner(System.in);
      num=s.nextInt();
      
      while( num>0) {
            fact= fact*num;
            num--;

      }
      System.out.println(fact);
}   
}
