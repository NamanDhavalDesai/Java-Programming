import java.util.*;
class sinexp
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        int a,b,c,d,e;
        System.out.println("Enter the exponential value");
        a=ob.nextInt();
        b=(int)Math.pow(2,(a-1));
        if((a%4)%2==0 ||  (a%4)%3==0)
        {
            System.out.print("-");
        }
        System.out.print("1/"+b+" x (");        
        if(a%2==0)
        {
            d=(a/2)-1;
        }
        else
        {
            d=(a/2);
        }       
        if(a%2==0)
        {
            System.out.print("cos^"+a);
        }
        else
        {
            System.out.print("sin^"+a);
        }         
        for(c=1;c<=d;c++)
        {
            e=f(a)/(f(c)*f(a-c));
            if(c%2==0)
            {
                System.out.print(" + ");
            }
            else
            {
                System.out.print(" - ");
            }
            if(a%2==0)
            {
                System.out.print(+e+"cos^"+(a-(2*c))+"Q");
            }
            else
            {
                System.out.print(+e+"sin^"+(a-(2*c))+"Q");
            }         
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