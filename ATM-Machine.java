import java.util.*;
class atm
{
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter pin");
        int i = 0, j = 0, t = 0, c;
        while(t <= 2)
        {
            int pin = Sc.nextInt();
            if(pin == 1234)
            {
                System.out.println("WELCOME. HOW CAN WE HELP YOU?");
                j++;
                break;
            }
            else
            {
                System.out.println("Wrong pin. Try again");
                t++;
                if(t == 2)
                {
                    System.out.println("Your account is blocked");
                    for(int k = 0; k <= 10000000; k++)
                    {//To delay the exit
                    }
                    System.exit(0);
                }
            }            
        }
        if(j > 0)
        {
            System.out.println("Enter 1 for account balance");
            System.out.println("Enter 2 to withdraw money");
            System.out.println("Enter 3 to exit");
        }
        int o = Sc.nextInt();
        switch(o)
        {
            case 1:
            System.out.println("Your balance is Rs.1,23,96,531");
            System.out.println("Word: 1 crore twenty three lakhs ninety six thousand five hundred thirty one rupees only");
            break;
            case 2:
            System.out.println("Enter amount");
            c = Sc.nextInt();
            System.out.println("Please collect your cash from the box below");
            break;
            case 3:
            System.exit(0);
            break;
            default:
            System.out.println("Wrong Output");
        }
    }
}
