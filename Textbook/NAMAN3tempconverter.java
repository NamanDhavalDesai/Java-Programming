import java.util.*;
class NAMAN3tempconverter
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        double a,c;
        char b;
        System.out.println("enter the temp ");
        a=ob.nextInt();
        System.out.println("enter the scale");
        b=ob.next().charAt(0);
        c=NAMAN3.tempconverter(a,b);
        
        if(b=='F'||b=='f')
        {
            System.out.print("the temp is "+c);
            System.out.print("`c");
        }
        else if(b=='C'||b=='c')
        {
            System.out.print("the temp is "+c);
            System.out.print("`f");
        }
        
        
        
        
    }
}