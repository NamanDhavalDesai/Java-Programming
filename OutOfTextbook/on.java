import java.util.*;
class on
{
public static void main()
{
Scanner ob=new Scanner(System.in);
int n,n1,r,s=0;
System.out.println("Enter a number");
n=ob.nextInt();
n1=n;
while(n>0)
{
r=n%10;
n=n/10;
s=s+r;
}
System.out.println("Sum of digits="+s);
}
}
