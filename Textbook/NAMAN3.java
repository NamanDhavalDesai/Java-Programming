class NAMAN3
{
    public static int PDA(int a)
    {
        int b,c=0,d;
        for(b=1;b<a;b++)
        {
            if(a%b==0)
            {
                c=c+b;
            }
        }
        if(c==a)
        {
            return 0;
        }
        else if(c>a)
        {
            return 1;
        }
        else
        {
            return -1;
        }
    }

    public static boolean isprime(int a)
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
            return true;
        }
        else

        {
            return false;
        }
    }

    public static double tempconverter(double a,char b)
    {
        double c=0,d,e;
        if(b=='F'||b=='f')
        {
            c=(a-32)*(0.5);
        }
        else if(b=='C'||b=='c')
        {
            c=a*1.8*32;
        }
        return c;
    }

    public static boolean LuckyTen(int a)
    {
        int b,c,d=0,e,f;
        b=a;
        while(b>0)
        {
            c=b%10;
            b=b/10;
            d=d+c;
        }
        if(d==10)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static int sumofdigits(int a)
    {
        int b,c,d=0,e,f;
        b=a;
        while(b>0)
        {
            c=b%10;
            b=b/10;
            d=d+c;
        }
        return d;
    }
}

    