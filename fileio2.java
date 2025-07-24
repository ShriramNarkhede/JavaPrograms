import java.io.*;
import java.util.Scanner;
class fileio2{
      public static void main(String[] args) {
            
            try {
                  Scanner s1 = new Scanner(System.in);
                  File f = new File("sample2.txt");
                  System.out.println("enter your name ");
                  String s = s1.next();
                  f.createNewFile();
                  System.out.println(f);
                  f.canWrite(    );
            } catch (Exception e) {
                  e.printStackTrace();
            }
           
      }
}