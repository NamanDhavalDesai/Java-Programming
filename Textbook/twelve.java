import java.util.*;
class twelve
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        int a,b,c;
        System.out.println("enter your first angle");
        a=ob.nextInt();
        System.out.println("enter your second angle");
        b=ob.nextInt();
        System.out.println("enter your second angle");
        c=ob.nextInt();
        if(a==b && b==c && a==c)
        {
            System.out.println("equilateral triangle");
        }
        
       
        if(a==b && b==c && a!=c || a==b && a==c && b!=c || a==c && b==c && a!=b )
        {
            System.out.println("isosceles triangle");
        }
        
        
        if(a!=b && b!=c && a!=c)
        {
         System.out.println("scalene triangle");   
        }
    }
}