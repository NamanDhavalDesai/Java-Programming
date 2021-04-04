import java.util.*;
class COUNTRIESCAPITALS
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        int a;
        System.out.println("1.india");
        System.out.println("2.russia");
        System.out.println("3.china");
        System.out.println("4.japan");
        System.out.println("5.australia");
        System.out.println("enter ur choice");
        a=ob.nextInt();
        switch(a)
        {
            case 1:
            System.out.println("currency is rupees");
            System.out.println("capital delhi");
            break;
            case 2:
            System.out.println("currency is rubel");
            System.out.println("capital moscow");
            break;
            case 3:
            System.out.println("currency is yuan");
            System.out.println("capital beijing");
            break;
            case 4:
            System.out.println("currency is yen");
            System.out.println("capital tokyo");
            break;
            case 5:
            System.out.println("currency is australian dollar");
            System.out.println("capital canberra");
            break;
            default:
            System.out.println("invalid");
        }
    }
}
