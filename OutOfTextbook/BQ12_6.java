import java.util.*;
class BQ12_6
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter a word");
        String s=ob.next();
        int a,d=0;
        char b,c;
        for(a=0;a<s.length()-1;a++)
        {
            b=s.charAt(a);
            c=s.charAt(a+1);
            if(b==c)
                d++;
        }
        System.out.println(d);
    }
}
    