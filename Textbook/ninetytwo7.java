import java.util.*;
class ninetytwo7
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        int a[]=new int[5],b,c,max,min;
        for(int i=0;i<a.length;i++)
        {
            System.out.println("enter 5 nos");
            a[i]=ob.nextInt();
        }
        max=a[0]; min=a[0];
        for( int i1=0;i1<a.length;i1++)
        {

            if(a[i1]>max) 
            {
                max=a[i1];   
            }
            if(a[i1]<min) 
            {
                min=a[i1];   
            }

        }
        System.out.println("max = "+max);
        System.out.println("min = "+min);
    }
}