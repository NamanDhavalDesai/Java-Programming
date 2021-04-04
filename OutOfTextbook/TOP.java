public class TOP
{
public static void main(int n)//enter a no
{
int a,b,c,s;
//7
s=n;
while(s>9)
{
n=s;s=0;
while(n>0)
{
a=n/15;
b=a*15;
c=n-b;
s=s+c;
n=a;
}
}
if(s==1)
System.out.println("magic no");
else
System.out.println("not a magic no");
}}

