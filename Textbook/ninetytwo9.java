import java.util.*;
class ninetytwo9
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        int a[]=new int[10];
        int b[]=new int[10];
        int c[]=new int[10];
        int d[]=new int[10];
        for(int i=0;i<a.length;i++)
        {
            System.out.println("enter 10 nos");
            a[i]=ob.nextInt();
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.println("enter second group of 10 nos");
            b[i]=ob.nextInt();
        }

        for( int i=0;i<a.length;i++)
        {
            c[i]=a[i]+b[i];
            d[i]=a[i]-b[i];
        }
        
        for( int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+"  "  );
            System.out.print(b[i]+"  "  );
            System.out.print(c[i]+"  "  );
            System.out.print(d[i]+"  "  );
            System.out.println("");
        }
    }
}