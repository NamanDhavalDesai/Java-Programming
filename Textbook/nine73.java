
class nine73
{
public static void main()
{
long a=0,b=0,c;


for(c=a ; c<b ; c++)
{
    if(c%3==0)
    {
        b=b+c;
    }
    if(c%7==0)
    {
        a=a+c;
    }
}
System.out.println("the sum of no divisable by 3 is"+b);
System.out.println("the sum of no divisable by 7 is"+a);




}
}