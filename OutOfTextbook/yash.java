class yash
{
    public static void main()
    {
        int a,b,c,d,e,f=7;
        for(a=1;a<=5;a++)
        {
            for(b=1;b<=a;b++)
            {
                System.out.print(b);
            }
            for(c=f;c>=1;c--)
            {
                System.out.print(" ");
            }
            f=f-2;
            e=a;
            if(a==5)
            {
                e=4;
                for(d=e;d>=1;d--)
                {
                    System.out.print(d);
                }
            }
            else
            {
                for(d=a;d>=1;d--)
                {
                    System.out.print(d);
                }
            }
            System.out.println("");
        }
    }
}
