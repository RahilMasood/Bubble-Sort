import java.util.*;
class bubble_sort_Str
{
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        int i, j, n;
        String temp;
        System.out.println("Enter the size of element");
        n = Sc.nextInt();
        String arr[] = new String[n+1];
        System.out.println("Enter the array elements");
        for(i = 0; i <= n; i++)
        //To accept the size of elemnts. 
        {
            arr[i] = Sc.nextLine();
        }
        for(i = 1; i <= n + 1; i++)
        {
            //for knowing the first element.
            for(j = 0; j < (n); j++)
            {
                //To know the second element in the series.
                if(arr[j].compareTo(arr[j + 1]) > 0)
                {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    //To swapp the values.
                }
            }
        }
        System.out.println("The sorted array is:");
        for(i = 1; i <= n; i++)
        //To display elements.
        {
            System.out.println(arr[i]);
        }
    }
}
