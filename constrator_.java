import java.util.Scanner;

class addtion {
    private int x;
    private int y;

    addtion(int a, int b) {
        x = a;
        y = b;
    }

    int getdeta() {
        int z = x*y ;
        return z;
    }
};

public class constrator_{
    public static void main(String[] args){
        System.out.println("enter two number ");
        Scanner S= new Scanner(System.in);
        int a = S.nextInt();
        int b = S.nextInt();        
        addtion A1 = new addtion(a, b);
       int  c = A1.getdeta();

       System.out.println(" AREA OF RECTANGLE is ......: "+c);
        S.close();

    }
}