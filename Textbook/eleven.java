import java.util.*;
class eleven
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        int a,b;
        System.out.print("enter the year 20");
        a=ob.nextInt();
        if(a%4==0)
        {
            System.out.println("leap year");
        }
        else
        {
            System.out.println("normal year");
        }
    }
}

      