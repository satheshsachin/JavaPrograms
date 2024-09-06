import java.io.*;
import java.util.*;

public class LongestCommon {

    public static void main(String[] args) {
         Scanner s=new Scanner(System.in);
        String s1=s.next();
        String s2=s.next();
        int l1=s1.length(),l2=s2.length(),i,j;
        int dp[][]=new int[l1+1][l2+1];
        for(i=1;i<=l1;i++)
        {
            for(j=1;j<=l2;j++)
            {
                if(s1.charAt(i-1)==s2.charAt(j-1))
                {
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else 
                {
                     dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }System.out.print(dp[l1][l2]);
        
    }
}