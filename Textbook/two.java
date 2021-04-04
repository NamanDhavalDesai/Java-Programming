import java.util.*;
class two
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        int a,b;
        System.out.println("enter your number");
        a=ob.nextInt();
        if(a%2==0)
        {
            System.out.println("EVEN number");
        }
        else
        {
            System.out.println("ODD number");
        }
    }
}