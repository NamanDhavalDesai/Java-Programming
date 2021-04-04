import java.util.*;
class automorphic
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        int a,b,z=1,c=0,d=0,y=1;

        System.out.println("enter a no");
        a=ob.nextInt();
        b=a*a;
        while(z>0)
        {
            c=b%10;
            z--;
        }
        while(y>0)
        {
            d=a%10;
            y--;
        }
        if(c==d)
        {
            System.out.print("automorphic no");
        }
        else
        {
            System.out.print("not a automorphic no");
        }
    }}