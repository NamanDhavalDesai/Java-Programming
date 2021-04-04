import java.util.*;
class Murr
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        int n,r,rev=0;
        System.out.println("enter a number");
        n=ob.nextInt();
        while(n>0)
        {
            r=n%10;
            n=n/10;
            rev=rev*10+r;
        }
        System.out.println(rev);
    }
}