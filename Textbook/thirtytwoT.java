import java.util.*;
class thirtytwoT

{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        
       double b,c,d;
        
        
        
        System.out.println("enter no of days");
        b=ob.nextDouble();
        
       if(b<7) 
       {
       c=b*3; 
        }
        else if(b<14)
        {   
        c=21+(b-7)*5;
        }
       else if(b<18)
       {
       c=21+35+(b-14)*8;
       }
       else 
       {
       c=21+35+56+(b-18)*15;    
       }    
       System.out.println("the amount is "+c);
       
       
}}