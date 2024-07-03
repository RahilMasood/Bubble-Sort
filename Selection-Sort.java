import java.util.*;
class selctn_sort_str
{
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int n = Sc.nextInt();
        String arr[] = new String[n + 1];
        System.out.println("Enter the array elements");
        for(int i = 0; i <= n; i++)
        {
            arr[i] = Sc.nextLine();
        }
        String sm, temp;
        int bg, psm, r;
        for(bg = 0; bg <= n; bg++)
        {
            sm = arr[bg];
            psm = bg;
            for(r = bg + 1; r <= n; r++)
            {
                if(sm.compareTo(arr[r]) > 0)
                {
                    sm = arr[r];
                    psm = r;
                }
            }
            temp = arr[bg];
            arr[bg] = arr[psm];
            arr[psm] = temp;
        }
        System.out.println("Elements are:");
        for(int i = 1; i <= n; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
