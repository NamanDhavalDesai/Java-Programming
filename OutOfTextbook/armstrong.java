import java.util.*;
class armstrong
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        int a,b,c,e;
        double d=0;
        System.out.println("enter a no");
        a=ob.nextInt();
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
    }}