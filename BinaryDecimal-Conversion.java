import java.util.*;
class decimal_binary
{
    public static void main(String args[])
    {
      Scanner Sc = new Scanner(System.in);
      int rah = 0;
      while(rah != 1)
      {
        System.out.println("Enter 1 to convert to decimal");
        System.out.println("Enter 2 to convert to binary");
        System.out.println("Enter 3 to exit");
        int o = Sc.nextInt();
        switch(o)
        {
           case 1:
           System.out.println("Enter a no. in binary");
           int n = Sc.nextInt();
           int sq = 0, num = 0;
           String rev = "";
           while(n != 0) 
           {
            int d = n % 10;
            rev = Integer.toString(d) + rev;
            n /= 10;
           }
           //To reverse the no.
           int numb = Integer.parseInt(rev);
           while(numb != 0)
           {
            int r = numb %10;
            num += (int)Math.pow(2,sq) * r;
            numb /= 10;
            sq++;
           }
           //To find the binary form
           System.out.println("The decimal Value is "+num);
           break;
           case 2:
           int q, k = 0;
           System.out.println("Enter a no.");
           q = Sc.nextInt();
           String a = "";
           while(q != 0)
           {            
                k = q % 2;
                a = Integer.toString(k) + a;
                q /= 2;
           }
           System.out.println(a);
           break;
           case 3:
           rah++;
           System.exit(0);
           //To exit
           break;
           default:
           System.out.println("Invalid Choice");
           //By chance if an invalid choice is inputed.
           break;
        }
      }
   }
}
