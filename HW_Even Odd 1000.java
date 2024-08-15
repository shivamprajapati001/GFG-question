import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
           Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        if(a%2==0){
            if(a>1000)
                System.out.print("Even and above 1000");
            else
                 System.out.print("Even");
                
        }
        else {
             if(a>1000)
                System.out.print("Odd and above 1000");
            else
                 System.out.print("Odd");
                
        }
        
    }
  
}
