import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc  =  new Scanner(System.in);
        int n1 = sc.nextInt();
        int arr[] = new int[n1];
        
        for(int i = 0; i < n1; i++){
            arr[i] = sc.nextInt();
        }
        int min=arr[0];
        int max=arr[0];
        for(int j=0;j<arr.length;j++)
        {
            if(arr[j]<min){
                min = arr[j];
            }
        }
        System.out.println("Youngest="+min);
        
        for(int k=0;k<arr.length;k++){
            if(arr[k]>max){
                max = arr[k];
            }
        }
        System.out.println("Oldest="+max);
        
        
        
    }
}