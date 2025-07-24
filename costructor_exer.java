package shreeram.inheritence;
import java.util.Random;
import java.util.Scanner;

class G_number {
    int Rn;
    int Gs;
    boolean b = true;
    Scanner s1 = new Scanner(System.in);

    G_number() {
        Random S = new Random(10);
        Rn = S.nextInt(1);
    }

    void takeUserInput() {

        System.out.println(" GUESS number.......");
        Gs = s1.nextInt();
    }

    void isCorrectNumber() {
        for(int i=0;i<=4;i++) {
            System.out.println(" enter number Between 1 TO 10 :");
            if (Rn == Gs) {
                System.out.println(" YOU won....");
            } else if (Gs > Rn) {
                System.out.println("You enter number IS gretter....");

            } else {
                System.out.println(" You enter number IS smaller....");
            }
        }

    }

};

class display {

};

public class costructor_exer {
    public static void main(String[] args) {
        G_number n1 = new G_number();
        n1.takeUserInput();
        n1.isCorrectNumber();
    }

}
