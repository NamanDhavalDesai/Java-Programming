import java.util.*;
class six
{
    public static  void main()
    {
        Scanner ob=new Scanner(System.in);
        int a,b;
        System.out.println("enter your age");
        a=ob.nextInt();
        if(a>0)
        {
            if(a>=18)
            {
                System.out.println("major have fun vote drive");
            }
            else
            {
                System.out.println("minors go home cry to your mama");
            }
        }
        else
        {
            System.out.println("enter properly");
        }
    }
}