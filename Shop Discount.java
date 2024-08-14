import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
          Scanner sc = new Scanner(System.in);
       int x=sc.nextInt();
         int temp;
        temp=x*100;
        if(temp>1000)
        {
           temp= temp-(temp*10)/100;
            System.out.print(temp);
        }
        else System.out.print(temp);
    }
}
