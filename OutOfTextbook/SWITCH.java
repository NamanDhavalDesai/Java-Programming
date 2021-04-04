import java.util.*;
class SWITCH
{
public static void main()
{
Scanner ob=new Scanner(System.in);
int a,r;
double A,p;
System.out.println("1.area of the circle");
System.out.println("2.perimeter of the circle");
System.out.println("choose any one");
a=ob.nextInt();
System.out.println("enter ur rADIUS");
r=ob.nextInt();
switch(a)
{
case 1:
A=3.14*r*r;
System.out.println("area is"+A);
break;
case 2:
p=2*3.14*r;
System.out.println("perimeter is"+p);
break;
default:
System.out.println("invalid");
}
}
}