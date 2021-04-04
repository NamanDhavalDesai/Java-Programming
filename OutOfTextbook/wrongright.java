import java.util.*;
class wrongright
{
public static void main()
{
Scanner ob=new Scanner(System.in);
int n,r,q,ch,s=0,p=0;
System.out.println("Enter 2 digit number");
n=ob.nextInt();
System.out.println("1.Sum of even digits");
System.out.println("2.Product of odd digits");
System.out.println("Enter your choice");
r=n%10;
q=n/10;
ch=ob.nextInt();
if(ch==1)
{
if(r%2==0)
s=r+r;
System.out.println("Sum of even digits"+s);
}
else if(q%2==1)
p=q*q;
System.out.println("Product of odd digits"+p);
}}


