import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
              Scanner sc = new Scanner(System.in);
       int a=sc.nextInt();
               int b=sc.nextInt();
        if(a>40)
        {
            if(b>=30000)
                System.out.print("You are rich and adult");
            else
                System.out.print("You are an adult"); 
        }
        else if(a<40)
        {
            if(b>=12000)
                System.out.print("You are rich and young");
            else
                System.out.print("You are young");
        }
    }
}
