import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner sc = new Scanner(System.in);
       int x=sc.nextInt();
        if(x%2==0)
            System.out.print("Even");
        else
            System.out.print("Odd");
    }
}
