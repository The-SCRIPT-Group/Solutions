import java.util.*;
class swfac_RitomGupta
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int m=sc.nextInt();
    int n=sc.nextInt();
    long  sum=0;

    for(int i=m;i<=n;i++)
    {
      sum+=fac(i);
    }
    if(sum%6==0)System.out.println("1");
    else System.out.println("0");
    System.out.println("The Sum is="+sum);

    System.out.println(Long.toString(sum).length());
  }

  static long fac(int x)
  {
    long f=1;
    for(int i=1;i<=x;i++)
     f*=i;
    return f;
  }
}
