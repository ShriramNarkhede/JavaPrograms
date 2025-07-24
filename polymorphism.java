 interface gps{
    void location();
}

interface snap{
    void Snapshot();
}

interface RecordIn4k{
    void record4k();
}
class phone{
     void call(int  a){
         System.out.println("Calling "+a);
     }
}


class smartphone extends phone implements gps,snap,RecordIn4k{
    public void Snapshot(){
            System.out.println("taking a snap ...");
    }
    public void record4k(){
        System.out.println(" recording video in 4k ");

    }
     public void location(){
         System.out.println(" turning on location ");
        
    }
    void camera(){
        System.out.println("click A picture");
    }
}
public class polymorphism {
    public static void main(String[] args) {

        gps G=  new smartphone();
        G.location();

        snap S = new smartphone();
        S.Snapshot();

         RecordIn4k R = new smartphone();
         R.record4k();


        
        
    }
    
}
