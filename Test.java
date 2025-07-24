import java.util.Scanner;
class circle{

      circle(Double f1){
            
            Double A= 3.14 * f1*f1;

            System.out.println("area of circle is "+A);
      }
}
class Test{
      public static void main(String[] args) {
            Scanner S1 = new Scanner(System.in); 
            System.out.println("Enter radius ");
            Double a = S1.nextDouble();
            circle c1 = new circle(a);

            
      }
}