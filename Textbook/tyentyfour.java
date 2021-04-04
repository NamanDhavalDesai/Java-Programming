import java.util.*;
class tyentyfour
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        double a,b,c;
        System.out.println("if you want to change the temp from fahrenheit to celius press 1 or if wise versa press two");
        a=ob.nextInt();
      System.out.println("enter the temp");
        c=ob.nextInt();
        if(a==1)
        {
          b=((c-32)*5)/9;
        }
        else
        {
          b=(c*1.8)+32;  
        }
        System.out.println("the ans is"+b);
    }
}