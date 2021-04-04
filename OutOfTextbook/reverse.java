import java.util.*;
class reverse
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        int a,b,c;
        System.out.println("enter a no");
        a=ob.nextInt();
        b=a;
        while(b>0)
        {
            c=b%10;
            b=b/10;
            System.out.print(c);
        }
    }}