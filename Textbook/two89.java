import java.util.*;
class two89
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        String a;
        char b;
        int c,d=0;
        System.out.println("enter a word");
        a=ob.nextLine();
        for(c=0;c<(a.length());c++)
        {
            if(a.charAt(c)=='a' )
            {
                d++;
            }
            if(a.charAt(c)=='e' )
            {
                d++;
            }
            if(a.charAt(c)=='i' )
            {
                d++;
            }
            if(a.charAt(c)=='o' )
            {
                d++;
            }
            if(a.charAt(c)=='u' )
            {
                d++;
            }
        }
        System.out.println("the no of a are "+d);
    }
}
