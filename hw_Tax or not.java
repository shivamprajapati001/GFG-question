import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner sc = new Scanner(System.in);
       int x=sc.nextInt();
        if(x<500000)
            System.out.print("No tax to be paid");
        else
            System.out.print("Tax to be paid");
    }
}
