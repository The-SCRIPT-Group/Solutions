import java.util.Scanner;

public class Solution {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int t = n - 1;
        scanner.close();
        for (int i = 1; i <= n; i++) {
            for (int j = t; j >= 1; j--) {
                System.out.print(" ");
            }
            t--;
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
