import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        // Create an object of Scanner class, which we will use to take input
        Scanner sc = new Scanner(System.in);
        // Accept the input as int, and compute and display the result
        System.out.print(sc.nextInt() % sc.nextInt());
        // Close the scanner object
        sc.close();
    }
}
