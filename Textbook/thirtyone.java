import java.util.*;
class thirtyone
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        
       double b,c=0,d,e=0,f,g,h,i,j,k,m,n,o,p;
        System.out.println("enter 1 if pay bill and enter 2 to recharge");
        d=ob.nextDouble();
        
        
        System.out.println("enter no of calls");
        b=ob.nextDouble();
    if(d==1) 
       {
        if(b<100)
        {   
        c=b*0.60;
        }
       else if(b<200)
       {
       c=0.60*100+(b-100)*1;
       }
       else if(b<400)
       {
       c=0.60*100+100*1+(b-200)*2;    
       }
       else if(b>600)
       {
       f=c*0.01;
       e=f+c;
        }
    }
    else
    {
    e=b*3;
    }
    
     
       System.out.println("the cost is"+e);
}
}