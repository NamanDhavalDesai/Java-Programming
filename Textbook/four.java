import java.util.*;
class four
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        char a,b;
        System.out.println("enter your letter");
        a=ob.next().charAt(0);
        if(a>='A' && a<='Z')
        {
            System.out.println("uppercase letter");
        }
        else
        {
            System.out.println("lowercase letter");
        }
    }
}

            