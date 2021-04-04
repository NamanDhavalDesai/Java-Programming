import java.util.*;
class nrxsd
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        int a,b,c,d,e,f,g,h,i,j;
        System.out.println(" press one for +");
        System.out.println(" press two for -");
        System.out.println(" press three for *");
        System.out.println(" press four for /");
        System.out.println(" press five for %");

        System.out.println("enter no");
        a=ob.nextInt();
        System.out.println('\f');
        System.out.println("enter first no");
        c=ob.nextInt();
        System.out.println("enter second no");
        b=ob.nextInt();


        switch(a)
        {
            case 1:
            d=c+b;
            System.out.println("the ans is "+d);
            break;
            case 2:
            d=c-b;
            System.out.println("the ans is "+d);
            break;
            case 3:
            d=c*b;
            System.out.println("the ans is "+d);
            break;
            case 4:
            d=c/b;
            System.out.println("the ans is "+d);
            break;
            case 5:
            d=c%b;
            System.out.println("the ans is "+d);
            break;
            default:
            System.out.println("you are lying");
        }
    }
}