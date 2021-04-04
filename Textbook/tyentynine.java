import java.util.*;
class tyentynine
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        int a;
        
        System.out.println("enter your number with accordance to the days of the week");
        a=ob.nextInt();
        
       switch(a)
       {
        case 1:
        System.out.println("sunday");
        break;
         case 2:
        System.out.println("monday");
        break;
         case 3:
        System.out.println("tuesday");
         case 4:
        System.out.println("wednesday");
         case 5:
        System.out.println("thursday");
        case 6:
        System.out.println("friday");
        case 7:
        System.out.println("saturday");
    }
    
    
    
    
}
}