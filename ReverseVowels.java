import java.io.*;
import java.util.*;

public class ReverseVowels {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int l=0,r=s.length()-1,i;
        char c[]=s.toCharArray();
        int f1=0,f2=0;
        while(l<r)
        {
            if("aeiouAEIOU".indexOf(c[l])!=-1)
            {
                f1=1;
            }else
            {
                l++;
            }
            if("aeiouAEIOU".indexOf(c[r])!=-1)
            {
                f2=1;
            }else
            {
                r--;
            }
            if(f1==1&&f2==1)
            {
                f1=0;
                f2=0;
               char ch=c[l];
                c[l]=c[r];
                c[r]=ch;
                l++;
                r--;
            }
            if(r<=l)
            {
                break;
            }
        }
        for(i=0;i<s.length();i++)
        {
            System.out.print(c[i]);
        }
    }
}