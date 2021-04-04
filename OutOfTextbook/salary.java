import java.util.*;
class salary
{
public static void main()
{
int bs;double hra,da,pf,gs,ns;
Scanner ob=new Scanner(System.in);
System.out.println("Enter Basic Salary");
bs=ob.nextInt();
hra=0.15*bs;
da=0.18*bs;
pf=0.10*bs;
gs=bs+hra+da;
ns=gs- pf;
System.out.println("Net salary"+ns);
}}