import java.util.*;
class neon
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        int a,b,c,e,d=0;
        
        System.out.println("enter a no");
        a=ob.nextInt();
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
    }}