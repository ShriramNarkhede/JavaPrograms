import java.util.Scanner;

class bank {
      int acNo = 0;
      String Name;
      long MobNO, balence;
      protected int pin, confPin;
      Scanner s = new Scanner(System.in);
      boolean isAc() {
            boolean a = false;
            if (acNo == 0) {
                  a = false;
            }
            return a;
      }

      void Details() {
            if (auth()) {
                  System.out.println("Hiiiii " + Name);
                  System.out.println("Mob no =" + MobNO);
                  System.out.println("Balence =" + balence);
            }

      }

      void CreateAC() {
            acNo = acNo + 1;
            System.out.println("Your Account no is " + acNo);
            System.out.println("Enter your name ..");
            Name = s.nextLine();

            System.out.println("Enter your mobile no...");
            MobNO = s.nextLong();

            System.out.println("Set Four Pin for your account ");
            pin = s.nextInt();
            System.out.println("Conform Pin ");
            confPin = s.nextInt();
            if (pin != confPin) {
                  System.out.println("You Enterd wrong PIN Try Again ");
                  System.out.println("Error please Enter pin Again ");
            }
            // deposit();
            System.out.println("Done.........");
      }

      boolean auth() {
            System.out.println("Enter your AC No..:");
            int tempacn = s.nextInt();
            System.out.println("Enter your PIN :");
            int tempPin = s.nextInt();
            if (acNo == tempacn && pin == tempPin) {
                  return true;
            } else {
                  return false;
            }

      }

      void checkBal() {
            if (isAc() && auth()) {
                  System.out.println("\n\nYour Account Balence is : " + balence + "\n\n");
            } else {
                  System.out.println("You have to create Account ...");
                  CreateAC();
            }

      }

      void deposit() {
            if (isAc()) {
                  System.out.println("\n\nYou have to Deposit min 100 Rs \n");
                  System.out.println("Enter Amount you want to deposit ");
                  int amount = s.nextInt();
                  balence = balence + amount;
            } else {
                  System.out.println("You have to create Account ...");
                  CreateAC();
            }
      }

}

public class bankM {
      public static void main(String[] args) {
            bank b = new bank();
            // b.start();
            Scanner s = new Scanner(System.in);

            while (true) {

                  System.out.println(
                              "\n1 For Account create \n2 For Deposit\n3 For Balence Check\n4 For Details OF Account Holder\n5 For Exit\n\n ");
                  int choice = s.nextInt();
                  switch (choice) {
                        case 1:
                              b.CreateAC();
                              break;
                        case 2:
                              b.deposit();
                              break;
                        case 3:
                              b.checkBal();
                              break;

                        case 4:
                              b.Details();
                              break;
                        case 5:
                              break;
                        default:
                              System.out.println("Error.....\nEnter Your choice again ");
                              break;
                  }
            }

      }
}
