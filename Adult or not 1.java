import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner sc = new Scanner(System.in);
       int x=sc.nextInt();
        if(x>=18)
            System.out.print("Adult");
        else
            System.out.print("Below age");
    }
}
