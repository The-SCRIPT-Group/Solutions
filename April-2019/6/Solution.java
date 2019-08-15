import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        double maxs = 1e15;
        long h;
        int n;
        Scanner sc = new Scanner(System.in);
        h = sc.nextLong();
        n = sc.nextInt();
        int[] arr = new int[n+1];
        arr[0] = 0;
        for (int i = 1; i <= n; i++)
            arr[i] = sc.nextInt();

        double mini = maxs;
        double sum = 0, ans = 0, rem = 0;

        for (int i = 1; i <= n; i++) 
        {
            sum += arr[i];
            mini = Math.min(mini, sum);
        }

        if (mini >= 0) 
        {
            System.out.println("-1");
            System.exit(0);
        }

        rem = h;

        if (h > Math.abs(mini)) 
        {
            if (sum >= 0) 
            {
              System.out.println("-1");
              System.exit(0);
            } 
            else 
            {
              sum = -1 * sum;
              ans = Math.floor((h + mini) / sum);
              if ((h + mini) % sum != 0)
                ans += 1;
              rem = h - sum * ans;
            }
        }

        for (int i = 1; i <= n; i++) 
        {
            rem += arr[i];
            if (rem <= 0) 
            {
                System.out.println((long)ans * n + i);
                System.exit(0);
            }
        }
        System.exit(0);
    }
}
