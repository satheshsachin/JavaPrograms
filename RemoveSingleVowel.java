import java.io.*;
import java.util.*;

public class RemoveSingleVowel {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int i=0,flag=0,j,f1;char ch1,ch2,ch;
        for(i=0;i<s.length();i++)
        {
            ch=s.charAt(i);
            if("aeiouAEIOU".indexOf(ch)!=-1)
            {
                flag=0;
                f1=0;
                for(j=i+1;j<s.length()-1;j++)
                {
                    ch1=s.charAt(j);
                if("aeiouAEIOU".indexOf(ch1)!=-1)
                    {
                        flag++;
                    }
                    else
                    {
                        break;
                    }
                }
                for(int l=i-1;l>=1;l--)
                {
                    ch1=s.charAt(l);
                 if("aeiouAEIOU".indexOf(ch1)!=-1){
                     f1++;
                 }else{
                     break;
                 }

                }
                if(flag>=1||f1>=1)
                {
                     System.out.print(ch);                
                }
                
            }
            else
            {
                System.out.print(ch);
            }
        }
        
    }
}