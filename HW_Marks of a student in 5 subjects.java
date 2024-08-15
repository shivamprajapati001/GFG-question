import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
           Scanner sc= new Scanner(System.in);
        double x=sc.nextDouble();
          double y=sc.nextDouble();
          double z=sc.nextDouble();
         double a=sc.nextDouble();
          double b=sc.nextDouble();
      double Tmark=a+b+x+y+z;
        double persentage=(Tmark/5);
        System.out.println(Tmark);
        System.out.println(persentage);
        
    }
}
