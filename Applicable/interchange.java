import java.util.*;
class interchange
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        String a;
        System.out.println("Enter a word");
        a=ob.next();
        System.out.println("Enter a hint");
        String z=ob.next();
       
        System.out.println('\f');
        int b;
        b=a.length();
        String c[]=new String[b];
        int f;
        char d;
        String e;
        double h;
        int g;
        int i=0;
        for(f=0;f<b;f++)
        {
            d=a.charAt(f);
            e=d+"";
            c[f]=e;
        }
        while(i<b)
        {
            h=(Math.random())*100;
            g=(int)h;
            if(g<b)
            {
                if(c[g]==null)
                {
                    continue;
                }
                else
                {
                    System.out.print(c[g]);
                    c[g]=null;
                    i++;
                }
            }
        }
        System.out.println("");
        System.out.println("the hint is "+z);
        System.out.println("Enter the word");
        String x=ob.next();
        if(x.equals(a)==true )
        {
            System.out.println("you won");
        }
        else
        {
            System.out.println("you lost");
            System.out.println("the word was "+a);

        }
    }
}

                