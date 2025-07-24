abstract class Parent {
    int a;
    public void text() {
        System.out.println(8 + 9);
    }

    void C1() {
        System.out.println("hiii");
    }
    abstract void greet();
    abstract void SimpleAdd();

};

class parent2 extends Parent{
    void greet(){
        System.out.println("how are you .......");
    }
    void SimpleAdd(){
        System.out.printf(" HELLO VRO...");
    }
};
class child extends parent2{
    child(){
        System.out.println(" good morning  vmro ..");
    }
}

public class AbstarctClass {
    public static void main(String[] args) {
        parent2 p1 = new parent2();
        p1.SimpleAdd();
       // p1.C1();
       parent2 c1 = new child();
       c1.greet();

    }
}
