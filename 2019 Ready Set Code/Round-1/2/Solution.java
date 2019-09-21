import java.util.Scanner;

class Solution {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while (n>0) {
            int t1 = scanner.nextInt();
            int t2 = scanner.nextInt();
            if (t2 - t1 >= 5) {
                System.out.println(t1);
                System.exit(0);
            }
            n--;
        }
        System.out.println("doggy sad");
        scanner.close();
    }
}