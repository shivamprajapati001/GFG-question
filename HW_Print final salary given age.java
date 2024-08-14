
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner sc = new Scanner(System.in);
       int x=sc.nextInt();
           int y=sc.nextInt();
        if(x>60)
            System.out.print((y+1000));
        else if(x>40&&x<=60)
             System.out.print((y+500));
            else 
                 System.out.print(y);
          
    }
}
