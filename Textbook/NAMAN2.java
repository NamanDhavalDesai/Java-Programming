import java.util.*;
class NAMAN2
{
    public static void prime(int a)
    {
        int b,c=0,d,e;
        for(b=1;b<=a;b++)
        {
            if(a%b==0)
            {
                c++;
            }
        }
        if(c<=2)
        {
            System.out.println("the no is a prime no");
        }
        else

        {
            System.out.println("the no is not a prime no");
        }
    }

    public static void perfect(int a)
    {
        int b,c=0,d,e;
        for(b=1;b<a;b++)
        {
            if(a%b==0)
            {
                c=c+b;
            }
        }
        if(a==c)
        {
            System.out.println("the no is a perfect no");
        }
        else

        {
            System.out.println("the no is not a perfect no");
        }
    }

    public static void armstrong(int a)
    {
        int b,c,e;
        double d=0;
        b=a;
        while(b>0)
        {
            c=b%10;
            b=b/10;
            d=d+Math.pow(c,3);

        }
        e=(int)d;
        if(e==a)
        {
            System.out.print("armstrong no");
        }
        else
        {
            System.out.print("not a armstrong no");
        }
    }

    public static void neon(int a)
    {
        int b,c,e,d=0;
        b=a*a;
        while(b>0)
        {
            c=b%10;
            b=b/10;
            d=d+c;

        }
        e=d;
        if(e==a)
        {
            System.out.print("neon no");
        }
        else
        {
            System.out.print("not a neon no");
        }
    }

    public static void automorphic(int a)
    {
        int b1,b,c,d=0,e=0,f,g,h,i,j=0,k,l;
        b1=a*a;
        c=a;
        while(c>0)
        {
            b=c%10;
            c=c/10;
            d++;
            e=(e+b)*10;
        }
        f=e/10;
        for(g=1;g<=d;g++)
        {
            i=b1%10;
            b1=b1/10;
            j=(j+i)*10;
        }
        k=j/10;
        if(f==k)
        {
            System.out.print("automorphic no");
        }
        else
        {
            System.out.print("not a automorphic no");
        }
    }

    public static void special(int a)
    {
        int b,c,e=0,d=1,z;
        b=a;
        while(b>0)
        {
            c=b%10;
            b=b/10;
            z=c;
            while(z>0)
            {
                d=d*z;
                z--;
            }
            e=e+d;
            d=1;
        }    
        if(e==a)
        {
            System.out.print("special no");
        }
        else
        {
            System.out.print("not a special no");
        }
    }

    public static void amicable(int a,int b)
    {
        int c,d=0,e,f=0;

        for(c=1;c<a;c++)
        {
            if(a%c==0)
            {
                d=d+b;
            }
        }
        for(e=1;e<b;e++)
        {
            if(b%e==0)
            {
                f=f+b;
            }
        }
        if(f==d)
        {
            System.out.print("amicable pair");
        }
        else
        {
            System.out.print("not a amicable pair");
        }
    }
}

        
        
        
        
        
        
        
    