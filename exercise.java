import java.util.Scanner;
import java.util.Random;

public class exercise {
    public static void main(String[] args) {
        System.out.println("0 for stone \n1 for paper \n2 for scissor ");

        int a, b;
        int i = 0;
        Scanner s = new Scanner(System.in);
        Random r = new Random();

        while (i <= 5) {

            System.out.println(" enter your choice ");
            int YC = s.nextInt();
            System.out.println(" computer choice :");
            int RA = r.nextInt(3);
            System.out.println(RA);
            switch (RA) {


                case 0:
                    
                    break;
            
                default:
                    break;
            }

        }
    }
}
