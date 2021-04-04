import java.util.*;
class six87op
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        int sides=4;
        System.out.println("Enter the no of sides are 3 or 4");
        sides=ob.nextInt();
        if(sides!=3 && sides!=4)
        {
            System.out.println("Enter properly");
        }
        int l,b,h,w;
        if(sides==3)
        {

            System.out.println("Enter base height ");
            b=ob.nextInt();
            h=ob.nextInt();

        }
        else
        {
            System.out.println("Length and breadth");
            b=ob.nextInt();
            h=ob.nextInt();

        }
        six87 naman=new six87(sides,b,h);
        naman.setNameAndArea();
        naman.show();
    }
}
        
    
