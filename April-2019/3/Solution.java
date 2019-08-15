import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        // Apply the formula given, and check for the given conditions
        if( (3.14/3 * Math.pow(sc.nextFloat(), 2.0/3.0)) >= 14 ){
            System.out.print("YIPEE");
        }
        else{
            System.out.print("OH CRAP");
        }
    }
}
