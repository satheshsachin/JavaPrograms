import java.io.*;
import java.util.*;

public class Candy {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        int i=0;
        for(i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        int can[]=new int[n];
        Arrays.fill(can,1);
        int c=n;
        for(i=0;i<n;i++)
        {
            if(i==0)
            {
                if(arr[i]>arr[i+1])
                {
                    c++;
                }
            }
            else if(i==n-1)
            {
                if(arr[i]>arr[i-1])
                {
                    c++;
                }
            }
            else
            {
                   if(arr[i]>arr[i-1]&&arr[i]>arr[i+1])
                {
                    c++;
                }
                if(arr[i]>arr[i-1])
                {
                    c++;
                }
                else if(arr[i]>arr[i+1])
                {
                    c++;
                }
            }
        }
        System.out.print(c);
    }
}