import java.util.Scanner;
class Area {
    Scanner s = new Scanner(System.in);

    void areaOfcircle() {
        System.out.println("Enter radius of circle :");
        float a = s.nextFloat();
        double ans = 3.14 * a * a;
        System.out.println(" ------Area of circle is :" + ans);
    }

    void areaOfTriangle() {
        System.out.println("Enter base and hight of Triangle :");
        float b = s.nextFloat();
        float h = s.nextFloat();
        double ans = 0.5 * b * h;
        System.out.println(" ------Area of Triangle with base " + b + " and hight " + h + " is = :" + ans);
    }

    void areaOfSquare() {
        System.out.println("Enter length  of square  :");
        float l = s.nextFloat();
        double ans = l * l;
        System.out.println("------Area of Square with length " + l + " is = :" + ans);
    }

    void areaOfrectangle() {

        System.out.println("Enter length  And width of rectangle  :");
        float l = s.nextFloat();
        float w = s.nextFloat();
        double ans = l * w;
        System.out.println(" ------Area of rectangle  with length " + l + " and width  " + w + " is = :" + ans);
    }

    void areaOfParallelogram() {

        System.out.println("Enter base and vertical hight of parallelogram :");
        float base = s.nextFloat();
        float vertical_hight = s.nextFloat();
        double ans = base * vertical_hight;
        System.out.println(" ------Area of parallelogram with base  " + base + " and vertical hight " + vertical_hight+ " is  = :" + ans);
    }

    void areaOfTrapezium() {

        System.out.println("Enter length of two parallel sides :");
        float la = s.nextFloat();
        float lb = s.nextFloat();

        System.out.println("Enter hight of trapezium :");

        float hight = s.nextFloat();
        double ans = 0.5 * (la + lb) * hight;
        System.out.println(" Area of trapezium  is = :" + ans);
    }
};

public class AreaOfShapes {
    public static void main(String[] args) {

        Scanner S1 = new Scanner(System.in);
       System.out.println("%%%%%%%%%%%%%%% AREA OF SHAPE %%%%%%%%%%%%%%%%%%%");

        System.out.println(" 1 for circle \n 2 for triangle \n 3 for square\n 4 for rectangle \n 5 for parallelogram \n 6 for trapezium\n\n");

        System.out.println(" \n*********Enter your choice *********");
        int choice = S1.nextInt();

        Area a1 = new Area();

        switch (choice) {
            case 1:
                a1.areaOfcircle();
                break;
            case 2:

                a1.areaOfTriangle();
                break;
            case 3:

                a1.areaOfSquare();
                break;

            case 4:

                a1.areaOfrectangle();
                break;

            case 5:

                a1.areaOfParallelogram();
                break;

            case 6:

                a1.areaOfTrapezium();
                break;
            default:
                System.out.println(" wrong choice");
                
                break;
        }

    }
}
