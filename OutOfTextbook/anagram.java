import java.util.*;
class anagram
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter a word");
        String a=ob.next();
        System.out.println("enter a word");
        String b=ob.next();
        int c,d,g=0;
        char e,f;
        a=a.trim();
        b=b.trim();
        for(c=0;c<a.length();c++)
        {
            e=a.charAt(c);
            for(d=0;d<b.length();d++)
            {
                f=b.charAt(d);
                if(e==f)
                    g++;
            }
        }
        if(g>=b.length()&&a.length()==b.length())
            System.out.println("it ocurs");
        else
            System.out.println("it doesent ocur");
    }
}