import java.util.*;
class thirty
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        int a;
        
    System.out.println("enter your number with accordance to the months of the year");
    a=ob.nextInt();
    if(a>12 && a<=0)
    {
        System.out.println("invalid");
    }
    else
       switch(a)
       {
        case 1:
        System.out.println("january");
        break;
         case 2:
        System.out.println("february");
        break;
         case 3:
        System.out.println("march");
         case 4:
        System.out.println("april");
         case 5:
        System.out.println("may");
        case 6:
        System.out.println("june");
        case 7:
        System.out.println("july");
        case 8:
        System.out.println("august");
        case 9:
        System.out.println("september");
        case 10:
        System.out.println("october");
        case 11:
        System.out.println("november");
        case 12:
        System.out.println("december");
    }
    
    
    
    
}
}