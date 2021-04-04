import java.util.*;
class twelwe89
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        int c,d,g=0;
        char e;
        String a,b,f="";
        System.out.println("enter a sentance");
        a=ob.nextLine();
        System.out.println("enter a word to find ");
        b=ob.nextLine();
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
                g++;
            }
           
            f="";
        }
       
        if(g>=1)
            System.out.println("the word comes in the sentance");
        else
            System.out.println("the word dosent come in the sentance");
    }
}