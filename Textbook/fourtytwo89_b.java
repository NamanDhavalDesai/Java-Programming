import java.util.*;
class fourtytwo89_b
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        int c,d,g=0,a1;
        char e,z;
        String a,b,f="",y="",a2,y1;
        System.out.println("enter a sentance");
        a=ob.nextLine();
        a=a.trim();
        a=a+" ";
        d=a.length();
        a1=a.indexOf(' ');
        a2=a.substring(0,a1-1);
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
         y1=a2+y;
         y=y1.substring(0,y1.length()-1);
         System.out.println(y);
        
        
        

    }
}