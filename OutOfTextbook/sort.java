
import java.util.*;
class sort 
{
public static void main()
{
int i,j,t,a[]={200,300,196,235,198,375,};
for (i=0;i<5;i++)
{
for(j=i+1;j<5;j++)
{
if(a[i]<a[j])
{
t=a[i];
a[i]=a[j];
a[j]=t;
}}}
for (i=0;i<5;i++)
System.out.println(a[i]);
}}
