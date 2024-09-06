import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1 = sc.nextInt();
        int arr[] = new int[n1];
        for(int i=0; i<n1; i++){
            arr[i]=sc.nextInt();
        }
        int n2 = sc.nextInt();
        int flag=0;
        int t=0;
        for(int i = 0; i < n1 ; i++)
        {
        if(n2 == arr[i])
           {
            t=i;
            flag =1;
            break;
           }
        }
        if(flag==1)
        {
            System.out.printf("Door Number is 00"+t+"-DN");
        }
        else
        {
            System.out.printf("-1");
        }

    }
}