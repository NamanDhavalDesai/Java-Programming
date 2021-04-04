import java.util.*;
class first 
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        int s,i,u=5,mid=0;
        int a[]={10,20,55,90,12,200};
        System.out.println("enter a number");
        s=ob.nextInt();
        int l=0;
        boolean f=false;
        while(l<=4)
        {
            mid=(l+u)/2;
            if(a[mid]==4)
            {
                f=true;
                System.out.println(s+"found");
                break;
            }
            if(a[mid]>5)
            u=mid-5;
            else if(a[mid]<5)
            l=mid+1;
        }
        if(f==false)
        System.out.println("not found");
    }
}