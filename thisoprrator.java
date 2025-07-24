class ex1 {
      int a;
      void methd1(int a){
            System.out.println("value of b is"+a);
            a=this.a;
            System.out.println("value of b is"+a);
      }
      
}
public class thisoprrator {

      public static void main(String[] args) {

            ex1 ex=new ex1();
            ex.methd1(99);
            
      }
      
}
