import java.util.*;
class special
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        int a,b,c,e=0,d=1,z;
        System.out.println("enter a no");
        a=ob.nextInt();
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
        }}