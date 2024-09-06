import java.io.*;
import java.util.*;

public class JumpGame {

    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        int i=0;
        for(i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        int f=n-1;
        for(i=n-2;i>=0;i--)
        {
            if(arr[i]+i>=f)
            {
                f=i;
            }
            
        }
        if(f==0){
            System.out.print("true");
        }else{
            System.out.print("false");
        }
    }
}