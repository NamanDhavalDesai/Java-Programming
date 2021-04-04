import java.util.*;
class NO2
{
public static void main()
{
Scanner ob=new Scanner(System.in);
int a,b,n;

int r;
System.out.println("Enter the first no");
n=ob.nextInt();
System.out.println("Enter your second no.");
r=ob.nextInt();

if(n>=10 && r<=99)
{
a=n+r;
System.out.println("the ans is"+a);
}
else 
{
System.out.println("type properly");
}
}
}

