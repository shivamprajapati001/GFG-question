import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
            int b= sc.nextInt();

        
        
        
   if(a<20||b>100)
     System.out.print("Needs improvement");
   else if(a<40||b>80)
     System.out.print("Concentrate");
 else if(a<60||b>120)
     System.out.print("Needs to focus");
else if(a>100||b<10)
     System.out.print("Very good");
else 
 System.out.print("Bright Student");
    }
}











