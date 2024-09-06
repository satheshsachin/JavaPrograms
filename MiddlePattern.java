import java.io.*;
import java.util.*;

public class MiddlePattern {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int i=0,j,k;int index=(s.length()/2);
        String s1="";int len=s.length();int count=0;
           for(i=index;i<len;i++)
           {
               s1=s1+s.charAt(i);
               System.out.print(s1+"$ ");
               if(i==len-1&&count==0)
               {
                   i=-1;
                   count=1;
                   len=s.length()/2;
               }
           }
        
    }
}