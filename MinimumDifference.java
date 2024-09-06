import java.io.*;
import java.util.*;

public class MinimumDifference {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s="";
        int arr[]=new int[n];int i;
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }Arrays.sort(arr);
        int dif=0,min=100000,j,flag=0;
        for(i=0;i<n-1;i++)
        {
            dif=Math.abs(arr[i]-arr[i+1]);
            if(min>dif)
            {
                min=dif;
            }
        }   
        for(i=0;i<n-1;i++)
        {
            if(min==Math.abs(arr[i]-arr[i+1]))
            {
                System.out.print(arr[i]+" "+arr[i+1]+" ");
            }
        }
        
    }
}