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
        String nums;
        nums = br.readLine();
        st = new StringTokenizer(nums, " ");
        int words = Integer.parseInt(st.nextToken());
        int ques = Integer.parseInt(st.nextToken());
        String[] dict = new String[words];
        String[] checks = new String[ques];
        for(int i = 0; i < words; i++)
        {
            dict[i] = br.readLine();
        }
        for(int i = 0; i < ques; i++)
        {
            checks[i] = br.readLine();
        }
        for(int i = 0; i < ques; i++)
        {
            int flg = 0;
            for(int j = 0; j < words; j++)
            {
                st = new StringTokenizer(dict[j], " ");
                if(checks[i].equals(st.nextToken())){
                    System.out.println(st.nextToken());
                    flg = 1;
                    break;
                }
                else
                    flg = 0;
            }
            if(flg == 0)
                System.out.println("whatcha sayin'?");
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
