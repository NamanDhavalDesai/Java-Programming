import java.util.*;
class ninetytwo12
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        int a[]={1,2,3,4,5};
        String b[]={"a","b","c","d","e"};
        int c[]={10,9,8,7,6};
        System.out.println("enter roll no");
        int d=ob.nextInt();
        if(d>=1&&d<=5)              
        {
            System.out.println(b[d-1]);
            System.out.println(c[d]-1);
        }
    }
}