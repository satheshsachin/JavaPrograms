import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n1 = sc.nextInt();
        int arr[] = new int[n1];
        for(int i = 0; i<n1; i++){
            arr[i]=sc.nextInt();
        }
        int n2 = sc.nextInt();
        int t=0;
        int Count=0;
        int sum=0;
        System.out.print("The elements that are divisible by " +n2+ " is ");
        for(int i =0;i<arr.length;i++){
            if(arr[i]%n2==0){
                t=arr[i];
                Count++;
                sum+=arr[i];
                System.out.print(t+" ");
            }
          
        }
          System.out.println("\nThe Count of the value that is divisible by " +n2+ " is "+Count);
        System.out.println("The Sum of value that is divisible by " +n2+ " is " +sum);
    }
}