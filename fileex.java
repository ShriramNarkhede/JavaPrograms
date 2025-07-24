import java.io.*;
import java.util.Scanner;
public class fileex {
      public static void main(String[] args) {
            char [] c= new char[100];
            String s="";

            try {
                  FileWriter f1= new FileWriter("sample2.txt");
                  System.out.println("enter txt");
                  Scanner s1= new Scanner(System.in);
                  s=s1.next();
                  f1.write(s);
                  f1.close();


                  FileReader f2= new FileReader("sample2.txt");
                  f2.read(c);
                  System.out.println(c);
                  f2.close();

            
            } catch (Exception e) {
                e.printStackTrace();
            }

      }
      
}
