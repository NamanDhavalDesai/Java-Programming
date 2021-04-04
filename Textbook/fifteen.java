import java.util.*;
class fifteen
{
public static void main()
{
Scanner ob=new Scanner(System.in);
int a=0,b=0,c=0,d=0,e=0,f=0,g=0,h=0,i=0;
System.out.println("enter your number");

a=ob.nextInt();
System.out.println("enter your number");
b=ob.nextInt();
System.out.println("enter your number");
c=ob.nextInt();
System.out.println("enter your number");
d=ob.nextInt();
System.out.println('\f');
if(a>b && a>c && a>d)
{
e=a;
if(b>d && b>c)
{
f=b;
if(c>d)
{
g=c;
}
else
{
g=d;
}       
if(c>b && b>c)
{
f=c;
if(b>d)
{
g=b;
}
else
{
g=d;
}       
if(d>b && d>c)
{
f=d;  
if(c>b)
{
g=c;
}
else
{
g=b;
}       
}
}
if(b>a && b>c && b>d)
{
e=b;
if(a>d && a>c)
{
f=a;
if(c>d)
{
g=c;
}
else
{
g=d;
}       
if(c>a && c>d)
{
f=c;
if(a>d)
{
g=a;
}
else
{
g=d;
}       
if(d>b && d>c)
{
f=d;  
if(c>a)
{
g=c;
}
else
{
g=a;
}       
}
}
if(c>b && c>a && c>d)
{
e=c;
if(b>d && b>c)
{
f=b;
if(a>d)
{
g=a;
}
else
{
g=d;
}       
if(a>b && a>c)
{
f=a;
if(b>d)
{
g=b;
}
else
{
g=d;
}       
if(d>b && d>c)
{
f=d;  
if(a>b)
{
g=a;
}
else
{
g=b;
}       
}
}
if(d>b && d>c && d>a)
{
e=d;
if(b>d && b>c)
{
f=b;
if(c>a)
{
g=c;
}
else
{
g=a;
}       
if(c>b && b>c)
{
f=c;
if(b>a)
{
g=b;
}
else
{
g=a;
}       
if(a>b && a>c)
{
f=d;  
if(c>b)
{
g=c;
}
else
{
g=b;
}       
}
}
}
}
}
}            
}  
}
}
}
if(a<b && a<c && a<d)
{
i=a;
}
else if (b<a && b<c && b<d)
{
i=b;
}
else if(c>a && c>b && c>d)
{
i=c;
}
else 
{
i=d;
}
System.out.println("."+e);
System.out.println("."+f);
System.out.println("."+g);
System.out.println("."+i);
}
}
