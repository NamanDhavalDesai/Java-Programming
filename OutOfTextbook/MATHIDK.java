import java.util.*;
class MATHIDK
    {
       public static void main()
           {
               Scanner ob=new Scanner(System.in);
               int n,s,c;
               System.out.println("enter any number");
               n=ob.nextInt();
               if(n%2==0)
                  {
                      c=n*n*n;
                      System.out.println(" is even and cube"+n +c);
                    }
               else
                    {
                        s=n*n;
                        System.out.println(" is odd and square"+n +s);
                    }
                }
            }
