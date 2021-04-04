import java.util.*;
class prime
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        int n,i,c=0;
        System.out.println("enter a number");
        n=ob.nextInt();
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                c++;
            }
        }
        if(c==2)
        {
            System.out.println("prime number");
        }
        else
        System.out.println("Composite number");
    }
}
