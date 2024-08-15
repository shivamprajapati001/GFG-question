import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
            int b= sc.nextInt();
          int c= sc.nextInt();
        if(a>60&&b>20000&&c>20)
  b=b+5000;
 else if(a>40&&b>15000&&c>10)
  b=b+2000;
else if(a>30&&b>10000&&c>5)
  b=b+1000;
  else 
  b=b+500;
System.out.print(b);
    }
}
 Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
            int b= sc.nextInt();
   if(a<20||b>100)
     System.out.print(" Needs improvement");
   if(a<40||b>80)
     System.out.print("Concentrate");
 if(a<60||b>120)
     System.out.print("Needs to focus");
 if(a<100||b>10)
     System.out.print("Very good");
else 
 System.out.print("Bright Student");
