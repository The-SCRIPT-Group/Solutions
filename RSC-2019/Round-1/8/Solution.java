import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Solution {

    public static void main(String[] args) {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
	String word = "";
	try {
	        word = stdin.readLine();
	} catch (IOException e) {
		e.printStackTrace();
	}
        int len = word.length();
        int l = len*2 - 1, c = l;
        int i, j, k, m;
        String t[] = new String[len];
        
        for (i=0; i<len; i++) {
            t[i]="";
            for (j=0;j<i;j++) {
                t[i]=t[i]+word.charAt(j);
            }
            for (k=0; k<c;k++) {
                t[i]=t[i]+word.charAt(i);
            }
            for (m=i-1;m>=0;m--) {
                t[i]=t[i]+word.charAt(m);
            }
            System.out.println(t[i]);
            c-=2;
        }
        for (i=len-2;i>=0;i--) {
            System.out.println(t[i]);
        }
    }
}
