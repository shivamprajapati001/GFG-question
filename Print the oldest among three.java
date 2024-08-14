import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
          Scanner sc = new Scanner(System.in);
       int a=sc.nextInt();
               int b=sc.nextInt();
               int c=sc.nextInt();
        if(a>b&&a>c)
            System.out.print("A");
        else if(b>c)
            System.out.print("B");
        else
            System.out.print("C");
    }
}
