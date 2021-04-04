import java.util.*;
class changedvovels
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter a word");
        String a=ob.next();
        int c,d,g=0;
        char e,f,z;
        String s="";
        a=a.trim();

        for(c=0;c<a.length();c++)
        {
            e=a.charAt(c);
            z=e;
            if("AEIOUaeiou".indexOf(e)!=-1)
            {
                z=(char)(e+1);
            }
            s=s+z;
        }

        System.out.println(s);

    }
}