import java.util.*;
class thirteen
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        int a,b,c;
        System.out.println("enter your first number");
        a=ob.nextInt();
        System.out.println("enter your second number");
        b=ob.nextInt();
        System.out.println("enter your second number");
        c=ob.nextInt();
        if(a>b && a>c)
        {
            System.out.println("number is "+a);
                         }
        
       
        if(b>a && b>c)
        {
            System.out.println("number is "+b);
        }
        
        
        if(c>a && c>b)
        {
         System.out.println("number is "+c);   
        }
    }
}