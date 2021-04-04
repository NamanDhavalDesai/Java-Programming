import java.util.*;
class ninetytwo10
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        int a[]={1,2,3,4,5};
        String b[]={"monday","tuesday","wednesday","thrusday","friday"};
        System.out.println("enter a no");
        int c=ob.nextInt();
        if(c>=1&&c<=5)
        {
            System.out.println("the day is "+b[c]);

        }
        else if(c>=5&&c<=7)
        {
            System.out.println("its a weekend");

        }
        else 
        System.out.println("enter properly");
    }
}