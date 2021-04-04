import java.util.*;
class sixteen
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        char a,b;
        System.out.println("enter your letter");
        a=ob.next().charAt(0);
          if(a>='1' && a<='9')
        {
            System.out.println("number");
        }
         else if(a>='A' && a<='Z')
        {
            System.out.println("uppercase letter");
        }
        else if(a>='a' && a<='z')
        {
            System.out.println("lowercase letter");
        }
        else 
        {
            System.out.println("special charecter");
        }
    }
}

            