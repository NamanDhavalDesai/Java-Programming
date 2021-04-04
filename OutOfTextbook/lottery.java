import java.util.*;
class lottery
{
public static void main()
{
Scanner ob=new Scanner(System.in);
double d,f,h,j,k,x,y,z;
int e, g,i,a,b,c;
System.out.println("enter your number");
a=ob.nextInt();
System.out.println("enter your number");
b=ob.nextInt();
System.out.println("enter your number");
c=ob.nextInt();

x=(Math.random())*10;
e=(int)x;
y=(Math.random())*10;
g=(int)y;

z=(Math.random())*10;
i=(int)z;
System.out.print("\nyour first guess "+a);
System.out.print("\nyour second guess "+b);
System.out.print("\nyour third guess "+c);
System.out.print("\nand");
System.out.print("\ncomputer first no"+e);
System.out.print("\ncomputer second no"+g);
System.out.print("\ncomputer third no"+i);
System.out.print("\nso ");
if(a==e && b==g && c==i)
{
System.out.println(" omg all are right so you get a trip to the US");
}
else if(a==e &&  b==g ||a==e && c==i || b==g && c==i)
{
System.out.println("nice guess two are right so you get a treat from me");
}
else if(a==e || b==g || c==i)
{
System.out.println("not bad one is correct so you get 1000 ruppes"); 
}
else
{
System.out.println("sorry all are wrong so you get nothing");    
}
}
}





