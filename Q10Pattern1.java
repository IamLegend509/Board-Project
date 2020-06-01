public class Q10Pattern1
{
      public static void main(int r)
      {
          int a=1;
          for(int i=1;i<=r;i++)
          {
              System.out.print(a);
              a+=1;
          for(int j=1;j<=i;j++)
          {
            if(j%2!=0)
            {
            System.out.print("* ");
            }
            else
            {
            System.out.print("# ");
            }
          }
          System.out.println();
         }
       }
}