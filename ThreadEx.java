class exThreadClass extends Thread {

    @Override
    public void run() {
        int i = 0;
        for (i = 0; i <= 10; i++) {
            i++;
           System.out.println(i+" extending thread class ");
          
         
           
        }
    }
}

class exThreadClass2 extends Thread {

    @Override
    public void run() {
        int i = 0;
        for (i = 0; i <= 10; i++) {
            i++;
           System.out.println(i+"  extending thread class ");
           
        }
    }
}

class ex2thread implements Runnable {
    int i = 0;

    @Override

    public void run() {
        for (i = 0; i <= 10; i++) {
            i++;
            System.out.println(i+" implimanting runnable interface ");
            
        }

    }
}

class ex2thread2 implements Runnable {
    int i = 0;

    @Override

    public void run() {
        for (i = 0; i <= 10; i++) {
            i++;
            System.out.println(i+" implimanting runnable interface ");
           
        }

    }
}

public class ThreadEx {

    public static void main(String[] args) {

      exThreadClass t1 = new exThreadClass();
      exThreadClass2 t2 = new exThreadClass2();
      t1.setPriority(7);
      t2.setPriority(3);
      t1.start();
      t2.start();

        ex2thread ex= new  ex2thread();
        Thread thread1= new Thread(ex);

        ex2thread2 ex2= new ex2thread2();
        Thread thread2= new Thread(ex2);

         thread1.start();
         thread2.start();


    }

}
