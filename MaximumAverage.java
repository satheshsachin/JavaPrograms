import java.io.*;
import java.util.*;

public class MaximumAverage {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        int i,sum=0;double max=0;
        for(i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
         int count=s.nextInt();
         int a=0,c=0;
        for(i=a;i<n;i++)
        {
            sum=sum+arr[i];
            c++;
            if(c==count)
            {
              // System.out.println("sum:"+sum);
                double avg=((double)sum/count);
                if(max<avg)
                {
                    max=avg;
                }
                c=0;
                a++;
                i=a-1;
                 sum=0;
            }
           
            
        }System.out.printf("%.5f",max);
    }
}