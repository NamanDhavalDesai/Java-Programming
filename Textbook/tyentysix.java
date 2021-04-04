import java.util.*;
class tyentysix
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        char a;
        System.out.println(" a if india");
        System.out.println(" b if china");
        System.out.println(" c if japan");
        System.out.println(" d if australia");
        System.out.println(" e if russia");
        System.out.println("enter your letter");
        a=ob.next().charAt(0);
        
       switch(a)
       {
           case 'a':case 'A':
           System.out.println(" the capital is delhi and currency is rupees");
           
        break;
        case 'b':case 'B':
        System.out.println(" the capital is shanghai and currency is yuan");
        break;
        case 'c':case 'C':
        System.out.println(" the capital is tokyo and currency is yen");
        case 'd':case 'D':
        System.out.println(" the capital is sydney and currency is euro");
        case 'e':case 'E':
        System.out.println(" the capital is  moscow and currency is ruble");
    }
    
    
    
    
}
}