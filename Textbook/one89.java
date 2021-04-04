import java.util.*;
class one89
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
            if(a.charAt(c)=='a')
            {
                d++;
            }

        }
        System.out.println("the no of a are "+d);
    }
}
