import java.util.*;
class qwerty
{
public static void main()
{


Scanner ob=new Scanner(System.in);


int a;
int b;
int s;
double d;


System.out.println("enter the THE QUANTITY");
a=ob.nextInt();
System.out.println("enter the price");
b=ob.nextInt();


s=a*b;


if(s<=20000 && s>=0)
{
d=0.02*s;

}

else if(s<30000 && s>=20000)
{
d=0.03*s;

}

 else
{
d=0.04*s;

}
System.out.println("the final price is"+d);

}
}

