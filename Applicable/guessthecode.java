import java.util.*;
class guessthecode
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        int a[]=new int[4];
        int b,c,d=0,e,f,g=0,h,n,chances,d1=0,d2=0,e1,e2,n1,n2;
        System.out.println("You have to guess the code.");
        System.out.println("Numbers from 1 to 9 can be in one of the digits.");
        System.out.println("0 cant be used.");
        System.out.println("You can only have a particular digit appear once in the code.");
        System.out.println("As the randomized code has particular digit appear once in the code.");
        System.out.println("Press 1 to play solo.");
        System.out.println("Press 2 to play multiplayer.");
        System.out.println("Choose ?");
        do
        {
            b=ob.nextInt();
            c=0;
            if(b==1)
            {
                c=1;
                System.out.println('\f');
                System.out.println("We will tell you how many digits in your code are right , correctly placed and how many are not correctly placed.");
                System.out.println("If you want to know which digits in your code are right , correctly placed and how many are not correctly placed.");
                System.out.println("Enter 1 , to play in beginner's mode else enter 0 for normal mode");
                do
                {
                    e=ob.nextInt();
                }while(e!=1 && e!=0);
                System.out.println("Please enter the length.");
                do
                {
                    f=0;
                    d=ob.nextInt();
                    if(d>=1 && d<=9)
                    {
                        f++;   
                    }
                }while(f==0);
                n=rcg(d);
                System.out.println("Enter the number of chances.");
                chances=ob.nextInt();
                System.out.println('\f');
                for(;;)
                {                 
                    System.out.println("Enter the code.");
                    h=ob.nextInt();
                    if(cv(h,d)==1)
                    {
                        g++;
                        if(e==0)
                        {
                            count(n,h,d);
                        }
                        if(e==1)
                        {
                            count2(n,h,d);
                        }
                        if(h==n)
                        {
                            System.out.println("You win !");
                            break;
                        }
                        if(g==chances)
                        {
                            System.out.println("You loose ...");
                            break;
                        }
                    }
                }
            }
            else if(b==2)
            {
                c=1;
                System.out.println('\f');
                System.out.println("We will tell you how many digits in your code are right , correctly placed and how many are not correctly placed.");
                System.out.println("If you want to know which digits in your code are right , correctly placed and how many are not correctly placed.");
                System.out.println("Enter 1 , to play in beginner's mode else enter 0 for normal mode for player 1.");
                do
                {
                    e1=ob.nextInt();
                }while(e1!=1 && e1!=0);
                System.out.println("Please enter the length for player 1 max is 9.");
                do
                {
                    f=0;
                    d1=ob.nextInt();
                    if(d1>=1 && d1<=9)
                    {
                        f++;   
                    }
                }while(f==0);
                n1=rcg(d1);
                System.out.println("Enter 1 , to play in beginner's mode else enter 0 for normal mode for player 2.");
                do
                {
                    e2=ob.nextInt();
                }while(e2!=1 || e2!=0);
                System.out.println("Please enter the length for player 2 max is 9.");
                do
                {
                    f=0;
                    d2=ob.nextInt();
                    if(d2>=1 && d2<=9)
                    {
                        f++;   
                    }
                }while(f==0);
                n2=rcg(d2);
                System.out.println('\f');
                for(;;)
                {
                    System.out.println("Player 1 enter the code.");
                    h=ob.nextInt();
                    if(cv(h,d1)==1)
                    {
                        g++;
                        if(e1==0)
                        {
                            count(n1,h,d1);
                        }
                        if(e1==1)
                        {
                            count2(n1,h,d1);
                        }
                        if(h==n1)
                        {
                            System.out.println("Player 1 wins !");
                            break;
                        }
                    }
                    System.out.println("Player 1 enter the code.");
                    h=ob.nextInt();
                    if(cv(h,d2)==1)
                    {
                        g++;
                        if(e2==0)
                        {
                            count(n2,h,d2);
                        }
                        if(e2==1)
                        {
                            count2(n2,h,d2);
                        }
                        if(h==n2)
                        {
                            System.out.println("Player 1 wins !");
                            break;
                        }
                    }
                }
            }
            else
            {
                System.out.println("Choose properly !");
            }
        }while(c==0);
    }

    public static int rcg(int d)
    {
        int a[]=new int[d];
        int b,c,e=0,g,h=0,i,j=0,no;
        double f;
        for(b=0;b<a.length;b++)
        {
            a[b]=0;
        }
        for(c=0;c<a.length;c++)
        {
            h=1;
            while(h!=0)
            {
                e=0;
                h=0;
                while(e==0)
                {
                    f=Math.random();
                    f=f*10;
                    e=(int)f;
                }
                for(g=0;g<a.length;g++)
                {
                    if(a[g]==e)
                    {
                        h++;
                    }
                }
            }
            a[c]=e;
        }
        for(i=0;i<a.length;i++)
        {
            j=j+(int)(a[i]*(Math.pow(10,((a.length-1)-(i)))));
        }
        if(j<0)
        {
            j=j*(-1);
        }
        System.out.println("Random code generated");
        return j;
    }

    public static int cv(int h,int d)
    {
        int i,j,k,l,m,o,p=0,ck;
        i=0;
        if(h/Math.pow(10,d-1)>=1)
        {
            i++;
            l=h;
            for(j=1;j<=d-1;j++)
            {
                k=l%10;
                l=l/10;
                p=0;
                ck=l;
                for(m=1;m<=d-j;m++)
                {
                    o=ck%10;
                    ck=ck/10;
                    if(o==k)
                    {
                        p++;
                    }
                }
            }
            if(p>=1)
            {
                System.out.println("Number is invalid !");
            }
            else
            {
                i++;
            }
        }
        else
        {
            System.out.println("Number is invalid !");
        }
        if(i==2)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }

    public static void count(int n,int h,int d)
    {
        int i,j=0,k,l,m,n1,h1,j1=0,ctr=0,ctr2=0;
        k=n;
        h1=h;
        while(h1>0)
        {
            l=h1%10;
            h1=h1/10;
            m=k%10;
            k=k/10;
            if(l==m)
            {
                j++;
            }
        }
        h1=h;
        k=n;
        while(h1>0)
        { 
            ctr++;
            k=n;
            l=h1%10;
            h1=h1/10;
            while(k>0)
            {
                ctr2++;
                m=k%10;
                k=k/10;
                if(ctr2!=ctr)
                {
                    if(l==m)
                    {
                        j1++;
                    }
                }
            }
            ctr2=0;
        }
        System.out.println("The number of digits that are right and are in the right place are "+j+".");
        System.out.println("The number of digits but are right and are in the wrong place are "+j1+".");
        System.out.println("The number of digits but are wrong and are "+(d-j-j1)+".");
    }

    public static void count2(int n,int h,int d)
    {
        int i,j=0,k,l,m,n1,h1,j1=0,ctr=0,ctr2=0;
        k=n;
        h1=h;
        while(h1>0)
        {
            l=h1%10;
            h1=h1/10;
            m=k%10;
            k=k/10;
            if(l==m)
            {
                System.out.println("The number "+m+" is in the correct number and it is in the right place");
            }
        }
        h1=h;
        k=n;
        while(h1>0)
        { 
            ctr++;
            k=n;
            l=h1%10;
            h1=h1/10;
            while(k>0)
            {
                ctr2++;
                m=k%10;
                k=k/10;
                if(ctr2!=ctr)
                {
                    if(l==m)
                    {
                        System.out.println("The number "+m+" is in the correct number but it is in the wrong place");
                    }
                }
            }
            ctr2=0;
        }
        System.out.println("Other number/s are wrong");
    }
}