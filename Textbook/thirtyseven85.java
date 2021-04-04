class thirtyseven85
{
    public static void Shape(char a1)
    {
        int a,b,c=1,d=3,e,j,k;
        for(a=1;a<=3;a++)
        {
            for(b=1;b<=d;b++)
            {
                System.out.print(" ");
            }
            for(b=1;b<=c;b++)
            {
                System.out.print(a1);
            }
            System.out.println("");
            d--;
            c=c+2;
        }
    }

    public static void Shape(char a1,int z)
    {
        int a,b,c=1,d=3,e,j,k;
        int x=0;
        x=z;
        for(a=1;a<=z;a++)
        {
            for(b=1;b<=x;b++)
            {
                System.out.print(" ");
            }
            for(b=1;b<=c;b++)
            {
                System.out.print(a1);
            }
            System.out.println("");
            x--;
            c=c+2;
        }
    }

    public static void Shape(int a1)
    {
        int a,b,c=1;

        for(a=1;a<=1000;a++)
        {
            if(c<=a1)
            {
                for(b=1;b<=c;b++)
                {
                    System.out.print(b);
                }
                System.out.println("");
                c++;
            }
        }
    }
}

  