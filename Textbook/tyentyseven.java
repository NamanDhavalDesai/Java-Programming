import java.util.*;
class tyentyseven
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        char a;
        int b,c;
        double d;
        System.out.println(" a if +");
        System.out.println(" b if -");
        System.out.println(" c if *");
        System.out.println(" d if /");
        
        System.out.println("enter your operator + , - , * , / , %");
        a=ob.next().charAt(0);
        
        System.out.println("enter your first no");
        b=ob.nextInt();
        System.out.println("enter your second no");
        c=ob.nextInt();
       switch(a)
       {
           case '+':
           d=b+c;
           System.out.println(" the ans is "+d);
           
        break;
        case '-':
        d=b-c;
        System.out.println(" the ans is "+d);
        break;
        case '*':
        d=b*c;
        System.out.println(" the ans is "+d);
        case '/':
        d=b/c;
        System.out.println(" the ans is "+d);
           }
    
    
    
    
}
}