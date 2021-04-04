import java.util.*;
class ap
{
public static void main()
{
Scanner ob=new Scanner(System.in);
int a,l,br,bt,h,A;
System.out.println("Enter your choice");
System.out.println("1.area of rectangle");
System.out.println("2.area of triangle");
a=ob.nextInt();
switch(a)
{
case 1:
System.out.println("enter length and breadth");
l=ob.nextInt();
br=ob.nextInt();
A=l*br;
System.out.println("Area of rectangle"+A);
break;
case 2:
System.out.println("Enter height and base");
bt=ob.nextInt();
h=ob.nextInt();
A=1/2*bt*h;
System.out.println("Area of triangle"+A);
break;
default:
System.out.println("Invalid");
}}}