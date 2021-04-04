import java.util.*;
class three89
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        String a,x="";
        char b,z;
        int c,d=0;
        System.out.println("enter a word");
        a=ob.nextLine();
        for(c=0;c<(a.length());c++)
        {
            z=a.charAt(c);
            if(a.charAt(c)=='a' )
            {
                z='A';
            }
            if(a.charAt(c)=='e' )
            {
                z='E';
            }
            if(a.charAt(c)=='i' )
            {
                z='I';
            }
            if(a.charAt(c)=='o' )
            {
                z='O';
            }
            if(a.charAt(c)=='u' )
            {
                z='U';
            }
            x=x+z;
        }
        System.out.println(x);
    }
}
