import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;



public class Solution {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void func()throws IOException
    {
        String str;
        str = br.readLine();
        int ctr = 1, flg = 1;
        
        StringTokenizer st = new StringTokenizer(str, " ");
        while(st.hasMoreTokens())
        {
            String temp = st.nextToken();
            if(temp.equals("static") == false)
            {
                int num = Integer.parseInt(temp);
                if(num != ctr)
                {
                    System.out.print("something is fishy");
                    flg = 0;
                    break;
                }
            }
            ctr++;
        }
        if(flg != 0)
            System.out.print("makes sense");        
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
