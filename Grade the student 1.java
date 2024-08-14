import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
               Scanner sc = new Scanner(System.in);
       int x=sc.nextInt();
          if(x>90)
            System.out.print("excellent");
        else if(x>80&&x<=90)
            System.out.print("good"); 
        else if(x>70&&x<=80)
             System.out.print("fair");
        else if(x>60&&x<=70)
         System.out.print("meets expectations"); 
            else if(x>40&&x<=60)
                System.out.print("below par");
        else
            System.out.print("failed");
    }
}
