import java.util.*;
class oddeve
{
public static void main()
{
Scanner ob=new Scanner(System.in);
int n, c, s;
System.out.println("enter any number");
n=ob.nextInt();
if (n%2==0)
{c=n*n*n;
 System.out.println("The number is even and cube is  "+n +c);
}
else
{s=n*n;
 System.out.println("The number is odd and square is "+n +s);
}
}}
                 