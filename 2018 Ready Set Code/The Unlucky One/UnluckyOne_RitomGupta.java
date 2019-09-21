import java.io.*;
class UnluckyOne_RitomGupta
{
       public static void main(String args[]) throws IOException
       {
           BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
           int x,y,z=0;
           x=Integer.parseInt(br.readLine());
           y=Integer.parseInt(br.readLine());
           z=Integer.parseInt(br.readLine());
           int s=specialfun(x,y,z);
           System.out.println(s);
       }
       static int specialfun(int x,int y,int z)
       {
           if(x==13)return 0;
           if(x!=13 && y==13)return x;
           if(x!=13 && y!=13 && z==13)return x+y;
           else return x+y+z;
        }
}
