import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
               Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
           int y=sc.nextInt();
           int z=sc.nextInt();
        if(x+y+z<150)
            System.out.print("True");
        else
            System.out.print("False");
        
    }
}
