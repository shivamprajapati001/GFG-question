import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
          Scanner sc = new Scanner(System.in);
       int x=sc.nextInt();
        if(x>=70)
            System.out.print("Super Senior Citizen");
        else if(x>=59)
             System.out.print("Senior Citizen");
            else if(x>=18)
                 System.out.print("Adult");
                else if(x>=1)
                     System.out.print("Underage");
                    else
                         System.out.print("New Born");
    }
}
