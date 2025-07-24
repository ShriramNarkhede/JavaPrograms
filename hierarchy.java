import java.util.*;
interface salary {
      double Basic_salary=10000.00;
      void Basic_salary();
      
}
class employee{
      String name;
      int age;
      public  employee(String n,int a){
            name=n;
            age= a;
      }
      public void display(){
            System.out.println("name of employee is :"+name);
            System.out.println("age of employee is :"+age);
      }
}
class gross_salary extends employee implements salary {
      double ta,da,hra,totalsal,bsal;
      String n1;
      int ag;
      gross_salary(double t,double d,double h,String n,int a){   
            super(n,a);         
            ta=t;
            da=d;
            hra=h;
            n1=n;
            ag=a;
           
      }

      @Override
      public void Basic_salary() {
            bsal=Basic_salary;
            System.out.println("basic salary "+bsal);
      }  
     public void totalsal(){
            totalsal = ta+da+hra+bsal;
            System.out.println("total salary = "+totalsal);
      }
}
public class hierarchy {
      public static void main(String[] args) {

        gross_salary g= new gross_salary(699.0,7666.9,746473.00,"shreeram",77);
        g.display();
        g.Basic_salary();
        g.totalsal();
        

      }
      
}
