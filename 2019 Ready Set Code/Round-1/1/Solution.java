import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int f = 0;
        for(int i = 1 ; i <= a ; i++) {
            if(a%i == 0)
                f++;
        }
        if(f == 2)
            System.out.println("PRIME");
        else if(f == 1 || a == 0)
            System.out.println("NONE");
        else
            System.out.println("NOT PRIME");
    }
}
