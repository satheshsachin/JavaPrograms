import java.io.*;
import java.util.*;

public class SquareTiles {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt(),l=s.nextInt(),mul=1,ans=0,i;
        for(i=1;i<=t;i++)
        {
            mul=i*i;
            if(mul<l)
            {
                ans=i;
            }
        }
        int len=ans*t;
        System.out.println(len*len);
        
    }
}