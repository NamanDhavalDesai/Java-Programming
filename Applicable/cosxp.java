import java.util.*;
class cosxp
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        int a,b,c,d,e;
        System.out.println("Enter the exponential value");
        a=ob.nextInt();
        b=(int)Math.pow(2,(a-1));
        System.out.print("1/"+b+" x (");
        if(a%2==0)
        {
            d=(a/2)-1;
        }
        else
        {
            d=(a/2);
        }
        System.out.print("cos^"+a);
        for(c=1;c<=d;c++)
        {
            e=f(a)/(f(c)*f(a-c));
            System.out.print(" + "+e+"cos^"+(a-(2*c))+"Q");
        }
        
        if(a%2==0)
        {
            System.out.print(" + "+(f(a)/(f(a/2)*f(a-(a/2))))/2);
        }
        System.out.println(")");
    }

    public static int f(int a)
    {
        int b,c=1;
        for(b=a;b>=1;b--)
        {
            c=c*b;
        }
        return c;
    }
}