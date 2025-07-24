import java.util.Scanner;

public class persentage_count 
{
    public static void main(String[] args) 
     {
        Scanner s1 = new Scanner(System.in);

        System.out.println(" Enter your marks obtain in :");

        System.out.println("oop");
        float Op = s1.nextFloat();

        System.out.println("DSU");
        float dc = s1.nextFloat();

        System.out.println("CGR");
        float cr = s1.nextFloat();

        System.out.println("DTE");
        float de = s1.nextFloat();

        System.out.println("DBMS");
        float ds = s1.nextFloat();


        float per = Op+dc+cr+de+ds;

        System.out.print("Total marks obtain out of 500 :");
        System.out.println(per);

        per=per/5;




        System.out.print("YOUR PERSENTAGE IS :");
        
        System.out.print(per);

    }
}
