import java.util.*;
class date

{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter a word");
        String a=ob.next();
        
        int l=a.lastIndexOf('/');
        int l1=a.indexOf('/');
        System.out.println("the year is"+a.substring(l+1));
        System.out.println("the year is"+a.substring(l1+1,l));
        System.out.println("the year is"+a.substring(0,l1));
    }
}