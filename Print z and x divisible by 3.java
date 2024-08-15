import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
          Scanner sc= new Scanner(System.in);
        int x=sc.nextInt();
          int y=sc.nextInt();
          int z=sc.nextInt();
        if(x%3==0){
            if(y>=200)
             z=z+10;
             else if(y>=100&&y<200)
                z=z+5;
              else if(y>=50&&y<100)
                z=z+4;
            else
                z=z+1;
                
    }
        else{
            if(y>=200)
             z=z+3;
             else if(y>=100&&y<200)
                z=z+2;
            else
                z=z+1;
        }
        z=z+10;
        System.out.print(z);
}
}
