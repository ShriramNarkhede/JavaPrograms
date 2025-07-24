import java.util.Vector;
public class vector {
public static void main(String[] args) {
    Vector v= new Vector<>();
    v.add("hiii");
    v.add("you ");
    v.add("are ");
    v.add("unforggetable ");
  System.out.println( v.elementAt(1));
  v.remove(0); 


    System.out.println(v);
    Vector v1= new Vector<>();
    v1.add(77);
    v1.add("uuuu");
    System.out.println(v1);
}    
}
