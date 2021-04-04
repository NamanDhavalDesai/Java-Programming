import java.util.*;
class bluej
{
public static void main()
{
Scanner ob=new Scanner(System.in);
double a,b,h,d,e,f,g;int c;
for(g=1;g>=10;g++)//
{
System.out.println("enter your no");
a=ob.nextInt();
h=((Math.random())*10);
c=(int)h;    
System.out.println('\f');
System.out.println("your guess is "+a);
System.out.println("comuters guess is"+c);
System.out.print("so");
if(a==c)
{
System.out.println("you win.");
}
else
{
System.out.println("you loose");
}    
}
}
}    