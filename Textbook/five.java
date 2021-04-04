import java.util.*;
class five
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        int a,b;
        System.out.println("enter your marks");
        a=ob.nextInt();
        if(a>=40&&a<100)
        {
            System.out.println("pass");
        }
        else
        {
            System.out.println("fail");
        }
        if(a>=100)
        {
            System.out.println("you are lying");
        }
    }
}