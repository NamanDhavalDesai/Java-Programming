import java.util.*;
class ninetytwo14
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        String a[]={"a","b","c","d","e"};
        String b[]={"monday","tuesday","wednesday","thrusday","friday"};
        System.out.println("enter the name n password");
        String c=ob.next();
        String d=ob.next();
        int f=0,g=0;
        for(int e=0;e<a.length;e++)
        {
            if(a[e].equals(c)==true)
            {
                f++;g=e;
            }
            
        }
        
        if(f>=1)
        {
            if(b[g].equals(d)==true)
            {
                System.out.println("hi");         
            }
            else
             System.out.println("its wrong");
        }
    }
}