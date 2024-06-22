import java.util.*;
class binary_search_str
{
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        int i, j, high, low = 0;
        String temp, se;
        boolean flag = false;
        System.out.println("Type the size");
        int n = Sc.nextInt();
        String arr[] = new String[n];
        System.out.println("Type the elements");
        for(i = 0; i < n; i++)
        {
            arr[i] = Sc.next();
        }
        System.out.println("Type the search element");
        se = Sc.next();        
        for(i = 1; i <= n; i++)
        {
            for(j = 0; j < (n - 1) - i; j++)
            {
                if(arr[j].compareTo(arr[j + 1]) > 0)
                {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            high = n - 1;
            while(low <= high)
            {
                int mid = (low + high) / 2;
                if(se.equals(arr[mid]))
                {
                    flag = true;
                    break;
                }
                else if(se.compareTo(arr[mid]) < 0)
                {
                    high = mid - 1;
                }
                else
                {
                    low = mid + 1;
                }
            }
        }
        if(flag == true)
        {
            System.out.println("The element is found");
        }
        else
        {
            System.out.println("The element is not found");
        }
    }
}
