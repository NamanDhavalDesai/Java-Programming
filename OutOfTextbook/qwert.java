import java.util.*;
class qwert
{
public static void main()
{
Scanner ob=new Scanner(System.in);
int a;
int b,c,d,e,f,g;
String name;
System.out.println("enter the the name");
name=ob.next();
System.out.println("enter the  roll no");
e=ob.nextInt();
System.out.println("enter the mark one");
a=ob.nextInt();
System.out.println("enter the mark two");
b=ob.nextInt();
System.out.println("enter the mark three");
c=ob.nextInt();
System.out.println("enter the mark four");
d=ob.nextInt();
System.out.println('\f');
f=a+b+c+d;
g=f/4;
System.out.println("your name is "+name);
System.out.println("your roll no is "+e);
System.out.println("your percentage is"+g);
System.out.print("so ");
if(g<=100 && g>=91)
{
System.out.println("we will pay your fees");
}
else if(g<=90 && g>=81)
{
System.out.println("exelent");
}
else if(g<=80 && g>=71)
{
System.out.println("very good");
}
else if(g<=70 && g>=61)    
{
System.out.println("good");
}
else if(g<=60 && g>=51)    
{
System.out.println("ok");
}
else if(g<=50 && g>=41)    
{
System.out.println("bad");
}
else if(g<=40 && g>=31)    
{
System.out.println("very bad");
}
else if(g<=30 && g>=21)    
{
System.out.println("pay extra fees");
}
else if(g<=20 && g>=11)    
{
System.out.println("pay excessevly extra fees");
}
else if(g<=10 && g>=0)    
{
System.out.println("we do not need you");
}
}
}