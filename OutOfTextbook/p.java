import java.util.*;
class p
{
public static void main()
{
Scanner ob=new Scanner(System.in);
int n,n1,r,rev=0;
System.out.println("Enter a number");
n=ob.nextInt();
n1=n;
while(n>0)
{
r=n%10;
n=n/10;
rev=(rev*10)+r;
}
System.out.println("ReVERSE OF THE NUMBER="+rev);
}
}

