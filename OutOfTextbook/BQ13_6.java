import java.util.*;
class BQ13_6
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter a word");
        String a=ob.next();
        a=a.trim();
        a=a.toUpperCase();
        int b=0;
        for(int c=0;c<a.length();c++)
        {
            char e=a.charAt(c);
            if("AEIOU".indexOf(e)!=-1)
            {
             b=c;
            break;
            }
        }
        System.out.println(a.substring(b)+a.substring(0,b)+"AY");
        

    }
}