public class Question5
{
    public static void main(int n)
    {
        switch (n)
        {
            case 1:
            for(int i=1;i<=5;i++)
            {
                for(int k= 1; k<=i; k++)
                {
                    System.out.print(k+"");
                }
                System.out.println();
            }
            break;
            case 2:
            for(int i= 6; i>=0; i--)
            {
                int al= 95;
                for(int k= 0; k<=i; k++)
                {
                    System.out.print((char)(al+k));
                }
                System.out.println();
            }
            break;
            default:
            System.out.println("Enter a valid integer");
        }
    }
}