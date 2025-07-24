public class switch {
    public static void main(String[] args)
     {
     int a,b,ch;
     System.out.println("1.addition/2.substraction/3.multiplication/4.division");
     System.out.println("Enter any 2 numbers");
     a=Integer.parseInt(args[0]);
     b=Integer.parseInt(args[1]);
     System.out.println("Enter your choice");
     ch=Integer.parseInt(args[2]);
     
     Switch (ch)
     {  case 1:
                 int c=a+b;
                 System.out.println("Sum");
                 break;
      case 2:
                int c=a-b;
                System.out.println("Sub");
                break;
      case 3:
                int c=a*b;
                System.out.println("Mul");
                break;
      case 4:
                int c=a/b;
                System.out.println("Div");
                break;
      default :
                System.out.println("invalid choice");
                break;                   
                                                
      }
    }
   }