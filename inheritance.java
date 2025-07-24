import java.util.Scanner;
import java.lang.String;

class base {
    Scanner S1 = new Scanner(System.in);
    String a, b, c;

    base() {

    }

    base(String a) {
        System.out.println("How are you " + a);
    }
};

class derived extends base {
    derived(String a, String b) {
        super(a);
        System.out.println(" Hiii " + a);
        System.out.println(" your age is " + b);
    }

};

class child extends derived {
    child(String a, String b, String c) {
        super(a, b);
        System.out.println(" your fevroite game is  " + c);

    }

}

public class inheritance {
    public static void main(String[] args) {
        child c = new child("shreeram", "17", "GTA 5");

    }
}
