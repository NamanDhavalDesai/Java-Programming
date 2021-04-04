import java.util.*;
class thirteen89
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        int c,d,g=0;
        char e;
        String a,b,f="",z="",c1;
        System.out.println("enter a sentance");
        a=ob.nextLine();
        System.out.println("enter a word to find");
        b=ob.nextLine();
        System.out.println("enter a word to sleep");
        c1=ob.nextLine();
        a=a.trim();
        a=a+" ";
        d=a.length();

        for(c=0;c<d;c++)
        {
            e=a.charAt(c);
            if(e!=' ')
            {
                f=f+e;
                continue;
            }

            if(f.equals(b)==true)
            {
                f=c1;
            }
            z=z+f+' ';
            f="";
        }
        System.out.println(z);
    }
}