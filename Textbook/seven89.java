import java.util.*;
class seven89
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        String a,x="";
        char b,z;
        int c,d=0;
        System.out.println("enter a word");
        a=ob.nextLine();
        for(c=(a.length()-1);c>=0;c--)
        {
            z=a.charAt(c);
            x=x+z;
        }
        System.out.println(x);
    }
}
