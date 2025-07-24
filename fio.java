import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;


class fio {
      public static void main(String[] args) throws Exception {
            int lineCount = 0, wordCount = 0;
            String line = "";
            BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
            FileWriter fw = new FileWriter("Sample.txt");

            // create text file for writing
            System.out.println("Enter data to be inserted in file: ");
            String fileData = br1.readLine();
            fw.write(fileData);
            fw.close();
            
            
            BufferedReader br = new BufferedReader(new FileReader("Sample.txt"));
            while ((line = br.readLine()) != null) {
                  lineCount++; 
                  String[] words = line.split(" ");
                  wordCount = wordCount + words.length;
                  
            }
            
            System.out.println("Number of lines is : " +lineCount);
            System.out.println("Number of words is : " +wordCount);
      }
}