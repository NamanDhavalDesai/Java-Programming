import java.util.*;
class mirror
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        int a1,b1,c,d,e,a,b=0,s,t,u,w,x,y,z;
        double r,v=0;
        System.out.println("enter a no");
        a1=ob.nextInt();
        System.out.println("enter a no");
        b1=ob.nextInt();
        d=a1;
        while(d>0)
        {
            c=d%10;
            d=d/10;
            b++;
        }
        r=Math.pow(10,b-1);
        u=a1;
        s=b;
        while(s>=1)
        {
            t=u%10;
            v=v+(t*r);
            s--;
            r=r/10;
            u=u/10;
        }    
        z=(int)v;
        if(z==b1)
        {
            System.out.print("mirror no");
        }
        else
        {
            System.out.print("not a mirror no");
        }
    }
}