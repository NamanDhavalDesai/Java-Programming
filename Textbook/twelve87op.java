import java.util.*;
class twelve87op
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        int sides=0;
        String a,b;
        System.out.println("Enter the no of days");
        sides=ob.nextInt();
         System.out.println("Enter the name");
        a=ob.next();
         System.out.println("Enter the address");
        b=ob.nextLine();
        twelwe87 naman=new twelwe87(sides,a,b);
        naman.calc();
        naman.show();
    }
}
        
    
