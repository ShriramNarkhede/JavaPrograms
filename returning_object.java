class Addtion{
      Addtion a,b;
      Addtion( int a, int b){
            System.out.println("sum is"+a+b);
            
      }

       Addtion meth(int a ,int b){
             this.a=a;
             
            System.out.println("vars are "+a+" "+b);
            return Addtion(a,b);
      }
       

     
     
}
public class returning_object {
      
      public static void main(String[] args) {
            Addtion b,c;
            Addtion a= new Addtion(b,c);
      
      }
}
