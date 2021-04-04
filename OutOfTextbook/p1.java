import java .util.*;
class p1
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        int a,n,m,s=0,b;
        System.out.println("1.sum of even digits");
        System.out.println("2.product of odd digits");
        System.out.println("enter a two digit no");
        a=ob.nextInt();
        System.out.println("makeyourchoiice");
        b=ob.nextInt();
        n=a%10;
        m=a/10;

        if(n%2==0 && m%2==0)
        {
            s=n+m;
            System.out.println("the sum of even no is "+s);
        }

        if(n%2!=0 && m%2!=0)
        {
            s=n*m;
            System.out.println("the product of odd no is "+s);
        }
        else if(n%2==0 && m%2!=0 || m%2==0 && n%2!=0)
        {
            s=n+m;
            System.out.println("the sum of odd n even no is "+s);
        }}}
