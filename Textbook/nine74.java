import java.util.*;
class nine74

{
public static void main()
{
int a=0,b,c=0;
Scanner ob=new Scanner(System.in);
System.out.println("Enten a no");
b=ob.nextInt();
while(b>0)
{
a=b%10;
b/=10;
if(a%2==0)
{
System.out.println(a);    
}
}
}
}    