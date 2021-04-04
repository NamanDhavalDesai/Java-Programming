import java.util.*;
class AREA
 {
 public static void main()
  {
    Scanner ob=new Scanner (System.in);
    int a,A,l,ba,h,br;
    System.out.println("choose any 2");
    System.out.println("1.area of rectangle");
    System.out.println("2.area of triangle");
    a=ob.nextInt();
    switch(a)
    {
        case 1:
        System.out.println("enter length & breadth");
        l=ob.nextInt();
        br=ob.nextInt();
        A=l*br;
        System.out.println("the area is"+A);
        break;
        case 2:
        System.out.println("enter height & base");
        h=ob.nextInt();
        ba=ob.nextInt();
        A=1/2*h*ba;
        System.out.println("the area is"+A);
        break;
        default:
        System.out.println("invalid");
    }
}
}
        
        
        