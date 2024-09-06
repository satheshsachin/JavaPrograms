import java.io.*;
import java.util.*;

public class PrimePair {

    public static int isprime(int sum)
    {
        int flag=0;
       
            for(int j=2;j<sum;j++)
            {
                if(sum%j==0)
                {
                    return 1;
                  
                }
            }
            return 0;
    }
    
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i,j,flag=0,count=0;
        for(i=2;i<=n;i++)
        {
            flag=isprime(i);
           
            if(flag==0)
            {count++;
            }
        }int arr[]=new int[count];int k=0;
        for(i=2;i<=n;i++)
        {
            flag=isprime(i);
          
            if(flag==0)
            {
                arr[k]=i;
                k++;
            }
        }
        for(i=0;i<count;i++)
        {
            for(j=0;j<count;j++)
            {
                if(i!=j&&arr[i]<arr[j])
                {
                    int sum=arr[i]+arr[j];
                    int mass=isprime(sum);
                    if(mass==0){
                    System.out.println(arr[i]+" "+arr[j]);
                    }
                }
            }
        }
        
    }
}