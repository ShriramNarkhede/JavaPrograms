import java.io.*;
import java.util.Scanner;

public class Filei_o {
      public static void main(String[] args) {
            try {

                  // Scanner s1 = new Scanner(System.in);

                  //FileWriter f1 = new FileWriter("sample.txt");

                  // System.out.println("enter Data ");
                  // String s = s1.nextLine();
                  // f1.write(s);
                  // f1.close();

                  // FileReader file = new FileReader("sample.txt");
                  // char[] array = new char[100];

                  // file.read(array);
                  // System.out.println(array);

                  // file.close();
                  File inputFile = new File("sample.txt");
                  File tempFile = new File("sample2.txt");

                  BufferedReader reader = new BufferedReader(new FileReader(inputFile));
                  BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

                  String lineToRemove = "bbb";
                  String currentLine;

                  while ((currentLine = reader.readLine()) != null) {
                        // trim newline when comparing with lineToRemove
                        String trimmedLine = currentLine.trim();
                        if (trimmedLine.equals(lineToRemove))
                              continue;
                        writer.write(currentLine + System.getProperty("line.separator"));
                  }
                  writer.close();
                  reader.close();
                  boolean successful = tempFile.renameTo(inputFile);

            } catch (IOException e) {

                  e.printStackTrace();
            }
      }
}
