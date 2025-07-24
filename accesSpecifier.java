
class a{
      int s=1;      
      public int a=10;
      private int b= 77;
      protected int c= 77;
      public void disp() {
           System.out.println(a); 
           System.out.println(b);
           System.out.println(c);
           System.out.println(s);
      }

}
class b extends a{
      public void disp2() {
            System.out.println(a); 
            //System.out.println(b); we cannot acces  private variable outside of class
            System.out.println(c);
            System.out.println(s);
       }
      
}
public class accesSpecifier {
      public static void main(String[] args) {
            a a1= new a();
            b b1= new b();

            a1.disp();
            b1.disp2();


            System.out.println(a1.a);
            // System.out.println(a1.b);  we cannot acces  private variable outside of class
            System.out.println(a1.c);
            System.out.println(a1.s);
      }
      
}
