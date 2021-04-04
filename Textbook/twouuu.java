import java .util.*;
class twouuu
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        double a,r,b,c;
        System.out.println("Enter 2 numbers");
        r=ob.nextDouble();
        b=ob.nextDouble();
        System.out.println("please select any one of the following");
        System.out.println("1.area of rectangle");
        System.out.println("2.area of triangle");
        System.out.println("enetr your choice");
        a=ob.nextInt();
        if(a==1)
        {
            c=b*r;
            System.out.println("AREA of rectangle= "+c);
        }
        else if(a==2) 
        {
            c=1/2*b*r;
            System.out.println("area of triangle= "+c);
        }
        else
        {
            System.out.println("invalid choice ");
        }
    }
}