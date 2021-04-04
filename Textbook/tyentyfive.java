import java.util.*;
class tyentyfive
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        int a,b,c,d,e,f,g;
        System.out.println("press one if rectangle");
        System.out.println("press two if circle");
        System.out.println("press three if triangle");
        System.out.println("enter your number");
        a=ob.nextInt();

        switch(a)
        {
            case 1:
            System.out.println("enter the length and width");
            b=ob.nextInt();
            c=ob.nextInt();
            g=b*c;
            System.out.println("so the area is "+g);
            break;
            case 2:
            System.out.println("enter the radius");
            d=ob.nextInt();
            g=22/7*d*d;
            System.out.println("so the area is "+g);
            break;
            case 3:
            System.out.println("enter the base and height");
            e=ob.nextInt();
            f=ob.nextInt();
            g=(e*f)/2;
            System.out.println("so the area is "+g);
        }

    
    }
}