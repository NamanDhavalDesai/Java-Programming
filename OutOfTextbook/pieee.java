import java.util.*;
class pieee
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        int n,s,r,sum=0; 
        System.out.println("enter a number");
        n=ob.nextInt();
        s=n*n;
        while(s>0)
        {
            r=s%10;
            s=s/10;
            sum=sum+r;
        }
        if(sum==s)
        {
            System.out.println("NEON NUMBER");
        }
        else
            System.out.println("sorrryyy... NOT A NEON NUMBER");
    }
}

