import java.util.*;
class sumproduct
{
public static void main()
{
Scanner ob=new Scanner(System.in);
int q, r ,n ,s , p;
System.out.println("Enter two digit number");
n=ob.nextInt();
r=n%10;
q=n/10;
if (n%2==0)
{s=r+q;
System.out.println("Sum of number is "+s);}
else
{p=r*q;
System.out.println("Product of number is "+p);}
}}