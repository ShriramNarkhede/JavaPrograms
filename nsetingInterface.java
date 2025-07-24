package pac.p1;

class b{
      interface Msg{
            public void ms();
                 }

}
class m implements b.Msg{

      public void ms(){
            System.out.println("hiii my name is shreeram");
      }
}
public class nsetingInterface {
      public static void main(String[] args) {
            b.Msg message = new m();
            message.ms();

      }
}
