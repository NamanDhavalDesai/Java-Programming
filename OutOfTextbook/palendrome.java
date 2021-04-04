import java.util.*;
class palendrome
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        int a,d,c,b=0,e,m,k=1,n,u,s=1,t,z ;
        double r,v=0;
        System.out.println("Enter a number");
        a=ob.nextInt();
        System.out.println('\f');
        d=a;
        while(d>0)
        {
            c=d%10;
            d=d/10;
            b++;
        }

        int x=0;
        if(b%2==1)
        {   
            x=1;
        }
        e=b/2;
        m=a;
        while(k<=e+x)
        {
            n=m/10;
            m=n;
            k++;
        }
        r=Math.pow(10,e-1);
        u=a;
        s=e;
        while(s>=1)
        {
            t=u%10;
            v=v+(t*r);
            s--;
            r=r/10;
            u=u/10;
        }    
        z=(int)v;
        if(z==m)
        {
            System.out.println("It is a palandrome");
        }
        else
        {
            System.out.println("Its not a palandrome");
        }

    }
}
