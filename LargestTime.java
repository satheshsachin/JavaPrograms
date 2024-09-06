import java.io.*;
import java.util.*;

public class LargestTime {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i,j;
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }boolean x=false;
        for(i=23;i>=0&&!x;i--)
        {
            for(j=59;j>=0&&!x;j--)
            {
                int t[]={i/10,i%10,j/10,j%10};
                Arrays.sort(t);
                if(Arrays.equals(t,arr))
                {
                    System.out.printf("%02d:%02d",i,j);
                    x=true;
                }
            }
        }
    }
}