import java.util.*;
class fourtytwo89_a
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        int c,d,g=0;
        char e,z;
        String a,b,f="",y="";
        System.out.println("enter a sentance");
        a=ob.nextLine();
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

            z=f.charAt(0);
            y=y+z+'.';

            f="";
        }

        y=y.substring(0,y.length()-1);
        System.out.println(y);

    }
}