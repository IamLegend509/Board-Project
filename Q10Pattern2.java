public class Q10Pattern2
{
    public static void main(int i)
    {
        for(int a= i; a>=0; a--)
            {
                int l= 53;
                for(int k= 0; k<=a; k++)
                {
                    System.out.print((char)(l-k));
                }
                System.out.println();
            }
    }
}