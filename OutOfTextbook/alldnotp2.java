import java.util.*;
class alldnotp2
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        int a;
        long b=0,c;
        System.out.println("enter the two nos");
        a=ob.nextInt();
        System.out.println('\f');
        switch(a)
        {
            case 1:
            b=9;
            break;
            case 2:
            b=99;
            break;
            case 3:
            b=999;
            break;
            case 4:
            b=9999;
            break;
            case 5:
            b=99999;
            break;
            case 6:
            b=999999;
            break;
            case 7:
            b=9999999;
            break;
            case 8:
            b=99999999;
            break;
            case 9:
            b=999999999;
            break;

            default:
            System.out.println("dude very big lock i cant");
            break;
        }
        for(c=1 ; c<=b ; c++)
        {
            System.out.println(c);
        }
    }
}
