import java.io.*;
import java.util.*;

public class SortEvenAndOddInDescending {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        int i;
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        for(i=n-1;i>=0;i--)
        {
            if((arr[i]&1)==0)
            {
                System.out.print(arr[i]+" ");
            }
        }
        for(i=n-1;i>=0;i--)
        {
            if((arr[i]&1)==1)
            {
                System.out.print(arr[i]+" ");
            }
        }
    
    }
}