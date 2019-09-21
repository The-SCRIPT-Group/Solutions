import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public void func()throws IOException
    {
        StringTokenizer st;
        int num = Integer.parseInt(br.readLine());
        String str = br.readLine();
        st = new StringTokenizer(str, " ");
        while(st.hasMoreTokens())
        {
            int inp = Integer.parseInt(st.nextToken());
            int ctr = 0;
            for(int i = 1; i <= inp; ++i) {
                if (inp % i == 0) {
                    ctr++;
                }
            }
            if(ctr == num)
                System.out.println("YES");
            else
                System.out.println("NO");
         }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Solution obj = new Solution();
        try
        {
            obj.func();
        }
        catch(IOException e)
        {
            System.out.println();
        }
    }
}
