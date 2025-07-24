import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.Vector;

class example {

}

public class vector1 {
    public static void main(String[] args) {

        Vector v = new Vector<>();
        v.add(55);
        v.add(88)  ;
        v.add(45);
        v.add(11);
        v.add(999);

        v.insertElementAt(77, 1);
        System.out.println(v);

        v.remove(3);
        System.out.println(v);
        try {
            Scanner s = new Scanner(System.in);
            System.out.println("enter txt ");
            String ss = s.next();
            FileWriter f = new FileWriter("sample2.txt");
            f.write(ss);
            f.close();

            FileReader g= new FileReader("sample2.txt");
            char [] a= new char[100];
        
            g.read(a);
        System.out.println(a);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
