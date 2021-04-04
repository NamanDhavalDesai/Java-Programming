import java.util.*;
class thirtythree
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        
       double b,c,d;
        
        
        
        System.out.println("enter no of calls");
        b=ob.nextDouble();
        
       if(b<100) 
       {
       c=b*1; 
        }
        else if(b<150)
        {   
        c=100+(b-100)*0.80;
        }
       else if(b<175)
       {
       c=100+0.80*50+(b-150)*0.60;
       }
       else 
       {
       c=100+0.80*50+25*0.60+(b-175)*0.50;    
       }    
       System.out.println("the amount is "+c);
       d=0.1224*c;
       System.out.println("the total amount is "+d);
       
       
}}