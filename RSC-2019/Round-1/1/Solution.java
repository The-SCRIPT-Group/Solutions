import java.util.Scanner;

public class Solution {

    static boolean prime(int n) {
        int c, i;
        c = 0;
        for (i = 2; i < n; i++) {
            if (n%i == 0) {
                c++;
            }
        }
        return c == 0;
    }
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n <= 1) {
            System.out.println("NONE");
        } else {
            if(prime(n)) {
                System.out.println("PRIME");
            } else {
                System.out.println("NOT PRIME");
            }
        }        
        scanner.close();
    }
}