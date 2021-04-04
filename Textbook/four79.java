import java.util.*;
class four79
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        int a=0,b=0,c=0,d=0,e=0,f=0,z=0,y=0,x=0,n=0,q=0;

        do
        {
            System.out.println("enter the no of veg pizzas");
            a=ob.nextInt();
            b=b+a;
            if(a>=1)
            {
                z++;    
            }
             System.out.println("enter the no of non veg pizzas");
            c=ob.nextInt();
            d=d+c;
            if(c>=1)
            {
                y++;    
            }
            System.out.println("enter no cold drink");
            n=ob.nextInt();
            q=q+n;
            if(c>=1)
            {
                x++;    
            }
            e++;
        }while(e<100);
        System.out.println("the no of veg pizza are"+b);
        System.out.println(" the no of people who opt for it are"+z);
        
        System.out.println("the no of  non veg pizza are"+d);
        System.out.println(" the no of people who opt for it are"+y);
        
        System.out.println("the no of veg pizza are"+q);
        System.out.println(" the no of people who opt for it are"+x);
    }}

        