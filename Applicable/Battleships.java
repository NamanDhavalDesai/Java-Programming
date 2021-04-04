import java.util.*;
class Battleships
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        String a[]=new String[100];
        String b[]=new String[100];
        int s12=0,s13=0,s14=0,s15=0;
        int s22=0,s23=0,s24=0,s25=0;
        int s5c=0,s4c=0,s3c=0,s2c=0;
        int c=0,sd=0,p=0,nt=0,attk=0,win=0,wctr=0,n=0,gm=0;
        int stpr;
        System.out.println("In this game you have to place your ships ammong the 100 squares.");
        System.out.println("You can have 5 block ships , 4 block ships , 3 block ships and 2 block ships.");
        System.out.println("It is your wish how many each player should get and where to place them.");
        System.out.println("You can have a maximum of 3 5 block ships , 4 3 block ships , 5 3 block ships and 6 2 block ships.");
        System.out.println("After placing them you will have to attack perticular squares.");
        System.out.println("If it hits the opponents ship you will get a hit meaning you have drowned that part of his ship.");
        System.out.println("After drowing all the opponents ships you will win the game.");
        for(c=0;c<100;c++)//setting values
        {
            a[c]="   ";
            b[c]="   ";
        }
        //taking no of ships
        do
        { 
            System.out.println("How many 5 block ship does player 1 need the maximum is 3 the minimumis 1.");
            s15=ob.nextInt();
        }while(s15>3 || s15<1);
        do
        {
            System.out.println("How many 4 block ship does player 1 need the maximum is 4 the minimumis 1.");
            s14=ob.nextInt();
        }while(s14>4 || s14<1);
        do{
            System.out.println("How many 3 block ship does player 1 need the maximum is 5 the minimumis 1.");
            s13=ob.nextInt();
        }while(s13>5 || s13<1);
        do
        {
            System.out.println("How many 2 block ship does player 1 need the maximum is 6 the minimumis 1.");
            s12=ob.nextInt();
        }while(s12>6 || s12<1);
        do
        { 
            System.out.println("How many 5 block ship does player 2 need the maximum is 3 the minimumis 1.");
            s25=ob.nextInt();
        }while(s25>3 || s25<1);
        do
        {
            System.out.println("How many 4 block ship does player 2 need the maximum is 4 the minimumis 1.");
            s24=ob.nextInt();
        }while(s24>4 || s24<1);
        do{
            System.out.println("How many 3 block ship does player 2 need the maximum is 5 the minimumis 1.");
            s23=ob.nextInt();
        }while(s23>5 || s23<1);
        do
        {
            System.out.println("How many 2 block ship does player 2 need the maximum is 6 the minimumis 1.");
            s22=ob.nextInt();
        }while(s22>6 || s22<1);
        System.out.println('\f');
        //placing ships
        //after checking
        {// for a
            print(a);
            for(s5c=1;s5c<=s15;s5c++)
            {
                do
                {
                    nt=0;
                    System.out.println("Where do you want to place your 5 block boat.");
                    p=ob.nextInt();
                    p--;
                    System.out.println('\f');
                    do
                    {
                        System.out.println("How do you want to place it.");
                        System.out.println("Enter 1 to place upwards.");
                        System.out.println("Enter 2 to place rightwards.");
                        System.out.println("Enter 3 to place downwards.");
                        System.out.println("Enter 4 to place leftwards.");
                        sd=ob.nextInt();
                    }while(sd!=1 && sd!=2 && sd!=3 && sd!=4);
                    if(check(p,5,sd,a)==1)
                    {
                        if(sd==1)
                        {
                            a[p]=" X ";
                            a[p-10]=" X ";
                            a[p-20]=" X ";
                            a[p-30]=" X ";
                            a[p-40]=" X ";
                        }
                        if(sd==2)
                        {
                            a[p]=" X ";
                            a[p+1]=" X ";
                            a[p+2]=" X ";
                            a[p+3]=" X ";
                            a[p+4]=" X ";
                        }
                        if(sd==3)
                        {
                            a[p]=" X ";
                            a[p+10]=" X ";
                            a[p+20]=" X ";
                            a[p+30]=" X ";
                            a[p+40]=" X ";
                        }
                        if(sd==4)
                        {
                            a[p]=" X ";
                            a[p-1]=" X ";
                            a[p-2]=" X ";
                            a[p-3]=" X ";
                            a[p-4]=" X ";
                        }
                    }
                    else
                    {
                        System.out.println("Invalid position.");
                        nt=1;
                    }
                    print(a);
                }while(nt==1);
            }
            for(s4c=1;s4c<=s14;s4c++)
            {
                do
                {
                    nt=0;
                    System.out.println("Where do you want to place your 4 block boat.");
                    p=ob.nextInt();
                    p--;
                    System.out.println('\f');
                    do
                    {
                        System.out.println("How do you want to place it.");
                        System.out.println("Enter 1 to place upwards.");
                        System.out.println("Enter 2 to place rightwards.");
                        System.out.println("Enter 3 to place downwards.");
                        System.out.println("Enter 4 to place leftwards.");
                        sd=ob.nextInt();
                    }while(sd!=1 && sd!=2 && sd!=3 && sd!=4);
                    if(check(p,4,sd,a)==1)
                    {
                        if(sd==1)
                        {
                            a[p]=" X ";
                            a[p-10]=" X ";
                            a[p-20]=" X ";
                            a[p-30]=" X ";
                        }
                        if(sd==2)
                        {
                            a[p]=" X ";
                            a[p+1]=" X ";
                            a[p+2]=" X ";
                            a[p+3]=" X ";
                        }
                        if(sd==3)
                        {
                            a[p]=" X ";
                            a[p+10]=" X ";
                            a[p+20]=" X ";
                            a[p+30]=" X ";
                        }
                        if(sd==4)
                        {
                            a[p]=" X ";
                            a[p-1]=" X ";
                            a[p-2]=" X ";
                            a[p-3]=" X ";
                        }
                    }
                    else
                    {
                        System.out.println("Invalid position.");
                        nt=1;
                    }
                    print(a);
                }while(nt==1);
            }
            for(s3c=1;s3c<=s13;s3c++)
            {
                do
                {
                    nt=0;
                    System.out.println("Where do you want to place your 3 block boat.");
                    p=ob.nextInt();
                    p--;
                    System.out.println('\f');
                    do
                    {
                        System.out.println("How do you want to place it.");
                        System.out.println("Enter 1 to place upwards.");
                        System.out.println("Enter 2 to place rightwards.");
                        System.out.println("Enter 3 to place downwards.");
                        System.out.println("Enter 4 to place leftwards.");
                        sd=ob.nextInt();
                    }while(sd!=1 && sd!=2 && sd!=3 && sd!=4);
                    if(check(p,3,sd,a)==1)
                    {
                        if(sd==1)
                        {
                            a[p]=" X ";
                            a[p-10]=" X ";
                            a[p-20]=" X ";
                        }
                        if(sd==2)
                        {
                            a[p]=" X ";
                            a[p+1]=" X ";
                            a[p+2]=" X ";
                        }
                        if(sd==3)
                        {
                            a[p]=" X ";
                            a[p+10]=" X ";
                            a[p+20]=" X ";
                        }
                        if(sd==4)
                        {
                            a[p]=" X ";
                            a[p-1]=" X ";
                            a[p-2]=" X ";
                        }
                    }
                    else
                    {
                        System.out.println("Invalid position.");
                        nt=1;
                    }
                    print(a);
                }while(nt==1);
            }
            for(s2c=1;s2c<=s12;s2c++)
            {
                do
                {
                    nt=0;
                    System.out.println("Where do you want to place your 2 block boat.");
                    p=ob.nextInt();
                    p--;
                    System.out.println('\f');
                    do
                    {
                        System.out.println("How do you want to place it.");
                        System.out.println("Enter 1 to place upwards.");
                        System.out.println("Enter 2 to place rightwards.");
                        System.out.println("Enter 3 to place downwards.");
                        System.out.println("Enter 4 to place leftwards.");
                        sd=ob.nextInt();
                    }while(sd!=1 && sd!=2 && sd!=3 && sd!=4);
                    if(check(p,2,sd,a)==1)
                    {
                        if(sd==1)
                        {
                            a[p]=" X ";
                            a[p-10]=" X ";
                        }
                        if(sd==2)
                        {
                            a[p]=" X ";
                            a[p+1]=" X ";
                        }
                        if(sd==3)
                        {
                            a[p]=" X ";
                            a[p+10]=" X ";
                        }
                        if(sd==4)
                        {
                            a[p]=" X ";
                            a[p-1]=" X ";
                        }
                    }
                    else
                    {
                        System.out.println("Invalid position.");
                        nt=1;
                    }
                    print(a);
                }while(nt==1);
            }
        }
        System.out.println('\f');
        {// for b
            print(b);
            for(s5c=1;s5c<=s25;s5c++)
            {
                do
                {
                    nt=0;
                    System.out.println("Where do you want to place your 5 block boat.");
                    p=ob.nextInt();
                    p--;
                    System.out.println('\f');
                    do
                    {
                        System.out.println("How do you want to place it.");
                        System.out.println("Enter 1 to place upwards.");
                        System.out.println("Enter 2 to place rightwards.");
                        System.out.println("Enter 3 to place downwards.");
                        System.out.println("Enter 4 to place leftwards.");
                        sd=ob.nextInt();
                    }while(sd!=1 && sd!=2 && sd!=3 && sd!=4);
                    if(check(p,5,sd,b)==1)
                    {
                        if(sd==1)
                        {
                            b[p]=" X ";
                            b[p-10]=" X ";
                            b[p-20]=" X ";
                            b[p-30]=" X ";
                            b[p-40]=" X ";
                        }
                        if(sd==2)
                        {
                            b[p]=" X ";
                            b[p+1]=" X ";
                            b[p+2]=" X ";
                            b[p+3]=" X ";
                            b[p+4]=" X ";
                        }
                        if(sd==3)
                        {
                            b[p]=" X ";
                            b[p+10]=" X ";
                            b[p+20]=" X ";
                            b[p+30]=" X ";
                            b[p+40]=" X ";
                        }
                        if(sd==4)
                        {
                            b[p]=" X ";
                            b[p-1]=" X ";
                            b[p-2]=" X ";
                            b[p-3]=" X ";
                            b[p-4]=" X ";
                        }
                    }
                    else
                    {
                        System.out.println("Invalid position.");
                        nt=1;
                    }
                    print(b);
                }while(nt==1);
            }
            for(s4c=1;s4c<=s24;s4c++)
            {
                do
                {
                    nt=0;
                    System.out.println("Where do you want to place your 4 block boat.");
                    p=ob.nextInt();
                    p--;
                    System.out.println('\f');
                    do
                    {
                        System.out.println("How do you want to place it.");
                        System.out.println("Enter 1 to place upwards.");
                        System.out.println("Enter 2 to place rightwards.");
                        System.out.println("Enter 3 to place downwards.");
                        System.out.println("Enter 4 to place leftwards.");
                        sd=ob.nextInt();
                    }while(sd!=1 && sd!=2 && sd!=3 && sd!=4);
                    if(check(p,4,sd,b)==1)
                    {
                        if(sd==1)
                        {
                            b[p]=" X ";
                            b[p-10]=" X ";
                            b[p-20]=" X ";
                            b[p-30]=" X ";
                        }
                        if(sd==2)
                        {
                            b[p]=" X ";
                            b[p+1]=" X ";
                            b[p+2]=" X ";
                            b[p+3]=" X ";
                        }
                        if(sd==3)
                        {
                            b[p]=" X ";
                            b[p+10]=" X ";
                            b[p+20]=" X ";
                            b[p+30]=" X ";
                        }
                        if(sd==4)
                        {
                            b[p]=" X ";
                            b[p-1]=" X ";
                            b[p-2]=" X ";
                            b[p-3]=" X ";
                        }
                    }
                    else
                    {
                        System.out.println("Invalid position.");
                        nt=1;
                    }
                    print(b);
                }while(nt==1);
            }
            for(s3c=1;s3c<=s23;s3c++)
            {
                do
                {
                    nt=0;
                    System.out.println("Where do you want to place your 3 block boat.");
                    p=ob.nextInt();
                    p--;
                    System.out.println('\f');
                    do
                    {
                        System.out.println("How do you want to place it.");
                        System.out.println("Enter 1 to place upwards.");
                        System.out.println("Enter 2 to place rightwards.");
                        System.out.println("Enter 3 to place downwards.");
                        System.out.println("Enter 4 to place leftwards");
                        sd=ob.nextInt();
                    }while(sd!=1 && sd!=2 && sd!=3 && sd!=4);
                    if(check(p,3,sd,b)==1)
                    {
                        if(sd==1)
                        {
                            b[p]=" X ";
                            b[p-10]=" X ";
                            b[p-20]=" X ";
                        }
                        if(sd==2)
                        {
                            b[p]=" X ";
                            b[p+1]=" X ";
                            b[p+2]=" X ";
                        }
                        if(sd==3)
                        {
                            b[p]=" X ";
                            b[p+10]=" X ";
                            b[p+20]=" X ";
                        }
                        if(sd==4)
                        {
                            b[p]=" X ";
                            b[p-1]=" X ";
                            b[p-2]=" X ";
                        }
                    }
                    else
                    {
                        System.out.println("Invalid position.");
                        nt=1;
                    }
                    print(b);
                }while(nt==1);
            }
            for(s2c=1;s2c<=s22;s2c++)
            {
                do
                {
                    nt=0;
                    System.out.println("Where do you want to place your 2 block boat.");
                    p=ob.nextInt();
                    p--;
                    System.out.println('\f');
                    do
                    {
                        System.out.println("How do you want to place it.");
                        System.out.println("Enter 1 to place upwards.");
                        System.out.println("Enter 2 to place rightwards.");
                        System.out.println("Enter 3 to place downwards.");
                        System.out.println("Enter 4 to place leftwards.");
                        sd=ob.nextInt();
                    }while(sd!=1 && sd!=2 && sd!=3 && sd!=4);
                    if(check(p,2,sd,b)==1)
                    {
                        if(sd==1)
                        {
                            b[p]=" X ";
                            b[p-10]=" X ";
                        }
                        if(sd==2)
                        {
                            b[p]=" X ";
                            b[p+1]=" X ";
                        }
                        if(sd==3)
                        {
                            b[p]=" X ";
                            b[p+10]=" X ";
                        }
                        if(sd==4)
                        {
                            b[p]=" X ";
                            b[p-1]=" X ";
                        }
                    }
                    else
                    {
                        System.out.println("Invalid position.");
                        nt=1;
                    }
                    print(b);
                }while(nt==1);
            }
        }
        for(gm=0;gm<=100;gm++)
        { 
            System.out.println('\f');
            System.out.println("Player 1.");
            print(a);
            System.out.println("O marks the place where your opponent has attacked you.");
            System.out.println("The places where u have attacked your opponent are :");
            for(attk=0;attk<100;attk++)
            {
                if(b[attk].equals(" O "))
                {
                    System.out.println((attk+1));
                }
            }
            do
            {
                System.out.println("Enter a possition where you want to attack.");
                n=ob.nextInt();
            }while(n<0 || n>100 || b[n-1].equals(" O "));
            if(b[n-1].equals(" X "))
            {
                System.out.println("Its a hit.");
            }
            else
            {
                System.out.println("Its not a hit.");
            }
            b[n-1]=" O ";
            for(win=0;win<100;win++)
            {
                if(b[win].equals(" X "))
                {
                    wctr++;
                }
            }
            if(wctr==0)
            {
                System.out.println("You win.");
                break;
            }
            System.out.println("Enter any number to end your turn.");
            stpr=ob.nextInt();
            System.out.println(stpr);
            System.out.println('\f');
            System.out.println("Player 2.");
            print(b);
            System.out.println("O marks the place where your opponent has attacked you.");
            System.out.println("The places where u have attacked your opponent are :");
            for(attk=0;attk<100;attk++)
            {
                if(a[attk].equals(" O "))
                {
                    System.out.println((attk+1));
                }
            }
            do
            {
                System.out.println("Enter a possition where you want to attack.");
                n=ob.nextInt();
            }while(n<0 || n>100 || a[n-1].equals(" O "));
            if(a[n-1].equals(" X "))
            {
                System.out.println("Its a hit.");
            }
            else
            {
                System.out.println("Its not a hit.");
            }
            a[n-1]=" O ";
            for(win=0;win<100;win++)
            {
                if(b[win].equals(" X "))
                {
                    wctr++;
                }
            }
            if(wctr==0)
            {
                System.out.println("You win.");
                break;
            }
            System.out.println("Enter any number to end your turn.");
            stpr=ob.nextInt();
        }
    }

    public static void print(String a[])
    {
        int c;
        {//for printing a
            System.out.println("+ "+"|"+" 0 "+"|"+" 1 "+"|"+" 2 "+"|"+" 3 "+"|"+" 4 "+"|"+" 5 "+"|"+" 6 "+"|"+" 7 "+"|"+" 8 "+"|"+" 9 "+"|");
            System.out.println("  "+"|"+"---"+"|"+"---"+"|"+"---"+"|"+"---"+"|"+"---"+"|"+"---"+"|"+"---"+"|"+"---"+"|"+"---"+"|"+"---"+"|");
            for(c=0;c<100;c=c+10)
            {
                if(c<=9)
                {
                    System.out.print(" ");
                }
                System.out.println(c+1+"|"+a[c]+"|"+a[c+1]+"|"+a[c+2]+"|"+a[c+3]+"|"+a[c+4]+"|"+a[c+5]+"|"+a[c+6]+"|"+a[c+7]+"|"+a[c+8]+"|"+a[c+9]+"|");
                System.out.println("  "+"|"+"---"+"|"+"---"+"|"+"---"+"|"+"---"+"|"+"---"+"|"+"---"+"|"+"---"+"|"+"---"+"|"+"---"+"|"+"---"+"|");
            }
        }
    }

    public static int check(int p,int n,int b,String a[])
    { 
        int c1,ctr=0;
        if(b==1)
        {
            for(c1=0;c1<=n-1;c1++)
            {
                if(p-(c1*10)>=0)
                {
                    if(a[p-(c1*10)].equals("   "))
                    {
                        ctr++;
                    }
                }
            }
        }
        if(b==2)
        {
            for(c1=0;c1<=n-1;c1++)
            {
                if((p+c1)/10==p/10)
                {
                    if(a[p+(c1)].equals("   "))
                    {
                        ctr++;
                    }
                }
            }
        }
        if(b==3)
        {
            for(c1=0;c1<=n-1;c1++)
            {
                if(p+(c1*10)<=100)
                {
                    if(a[p+(c1*10)].equals("   "))
                    {
                        ctr++;
                    }
                }
            }
        }
        if(b==4)
        {
            for(c1=0;c1<=n-1;c1++)
            {
                if((p-c1)/10==p/10)
                {
                    if(a[p-(c1)].equals("   "))
                    {
                        ctr++;
                    }
                }
            }
        }
        if(ctr==n)
        {
            return 1;
        }
        else 
        {
            return 0;
        }
    }
}