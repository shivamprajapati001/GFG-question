import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner sc= new Scanner(System.in);
        int x=sc.nextInt();
            int y= sc.nextInt();
          int z= sc.nextInt();
        if(x>=20&&z<100)
  z=z+200;
else if(x>=10||y<50)
  z=z+100;
System.out.print(z);
    }
}
