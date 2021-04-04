import java .util.*;
class p7
{
public static void main()
{
int a;
double b,l,c,h;
Scanner ob=new Scanner(System.in);
System.out.println("1. area of rectangle");
System.out.println("2.area of triangle");
System.out.println("make ur choice");
a=ob.nextInt();
if(a==1)
{
System.out.println("enter breadth");
b=ob.nextDouble();
System.out.println("enter lenght");
l=ob.nextDouble();
c=b*l;
System.out.println("thr area of rectangle is "+c);
}
else if(a==2)
{
System.out.println("enter height");
h=ob.nextDouble();
System.out.println("enter breadth");
b=ob.nextDouble();
c=0.5*b*h;
System.out.println("the area is "+c);
}}}