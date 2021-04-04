import java.util.*;
class six73
{
public static void main()
{
Scanner ob=new Scanner(System.in);
long a,b,c;
System.out.println("enter the two nos");
a=ob.nextLong();
b=ob.nextLong();
System.out.println('\f');
for(c=a ; c<b ; c++)
{
    if(c%2!=0)
    {
    System.out.println(c);
}
}
}
}