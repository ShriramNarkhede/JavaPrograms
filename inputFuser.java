import java.util.Scanner;
public class inputFuser {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println(" 1 for Add\n 2 for substraction \n 3 for multiplication \n 4 for division \n:");
        System.out.print(" Enter your choice :");
        int ch = s.nextInt();
        System.out.println(" Enter value for num1 and num2 :");
        float num1 = s.nextFloat();
        float num2 = s.nextFloat();

        switch (ch) {
            case 1:
                System.out.print(num1 + num2);
                break;
            case 2:
                System.out.print(num1 - num2);
                break;
            case 3:
                System.out.print(num1 * num2);
                break;
            case 4:
                System.out.print(num1 / num2);
                break;
            default:
                System.out.println("Wrong input");
                break;
        }

    }
}
