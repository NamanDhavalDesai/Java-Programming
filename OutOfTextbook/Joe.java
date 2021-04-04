import java.util.*;
class Joe
{
public static void main()
{
Scanner ob=new Scanner(System.in);
int n,r,n1,sq,sum=0;
System.out.println("Enter a number to prove its a neon number");
n=ob.nextInt();
n1=n;
sq=n*n;
while(sq>0)
{
r=sq%10;
sq=sq/10;
sum=sum+r;
}
if(sum==n1)
{
System.out.println("Neon number");
}
else
{
System.out.println("Not a neon number");
}
}
}
