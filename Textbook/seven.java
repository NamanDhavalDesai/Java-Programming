import java.util.*;
class seven 
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        int a,b,c;
        System.out.println("enter your first number");
        a=ob.nextInt();
        System.out.println("enter your second number");
        b=ob.nextInt();
        if(a>b)
        {
            System.out.println("."+a);
        }
        else
        {
            System.out.println("."+b);
        }
        if(a==b)
        {
            System.out.println("its the same");
        }
    }
}