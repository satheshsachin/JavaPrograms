import java.io.*;
import java.util.*;

public class RotationOfAnArray {

    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        int i;
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
         int r=sc.nextInt();
       for(int j=0;j<(r%n);j++)
       {
           
        int var=arr[n-1];
        for(i=n-1;i>=1;i--)
        {
            
           arr[i]=arr[i-1];
        }
           arr[0]=var;
       }
            
        
        for(i=0;i<n;i++)
        {
           System.out.print(arr[i]+" ");
        }
    }
}