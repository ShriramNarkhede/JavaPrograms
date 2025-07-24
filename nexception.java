import java.util.*;
class ownException extends Exception{

      ownException(){
            System.out.println("Can't apply  For DL");
      }
      
}

class nexception{
      public static void main(String[] args) {
            Scanner s= new Scanner(System.in);
            System.out.println("ENTER YOUR AGE ");
            int a=s.nextInt();
            try {
                 
                  if (a<18) {
                        throw new ownException();                        
                  }
                  else{
                        System.out.println("Now you can apply for driveing licence ");
                  }
            } catch (ownException e) {
                  System.out.println(e+" Occurs");
            }
      }
}