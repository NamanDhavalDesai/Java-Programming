import java.util.*;
class perfectabundantdeficientmaian
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        int a,b,c;
        System.out.println("enter no");
        a=ob.nextInt();
       c=NAMAN3.PDA(a);
        if(c==0)
        {
            System.out.println("the no is perfect");
        }
        else if(c==1)
        {
              System.out.println("the no is abundant");
        }
        else
        {
              System.out.println("the no is deficient");
        }
    }
}