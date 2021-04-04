import java.util.*;
class Sal
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        int n,n1=0,r,rev=0;
        System.out.println("enter a number");
        n=ob.nextInt();
        while(n>0)
        {
            n1=n;
            r=n%10;
            n=n/10;
            rev=rev*10+r;
        }
        if(rev==n1)
        {
            System.out.println("Palindrome");
        }
        else
        System.out.println("Not Palindrome");
    }
}