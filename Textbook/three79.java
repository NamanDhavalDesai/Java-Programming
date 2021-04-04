import java.util.*;
class three79
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        int a,b=0,c=0,d=0,e=0;

        do
        {
            System.out.println("enter the weight");
            a=ob.nextInt();
            if(a>60)
            {
                b++;
            }
            else if(a>30)
            {
                c++;
            }
            else
            {
                d++;
            }
            e++;
        }while(e<60);
        System.out.println("no of children who are fat"+b);
        System.out.println("no of children who are fit"+c);
        System.out.println("no of children who are thin"+d);
    }}

        