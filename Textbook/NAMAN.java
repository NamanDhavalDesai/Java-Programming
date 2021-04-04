import java.util.*;
class NAMAN
{
    public static void rectangle(int a,int b)
    {
        int c,d;
        c=a*b;
        d=2*(a+b);
        System.out.println("the area is "+c);
        System.out.println("the perimeter is "+d);
    }
    public static void circle(double a1)
    {
        double c,d;
        c=3.14*a1*a1;
        d=3.14*a1*2;
        System.out.println("the area is "+c);
        System.out.println("the perimeter is "+d);
    }
    public static void triangle(double a2,double b2)
    {
        double c;
        c=0.5*a2*b2;
        System.out.println("the area is "+c);
    }
}