import java.util.*;
class thirtyfour

{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        
       double b,c,d;
        
        
        
        System.out.println("enter no of kilometers");
        b=ob.nextDouble();
        
       if(b<5) 
       {
       c=b*5.50; 
        }
        else if(b<10)
        {   
        c=5*5.50+(b-5)*4;
        }
       else if(b<40)
       {
       c=5*5.50+20+(b-10)*3.50;
       }
       else 
       {
       c=5*5.50+20+30*3.50+(b-40)*15;    
       }    
       System.out.println("the amount is "+c);
       
       
}}