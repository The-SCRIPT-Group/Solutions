import java.util.*;
class numberslope_RitomGupta
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int r=sc.nextInt();
    int count=1;

    for(int i=1;i<=r;i++)
    {
      for(int j=0;j<i;j++)
      {
        if(j!=i-1)
        System.out.print(count+" ");
        else
        System.out.print(count);
        count++;
      }
      System.out.println();
    }
  }
}
