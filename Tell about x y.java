import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);
        int x=sc.nextInt();
            int y= sc.nextInt();
        if(x>=59&&y>=10)
            System.out.print("X is greater than or equal to 59 and y is greater than or equal to 10");
      else  if(x>=50&&y<10)
            System.out.print("X is greater than or equal to 50 and y is less than 10");
        else 
            System.out.print("None of the condition matches");
    }
}
