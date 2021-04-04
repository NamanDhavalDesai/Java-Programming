import java.util.*;
class BQ14_6
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter a word");
        String a=ob.next();
        a=a.trim();
       System.out.println(a.substring(a.lastIndexOf('/')+1,a.lastIndexOf('.')));
       System.out.println(a.substring(a.lastIndexOf('.')+1)); 

    }
}