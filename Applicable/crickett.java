import java.util.*;
class crickett
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        int a,b,c,e,f,h,i,k,l=0,m,n,p,q=0,r;
        double d,g,j,o;

        System.out.println("1-5 odd and 6-9 even");
        c=ob.nextInt();
        e=(int)((Math.random())*10);
        if(c<=5&&e<=5||c>5&&e>5)
        {
            System.out.println("you win the toss");
            System.out.println("1-5 bat and 6-9 ball");
            f=ob.nextInt();
        }
        else
        {
            f=(int)((Math.random())*10);
        }
        if(f<=5)
            System.out.println("you chose to bat");
        else 
            System.out.println("you chose to ball");
        if(f<=5)
        {
            for(h=1;h<=1000;h++)
            {

                System.out.println("enter a number");
                i=ob.nextInt();
                k=(int)((Math.random())*10);

                System.out.println("their no is "+k);
                if(i!=k)
                {
                    l=l+i;
                }
                else
                {
                    break;
                }

                System.out.println("your score is  "+l);
            }

            System.out.println("your score is  "+l);
            for(m=1;m<=100;m++)
            {

                System.out.println("enter your no");
                n=ob.nextInt();
                p=(int)((Math.random())*10);

                System.out.println("their no is "+p);
                if(p!=n)
                {
                    q=q+p;
                }
                else
                {
                    if(q<l)
                    {

                        System.out.println("their score is"+q);
                        r=l-q;
                        System.out.print("you win by "+r+" runs");
                        break;
                    }
                }

                System.out.println("their score is"+q);
                if(q>l)
                {
                    System.out.print("you loose");
                    break;
                }
            }
        }
        else
        {
            for(m=1;m<=100;m++)
            {

                System.out.println("enter your no");
                n=ob.nextInt();
                p=(int)((Math.random())*10);
                System.out.println("their no is "+p);
                if(p!=n)
                {
                    q=q+p;
                }
                else
                {
                    break;
                }

                System.out.println("their score is "+q);
            }

            System.out.println("their score is "+q);    
            for(h=1;h<=1000;h++)
            {

                System.out.println("enter a number");
                i=ob.nextInt();
                k=(int)((Math.random())*10);
                System.out.println("their no is "+k);
                if(i!=k)
                {
                    l=l+i;
                }
                else
                {
                    if(q>l)
                    {

                        System.out.println("your score is"+l);
                        r=q-l;
                        System.out.print("you loose by "+r);
                        System.out.println(" runs. ");
                        break;
                    }
                }

                System.out.println("your score is"+l);
                if(l>q)
                {
                    r=l-q;
                    System.out.print("you win");
                }   
            } 
        }    

        a=0;b=0;c=0;d=0;e=0;f=0;g=0;h=0;i=0;j=0;k=0;l=0;m=0;n=0;o=0;p=0;q=0;r=0;
    }
}