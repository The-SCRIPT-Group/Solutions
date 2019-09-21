import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        // Create an object of Scanner class, which we will use to take input
        Scanner sc = new Scanner(System.in);
        
        // Accept the input as an integer
        int n = sc.nextInt();
        int fac = 1;
        
        // A loop to compute the factorial
        for(int i=2; i<=n; i++){
            fac = fac * i;
        }
        
        // Print the result
        System.out.print(fac);
        // Close the scanner object
        sc.close();
    }
}
