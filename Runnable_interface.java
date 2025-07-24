class ex2thread implements Runnable {
      int i = 0;

      @Override

      public void run() {
            int a = 0;
            while (a <= 10) {

                  System.out.println(" even number " + (i));
                  i = i + 2;
                  a++;

            }

      }
}

class ex2thread2 implements Runnable {
      int i = 0;

      @Override

      public void run() {
            int a = 0;
            while (a <= 10) {
                  i = i + 2;

                  System.out.println(" odd number " + (i = i + 2));
                  a++;
            }

      }
}

public class Runnable_interface {

      public static void main(String[] args) {

            ex2thread ex = new ex2thread();
            Thread thread1 = new Thread(ex);

            ex2thread2 ex2 = new ex2thread2();
            Thread thread2 = new Thread(ex2);

            thread1.start();
            thread2.start();

      }

}
