import java.io.*;
class OnlyFirst2_RitomGupta
{
       public static void main(String args[]) throws IOException
       {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            String s=br.readLine();//consider a word

            if(s.length()>=2)//if length is 2 or more
              System.out.println(s.substring(0,2));//extract substring from s

            else if(s.length()==1)//if length is 1
              System.out.println(s.charAt(0)+"@");//append @ to first char

            else if(s.length()==0 || s==null)//if length is 0 or no input
              System.out.println("@@");//output @@
        }
}
