import java.util.*;
class ProjectPaw_RitomGupta
{
        static Scanner sc=new Scanner(System.in);
        public static void main(String args[])
        {

            int a=sc.nextInt();//as per chosen test cases, always greater than 45*n km^2
            int n=sc.nextInt();

            int c=conserve(a,n);
            System.out.println("Area to be allocated:"+c);
        }
        static int conserve(int a,int n)
        {
                int injuries[][]=new int[n][6];
                int con=0;
                for(int i=0;i<n;i++)
                {
                        for(int j=0;j<6;j++)
                        {
                           injuries[i][j]=sc.nextInt();
                        }

                        if((injuries[i][0]+injuries[i][1]+injuries[i][2]+injuries[i][3]>=2) || injuries[i][4]==1 || injuries[i][5]==1)
                        con++;

                }
                System.out.println("Tiger needing conservation:"+con);
                return 45*con;
        }
}
