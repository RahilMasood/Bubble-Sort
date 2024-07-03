import java.util.*;
class linear_search_str
{
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the size of element");
        int n = Sc.nextInt();
        String arr[] = new String[n];
        int i;
        System.out.println("Enter the array elements");
        for(i = 0; i < n; i++)
        {
            arr[i] = Sc.next();
        }
        System.out.println("Type the search element");
        String se = Sc.next();
        int flag = 0, pse;
        for(i = 0; i < n; i++)
        {
            if(arr[i].equalsIgnoreCase(se))
            {
                pse = i;
                flag++;
            }
        }
        if(flag == 1)
        {
            System.out.println("The element "+se+" is present");
        }
        else
        {
            System.out.println("The element "+se+" is not present");
        }
    }
}
