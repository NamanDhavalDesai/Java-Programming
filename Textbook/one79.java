import java.util.*;
class one79
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        int a,b,c,e,f,g;
       
        do
        {
        System.out.println("enter marks of three subjects out of 100");
        a=ob.nextInt();
        b=ob.nextInt();
        c=ob.nextInt();
        f=(int)(a+b+c)/3;
        e=(int)(((a+b+c)/300)*100);
        System.out.println("the average is"+f);
        if(e>=75)
        {
          System.out.println("a grade");
        }
        else if(e>50)
        {
            System.out.println("b grade");
        }
        else
        {
            System.out.println("c grade");
        }
        System.out.println("if you wanna cont enter 1");
        g=ob.nextInt();
    }while(g==1);
}}
        
        
        
        