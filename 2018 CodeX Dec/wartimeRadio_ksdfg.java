import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        int i=1;    //integer to keep count
        String a;   //string to store input - what the spotter is saying
        
        Scanner sc = new Scanner(System.in);    //scanner to take input
        
        while(sc.hasNext()){    //while there is more input in STDIN
            a = sc.next();
            if(a.equals(""+i) || a.equals("static")){  //if the spotter is saying a number that is inline with the count or static
                i++;
            }
            else{
                System.out.println("something is fishy");
                return;
            }
        }
        
        System.out.println("makes sense");    //will only print if all are right
        
    }
}
