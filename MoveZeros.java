import java.io.*;
import java.util.*;

public class MoveZeros {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int r=0,l=n-1;
        int i;
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
            if(arr[i]!=0)
            {
                System.out.print(arr[i]+" ");
            }
        }
        for(i=0;i<n;i++)
        {
           if(arr[i]==0)
           {
               System.out.print(arr[i]+" ");
           }
        }
    }
}