public class Question9
{
    public static void main(char n, int x)
    {
        switch (n)
        {
            case 'a':
            int sum=(2-4)+(6-8)+(10-12)+(14-16)+(18-20);
            System.out.println(sum);
            break;
            case 'b':
            double s=0;
            for(int i=2;i<=20;i=i+3)
             {
               s=s+(x/i);
             }
             System.out.println(s);
            break;
            default: System.out.println("Please enter a valid character");
            break;
        }
    }
}  