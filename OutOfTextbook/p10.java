import java.util.*;
class p10
{
public static void main()
{
int l,b,h,ch;
double a;
Scanner ob=new Scanner(System.in);
System.out.println("1.area of triangle");
System.out.println("2.area of rectangle");
System.out.println("make choice 1 or 2");
ch=ob.nextInt();
switch(ch)
{
case 1:
System.out.println("enter height and breadth");
h=ob.nextInt();
b=ob.nextInt();
a=0.5*b*h;
System.out.println("the area is "+a);
break;
case 2:
System.out.println("enter lenght and breadth");
l=ob.nextInt();
b=ob.nextInt();
a=b*l;
System.out.println("the area is "+a);
break;
default:
System.out.println("invalid");
}}}