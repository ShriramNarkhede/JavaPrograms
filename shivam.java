import java.util.Scanner;

public class shivam {
      public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.println("enter a number ");
            int inp= s.nextInt();
            int countx=0;

            for(int i=0;i<=inp;i++)
            {
                  countx=countx+i;

                  //System.out.println("");
            
            }
            System.out.println("final addtion is "+countx);
      }
}
