package input;
import DesignPrinciples.*;



import java.util.*;
public class TakingInput
{
    static Scanner sc;

    public TakingInput() {
        sc = new Scanner(System.in);
    }

    static int readNumber1() {
        return sc.nextInt();
    }
    
    static int readNumber2() {
        return sc.nextInt();
    }
   public void takeInput()
   {
    int number1=0;
    int number2=0;
    int choice=0;
    
    while(true)
    {
        System.out.println("1 ->Add(+)");
        System.out.println("2 -> Substract(-)");
        System.out.println("3 -> Multiplication(*)");
        System.out.println("4 -> Division(/)");
        System.out.println("5 -> Modulo(%)");
        System.out.println("6 -> Exit");
        System.out.println("Enter your choice");
        choice=sc.nextInt();
                
        switch(choice)
        {
            case 1:
            System.out.println("Enter the first number ");
            number1 =readNumber1();    
            System.out.println("Enter the second number");
            number2=readNumber2();
            Sum sum = new Sum(); 
            sum.perform(number1, number2);
            break;
            case 2:
            System.out.println("Enter the first number ");
            number1 =readNumber1();    
            System.out.println("Enter the second number");
            number2=readNumber2();
            Substract substract = new Substract();
            substract.perform(number1, number2);
            break;
            case 3:
            System.out.println("Enter the first number ");
            number1 =readNumber1();    
            System.out.println("Enter the second number");
            number2=readNumber2();
            Multiply mult = new Multiply();
            mult.perform(number1, number2);
            break;
            case 4:
            System.out.println("Enter the first number ");
            number1 =readNumber1();    
            System.out.println("Enter the second number");
            number2=readNumber2();
            Division div = new Division();
            div.perform(number1, number2);
            break;
            case 5:
            System.out.println("Enter the first number ");
            number1 =readNumber1();    
            System.out.println("Enter the second number");
            number2=readNumber2();
            Modulo modulo = new Modulo();
            modulo.perform(number1,number2);
            break;
            case 6:
            System.out.println("Exit");
            System.exit(0);
            break;
            default:
            System.out.println("Enter your choice  ");
            break;
                
        }

        
    }
   }



}