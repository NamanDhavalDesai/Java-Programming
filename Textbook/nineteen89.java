import java.util.*;
class nineteen89
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        int c,d,g=0;
        char e;
        String a,b,f="",z="",c1;
        System.out.println("enter a word");
        a=ob.nextLine();
        a=a.trim();
        d=a.length();
        for(c=0;c<d;c++)
        {
            e=a.charAt(c);
            if(e=='a')
            {
                e=' ';
            }
            if(e=='e')
            {
              e=' ';
            }
            if(e=='i')
            {
                e=' ';
            }
            if(e=='o')
            {
                e=' ';
            }
            if(e=='u')
            {
                e=' ';
            }
            z=z+e;
            
        }
        System.out.println(z);
    }
}