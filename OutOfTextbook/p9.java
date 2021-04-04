import java.util.*;
class p9

{
public static void main()
{
int a,b,c;String max;
Scanner ob=new Scanner(System.in);
System.out.println("enter d first no.");
a=ob.nextInt();
System.out.println("enter d second no.");
b=ob.nextInt();
System.out.println("enter d third no.");
c=ob.nextInt();
max=(a>b)?(a>c)?"a":"c":(b>c)?"b":"c";
System.out.println("the greater no. is "+max);
}}
 