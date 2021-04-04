import java.util.*;
class NRX07 //8730 lines and 34 functions made my naman desai
{
    public static void main()
    {
        int a,b=0,c;
        Scanner ob=new Scanner(System.in);
        do
        {
            do
            {
                c=0;
                System.out.println('\f');
                System.out.println("Enter 1 to play hangman");
                System.out.println("Enter 2 to play connect 4");
                System.out.println("Enter 3 to play X and O");
                System.out.println("Enter 4 to jumble words");
                System.out.println("Enter 5 to play cricket(luck)");
                System.out.println("Enter 6 to play chess");
                System.out.println("Enter 7 to play guessthecode");
                System.out.println("Enter 8 to play battleships");
                System.out.println("Enter 9 to play othello");
                if(b==0)
                {
                    System.out.println("choose");
                    b++;
                }
                else
                {
                    System.out.println("choose properly");
                }
                a=ob.nextInt();
                if(a==1)
                {
                    NRX07.hangman();b=0;
                }
                if(a==2)
                {
                    NRX07.connect();b=0;
                }
                if(a==3)
                {
                    NRX07.xando();b=0;
                }
                if(a==4)
                {
                    NRX07.jumblewords();b=0;
                }
                if(a==5)
                {
                    NRX07.cricket();b=0;
                }
                if(a==6)
                {
                    NRX07.chess();b=0;
                }
                if(a==7)
                {
                    NRX07.guessthecode();b=0;
                }
                if(a==8)
                {
                    NRX07.battleships();b=0;
                }
                if(a==9)
                {
                    NRX07.Othello();b=0;
                }
            }while(a>8||a<1);
            a=0;
            System.out.println("enter 1 to play again and 2 to exit");
            c=ob.nextInt();
            if(c==1)
            {
                System.out.println('\f');
            }
        }while(c==1);
        System.out.println("Thank you");
        System.out.println("Made By Naman Desai");
    }

    public static void Othello()
    {
        Scanner ob=new Scanner(System.in);
        String a[]=new String[64];
        int b,c,d,e,f,g,h,i,j=0,k=0;
        for(b=0;b<64;b++)
        {
            a[b]="   ";
        }
        a[27]=" X ";
        a[28]=" O ";
        a[35]=" O ";
        a[36]=" X ";
        System.out.println('\f');
        {//for printing
            System.out.println("+ "+"|"+" 0 "+"|"+" 1 "+"|"+" 2 "+"|"+" 3 "+"|"+" 4 "+"|"+" 5 "+"|"+" 6 "+"|"+" 7 "+"|");
            System.out.println("  "+"|"+"---"+"|"+"---"+"|"+"---"+"|"+"---"+"|"+"---"+"|"+"---"+"|"+"---"+"|"+"---"+"|");
            for(c=0;c<64;c=c+8)
            {
                if(c<=9)
                {
                    System.out.print(" ");
                }
                System.out.println(c+1+"|"+a[c]+"|"+a[c+1]+"|"+a[c+2]+"|"+a[c+3]+"|"+a[c+4]+"|"+a[c+5]+"|"+a[c+6]+"|"+a[c+7]+"|");
                System.out.println("  "+"|"+"---"+"|"+"---"+"|"+"---"+"|"+"---"+"|"+"---"+"|"+"---"+"|"+"---"+"|"+"---"+"|");
            }
            for(i=0;i<=63;i++)
            {
                if(a[i].equals(" X "))
                {
                    j++;
                }
                if(a[i].equals(" O "))
                {
                    k++;
                }
            }
            System.out.println("Number of X is "+j);
            System.out.println("Number of O is "+k);
            j=0;
            k=0;
        }
        for(;;)
        {
            do//player X
            {
                d=0;
                g=0;
                System.out.println("Player X where do you want to place your tile");
                System.out.println("Press 100 to skip turn");
                System.out.println("Press 200 to forfeit the game");
                d=ob.nextInt();
                if(d==100)
                {
                    break;
                }
                if(d==200)
                {
                    break;
                }
                d--;
                for(;;)
                {//down
                    e=0;
                    f=0;
                    h=0;
                    if(d>=56 && d<=63)
                    {
                        break;
                    }
                    if(a[d+8]==" O ")//check
                    {
                        e=2;
                        while(d+(e*8)<=64)
                        {
                            if(a[d+(e*8)]=="   ")
                            {
                                break;
                            }
                            if(a[d+(e*8)]==" X ")
                            {
                                f=e;
                                g++;
                                break;
                            }
                            e++;
                        }
                    }
                    for(h=1;h<=f;h++)//change
                    {
                        a[d+(h*8)]=" X ";
                        a[d]=" X ";               
                    }
                    break;
                }
                for(;;)
                {//up
                    e=0;
                    f=0;
                    h=0;
                    if(d>=0 && d<=7)
                    {
                        break;
                    }
                    if(a[d-8]==" O ")//check
                    {
                        e=2;
                        while(d-(e*8)>=0)
                        {
                            if(a[d-(e*8)]=="   ")
                            {
                                break;
                            }
                            if(a[d-(e*8)]==" X ")
                            {
                                f=e;
                                g++;
                                break;
                            }
                            e++;
                        }
                    }
                    for(h=1;h<=f;h++)//change
                    {
                        a[d-(h*8)]=" X ";
                        a[d]=" X ";               
                    }
                    break;
                }
                for(;;)
                {//right
                    e=0;
                    f=0;
                    h=0;
                    if(d==7 || d==7+(8) || d==7+(8*2) || d==7+(8*3) || d==7+(8*4) || d==7+(8*5) || d==7+(8*6) || d==7+(8*7))
                    {
                        break;
                    }
                    if(a[d+1]==" O ")//check
                    {
                        e=2;
                        while(d+(e)<=7+(8*((d/8)+1)))
                        {
                            if(a[d+(e)]=="   ")
                            {
                                break;
                            }
                            if(a[d+(e)]==" X ")
                            {
                                f=e;
                                g++;
                                break;
                            }
                            e++;
                        }
                    }
                    for(h=1;h<=f;h++)//change
                    {
                        a[d+(h)]=" X ";
                        a[d]=" X ";
                    }
                    break;
                }
                for(;;)
                {//left
                    e=0;
                    f=0;
                    h=0;
                    if(d==0 || d==0+(8) || d==0+(8*2) || d==0+(8*3) || d==0+(8*4) || d==0+(8*5) || d==0+(8*6) || d==0+(8*7))
                    {
                        break;
                    }
                    if(a[d-1]==" O ")//check
                    {
                        e=2;
                        while(d+(e)<=0+(8*((d/8)+1)))
                        {
                            if(a[d-(e)]=="   ")
                            {
                                break;
                            }
                            if(a[d-(e)]==" X ")
                            {
                                f=e;
                                g++;
                                break;
                            }
                            e++;
                        }
                    }
                    for(h=1;h<=f;h++)//change
                    {
                        a[d-(h)]=" X ";
                        a[d]=" X ";
                    }
                    break;
                }
                for(;;)
                {//up right
                    e=0;
                    f=0;
                    h=0;
                    if(d>=0 && d<=7)
                    {
                        break;
                    }
                    if(d==7 || d==7+(8) || d==7+(8*2) || d==7+(8*3) || d==7+(8*4) || d==7+(8*5) || d==7+(8*6) || d==7+(8*7))
                    {
                        break;
                    }
                    if(a[d-8+1]==" O ")//check
                    {
                        e=2;
                        while((d-(e*8)+e)>=0)
                        {
                            if(a[d-(e*8)+e]=="   ")
                            {
                                break;
                            }
                            if(a[d-(e*8)+e]==" X ")
                            {
                                f=e;
                                g++;
                                break;
                            }
                            e++;
                        }
                    }
                    for(h=1;h<=f;h++)//change
                    {
                        a[d-(h*8)+h]=" X ";
                        a[d]=" X ";               
                    }
                    break;
                }
                for(;;)
                {//up left
                    e=0;
                    f=0;
                    h=0;
                    if(d>=0 && d<=7)
                    {
                        break;
                    }
                    if(d==0 || d==0+(8) || d==0+(8*2) || d==0+(8*3) || d==0+(8*4) || d==0+(8*5) || d==0+(8*6) || d==0+(8*7))
                    {
                        break;
                    }
                    if(a[d-8-1]==" O ")//check
                    {
                        e=2;
                        while((d-(e*8)-e)>=0)
                        {
                            if(a[d-(e*8)-e]=="   ")
                            {
                                break;
                            }
                            if(a[d-(e*8)-e]==" X ")
                            {
                                f=e;
                                g++;
                                break;
                            }
                            e++;
                        }
                    }
                    for(h=1;h<=f;h++)//change
                    {
                        a[d-(h*8)-h]=" X ";
                        a[d]=" X ";               
                    }
                    break;
                }
                for(;;)
                {//down right
                    e=0;
                    f=0;
                    h=0;
                    if(d>=56 && d<=63)
                    {
                        break;
                    }
                    if(d==7 || d==7+(8) || d==7+(8*2) || d==7+(8*3) || d==7+(8*4) || d==7+(8*5) || d==7+(8*6) || d==7+(8*7))
                    {
                        break;
                    }
                    if(a[d+8+1]==" O ")//check
                    {
                        e=2;
                        while((d+(e*8)+e)>=0)
                        {
                            if(a[d+(e*8)+e]=="   ")
                            {
                                break;
                            }
                            if(a[d+(e*8)+e]==" X ")
                            {
                                f=e;
                                g++;
                                break;
                            }
                            e++;
                        }
                    }
                    for(h=1;h<=f;h++)//change
                    {
                        a[d+(h*8)+h]=" X ";
                        a[d]=" X ";               
                    }
                    break;
                }
                for(;;)
                {//down left
                    e=0;
                    f=0;
                    h=0;
                    if(d>=56 && d<=63)
                    {
                        break;
                    }
                    if(d==0 || d==0+(8) || d==0+(8*2) || d==0+(8*3) || d==0+(8*4) || d==0+(8*5) || d==0+(8*6) || d==0+(8*7))
                    {
                        break;
                    }
                    if(a[d+8-1]==" O ")//check
                    {
                        e=2;
                        while((d+(e*8)-e)>=0)
                        {
                            if(a[d+(e*8)-e]=="   ")
                            {
                                break;
                            }
                            if(a[d+(e*8)-e]==" X ")
                            {
                                f=e;
                                g++;
                                break;
                            }
                            e++;
                        }
                    }
                    for(h=1;h<=f;h++)//change
                    {
                        a[d+(h*8)-h]=" X ";
                        a[d]=" X ";               
                    }
                    break;
                }
                if(g==0)
                {
                    System.out.println("Choose properly");
                }
            }while(g==0);
            System.out.println('\f');
            {//for printing
                System.out.println("+ "+"|"+" 0 "+"|"+" 1 "+"|"+" 2 "+"|"+" 3 "+"|"+" 4 "+"|"+" 5 "+"|"+" 6 "+"|"+" 7 "+"|");
                System.out.println("  "+"|"+"---"+"|"+"---"+"|"+"---"+"|"+"---"+"|"+"---"+"|"+"---"+"|"+"---"+"|"+"---"+"|");
                for(c=0;c<64;c=c+8)
                {
                    if(c<=9)
                    {
                        System.out.print(" ");
                    }
                    System.out.println(c+1+"|"+a[c]+"|"+a[c+1]+"|"+a[c+2]+"|"+a[c+3]+"|"+a[c+4]+"|"+a[c+5]+"|"+a[c+6]+"|"+a[c+7]+"|");
                    System.out.println("  "+"|"+"---"+"|"+"---"+"|"+"---"+"|"+"---"+"|"+"---"+"|"+"---"+"|"+"---"+"|"+"---"+"|");
                }
                for(i=0;i<=63;i++)
                {
                    if(a[i].equals(" X "))
                    {
                        j++;
                    }
                    if(a[i].equals(" O "))
                    {
                        k++;
                    }
                }
                System.out.println("Number of X is "+j);
                System.out.println("Number of O is "+k);
            }
            if((j+k)==64)
            {
                if(j>k)
                    System.out.println("Player X Wins");
                if(j<k)
                    System.out.println("Player O Wins");
                if(j==k)
                    System.out.println("Its a draw");
                break;
            }
            if(k==0)
            {
                System.out.println("Player X Wins");
                break;
            }
            j=0;
            k=0;
            if(d==200)
            {
                System.out.println("Player X looses");
                break;
            }
            do//player O
            {
                d=0;
                g=0;
                System.out.println("Player O where do you want to place your tile");
                System.out.println("Press 100 to skip turn");
                System.out.println("Press 200 to forfeit the game");
                d=ob.nextInt();
                if(d==100)
                {
                    break;
                }
                if(d==200)
                {
                    break;
                }
                d--;
                for(;;)
                {//down
                    e=0;
                    f=0;
                    h=0;
                    if(d>=56 && d<=63)
                    {
                        break;
                    }
                    if(a[d+8]==" X ")//check
                    {
                        e=2;
                        while(d+(e*8)<=64)
                        {
                            if(a[d+(e*8)]=="   ")
                            {
                                break;
                            }
                            if(a[d+(e*8)]==" O ")
                            {
                                f=e;
                                g++;
                                break;
                            }
                            e++;
                        }
                    }
                    for(h=1;h<=f;h++)//change
                    {
                        a[d+(h*8)]=" O ";
                        a[d]=" O ";               
                    }
                    break;
                }
                for(;;)
                {//up
                    e=0;
                    f=0;
                    h=0;
                    if(d>=0 && d<=7)
                    {
                        break;
                    }
                    if(a[d-8]==" X ")//check
                    {
                        e=2;
                        while(d-(e*8)>=0)
                        {
                            if(a[d-(e*8)]=="   ")
                            {
                                break;
                            }
                            if(a[d-(e*8)]==" O ")
                            {
                                f=e;
                                g++;
                                break;
                            }
                            e++;
                        }
                    }
                    for(h=1;h<=f;h++)//change
                    {
                        a[d-(h*8)]=" O ";
                        a[d]=" O ";               
                    }
                    break;
                }
                for(;;)
                {//right
                    e=0;
                    f=0;
                    h=0;
                    if(d==7 || d==7+(8) || d==7+(8*2) || d==7+(8*3) || d==7+(8*4) || d==7+(8*5) || d==7+(8*6) || d==7+(8*7))
                    {
                        break;
                    }
                    if(a[d+1]==" X ")//check
                    {
                        e=2;
                        while(d+(e)<=7+(8*((d/8)+1)))
                        {
                            if(a[d+(e)]=="   ")
                            {
                                break;
                            }
                            if(a[d+(e)]==" O ")
                            {
                                f=e;
                                g++;
                                break;
                            }
                            e++;
                        }
                    }
                    for(h=1;h<=f;h++)//change
                    {
                        a[d+(h)]=" O ";
                        a[d]=" O ";
                    }
                    break;
                }
                for(;;)
                {//left
                    e=0;
                    f=0;
                    h=0;
                    if(d==0 || d==0+(8) || d==0+(8*2) || d==0+(8*3) || d==0+(8*4) || d==0+(8*5) || d==0+(8*6) || d==0+(8*7))
                    {
                        break;
                    }
                    if(a[d-1]==" X ")//check
                    {
                        e=2;
                        while(d+(e)<=0+(8*((d/8)+1)))
                        {
                            if(a[d-(e)]=="   ")
                            {
                                break;
                            }
                            if(a[d-(e)]==" O ")
                            {
                                f=e;
                                g++;
                                break;
                            }
                            e++;
                        }
                    }
                    for(h=1;h<=f;h++)//change
                    {
                        a[d-(h)]=" O ";
                        a[d]=" O ";
                    }
                    break;
                }
                for(;;)
                {//up right
                    e=0;
                    f=0;
                    h=0;
                    if(d>=0 && d<=7)
                    {
                        break;
                    }
                    if(d==7 || d==7+(8) || d==7+(8*2) || d==7+(8*3) || d==7+(8*4) || d==7+(8*5) || d==7+(8*6) || d==7+(8*7))
                    {
                        break;
                    }
                    if(a[d-8+1]==" X ")//check
                    {
                        e=2;
                        while((d-(e*8)+e)>=0)
                        {
                            if(a[d-(e*8)+e]=="   ")
                            {
                                break;
                            }
                            if(a[d-(e*8)+e]==" O ")
                            {
                                f=e;
                                g++;
                                break;
                            }
                            e++;
                        }
                    }
                    for(h=1;h<=f;h++)//change
                    {
                        a[d-(h*8)+h]=" O ";
                        a[d]=" O ";               
                    }
                    break;
                }
                for(;;)
                {//up left
                    e=0;
                    f=0;
                    h=0;
                    if(d>=0 && d<=7)
                    {
                        break;
                    }
                    if(d==0 || d==0+(8) || d==0+(8*2) || d==0+(8*3) || d==0+(8*4) || d==0+(8*5) || d==0+(8*6) || d==0+(8*7))
                    {
                        break;
                    }
                    if(a[d-8-1]==" X ")//check
                    {
                        e=2;
                        while((d-(e*8)-e)>=0)
                        {
                            if(a[d-(e*8)-e]=="   ")
                            {
                                break;
                            }
                            if(a[d-(e*8)-e]==" O ")
                            {
                                f=e;
                                g++;
                                break;
                            }
                            e++;
                        }
                    }
                    for(h=1;h<=f;h++)//change
                    {
                        a[d-(h*8)-h]=" O ";
                        a[d]=" O ";               
                    }
                    break;
                }
                for(;;)
                {//down right
                    e=0;
                    f=0;
                    h=0;
                    if(d>=56 && d<=63)
                    {
                        break;
                    }
                    if(d==7 || d==7+(8) || d==7+(8*2) || d==7+(8*3) || d==7+(8*4) || d==7+(8*5) || d==7+(8*6) || d==7+(8*7))
                    {
                        break;
                    }
                    if(a[d+8+1]==" X ")//check
                    {
                        e=2;
                        while((d+(e*8)+e)>=0)
                        {
                            if(a[d+(e*8)+e]=="   ")
                            {
                                break;
                            }
                            if(a[d+(e*8)+e]==" O ")
                            {
                                f=e;
                                g++;
                                break;
                            }
                            e++;
                        }
                    }
                    for(h=1;h<=f;h++)//change
                    {
                        a[d+(h*8)+h]=" O ";
                        a[d]=" O ";               
                    }
                    break;
                }
                for(;;)
                {//down left
                    e=0;
                    f=0;
                    h=0;
                    if(d>=56 && d<=63)
                    {
                        break;
                    }
                    if(d==0 || d==0+(8) || d==0+(8*2) || d==0+(8*3) || d==0+(8*4) || d==0+(8*5) || d==0+(8*6) || d==0+(8*7))
                    {
                        break;
                    }
                    if(a[d+8-1]==" X ")//check
                    {
                        e=2;
                        while((d+(e*8)-e)>=0)
                        {
                            if(a[d+(e*8)-e]=="   ")
                            {
                                break;
                            }
                            if(a[d+(e*8)-e]==" O ")
                            {
                                f=e;
                                g++;
                                break;
                            }
                            e++;
                        }
                    }
                    for(h=1;h<=f;h++)//change
                    {
                        a[d+(h*8)-h]=" O ";
                        a[d]=" O ";               
                    }
                    break;
                }
                if(g==0)
                {
                    System.out.println("Choose properly");
                }
            }while(g==0);
            System.out.println('\f');
            {//for printing
                System.out.println("+ "+"|"+" 0 "+"|"+" 1 "+"|"+" 2 "+"|"+" 3 "+"|"+" 4 "+"|"+" 5 "+"|"+" 6 "+"|"+" 7 "+"|");
                System.out.println("  "+"|"+"---"+"|"+"---"+"|"+"---"+"|"+"---"+"|"+"---"+"|"+"---"+"|"+"---"+"|"+"---"+"|");
                for(c=0;c<64;c=c+8)
                {
                    if(c<=9)
                    {
                        System.out.print(" ");
                    }
                    System.out.println(c+1+"|"+a[c]+"|"+a[c+1]+"|"+a[c+2]+"|"+a[c+3]+"|"+a[c+4]+"|"+a[c+5]+"|"+a[c+6]+"|"+a[c+7]+"|");
                    System.out.println("  "+"|"+"---"+"|"+"---"+"|"+"---"+"|"+"---"+"|"+"---"+"|"+"---"+"|"+"---"+"|"+"---"+"|");
                }
                for(i=0;i<=63;i++)
                {
                    if(a[i].equals(" X "))
                    {
                        j++;
                    }
                    if(a[i].equals(" O "))
                    {
                        k++;
                    }
                }
                System.out.println("Number of X is "+j);
                System.out.println("Number of O is "+k);
            }
            if((j+k)==64)
            {
                if(j>k)
                    System.out.println("Player X Wins");
                if(j<k)
                    System.out.println("Player O Wins");
                if(j==k)
                    System.out.println("Its a draw");
                break;
            }
            if(j==0)
            {
                System.out.println("Player O Wins");
                break;
            }
            j=0;
            k=0;
            if(d==200)
            {
                System.out.println("Player O looses");
                break;
            }
        }
    }

    public static void battleships()
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

    public static void guessthecode()
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

    public static void chess()
    {
        Scanner ob=new Scanner(System.in);
        String a[]=new String[64];
        int b,c,d,g,h,i=0,j=0,l,m=0,n=0,o=0,p=0,q=0,r=0,up=0,down=0,s=0,t=0,u=0,left=0,right=0,v,w,x,y,z,queenhack=0,a1=0,b1=0,c1=0,d1=0,e1=0,f1=0,g1=0,kc=0,naman=0;
        int l1=0,l2=0,l3=0,l4=0,l5=0,l6=0,l7=0,i1=0,A=0,B=0,C=0,counter=0,iz=0,ix=0,iy=0,l11=0,l22=0,l33=0,l44=0,l55=0,no,take,ctr=0,sv=0,cv=0,sm=0,Z=0,cmon=0;
        String e,save="",ali="";
        char f,k;
        {//default values
            for(d=0;d<64;d++)
            {
                a[d]="   ";
            }
            a[0]="WE1";
            a[1]="WH1";
            a[2]="WC1";
            a[3]="WK1";
            a[4]="WQ1";
            a[5]="WC2";
            a[6]="WH2";
            a[7]="WE2";
            a[8]="WP1";
            a[9]="WP2";
            a[10]="WP3";
            a[11]="WP4";
            a[12]="WP5";
            a[13]="WP6";
            a[14]="WP7";
            a[15]="WP8";
            a[56]="BE1";
            a[57]="BH1";
            a[58]="BC1";
            a[59]="BK1";
            a[60]="BQ1";
            a[61]="BC2";
            a[62]="BH2";
            a[63]="BE2";
            a[48]="BP1";
            a[49]="BP2";
            a[50]="BP3";
            a[51]="BP4";
            a[52]="BP5";
            a[53]="BP6";
            a[54]="BP7";
            a[55]="BP8";
        }
        for(b=1;b>=0;b++)//max is 5949
        {
            {//for printing
                System.out.println("+ "+"|"+" 0 "+"|"+" 1 "+"|"+" 2 "+"|"+" 3 "+"|"+" 4 "+"|"+" 5 "+"|"+" 6 "+"|"+" 7 "+"|");
                System.out.println("  "+"|"+"---"+"|"+"---"+"|"+"---"+"|"+"---"+"|"+"---"+"|"+"---"+"|"+"---"+"|"+"---"+"|");
                for(c=0;c<64;c=c+8)
                {
                    if(c<=9)
                    {
                        System.out.print(" ");
                    }
                    System.out.println(c+1+"|"+a[c]+"|"+a[c+1]+"|"+a[c+2]+"|"+a[c+3]+"|"+a[c+4]+"|"+a[c+5]+"|"+a[c+6]+"|"+a[c+7]+"|");
                    System.out.println("  "+"|"+"---"+"|"+"---"+"|"+"---"+"|"+"---"+"|"+"---"+"|"+"---"+"|"+"---"+"|"+"---"+"|");
                }
            }
            if(b==1)
            {
                System.out.println("White goes first");
            }
            if(C==1)
            {
                System.out.print("Its a check");
            }
            if(C==1)
            {
                counter=0;
                kc=0;
                l1=0;
                l2=0;
                l3=0;
                l4=0;
                l5=0;
                l6=0;
                for(l1=0;l1<64;l1++)
                {
                    if(a[l1].startsWith("WE"))
                    {
                        if(WE(l1+1,i,a)==1)
                        {//sWitch temporarily and then check all for Bhite and then sWitch Wack again
                            save=a[i-1];
                            a[i-1]=a[l1];
                            a[l1]="   ";
                            kc=0;
                            l11=0;
                            l2=0;
                            l3=0;
                            l4=0;
                            l5=0;
                            l6=0;
                            l7=0;
                            for(l7=0;l7<64;l7++)
                            {
                                if(a[l7].startsWith("WK"))
                                {
                                    i1=l7+1;
                                }
                            }
                            for(l11=0;l1<64;l1++)
                            {
                                if(a[l11].startsWith("BE"))
                                {
                                    kc+=BE(l11+1,i1,a);
                                }
                            }
                            for(l2=0;l2<64;l2++)
                            {
                                if(a[l2].startsWith("BH"))
                                {
                                    kc+=BH(l2+1,i1,a);
                                }
                            }
                            for(l3=0;l3<64;l3++)
                            {
                                if(a[l3].startsWith("BC"))
                                {
                                    kc+=BC(l3+1,i1,a);
                                }
                            }
                            for(l4=0;l4<64;l4++)
                            {
                                if(a[l4].startsWith("BQ"))
                                {
                                    kc+=BQ(l4+1,i1,a);
                                }
                            }
                            for(l5=0;l5<64;l5++)
                            {
                                if(a[l5].startsWith("BK"))
                                {
                                    kc+=BK(l5+1,i1,a);
                                }
                            }
                            for(l6=0;l6<64;l6++)
                            {
                                if(a[l6].startsWith("BP"))
                                {
                                    kc+=BPC(l6+1,i1,a);
                                }
                            }
                            if(kc==0)
                            {
                                counter++;
                            }
                            a[l1]=a[i-1];
                            a[i-1]=save; 
                        }
                    }
                }
                for(l2=0;l2<64;l2++)
                {
                    if(a[l2].startsWith("WH"))
                    {
                        if(WH(l2+1,i,a)==1)
                        {
                            save=a[i-1];
                            a[i-1]=a[l2];
                            a[l2]="   ";
                            kc=0;
                            l1=0;
                            l22=0;
                            l3=0;
                            l4=0;
                            l5=0;
                            l6=0;
                            l7=0;
                            for(l7=0;l7<64;l7++)
                            {
                                if(a[l7].startsWith("WK"))
                                {
                                    i1=l7+1;
                                }
                            }
                            for(l1=0;l1<64;l1++)
                            {
                                if(a[l1].startsWith("BE"))
                                {
                                    kc+=BE(l1+1,i1,a);
                                }
                            }
                            for(l22=0;l22<64;l22++)
                            {
                                if(a[l22].startsWith("BH"))
                                {
                                    kc+=BH(l22+1,i1,a);
                                }
                            }
                            for(l3=0;l3<64;l3++)
                            {
                                if(a[l3].startsWith("BC"))
                                {
                                    kc+=BC(l3+1,i1,a);
                                }
                            }
                            for(l4=0;l4<64;l4++)
                            {
                                if(a[l4].startsWith("BQ"))
                                {
                                    kc+=BQ(l4+1,i1,a);
                                }
                            }
                            for(l5=0;l5<64;l5++)
                            {
                                if(a[l5].startsWith("BK"))
                                {
                                    kc+=BK(l5+1,i1,a);
                                }
                            }
                            for(l6=0;l6<64;l6++)
                            {
                                if(a[l6].startsWith("BP"))
                                {
                                    kc+=BPC(l6+1,i1,a);
                                }
                            }
                            if(kc==0)
                            {
                                counter++;
                            }
                            a[l2]=a[i-1];
                            a[i-1]=save; 
                        }
                    }
                }
                for(l3=0;l3<64;l3++)
                {
                    if(a[l3].startsWith("WC"))
                    {
                        if(WC(l3+1,i,a)==1)
                        {
                            save=a[i-1];
                            a[i-1]=a[l3];
                            a[l3]="   ";
                            kc=0;
                            l1=0;
                            l2=0;
                            l33=0;
                            l4=0;
                            l5=0;
                            l6=0;
                            l7=0;
                            for(l7=0;l7<64;l7++)
                            {
                                if(a[l7].startsWith("WK"))
                                {
                                    i1=l7+1;
                                }
                            }
                            for(l1=0;l1<64;l1++)
                            {
                                if(a[l1].startsWith("BE"))
                                {
                                    kc+=BE(l1+1,i1,a);
                                }
                            }
                            for(l2=0;l2<64;l2++)
                            {
                                if(a[l2].startsWith("BH"))
                                {
                                    kc+=BH(l2+1,i1,a);
                                }
                            }
                            for(l33=0;l33<64;l33++)
                            {
                                if(a[l33].startsWith("BC"))
                                {
                                    kc+=BC(l33+1,i1,a);
                                }
                            }
                            for(l4=0;l4<64;l4++)
                            {
                                if(a[l4].startsWith("BQ"))
                                {
                                    kc+=BQ(l4+1,i1,a);
                                }
                            }
                            for(l5=0;l5<64;l5++)
                            {
                                if(a[l5].startsWith("BK"))
                                {
                                    kc+=BK(l5+1,i1,a);
                                }
                            }
                            for(l6=0;l6<64;l6++)
                            {
                                if(a[l6].startsWith("BP"))
                                {
                                    kc+=BPC(l6+1,i1,a);
                                }
                            }
                            if(kc==0)
                            {
                                counter++;
                            }
                            a[l3]=a[i-1];
                            a[i-1]=save; 
                        }
                    }
                }
                for(l4=0;l4<64;l4++)
                {
                    if(a[l4].startsWith("WQ"))
                    {
                        if(WQ(l4+1,i,a)==1)
                        {
                            save=a[i-1];
                            a[i-1]=a[l4];
                            a[l4]="   ";
                            kc=0;
                            l1=0;
                            l2=0;
                            l3=0;
                            l44=0;
                            l5=0;
                            l6=0;
                            l7=0;
                            for(l7=0;l7<64;l7++)
                            {
                                if(a[l7].startsWith("WK"))
                                {
                                    i1=l7+1;
                                }
                            }
                            for(l1=0;l1<64;l1++)
                            {
                                if(a[l1].startsWith("BE"))
                                {
                                    kc+=BE(l1+1,i1,a);
                                }
                            }
                            for(l2=0;l2<64;l2++)
                            {
                                if(a[l2].startsWith("BH"))
                                {
                                    kc+=BH(l2+1,i1,a);
                                }
                            }
                            for(l3=0;l3<64;l3++)
                            {
                                if(a[l3].startsWith("BC"))
                                {
                                    kc+=BC(l3+1,i1,a);
                                }
                            }
                            for(l44=0;l44<64;l44++)
                            {
                                if(a[l44].startsWith("BQ"))
                                {
                                    kc+=BQ(l44+1,i1,a);
                                }
                            }
                            for(l5=0;l5<64;l5++)
                            {
                                if(a[l5].startsWith("BK"))
                                {
                                    kc+=BK(l5+1,i1,a);
                                }
                            }
                            for(l6=0;l6<64;l6++)
                            {
                                if(a[l6].startsWith("BP"))
                                {
                                    kc+=BPC(l6+1,i1,a);
                                }
                            }
                            if(kc==0)
                            {
                                counter++;
                            }
                            a[l4]=a[i-1];
                            a[i-1]=save; 
                        }
                    }
                }
                for(l5=0;l5<64;l5++)
                {
                    if(a[l5].startsWith("WP"))
                    {
                        if(WPC(l5+1,i,a)==1)
                        {
                            save=a[i-1];
                            a[i-1]=a[l5];
                            a[l5]="   ";
                            kc=0;
                            l1=0;
                            l2=0;
                            l3=0;
                            l4=0;
                            l55=0;
                            l6=0;
                            l7=0;
                            for(l7=0;l7<64;l7++)
                            {
                                if(a[l7].startsWith("WK"))
                                {
                                    i1=l7+1;
                                }
                            }
                            for(l1=0;l1<64;l1++)
                            {
                                if(a[l1].startsWith("BE"))
                                {
                                    kc+=BE(l1+1,i1,a);
                                }
                            }
                            for(l2=0;l2<64;l2++)
                            {
                                if(a[l2].startsWith("BH"))
                                {
                                    kc+=BH(l2+1,i1,a);
                                }
                            }
                            for(l3=0;l3<64;l3++)
                            {
                                if(a[l3].startsWith("BC"))
                                {
                                    kc+=BC(l3+1,i1,a);
                                }
                            }
                            for(l4=0;l4<64;l4++)
                            {
                                if(a[l4].startsWith("BQ"))
                                {
                                    kc+=BQ(l4+1,i1,a);
                                }
                            }
                            for(l55=0;l55<64;l55++)
                            {
                                if(a[l55].startsWith("BK"))
                                {
                                    kc+=BK(l55+1,i1,a);
                                }
                            }
                            for(l6=0;l6<64;l6++)
                            {
                                if(a[l6].startsWith("BP"))
                                {
                                    kc+=BPC(l6+1,i1,a);
                                }
                            }
                            if(kc==0)
                            {
                                counter++;
                            }
                            a[l5]=a[i-1];
                            a[i-1]=save; 
                        }
                    }
                }
                for(iz=0;iz<64;iz++)
                {
                    l1=0;
                    l2=0;
                    l3=0;
                    l4=0;
                    l5=0;
                    l6=0;
                    for(l1=0;l1<64;l1++)
                    {
                        if(a[l1].startsWith("WE"))
                        {
                            if(WE(l1+1,iz,a)==1)
                            {//sWitch temporarily and then check all for Bhite and then sWitch Wack again
                                save=a[iz-1];
                                a[iz-1]=a[l1];
                                a[l1]="   ";
                                kc=0;
                                l11=0;
                                l2=0;
                                l3=0;
                                l4=0;
                                l5=0;
                                l6=0;
                                l7=0;
                                for(l7=0;l7<64;l7++)
                                {
                                    if(a[l7].startsWith("WK"))
                                    {
                                        i1=l7+1;
                                    }
                                }
                                for(l11=0;l11<64;l11++)
                                {
                                    if(a[l11].startsWith("BE"))
                                    {
                                        kc+=BE(l11+1,i1,a);
                                    }
                                }
                                for(l2=0;l2<64;l2++)
                                {
                                    if(a[l2].startsWith("BH"))
                                    {
                                        kc+=BH(l2+1,i1,a);
                                    }
                                }
                                for(l3=0;l3<64;l3++)
                                {
                                    if(a[l3].startsWith("BC"))
                                    {
                                        kc+=BC(l3+1,i1,a);
                                    }
                                }
                                for(l4=0;l4<64;l4++)
                                {
                                    if(a[l4].startsWith("BQ"))
                                    {
                                        kc+=BQ(l4+1,i1,a);
                                    }
                                }
                                for(l5=0;l5<64;l5++)
                                {
                                    if(a[l5].startsWith("BK"))
                                    {
                                        kc+=BK(l5+1,i1,a);
                                    }
                                }
                                for(l6=0;l6<64;l6++)
                                {
                                    if(a[l6].startsWith("BP"))
                                    {
                                        kc+=BPC(l6+1,i1,a);
                                    }
                                }
                                if(kc==0)
                                {
                                    counter++;
                                }
                                a[l1]=a[iz-1];
                                a[iz-1]=save; 
                            }
                        }
                    }
                    for(l2=0;l2<64;l2++)
                    {
                        if(a[l2].startsWith("WH"))
                        {
                            if(WH(l2+1,iz,a)==1)
                            {
                                save=a[iz-1];
                                a[iz-1]=a[l2];
                                a[l2]="   ";
                                kc=0;
                                l1=0;
                                l22=0;
                                l3=0;
                                l4=0;
                                l5=0;
                                l6=0;
                                l7=0;
                                for(l7=0;l7<64;l7++)
                                {
                                    if(a[l7].startsWith("WK"))
                                    {
                                        i1=l7+1;
                                    }
                                }
                                for(l1=0;l1<64;l1++)
                                {
                                    if(a[l1].startsWith("BE"))
                                    {
                                        kc+=BE(l1+1,i1,a);
                                    }
                                }
                                for(l22=0;l22<64;l22++)
                                {
                                    if(a[l22].startsWith("BH"))
                                    {
                                        kc+=BH(l22+1,i1,a);
                                    }
                                }
                                for(l3=0;l3<64;l3++)
                                {
                                    if(a[l3].startsWith("BC"))
                                    {
                                        kc+=BC(l3+1,i1,a);
                                    }
                                }
                                for(l4=0;l4<64;l4++)
                                {
                                    if(a[l4].startsWith("BQ"))
                                    {
                                        kc+=BQ(l4+1,i1,a);
                                    }
                                }
                                for(l5=0;l5<64;l5++)
                                {
                                    if(a[l5].startsWith("BK"))
                                    {
                                        kc+=BK(l5+1,i1,a);
                                    }
                                }
                                for(l6=0;l6<64;l6++)
                                {
                                    if(a[l6].startsWith("BP"))
                                    {
                                        kc+=BPC(l6+1,i1,a);
                                    }
                                }
                                if(kc==0)
                                {
                                    counter++;
                                }
                                a[l2]=a[iz-1];
                                a[iz-1]=save; 
                            }
                        }
                    }
                    for(l3=0;l3<64;l3++)
                    {
                        if(a[l3].startsWith("WC"))
                        {
                            if(WC(l3+1,iz,a)==1)
                            {
                                save=a[iz-1];
                                a[iz-1]=a[l3];
                                a[l3]="   ";
                                kc=0;
                                l1=0;
                                l2=0;
                                l33=0;
                                l4=0;
                                l5=0;
                                l6=0;
                                l7=0;
                                for(l7=0;l7<64;l7++)
                                {
                                    if(a[l7].startsWith("WK"))
                                    {
                                        i1=l7+1;
                                    }
                                }
                                for(l1=0;l1<64;l1++)
                                {
                                    if(a[l1].startsWith("BE"))
                                    {
                                        kc+=BE(l1+1,i1,a);
                                    }
                                }
                                for(l2=0;l2<64;l2++)
                                {
                                    if(a[l2].startsWith("BH"))
                                    {
                                        kc+=BH(l2+1,i1,a);
                                    }
                                }
                                for(l33=0;l33<64;l33++)
                                {
                                    if(a[l33].startsWith("BC"))
                                    {
                                        kc+=BC(l33+1,i1,a);
                                    }
                                }
                                for(l4=0;l4<64;l4++)
                                {
                                    if(a[l4].startsWith("BQ"))
                                    {
                                        kc+=BQ(l4+1,i1,a);
                                    }
                                }
                                for(l5=0;l5<64;l5++)
                                {
                                    if(a[l5].startsWith("BK"))
                                    {
                                        kc+=BK(l5+1,i1,a);
                                    }
                                }
                                for(l6=0;l6<64;l6++)
                                {
                                    if(a[l6].startsWith("BP"))
                                    {
                                        kc+=BPC(l6+1,i1,a);
                                    }
                                }
                                if(kc==0)
                                {
                                    counter++;
                                }
                                a[l3]=a[iz-1];
                                a[iz-1]=save; 
                            }
                        }
                    }
                    for(l4=0;l4<64;l4++)
                    {
                        if(a[l4].startsWith("WQ"))
                        {
                            if(WQ(l4+1,iz,a)==1)
                            {
                                save=a[iz-1];
                                a[iz-1]=a[l4];
                                a[l4]="   ";
                                kc=0;
                                l1=0;
                                l2=0;
                                l3=0;
                                l44=0;
                                l5=0;
                                l6=0;
                                l7=0;
                                for(l7=0;l7<64;l7++)
                                {
                                    if(a[l7].startsWith("WK"))
                                    {
                                        i1=l7+1;
                                    }
                                }
                                for(l1=0;l1<64;l1++)
                                {
                                    if(a[l1].startsWith("BE"))
                                    {
                                        kc+=BE(l1+1,i1,a);
                                    }
                                }
                                for(l2=0;l2<64;l2++)
                                {
                                    if(a[l2].startsWith("BH"))
                                    {
                                        kc+=BH(l2+1,i1,a);
                                    }
                                }
                                for(l3=0;l3<64;l3++)
                                {
                                    if(a[l3].startsWith("BC"))
                                    {
                                        kc+=BC(l3+1,i1,a);
                                    }
                                }
                                for(l44=0;l44<64;l44++)
                                {
                                    if(a[l44].startsWith("BQ"))
                                    {
                                        kc+=BQ(l44+1,i1,a);
                                    }
                                }
                                for(l5=0;l5<64;l5++)
                                {
                                    if(a[l5].startsWith("BK"))
                                    {
                                        kc+=BK(l5+1,i1,a);
                                    }
                                }
                                for(l6=0;l6<64;l6++)
                                {
                                    if(a[l6].startsWith("BP"))
                                    {
                                        kc+=BPC(l6+1,i1,a);
                                    }
                                }
                                if(kc==0)
                                {
                                    counter++;
                                }
                                a[l4]=a[iz-1];
                                a[iz-1]=save; 
                            }
                        }
                    }
                    for(l55=0;l55<64;l55++)
                    {
                        if(a[l55].startsWith("WP"))
                        {
                            if(WPC(l55+1,iz,a)==1)
                            {
                                save=a[iz-1];
                                a[iz-1]=a[l5];
                                a[l5]="   ";
                                kc=0;
                                l1=0;
                                l2=0;
                                l3=0;
                                l4=0;
                                l55=0;
                                l6=0;
                                l7=0;
                                for(l7=0;l7<64;l7++)
                                {
                                    if(a[l7].startsWith("WK"))
                                    {
                                        i1=l7+1;
                                    }
                                }
                                for(l1=0;l1<64;l1++)
                                {
                                    if(a[l1].startsWith("BE"))
                                    {
                                        kc+=BE(l1+1,i1,a);
                                    }
                                }
                                for(l2=0;l2<64;l2++)
                                {
                                    if(a[l2].startsWith("BH"))
                                    {
                                        kc+=BH(l2+1,i1,a);
                                    }
                                }
                                for(l3=0;l3<64;l3++)
                                {
                                    if(a[l3].startsWith("BC"))
                                    {
                                        kc+=BC(l3+1,i1,a);
                                    }
                                }
                                for(l4=0;l4<64;l4++)
                                {
                                    if(a[l4].startsWith("BQ"))
                                    {
                                        kc+=BQ(l4+1,i1,a);
                                    }
                                }
                                for(l55=0;l55<64;l55++)
                                {
                                    if(a[l55].startsWith("BK"))
                                    {
                                        kc+=BK(l55+1,i1,a);
                                    }
                                }
                                for(l6=0;l6<64;l6++)
                                {
                                    if(a[l6].startsWith("BP"))
                                    {
                                        kc+=BPC(l6+1,i1,a);
                                    }
                                }
                                if(kc==0)
                                {
                                    counter++;
                                }
                                a[l5]=a[iz-1];
                                a[iz-1]=save; 
                            }
                        }
                    }
                }
                for(iy=0;iy<64;iy++)
                {
                    if(a[iy].equals("WK1"))
                    {
                        m=iy+1;
                    }
                }
                for(ix=0;ix<64;ix++)
                {
                    if(ix==m+8 || ix==m-8 || ix==m+1 || ix==m-1 || ix==m+9 || ix==m+7 || ix==m-7 || ix==m-9)
                    {
                        if(a[ix-1].startsWith("BK"))
                        {
                        }
                        else
                        {
                            if(a[ix-1].startsWith("B") || a[ix-1].startsWith(" "))
                            {
                                kc=0;
                                l1=0;
                                l2=0;
                                l3=0;
                                l4=0;
                                l5=0;
                                l6=0;
                                for(l1=0;l1<64;l1++)
                                {
                                    if(a[l1].startsWith("BE"))
                                    {
                                        kc+=BE(l1+1,ix,a);
                                    }
                                }
                                for(l2=0;l2<64;l2++)
                                {
                                    if(a[l2].startsWith("BH"))
                                    {
                                        kc+=BH(l2+1,ix,a);
                                    }
                                }
                                for(l3=0;l3<64;l3++)
                                {
                                    if(a[l3].startsWith("BC"))
                                    {
                                        kc+=BC(l3+1,ix,a);
                                    }
                                }
                                for(l4=0;l4<64;l4++)
                                {
                                    if(a[l4].startsWith("BQ"))
                                    {
                                        kc+=BQ(l4+1,ix,a);
                                    }
                                }
                                for(l5=0;l5<64;l5++)
                                {
                                    if(a[l5].startsWith("BK"))
                                    {
                                        kc+=BK(l5+1,ix,a);
                                    }
                                }
                                for(l6=0;l6<64;l6++)
                                {
                                    if(a[l6].startsWith("BP"))
                                    {
                                        kc+=BP(l6+1,ix,a);
                                    }
                                }
                                if(kc==0)
                                {
                                    j=3;
                                }
                            }
                        }
                        if(j==3)
                        {
                            save=a[ix-1];
                            a[ix-1]=a[m-1];
                            a[m-1]="   ";
                            kc=0;
                            l1=0;
                            l2=0;
                            l3=0;
                            l4=0;
                            l5=0;
                            l6=0;
                            for(l1=0;l1<64;l1++)
                            {
                                if(a[l1].startsWith("BE"))
                                {
                                    kc+=BE(l1+1,ix,a);
                                }
                            }
                            for(l2=0;l2<64;l2++)
                            {
                                if(a[l2].startsWith("BH"))
                                {
                                    kc+=BH(l2+1,ix,a);
                                }
                            }
                            for(l3=0;l3<64;l3++)
                            {
                                if(a[l3].startsWith("BC"))
                                {
                                    kc+=BC(l3+1,ix,a);
                                }
                            }
                            for(l4=0;l4<64;l4++)
                            {
                                if(a[l4].startsWith("BQ"))
                                {
                                    kc+=BQ(l4+1,ix,a);
                                }
                            }
                            for(l5=0;l5<64;l5++)
                            {
                                if(a[l5].startsWith("BK"))
                                {
                                    kc+=BK(l5+1,ix,a);
                                }
                            }
                            for(l6=0;l6<64;l6++)
                            {
                                if(a[l6].startsWith("BP"))
                                {
                                    kc+=BP(l6+1,ix,a);
                                }
                            }
                            if(kc==0)
                            {
                                counter++;
                            }
                            a[m-1]=a[ix-1];
                            a[ix-1]=save;
                        }
                    }
                }
                if(counter==0)
                {
                    System.out.println("mate");
                    System.out.println("Black Wins");
                    break;
                }
                System.out.println("");
                counter=0;
            }
            c=0;d=0;g=0;h=0;i=0;j=0;l=0;m=0;n=0;o=0;p=0;q=0;r=0;up=0;down=0;s=0;t=0;u=0;left=0;right=0;v=0;w=0;x=0;y=0;z=0;queenhack=0;
            e="";
            do{
                queenhack=0;
                e="";
                g=0;
                System.out.println("Which peice do you want to move");
                e=ob.next();
                e=e.toUpperCase();
                for(h=0;h<64;h++)
                {
                    if(a[h].equals(e) && e.startsWith("W"))
                    {
                        g++;
                        m=h+1;
                    }
                }
                if(e.startsWith("B"))
                {
                    System.out.println("choose correctly(it is not your turn)");
                }
                if(g==0)
                {
                    System.out.println("choose correctly(invalid selection)");
                }
                if(C==1)
                {
                    System.out.println("where do you want to move the chosen peice");
                    take=ob.nextInt();
                    if(wcr(m,take,a,e)==1)
                    {
                        g=1;
                        i=take;
                    }
                    else
                    {
                        g=0;
                        System.out.println("Its a check protect your king");
                    }
                }
            }while(g==0);
            if(C==0)
            {
                System.out.println("where do you want to move the chosen peice");
            }
            do
            {
                if(C==0)
                    i=ob.nextInt();
                C=0;    
                j=0;
                if(i>=1 && i<=64)
                {
                    j++;
                }
                else
                {
                    System.out.println("choose correctly(invalid move)");
                    continue;
                }
                k=e.charAt(1);
                if(k=='E' || k=='Q')
                {   
                    for(l=0;l<=7;l++)
                    {
                        if(m>=(1+(l*8)) && m<=((l*8)+8))
                        {
                            n=l;
                            break;
                        }
                    }
                    for(o=0;o<=7;o++)
                    {
                        if(m==((n*8)+1)+o)
                        {
                            p=o;
                            break;
                        }
                    }
                    if(m!=i)
                    {
                        for(q=0;q<=7;q++)
                        {
                            if(i==(1+p)+(8*q))
                            {
                                j++;
                                break;
                            }
                        }
                        if(j==1)
                        {
                            if(i>=(n*8)+1 && i<=((n+1)*8))
                            {
                                j=j+2;
                            }
                            else
                            {
                                System.out.println("choose correctly(invalid move)");
                            }
                        }
                    }
                    if(j==2)
                    {
                        for(r=1;r<=7;r++)
                        {
                            if(m-(r*8)>0)
                            {
                                if(a[(m-(r*8))-1]=="   ")
                                {
                                    up++;
                                    continue;
                                }
                                if(a[(m-(r*8))-1].startsWith("W"))
                                {
                                    up=r-1;
                                    break;
                                }
                                if(a[(m-(r*8))-1].startsWith("B"))
                                {
                                    up=r;
                                    break;
                                }
                            }
                        }
                        for(s=1;s<=7;s++)
                        {
                            if(m+(s*8)<=64)
                            {
                                if(a[(m+(s*8))-1]=="   ")
                                {
                                    down++;
                                    continue;
                                }
                                if(a[(m+(s*8))-1].startsWith("W"))
                                {
                                    down=s-1;
                                    break;
                                }
                                if(a[(m+(s*8))-1].startsWith("B"))
                                {
                                    down=s;
                                    break;
                                }
                            }
                        }
                        if(m-i>0)
                        {
                            if(m-i<=up*8)
                            {
                                j++;
                                System.out.println('\f');
                            }
                            else
                            {
                                System.out.println("You cannot jump over peices");
                            }
                        }
                        else
                        {
                            if(i-m<=down*8)
                            {
                                j++;
                                System.out.println('\f');
                            }
                            else
                            {
                                System.out.println("You cannot jump over peices");
                            }
                        }
                    }
                    else if(j==3)
                    {
                        j--;
                        for(t=1;t<=7;t++)
                        {
                            if((m-t)>=(n*8)+1)
                            {
                                if(a[(m-t)-1]=="   ")
                                {
                                    left++;
                                    continue;
                                }
                                if(a[(m-t)-1].startsWith("W"))
                                {
                                    left=t-1;
                                    break;
                                }
                                if(a[(m-t)-1].startsWith("B"))
                                {
                                    left=t;
                                    break;
                                }
                            }
                        }
                        for(u=1;u<=7;u++)
                        {
                            if((m+t)<=((n+1)*8))
                            {
                                if(a[(m+t)-1]=="   ")
                                {
                                    right++;
                                    continue;
                                }
                                if(a[(m+t)-1].startsWith("W"))
                                {
                                    right=t-1;
                                    break;
                                }
                                if(a[(m+t)-1].startsWith("B"))
                                {
                                    right=t;
                                    break;
                                }
                            }
                        }
                        if(m-i>0)
                        {
                            if(m-i<=left)
                            {
                                j++;
                                System.out.println('\f');
                            }
                            else
                            {
                                System.out.println("You cannot jump over peices");
                            }
                        }
                        else
                        {
                            if(i-m<=right)
                            {
                                j++;
                                System.out.println('\f');
                            }
                            else
                            {
                                System.out.println("You cannot jump over peices");
                            }
                        }
                    }
                    if(j==3)
                    {   
                        save=a[i-1];
                        a[i-1]=a[m-1];
                        a[m-1]="   ";
                        kc=0;
                        l1=0;
                        l2=0;
                        l3=0;
                        l4=0;
                        l5=0;
                        l6=0;
                        l7=0;
                        for(l7=0;l7<64;l7++)
                        {
                            if(a[l7].startsWith("WK"))
                            {
                                i1=l7+1;
                            }
                        }
                        for(l1=0;l1<64;l1++)
                        {
                            if(a[l1].startsWith("BE"))
                            {
                                kc+=BE(l1+1,i1,a);
                            }
                        }
                        for(l2=0;l2<64;l2++)
                        {
                            if(a[l2].startsWith("BH"))
                            {
                                kc+=BH(l2+1,i1,a);
                            }
                        }
                        for(l3=0;l3<64;l3++)
                        {
                            if(a[l3].startsWith("BC"))
                            {
                                kc+=BC(l3+1,i1,a);
                            }
                        }
                        for(l4=0;l4<64;l4++)
                        {
                            if(a[l4].startsWith("BQ"))
                            {
                                kc+=BQ(l4+1,i1,a);
                            }
                        }
                        for(l5=0;l5<64;l5++)
                        {
                            if(a[l5].startsWith("BK"))
                            {
                                kc+=BK(l5+1,i1,a);
                            }
                        }
                        for(l6=0;l6<64;l6++)
                        {
                            if(a[l6].startsWith("BP"))
                            {
                                kc+=BP(l6+1,i1,a);
                            }
                        }
                        a[m-1]=a[i-1];
                        a[i-1]=save;
                        if(kc==0)
                        {
                            j=6;
                        }
                    }
                    if(j==3)
                    {
                        System.out.println("move invalid as u are blocking your king by getting checked");
                    }
                    if(j==6)
                    {
                        queenhack++;
                        a[i-1]=a[m-1];
                        a[m-1]="   ";
                    }
                    A=0;B=0;C=0;
                    for(A=0;A<64;A++)
                    {
                        if(a[A].startsWith("BK"))
                        {
                            B=A+1;
                        }
                    }
                    if(k=='E')
                    {
                        C=WE(i,B,a);
                    }
                    else if(k=='Q')
                    {
                        C=WQ(i,B,a);
                    }
                    if(c==1)
                    {
                        System.out.println("Its a check");
                    }
                }
                if(k=='H')
                {
                    if(a[i-1].startsWith("B") || a[i-1].startsWith(" "))
                    {
                        if(i==(m-6) && a[m-6-1].equals("   ") && m!=7 && m!=15 && m!=23 && m!=31 && m!=39 && m!=47 && m!=55 && m!=63 && m!=8 && m!=16 && m!=24 && m!=32 && m!=40 && m!=48 && m!=56 && m!=64 && m!=1 && m!=2 && m!=3 && m!=4 && m!=5 && m!=6)
                        {
                            j=3;
                            System.out.println('\f');
                        }                   
                        else if(i==(m+10) && a[m+10-1].equals("   ") && m!=7 && m!=15 && m!=23 && m!=31 && m!=39 && m!=47 && m!=55 && m!=63 && m!=8 && m!=16 && m!=24 && m!=32 && m!=40 && m!=48 && m!=56 && m!=64 && m!=57 && m!=58 && m!=59 && m!=60 && m!=61 && m!=62)
                        {
                            j=3;
                            System.out.println('\f');
                        }                    
                        else if(i==(m-15) && a[m-15-1].equals("   ")  && m!=9 && m!=10 && m!=11 && m!=12 && m!=13 && m!=14 && m!=15 && m!=8 && m!=16 && m!=24 && m!=32 && m!=40 && m!=48 && m!=56 && m!=64 && m!=1 && m!=2 && m!=3 && m!=4 && m!=5 && m!=6 && m!=7)
                        {
                            j=3;
                            System.out.println('\f');
                        }                    
                        else if(i==(m+17) && a[m+17-1].equals("   ") && m!=49 && m!=50 && m!=51 && m!=52 && m!=53 && m!=54 && m!=55 && m!=8 && m!=16 && m!=24 && m!=32 && m!=40 && m!=48 && m!=56 && m!=64 && m!=57 && m!=58 && m!=59 && m!=60 && m!=61 && m!=62 && m!=63)
                        {
                            j=3;
                            System.out.println('\f');
                        }                    
                        else if(i==(m+-17) && a[m-17-1].equals("   ") && m!=1 && m!=2 && m!=3 && m!=4 && m!=5 && m!=6 && m!=7 && m!=8 && m!=9 && m!=10 && m!=11 && m!=12 && m!=13 && m!=14 && m!=15 && m!=16 && m!=17 && m!=25 && m!=33 && m!=41 && m!=49 && m!=57)
                        {
                            j=3;
                            System.out.println('\f');
                        }
                        else if(i==(m-10) && a[m-10-1].equals("   ") && m!=1 && m!=2 && m!=3 && m!=4 && m!=5 && m!=6 && m!=7 && m!=8 && m!=10 && m!=18 && m!=26 && m!=34 && m!=42 && m!=50 && m!=58 && m!=9 && m!=17 && m!=25 && m!=33 && m!=41 && m!=49 && m!=57)
                        {
                            j=3;
                            System.out.println('\f');
                        }
                        else if(i==(m+15) && a[m+15-1].equals("   ") && m!=51 && m!=52 && m!=53 && m!=54 && m!=55 && m!=56 && m!=50 && m!=58 && m!=59 && m!=60 && m!=61 && m!=62 && m!=63 && m!=64 && m!=1 && m!=9 && m!=17 && m!=25 && m!=33 && m!=41 && m!=49 && m!=57)
                        {
                            j=3;
                            System.out.println('\f');
                        }
                        else if(i==(m+6) && a[m+6-1].equals("   ") && m!=2 && m!=10 && m!=18 && m!=26 && m!=34 && m!=42 && m!=50 && m!=58 && m!=59 && m!=60 && m!=61 && m!=62 && m!=63 && m!=64 && m!=1 && m!=9 && m!=17 && m!=25 && m!=33 && m!=41 && m!=49 && m!=57)
                        {
                            j=3;
                            System.out.println('\f');
                        }
                        else
                        {
                            System.out.println("choose correctly(invalid move)");
                        }
                    }
                    else
                    {
                        System.out.println("choose correctly(invalid move)");
                    }
                    if(j==3)
                    {
                        save=a[i-1];
                        a[i-1]=a[m-1];
                        a[m-1]="   ";
                        kc=0;
                        l1=0;
                        l2=0;
                        l3=0;
                        l4=0;
                        l5=0;
                        l6=0;
                        l7=0;
                        for(l7=0;l7<64;l7++)
                        {
                            if(a[l7].startsWith("WK"))
                            {
                                i1=l7+1;
                            }
                        }
                        for(l1=0;l1<64;l1++)
                        {
                            if(a[l1].startsWith("BE"))
                            {
                                kc+=BE(l1+1,i1,a);
                            }
                        }
                        for(l2=0;l2<64;l2++)
                        {
                            if(a[l2].startsWith("BH"))
                            {
                                kc+=BH(l2+1,i1,a);
                            }
                        }
                        for(l3=0;l3<64;l3++)
                        {
                            if(a[l3].startsWith("BC"))
                            {
                                kc+=BC(l3+1,i1,a);
                            }
                        }
                        for(l4=0;l4<64;l4++)
                        {
                            if(a[l4].startsWith("BQ"))
                            {
                                kc+=BQ(l4+1,i1,a);
                            }
                        }
                        for(l5=0;l5<64;l5++)
                        {
                            if(a[l5].startsWith("BK"))
                            {
                                kc+=BK(l5+1,i1,a);
                            }
                        }
                        for(l6=0;l6<64;l6++)
                        {
                            if(a[l6].startsWith("BP"))
                            {
                                kc+=BP(l6+1,i1,a);
                            }
                        }
                        a[m-1]=a[i-1];
                        a[i-1]=save;
                        if(kc==0)
                        {
                            j=6;
                        }
                    }
                    if(j==3)
                    {
                        System.out.println("move invalid as u are blocking your king by getting checked");
                    }
                    if(j==6)
                    {
                        a[i-1]=a[m-1];
                        a[m-1]="   ";
                    }
                    A=0;B=0;C=0;
                    for(A=0;A<64;A++)
                    {
                        if(a[A].startsWith("BK"))
                        {
                            B=A+1;
                        }
                    }
                    C=WH(i,B,a);
                    if(c==1)
                    {
                        System.out.println("Its a check");
                    }
                }
                if(k=='C' || k=='Q')
                {
                    if(queenhack==0)
                    {
                        if(m!=i)
                        {
                            w=0;
                            for(v=1;v<=7;v++)
                            {
                                if(m-(v*7)>0)
                                {
                                    if((a[m-(v*7)-1].startsWith("W")))
                                    {
                                        System.out.println("choose correctly(invalid move)");
                                        break;
                                    }
                                    if(k==1)
                                    {
                                        System.out.println("choose correctly(invalid move)");
                                        break;
                                    }
                                    if((a[m-(v*7)-1].startsWith("B")))
                                    {
                                        if(w==1)
                                        {
                                            System.out.println("choose correctly(invalid move)");
                                            break;
                                        }
                                        w++;
                                    }
                                    if((m-(v*7)==i))
                                    {
                                        j=3;
                                        System.out.println('\f');
                                    }
                                }
                            }
                            w=0;
                            for(x=1;x<=7;x++)
                            {
                                if(m-(x*9)>0)
                                {
                                    if((a[m-(x*9)-1].startsWith("W")))
                                    {
                                        System.out.println("choose correctly(invalid move)");
                                        break;
                                    }
                                    if(k==1)
                                    {
                                        System.out.println("choose correctly(invalid move)");
                                        break;
                                    }
                                    if((a[m-(x*9)-1].startsWith("B")))
                                    {
                                        if(w==1)
                                        {
                                            System.out.println("choose correctly(invalid move)");
                                            break;
                                        }
                                        w++;
                                    }
                                    if((m-(x*9)==i))
                                    {
                                        j=3;
                                        System.out.println('\f');
                                    }
                                }
                            }
                            w=0;
                            for(y=1;y<=7;y++)
                            {
                                if(m+(y*9)<=64)
                                {
                                    if((a[m+(y*9)-1].startsWith("W")))
                                    {
                                        System.out.println("choose correctly(invalid move)");
                                        break;
                                    }
                                    if(k==1)
                                    {
                                        System.out.println("choose correctly(invalid move)");
                                        break;
                                    }
                                    if((a[m+(y*9)-1].startsWith("B")))
                                    {
                                        if(w==1)
                                        {
                                            System.out.println("choose correctly(invalid move)");
                                            break;
                                        }
                                        w++;
                                    }
                                    if((m+(y*9)==i))
                                    {
                                        j=3;
                                        System.out.println('\f');
                                    }
                                }
                            }
                            w=0;
                            for(z=1;z<=7;z++)
                            {
                                if(m+(z*7)<=64)
                                {
                                    if((a[m+(z*7)-1].startsWith("W")))
                                    {
                                        System.out.println("choose correctly(invalid move)");
                                        break;
                                    }
                                    if(k==1)
                                    {
                                        System.out.println("choose correctly(invalid move)");
                                        break;
                                    }
                                    if((a[m+(z*7)-1].startsWith("B")))
                                    {
                                        if(w==1)
                                        {
                                            System.out.println("choose correctly(invalid move)");
                                            break;
                                        }
                                        w++;
                                    }
                                    if((m+(z*7)==i))
                                    {
                                        j=3;
                                        System.out.println('\f');
                                    }
                                }
                            }
                        }
                        if(j==3)
                        {
                            save=a[i-1];
                            a[i-1]=a[m-1];
                            a[m-1]="   ";
                            kc=0;
                            l1=0;
                            l2=0;
                            l3=0;
                            l4=0;
                            l5=0;
                            l6=0;
                            l7=0;
                            for(l7=0;l7<64;l7++)
                            {
                                if(a[l7].startsWith("WK"))
                                {
                                    i1=l7+1;
                                }
                            }
                            for(l1=0;l1<64;l1++)
                            {
                                if(a[l1].startsWith("BE"))
                                {
                                    kc+=BE(l1+1,i1,a);
                                }
                            }
                            for(l2=0;l2<64;l2++)
                            {
                                if(a[l2].startsWith("BH"))
                                {
                                    kc+=BH(l2+1,i1,a);
                                }
                            }
                            for(l3=0;l3<64;l3++)
                            {
                                if(a[l3].startsWith("BC"))
                                {
                                    kc+=BC(l3+1,i1,a);
                                }
                            }
                            for(l4=0;l4<64;l4++)
                            {
                                if(a[l4].startsWith("BQ"))
                                {
                                    kc+=BQ(l4+1,i1,a);
                                }
                            }
                            for(l5=0;l5<64;l5++)
                            {
                                if(a[l5].startsWith("BK"))
                                {
                                    kc+=BK(l5+1,i1,a);
                                }
                            }
                            for(l6=0;l6<64;l6++)
                            {
                                if(a[l6].startsWith("BP"))
                                {
                                    kc+=BP(l6+1,i1,a);
                                }
                            }
                            a[m-1]=a[i-1];
                            a[i-1]=save;
                            if(kc==0)
                            {
                                j=6;
                            }
                        }
                        if(j==3)
                        {
                            System.out.println("move invalid as u are blocking your king by getting checked");
                        }
                        if(j==6)
                        {
                            a[i-1]=a[m-1];
                            a[m-1]="   ";
                        }
                        A=0;B=0;C=0;
                        for(A=0;A<64;A++)
                        {
                            if(a[A].startsWith("BK"))
                            {
                                B=A+1;
                            }
                        }
                        if(k=='C')
                        {
                            C=WC(i,B,a);
                        }
                        else if(k=='Q')
                        {
                            C=WQ(i,B,a);
                        }
                        if(c==1)
                        {
                            System.out.println("Its a check");
                        }
                    }
                }
                if(k=='P')
                {
                    for(no=0;no<7;no++)
                    {
                        if(m>=(no*8)+1 && m<=(no+1)*8 && i>=((no+1)*8)+1 && i<=(no+2)*8)
                        {
                            if(i==(m+7) || i==(m+9))
                            {
                                if(a[i-1].startsWith("B"))
                                {
                                    j=3;
                                }
                                else
                                {
                                    System.out.println("choose correctly(invalid move)");
                                }
                            }
                            else if(i==(m+8))
                            {
                                if(a[i-1].startsWith(" "))
                                {
                                    j=3;
                                }
                                else
                                {
                                    System.out.println("choose correctly(invalid move)");
                                }
                            }
                        }
                        else if(m>=(no*8)+1 && m<=(no+1)*8 && i>=((no+2)*8)+1 && i<=(no+3)*8)
                        {
                            if(m>=9 && m<=16 && i==(m+16))
                            {
                                if(a[i-1].startsWith(" "))
                                {
                                    j=3;
                                }
                                else
                                {
                                    System.out.println("choose correctly(invalid move)");
                                }
                            }
                        }
                        else
                        {
                            System.out.println("choose correctly(invalid move)");
                        }
                    }
                    if(j==3)
                    {
                        save=a[i-1];
                        a[i-1]=a[m-1];
                        a[m-1]="   ";
                        kc=0;
                        l1=0;
                        l2=0;
                        l3=0;
                        l4=0;
                        l5=0;
                        l6=0;
                        l7=0;
                        for(l7=0;l7<64;l7++)
                        {
                            if(a[l7].startsWith("WK"))
                            {
                                i1=l7+1;
                            }
                        }
                        for(l1=0;l1<64;l1++)
                        {
                            if(a[l1].startsWith("BE"))
                            {
                                kc+=BE(l1+1,i1,a);
                            }
                        }
                        for(l2=0;l2<64;l2++)
                        {
                            if(a[l2].startsWith("BH"))
                            {
                                kc+=BH(l2+1,i1,a);
                            }
                        }
                        for(l3=0;l3<64;l3++)
                        {
                            if(a[l3].startsWith("BC"))
                            {
                                kc+=BC(l3+1,i1,a);
                            }
                        }
                        for(l4=0;l4<64;l4++)
                        {
                            if(a[l4].startsWith("BQ"))
                            {
                                kc+=BQ(l4+1,i1,a);
                            }
                        }
                        for(l5=0;l5<64;l5++)
                        {
                            if(a[l5].startsWith("BK"))
                            {
                                kc+=BK(l5+1,i1,a);
                            }
                        }
                        for(l6=0;l6<64;l6++)
                        {
                            if(a[l6].startsWith("BP"))
                            {
                                kc+=BP(l6+1,i1,a);
                            }
                        }
                        a[m-1]=a[i-1];
                        a[i-1]=save;
                        if(kc==0)
                        {
                            j=6;
                        }
                    }
                    if(j==3)
                    {
                        System.out.println("move invalid as u are blocking your king by getting checked");
                    }
                    if(j==6)
                    {
                        if(i<=57 && i>=64)
                        {
                            do
                            {
                                naman=0;
                                System.out.println("Your pawn has reached the end of the board what do u want it to change to");
                                ali=ob.nextLine();
                                if(ali.startsWith("W"))
                                {
                                    if(ali.startsWith("WE") || ali.startsWith("WH") || ali.startsWith("WC") || ali.startsWith("WQ"))
                                    {
                                        for(Z=0;Z<64;Z++)
                                        {
                                            if(a[Z].equals(ali))
                                            {
                                                cmon++;
                                            }
                                        }
                                        if(cmon==0)
                                        {
                                            naman++;
                                        }
                                        else
                                        {
                                            System.out.println("Its already in use");
                                        }
                                    }
                                    else
                                    {
                                        System.out.println("It has to be an elsephant or a horse or a cammel or a queen");
                                    }
                                }
                                else
                                {
                                    System.out.println("It has to be white");
                                }
                                cmon=0;
                                ali="";
                            }while(naman!=0);
                            if(naman!=0)
                            {
                                a[m-1]=ali;
                            }
                        }
                        System.out.println('\f');
                        a[i-1]=a[m-1];
                        a[m-1]="   ";
                    }
                    A=0;B=0;C=0;
                    for(A=0;A<64;A++)
                    {
                        if(a[A].startsWith("BK"))
                        {
                            B=A+1;
                        }
                    }
                    C=WPC(i,B,a);
                    if(c==1)
                    {
                        System.out.println("Its a check");
                    }
                }
                if(k=='K')
                {
                    if(i==m+8 || i==m-8 || i==m+1 || i==m-1 || i==m+9 || i==m+7 || i==m-7 || i==m-9)
                    {
                        if(a[i-1].startsWith("BK"))
                        {
                            System.out.println("choose correctly(you cant the king via the king)");
                        }
                        else
                        {
                            if(a[i-1].startsWith("B") || a[i-1].startsWith(" "))
                            {
                                kc=0;
                                l1=0;
                                l2=0;
                                l3=0;
                                l4=0;
                                l5=0;
                                l6=0;
                                for(l1=0;l1<64;l1++)
                                {
                                    if(a[l1].startsWith("BE"))
                                    {
                                        kc+=BE(l1+1,i,a);
                                    }
                                }
                                for(l2=0;l2<64;l2++)
                                {
                                    if(a[l2].startsWith("BH"))
                                    {
                                        kc+=BH(l2+1,i,a);
                                    }
                                }
                                for(l3=0;l3<64;l3++)
                                {
                                    if(a[l3].startsWith("BC"))
                                    {
                                        kc+=BC(l3+1,i,a);
                                    }
                                }
                                for(l4=0;l4<64;l4++)
                                {
                                    if(a[l4].startsWith("BQ"))
                                    {
                                        kc+=BQ(l4+1,i,a);
                                    }
                                }
                                for(l5=0;l5<64;l5++)
                                {
                                    if(a[l5].startsWith("BK"))
                                    {
                                        kc+=BK(l5+1,i,a);
                                    }
                                }
                                for(l6=0;l6<64;l6++)
                                {
                                    if(a[l6].startsWith("BP"))
                                    {
                                        kc+=BP(l6+1,i,a);
                                    }
                                }
                                if(kc==0)
                                {
                                    j=3;
                                }
                                else
                                {
                                    System.out.println("choose correctly(its a check there)");
                                }
                            }
                            else
                            {
                                System.out.println("choose correctly(invalid move)");
                            }
                        }
                    }
                    else
                    {
                        System.out.println("choose correctly(invalid move)");
                    }
                    if(j==3)
                    {
                        System.out.println('\f');
                        a[i-1]=a[m-1];
                        a[m-1]="   ";
                    }
                }
            }while(j!=6);
            a1++;
            d1=c1;
            for(b1=0;b1<=63;b1++)
            {
                if(a[b1].startsWith(" "))
                {
                }
                else
                {
                    c1++;
                }
            }
            if(d1>c1)
            {
                a1=0;
            }
            if(a1==50)
            {
                System.out.println("In the last 50 moves no kill has been observed hence the game is a draw");
                break;
            }
            for(e1=0;e1<=63;e1++)
            {
                if(a[e1].startsWith(" "))
                {
                    f1++;
                }
                if(a[e1].startsWith("BK") || a[e1].startsWith("WK"))
                {
                    g1++;
                }
            }
            if(f1==g1)
            {
                System.out.println("Only the kings are left hence the game is a draw");
                break;
            }
            f1=0;
            g1=0;
            for(ctr=0;ctr<64;ctr++)
            {
                if(a[ctr].startsWith("B"))
                {
                    sv=ctr;
                    cv++;
                }
            }
            if(cv==1)
            {
                if(a[sv].startsWith("BK"))
                {
                    sm=smbc(a);
                }
            }
            if(sm==1)
            {
                System.out.println("White wins");
                System.out.println("Stalemate");
                break;
            }
            cv=0;
            sm=0;
            {//for printing
                System.out.println("+ "+"|"+" 0 "+"|"+" 1 "+"|"+" 2 "+"|"+" 3 "+"|"+" 4 "+"|"+" 5 "+"|"+" 6 "+"|"+" 7 "+"|");
                System.out.println("  "+"|"+"---"+"|"+"---"+"|"+"---"+"|"+"---"+"|"+"---"+"|"+"---"+"|"+"---"+"|"+"---"+"|");
                for(c=0;c<64;c=c+8)
                {
                    if(c<=9)
                    {
                        System.out.print(" ");
                    }
                    System.out.println(c+1+"|"+a[c]+"|"+a[c+1]+"|"+a[c+2]+"|"+a[c+3]+"|"+a[c+4]+"|"+a[c+5]+"|"+a[c+6]+"|"+a[c+7]+"|");
                    System.out.println("  "+"|"+"---"+"|"+"---"+"|"+"---"+"|"+"---"+"|"+"---"+"|"+"---"+"|"+"---"+"|"+"---"+"|");
                }
            }
            if(C==1)
            {
                System.out.print("Its a check");
            }
            if(C==1)
            {
                counter=0;
                kc=0;
                l1=0;
                l2=0;
                l3=0;
                l4=0;
                l5=0;
                l6=0;
                for(l1=0;l1<64;l1++)
                {
                    if(a[l1].startsWith("BE"))
                    {
                        if(BE(l1+1,i,a)==1)
                        {//switch temporarily and then check all for white and then switch back again
                            save=a[i-1];
                            a[i-1]=a[l1];
                            a[l1]="   ";
                            kc=0;
                            l11=0;
                            l2=0;
                            l3=0;
                            l4=0;
                            l5=0;
                            l6=0;
                            l7=0;
                            for(l7=0;l7<64;l7++)
                            {
                                if(a[l7].startsWith("BK"))
                                {
                                    i1=l7+1;
                                }
                            }
                            for(l11=0;l11<64;l11++)
                            {
                                if(a[l11].startsWith("WE"))
                                {
                                    kc+=WE(l11+1,i1,a);
                                }
                            }
                            for(l2=0;l2<64;l2++)
                            {
                                if(a[l2].startsWith("WH"))
                                {
                                    kc+=WH(l2+1,i1,a);
                                }
                            }
                            for(l3=0;l3<64;l3++)
                            {
                                if(a[l3].startsWith("WC"))
                                {
                                    kc+=WC(l3+1,i1,a);
                                }
                            }
                            for(l4=0;l4<64;l4++)
                            {
                                if(a[l4].startsWith("WQ"))
                                {
                                    kc+=WQ(l4+1,i1,a);
                                }
                            }
                            for(l5=0;l5<64;l5++)
                            {
                                if(a[l5].startsWith("WK"))
                                {
                                    kc+=WK(l5+1,i1,a);
                                }
                            }
                            for(l6=0;l6<64;l6++)
                            {
                                if(a[l6].startsWith("WP"))
                                {
                                    kc+=WPC(l6+1,i1,a);
                                }
                            }
                            if(kc==0)
                            {
                                counter++;
                            }
                            a[l1]=a[i-1];
                            a[i-1]=save; 
                        }
                    }
                }
                for(l2=0;l2<64;l2++)
                {
                    if(a[l2].startsWith("BH"))
                    {
                        if(BH(l2+1,i,a)==1)
                        {
                            save=a[i-1];
                            a[i-1]=a[l2];
                            a[l2]="   ";
                            kc=0;
                            l1=0;
                            l22=0;
                            l3=0;
                            l4=0;
                            l5=0;
                            l6=0;
                            l7=0;
                            for(l7=0;l7<64;l7++)
                            {
                                if(a[l7].startsWith("BK"))
                                {
                                    i1=l7+1;
                                }
                            }
                            for(l1=0;l1<64;l1++)
                            {
                                if(a[l1].startsWith("WE"))
                                {
                                    kc+=WE(l1+1,i1,a);
                                }
                            }
                            for(l22=0;l22<64;l22++)
                            {
                                if(a[l22].startsWith("WH"))
                                {
                                    kc+=WH(l22+1,i1,a);
                                }
                            }
                            for(l3=0;l3<64;l3++)
                            {
                                if(a[l3].startsWith("WC"))
                                {
                                    kc+=WC(l3+1,i1,a);
                                }
                            }
                            for(l4=0;l4<64;l4++)
                            {
                                if(a[l4].startsWith("WQ"))
                                {
                                    kc+=WQ(l4+1,i1,a);
                                }
                            }
                            for(l5=0;l5<64;l5++)
                            {
                                if(a[l5].startsWith("WK"))
                                {
                                    kc+=WK(l5+1,i1,a);
                                }
                            }
                            for(l6=0;l6<64;l6++)
                            {
                                if(a[l6].startsWith("WP"))
                                {
                                    kc+=WPC(l6+1,i1,a);
                                }
                            }
                            if(kc==0)
                            {
                                counter++;
                            }
                            a[l2]=a[i-1];
                            a[i-1]=save; 
                        }
                    }
                }
                for(l3=0;l3<64;l3++)
                {
                    if(a[l3].startsWith("BC"))
                    {
                        if(BC(l3+1,i,a)==1)
                        {
                            save=a[i-1];
                            a[i-1]=a[l3];
                            a[l3]="   ";
                            kc=0;
                            l1=0;
                            l2=0;
                            l33=0;
                            l4=0;
                            l5=0;
                            l6=0;
                            l7=0;
                            for(l7=0;l7<64;l7++)
                            {
                                if(a[l7].startsWith("BK"))
                                {
                                    i1=l7+1;
                                }
                            }
                            for(l1=0;l1<64;l1++)
                            {
                                if(a[l1].startsWith("WE"))
                                {
                                    kc+=WE(l1+1,i1,a);
                                }
                            }
                            for(l2=0;l2<64;l2++)
                            {
                                if(a[l2].startsWith("WH"))
                                {
                                    kc+=WH(l2+1,i1,a);
                                }
                            }
                            for(l33=0;l33<64;l33++)
                            {
                                if(a[l33].startsWith("WC"))
                                {
                                    kc+=WC(l33+1,i1,a);
                                }
                            }
                            for(l4=0;l4<64;l4++)
                            {
                                if(a[l4].startsWith("WQ"))
                                {
                                    kc+=WQ(l4+1,i1,a);
                                }
                            }
                            for(l5=0;l5<64;l5++)
                            {
                                if(a[l5].startsWith("WK"))
                                {
                                    kc+=WK(l5+1,i1,a);
                                }
                            }
                            for(l6=0;l6<64;l6++)
                            {
                                if(a[l6].startsWith("WP"))
                                {
                                    kc+=WPC(l6+1,i1,a);
                                }
                            }
                            if(kc==0)
                            {
                                counter++;
                            }
                            a[l3]=a[i-1];
                            a[i-1]=save; 
                        }
                    }
                }
                for(l4=0;l4<64;l4++)
                {
                    if(a[l4].startsWith("BQ"))
                    {
                        if(BQ(l4+1,i,a)==1)
                        {
                            save=a[i-1];
                            a[i-1]=a[l4];
                            a[l4]="   ";
                            kc=0;
                            l1=0;
                            l2=0;
                            l3=0;
                            l44=0;
                            l5=0;
                            l6=0;
                            l7=0;
                            for(l7=0;l7<64;l7++)
                            {
                                if(a[l7].startsWith("BK"))
                                {
                                    i1=l7+1;
                                }
                            }
                            for(l1=0;l1<64;l1++)
                            {
                                if(a[l1].startsWith("WE"))
                                {
                                    kc+=WE(l1+1,i1,a);
                                }
                            }
                            for(l2=0;l2<64;l2++)
                            {
                                if(a[l2].startsWith("WH"))
                                {
                                    kc+=WH(l2+1,i1,a);
                                }
                            }
                            for(l3=0;l3<64;l3++)
                            {
                                if(a[l3].startsWith("WC"))
                                {
                                    kc+=WC(l3+1,i1,a);
                                }
                            }
                            for(l44=0;l44<64;l44++)
                            {
                                if(a[l44].startsWith("WQ"))
                                {
                                    kc+=WQ(l44+1,i1,a);
                                }
                            }
                            for(l5=0;l5<64;l5++)
                            {
                                if(a[l5].startsWith("WK"))
                                {
                                    kc+=WK(l5+1,i1,a);
                                }
                            }
                            for(l6=0;l6<64;l6++)
                            {
                                if(a[l6].startsWith("WP"))
                                {
                                    kc+=WPC(l6+1,i1,a);
                                }
                            }
                            if(kc==0)
                            {
                                counter++;
                            }
                            a[l4]=a[i-1];
                            a[i-1]=save; 
                        }
                    }
                }
                for(l6=0;l6<64;l6++)
                {
                    if(a[l5].startsWith("BP"))
                    {
                        if(BPC(l5+1,i,a)==1)
                        {
                            save=a[i-1];
                            a[i-1]=a[l5];
                            a[l5]="   ";
                            kc=0;
                            l1=0;
                            l2=0;
                            l3=0;
                            l4=0;
                            l55=0;
                            l6=0;
                            l7=0;
                            for(l7=0;l7<64;l7++)
                            {
                                if(a[l7].startsWith("BK"))
                                {
                                    i1=l7+1;
                                }
                            }
                            for(l1=0;l1<64;l1++)
                            {
                                if(a[l1].startsWith("WE"))
                                {
                                    kc+=WE(l1+1,i1,a);
                                }
                            }
                            for(l2=0;l2<64;l2++)
                            {
                                if(a[l2].startsWith("WH"))
                                {
                                    kc+=WH(l2+1,i1,a);
                                }
                            }
                            for(l3=0;l3<64;l3++)
                            {
                                if(a[l3].startsWith("WC"))
                                {
                                    kc+=WC(l3+1,i1,a);
                                }
                            }
                            for(l4=0;l4<64;l4++)
                            {
                                if(a[l4].startsWith("WQ"))
                                {
                                    kc+=WQ(l4+1,i1,a);
                                }
                            }
                            for(l55=0;l55<64;l55++)
                            {
                                if(a[l55].startsWith("WK"))
                                {
                                    kc+=WK(l55+1,i1,a);
                                }
                            }
                            for(l6=0;l6<64;l6++)
                            {
                                if(a[l6].startsWith("WP"))
                                {
                                    kc+=WPC(l6+1,i1,a);
                                }
                            }
                            if(kc==0)
                            {
                                counter++;
                            }
                            a[l5]=a[i-1];
                            a[i-1]=save; 
                        }
                    }
                }
                for(iz=0;iz<64;iz++)
                {
                    l1=0;
                    l2=0;
                    l3=0;
                    l4=0;
                    l5=0;
                    l6=0;
                    for(l1=0;l1<64;l1++)
                    {
                        if(a[l1].startsWith("BE"))
                        {
                            if(BE(l1+1,iz,a)==1)
                            {//switch temporarily and then check all for white and then switch back again
                                save=a[iz-1];
                                a[iz-1]=a[l1];
                                a[l1]="   ";
                                kc=0;
                                l11=0;
                                l2=0;
                                l3=0;
                                l4=0;
                                l5=0;
                                l6=0;
                                l7=0;
                                for(l7=0;l7<64;l7++)
                                {
                                    if(a[l7].startsWith("BK"))
                                    {
                                        i1=l7+1;
                                    }
                                }
                                for(l11=0;l11<64;l11++)
                                {
                                    if(a[l11].startsWith("WE"))
                                    {
                                        kc+=WE(l11+1,i1,a);
                                    }
                                }
                                for(l2=0;l2<64;l2++)
                                {
                                    if(a[l2].startsWith("WH"))
                                    {
                                        kc+=WH(l2+1,i1,a);
                                    }
                                }
                                for(l3=0;l3<64;l3++)
                                {
                                    if(a[l3].startsWith("WC"))
                                    {
                                        kc+=WC(l3+1,i1,a);
                                    }
                                }
                                for(l4=0;l4<64;l4++)
                                {
                                    if(a[l4].startsWith("WQ"))
                                    {
                                        kc+=WQ(l4+1,i1,a);
                                    }
                                }
                                for(l5=0;l5<64;l5++)
                                {
                                    if(a[l5].startsWith("WK"))
                                    {
                                        kc+=WK(l5+1,i1,a);
                                    }
                                }
                                for(l6=0;l6<64;l6++)
                                {
                                    if(a[l6].startsWith("WP"))
                                    {
                                        kc+=WPC(l6+1,i1,a);
                                    }
                                }
                                if(kc==0)
                                {
                                    counter++;
                                }
                                a[l1]=a[iz-1];
                                a[iz-1]=save; 
                            }
                        }
                    }
                    for(l2=0;l2<64;l2++)
                    {
                        if(a[l2].startsWith("BH"))
                        {
                            if(BH(l2+1,iz,a)==1)
                            {
                                save=a[iz-1];
                                a[iz-1]=a[l2];
                                a[l2]="   ";
                                kc=0;
                                l1=0;
                                l22=0;
                                l3=0;
                                l4=0;
                                l5=0;
                                l6=0;
                                l7=0;
                                for(l7=0;l7<64;l7++)
                                {
                                    if(a[l7].startsWith("BK"))
                                    {
                                        i1=l7+1;
                                    }
                                }
                                for(l1=0;l1<64;l1++)
                                {
                                    if(a[l1].startsWith("WE"))
                                    {
                                        kc+=WE(l1+1,i1,a);
                                    }
                                }
                                for(l22=0;l22<64;l22++)
                                {
                                    if(a[l22].startsWith("WH"))
                                    {
                                        kc+=WH(l22+1,i1,a);
                                    }
                                }
                                for(l3=0;l3<64;l3++)
                                {
                                    if(a[l3].startsWith("WC"))
                                    {
                                        kc+=WC(l3+1,i1,a);
                                    }
                                }
                                for(l4=0;l4<64;l4++)
                                {
                                    if(a[l4].startsWith("WQ"))
                                    {
                                        kc+=WQ(l4+1,i1,a);
                                    }
                                }
                                for(l5=0;l5<64;l5++)
                                {
                                    if(a[l5].startsWith("WK"))
                                    {
                                        kc+=WK(l5+1,i1,a);
                                    }
                                }
                                for(l6=0;l6<64;l6++)
                                {
                                    if(a[l6].startsWith("WP"))
                                    {
                                        kc+=WPC(l6+1,i1,a);
                                    }
                                }
                                if(kc==0)
                                {
                                    counter++;
                                }
                                a[l2]=a[iz-1];
                                a[iz-1]=save; 
                            }
                        }
                    }
                    for(l3=0;l3<64;l3++)
                    {
                        if(a[l3].startsWith("BC"))
                        {
                            if(BC(l3+1,iz,a)==1)
                            {
                                save=a[iz-1];
                                a[iz-1]=a[l3];
                                a[l3]="   ";
                                kc=0;
                                l1=0;
                                l2=0;
                                l33=0;
                                l4=0;
                                l5=0;
                                l6=0;
                                l7=0;
                                for(l7=0;l7<64;l7++)
                                {
                                    if(a[l7].startsWith("BK"))
                                    {
                                        i1=l7+1;
                                    }
                                }
                                for(l1=0;l1<64;l1++)
                                {
                                    if(a[l1].startsWith("WE"))
                                    {
                                        kc+=WE(l1+1,i1,a);
                                    }
                                }
                                for(l2=0;l2<64;l2++)
                                {
                                    if(a[l2].startsWith("WH"))
                                    {
                                        kc+=WH(l2+1,i1,a);
                                    }
                                }
                                for(l33=0;l33<64;l33++)
                                {
                                    if(a[l33].startsWith("WC"))
                                    {
                                        kc+=WC(l33+1,i1,a);
                                    }
                                }
                                for(l4=0;l4<64;l4++)
                                {
                                    if(a[l4].startsWith("WQ"))
                                    {
                                        kc+=WQ(l4+1,i1,a);
                                    }
                                }
                                for(l5=0;l5<64;l5++)
                                {
                                    if(a[l5].startsWith("WK"))
                                    {
                                        kc+=WK(l5+1,i1,a);
                                    }
                                }
                                for(l6=0;l6<64;l6++)
                                {
                                    if(a[l6].startsWith("WP"))
                                    {
                                        kc+=WPC(l6+1,i1,a);
                                    }
                                }
                                if(kc==0)
                                {
                                    counter++;
                                }
                                a[l3]=a[iz-1];
                                a[iz-1]=save; 
                            }
                        }
                    }
                    for(l4=0;l4<64;l4++)
                    {
                        if(a[l4].startsWith("BQ"))
                        {
                            if(BQ(l4+1,iz,a)==1)
                            {
                                save=a[iz-1];
                                a[iz-1]=a[l4];
                                a[l4]="   ";
                                kc=0;
                                l1=0;
                                l2=0;
                                l3=0;
                                l44=0;
                                l5=0;
                                l6=0;
                                l7=0;
                                for(l7=0;l7<64;l7++)
                                {
                                    if(a[l7].startsWith("BK"))
                                    {
                                        i1=l7+1;
                                    }
                                }
                                for(l1=0;l1<64;l1++)
                                {
                                    if(a[l1].startsWith("WE"))
                                    {
                                        kc+=WE(l1+1,i1,a);
                                    }
                                }
                                for(l2=0;l2<64;l2++)
                                {
                                    if(a[l2].startsWith("WH"))
                                    {
                                        kc+=WH(l2+1,i1,a);
                                    }
                                }
                                for(l3=0;l3<64;l3++)
                                {
                                    if(a[l3].startsWith("WC"))
                                    {
                                        kc+=WC(l3+1,i1,a);
                                    }
                                }
                                for(l44=0;l44<64;l44++)
                                {
                                    if(a[l44].startsWith("WQ"))
                                    {
                                        kc+=WQ(l44+1,i1,a);
                                    }
                                }
                                for(l55=0;l55<64;l55++)
                                {
                                    if(a[l55].startsWith("WK"))
                                    {
                                        kc+=WK(l55+1,i1,a);
                                    }
                                }
                                for(l6=0;l6<64;l6++)
                                {
                                    if(a[l6].startsWith("WP"))
                                    {
                                        kc+=WPC(l6+1,i1,a);
                                    }
                                }
                                if(kc==0)
                                {
                                    counter++;
                                }
                                a[l4]=a[iz-1];
                                a[iz-1]=save; 
                            }
                        }
                    }
                    for(l5=0;l5<64;l5++)
                    {
                        if(a[l5].startsWith("BP"))
                        {
                            if(BP(l5+1,iz,a)==1)
                            {
                                save=a[iz-1];
                                a[iz-1]=a[l5];
                                a[l5]="   ";
                                kc=0;
                                l1=0;
                                l2=0;
                                l3=0;
                                l4=0;
                                l55=0;
                                l6=0;
                                l7=0;
                                for(l7=0;l7<64;l7++)
                                {
                                    if(a[l7].startsWith("BK"))
                                    {
                                        i1=l7+1;
                                    }
                                }
                                for(l1=0;l1<64;l1++)
                                {
                                    if(a[l1].startsWith("WE"))
                                    {
                                        kc+=WE(l1+1,i1,a);
                                    }
                                }
                                for(l2=0;l2<64;l2++)
                                {
                                    if(a[l2].startsWith("WH"))
                                    {
                                        kc+=WH(l2+1,i1,a);
                                    }
                                }
                                for(l3=0;l3<64;l3++)
                                {
                                    if(a[l3].startsWith("WC"))
                                    {
                                        kc+=WC(l3+1,i1,a);
                                    }
                                }
                                for(l4=0;l4<64;l4++)
                                {
                                    if(a[l4].startsWith("WQ"))
                                    {
                                        kc+=WQ(l4+1,i1,a);
                                    }
                                }
                                for(l55=0;l55<64;l55++)
                                {
                                    if(a[l55].startsWith("WK"))
                                    {
                                        kc+=WK(l55+1,i1,a);
                                    }
                                }
                                for(l6=0;l6<64;l6++)
                                {
                                    if(a[l6].startsWith("WP"))
                                    {
                                        kc+=WPC(l6+1,i1,a);
                                    }
                                }
                                if(kc==0)
                                {
                                    counter++;
                                }
                                a[l5]=a[iz-1];
                                a[iz-1]=save; 
                            }
                        }
                    }
                }
                for(iy=0;iy<64;iy++)
                {
                    if(a[iy].equals("BK1"))
                    {
                        m=iy+1;
                    }
                }
                for(ix=0;ix<64;ix++)
                {
                    if(ix==m+8 || ix==m-8 || ix==m+1 || ix==m-1 || ix==m+9 || ix==m+7 || ix==m-7 || ix==m-9)
                    {
                        if(a[ix-1].startsWith("WK"))
                        {
                        }
                        else
                        {
                            if(a[ix-1].startsWith("W") || a[ix-1].startsWith(" "))
                            {
                                kc=0;
                                l1=0;
                                l2=0;
                                l3=0;
                                l4=0;
                                l5=0;
                                l6=0;
                                for(l1=0;l1<64;l1++)
                                {
                                    if(a[l1].startsWith("WE"))
                                    {
                                        kc+=WE(l1+1,ix,a);
                                    }
                                }
                                for(l2=0;l2<64;l2++)
                                {
                                    if(a[l2].startsWith("WH"))
                                    {
                                        kc+=WH(l2+1,ix,a);
                                    }
                                }
                                for(l3=0;l3<64;l3++)
                                {
                                    if(a[l3].startsWith("WC"))
                                    {
                                        kc+=WC(l3+1,ix,a);
                                    }
                                }
                                for(l4=0;l4<64;l4++)
                                {
                                    if(a[l4].startsWith("WQ"))
                                    {
                                        kc+=WQ(l4+1,ix,a);
                                    }
                                }
                                for(l5=0;l5<64;l5++)
                                {
                                    if(a[l5].startsWith("WK"))
                                    {
                                        kc+=WK(l5+1,ix,a);
                                    }
                                }
                                for(l6=0;l6<64;l6++)
                                {
                                    if(a[l6].startsWith("WP"))
                                    {
                                        kc+=WP(l6+1,ix,a);
                                    }
                                }
                                if(kc==0)
                                {
                                    j=3;
                                }
                            }
                        }
                        if(j==3)
                        {
                            save=a[ix-1];
                            a[ix-1]=a[m-1];
                            a[m-1]="   ";
                            kc=0;
                            l1=0;
                            l2=0;
                            l3=0;
                            l4=0;
                            l5=0;
                            l6=0;
                            for(l1=0;l1<64;l1++)
                            {
                                if(a[l1].startsWith("WE"))
                                {
                                    kc+=WE(l1+1,ix,a);
                                }
                            }
                            for(l2=0;l2<64;l2++)
                            {
                                if(a[l2].startsWith("WH"))
                                {
                                    kc+=WH(l2+1,ix,a);
                                }
                            }
                            for(l3=0;l3<64;l3++)
                            {
                                if(a[l3].startsWith("WC"))
                                {
                                    kc+=WC(l3+1,ix,a);
                                }
                            }
                            for(l4=0;l4<64;l4++)
                            {
                                if(a[l4].startsWith("WQ"))
                                {
                                    kc+=WQ(l4+1,ix,a);
                                }
                            }
                            for(l5=0;l5<64;l5++)
                            {
                                if(a[l5].startsWith("WK"))
                                {
                                    kc+=WK(l5+1,ix,a);
                                }
                            }
                            for(l6=0;l6<64;l6++)
                            {
                                if(a[l6].startsWith("WP"))
                                {
                                    kc+=WP(l6+1,ix,a);
                                }
                            }
                            if(kc==0)
                            {
                                counter++;
                            }
                            a[m-1]=a[ix-1];
                            a[ix-1]=save;
                        }
                    }
                }
                if(counter==0)
                {
                    System.out.println("mate");
                    System.out.println("White wins");
                    break;
                }
                System.out.println("");
                counter=0;
            }
            c=0;d=0;g=0;h=0;i=0;j=0;l=0;m=0;n=0;o=0;p=0;q=0;r=0;up=0;down=0;s=0;t=0;u=0;left=0;right=0;v=0;w=0;x=0;y=0;z=0;queenhack=0;
            e="";
            do{
                queenhack=0;
                e="";
                g=0;
                System.out.println("Which peice do you want to move");
                e=ob.next();
                e=e.toUpperCase();
                for(h=0;h<64;h++)
                {
                    if(a[h].equals(e) && e.startsWith("B"))
                    {
                        g++;
                        m=h+1;
                    }
                }
                if(e.startsWith("W"))
                {
                    System.out.println("choose correctly(it is not your turn)");
                }
                if(g==0)
                {
                    System.out.println("choose correctly(invalid selection)");
                } 
                if(C==1)
                {
                    System.out.println("where do you want to move the chosen peice");
                    take=ob.nextInt();
                    if(bcr(m,take,a,e)==1)
                    {
                        g=1;
                        i=take;
                    }
                    else
                    {
                        g=0;
                        System.out.println("Its a check protect your king");
                    }
                }
            }while(g==0);
            if(C==0)
            {
                System.out.println("where do you want to move the chosen peice");
            }
            do
            {
                if(C==0)
                    i=ob.nextInt();
                C=0;    
                j=0;
                if(i>=1 && i<=64)
                {
                    j++;
                }
                else
                {
                    System.out.println("choose correctly(invalid move)");
                    continue;
                }
                k=e.charAt(1);
                if(k=='E' || k=='Q')
                {   
                    for(l=0;l<=7;l++)
                    {
                        if(m>=(1+(l*8)) && m<=((l*8)+8))
                        {
                            n=l;
                            break;
                        }
                    }
                    for(o=0;o<=7;o++)
                    {
                        if(m==((n*8)+1)+o)
                        {
                            p=o;
                            break;
                        }
                    }
                    if(m!=i)
                    {
                        for(q=0;q<=7;q++)
                        {
                            if(i==(1+p)+(8*q))
                            {
                                j++;
                                break;
                            }
                        }
                        if(j==1)
                        {
                            if(i>=(n*8)+1 && i<=((n+1)*8))
                            {
                                j=j+2;
                            }
                            else
                            {
                                System.out.println("choose correctly(invalid move)");
                            }
                        }
                    }
                    if(j==2)
                    {
                        for(r=1;r<=7;r++)
                        {
                            if(m-(r*8)>0)
                            {
                                if(a[(m-(r*8))-1]=="   ")
                                {
                                    up++;
                                    continue;
                                }
                                if(a[(m-(r*8))-1].startsWith("B"))
                                {
                                    up=r-1;
                                    break;
                                }
                                if(a[(m-(r*8))-1].startsWith("W"))
                                {
                                    up=r;
                                    break;
                                }
                            }
                        }
                        for(s=1;s<=7;s++)
                        {
                            if(m+(s*8)<=64)
                            {
                                if(a[(m+(s*8))-1]=="   ")
                                {
                                    down++;
                                    continue;
                                }
                                if(a[(m+(s*8))-1].startsWith("B"))
                                {
                                    down=s-1;
                                    break;
                                }
                                if(a[(m+(s*8))-1].startsWith("W"))
                                {
                                    down=s;
                                    break;
                                }
                            }
                        }
                        if(m-i>0)
                        {
                            if(m-i<=up*8)
                            {
                                j++;
                                System.out.println('\f');
                            }
                            else
                            {
                                System.out.println("You cannot jump over peices");
                            }
                        }
                        else
                        {
                            if(i-m<=down*8)
                            {
                                j++;
                                System.out.println('\f');
                            }
                            else
                            {
                                System.out.println("You cannot jump over peices");
                            }
                        }
                    }
                    else if(j==3)
                    {
                        j--;
                        for(t=1;t<=7;t++)
                        {
                            if((m-t)>=(n*8)+1)
                            {
                                if(a[(m-t)-1]=="   ")
                                {
                                    left++;
                                    continue;
                                }
                                if(a[(m-t)-1].startsWith("B"))
                                {
                                    left=t-1;
                                    break;
                                }
                                if(a[(m-t)-1].startsWith("W"))
                                {
                                    left=t;
                                    break;
                                }
                            }
                        }
                        for(u=1;u<=7;u++)
                        {
                            if((m+t)<=((n+1)*8))
                            {
                                if(a[(m+t)-1]=="   ")
                                {
                                    right++;
                                    continue;
                                }
                                if(a[(m+t)-1].startsWith("B"))
                                {
                                    right=t-1;
                                    break;
                                }
                                if(a[(m+t)-1].startsWith("W"))
                                {
                                    right=t;
                                    break;
                                }
                            }
                        }
                        if(m-i>0)
                        {
                            if(m-i<=left)
                            {
                                j++;
                                System.out.println('\f');
                            }
                            else
                            {
                                System.out.println("You cannot jump over peices");
                            }
                        }
                        else
                        {
                            if(i-m<=right)
                            {
                                j++;
                                System.out.println('\f');
                            }
                            else
                            {
                                System.out.println("You cannot jump over peices");
                            }
                        }
                    }
                    if(j==3)
                    { 
                        save=a[i-1];
                        a[i-1]=a[m-1];
                        a[m-1]="   ";
                        kc=0;
                        l1=0;
                        l2=0;
                        l3=0;
                        l4=0;
                        l5=0;
                        l6=0;
                        l7=0;
                        for(l7=0;l7<64;l7++)
                        {
                            if(a[l7].startsWith("BK"))
                            {
                                i1=l7+1;
                            }
                        }
                        for(l1=0;l1<64;l1++)
                        {
                            if(a[l1].startsWith("WE"))
                            {
                                kc+=WE(l1+1,i1,a);
                            }
                        }
                        for(l2=0;l2<64;l2++)
                        {
                            if(a[l2].startsWith("WH"))
                            {
                                kc+=WH(l2+1,i1,a);
                            }
                        }
                        for(l3=0;l3<64;l3++)
                        {
                            if(a[l3].startsWith("WC"))
                            {
                                kc+=WC(l3+1,i1,a);
                            }
                        }
                        for(l4=0;l4<64;l4++)
                        {
                            if(a[l4].startsWith("WQ"))
                            {
                                kc+=WQ(l4+1,i1,a);
                            }
                        }
                        for(l5=0;l5<64;l5++)
                        {
                            if(a[l5].startsWith("WK"))
                            {
                                kc+=WK(l5+1,i1,a);
                            }
                        }
                        for(l6=0;l6<64;l6++)
                        {
                            if(a[l6].startsWith("WP"))
                            {
                                kc+=WP(l6+1,i1,a);
                            }
                        }
                        a[m-1]=a[i-1];
                        a[i-1]=save;
                        if(kc==0)
                        {
                            j=6;
                        }
                    }
                    if(j==3)
                    {
                        System.out.println("move invalid as u are blocking your king by getting checked");
                    }
                    if(j==6)
                    {
                        queenhack++;
                        a[i-1]=a[m-1];
                        a[m-1]="   ";
                    }
                    A=0;B=0;C=0;
                    for(A=0;A<64;A++)
                    {
                        if(a[A].startsWith("WK"))
                        {
                            B=A+1;
                        }
                    }
                    if(k=='E')
                    {
                        C=BE(i,B,a);
                    }
                    else if(k=='Q')
                    {
                        C=BQ(i,B,a);
                    }
                    if(c==1)
                    {
                        System.out.println("Its a check");
                    }
                }
                if(k=='H')
                {
                    if(a[i-1].startsWith("W") || a[i-1].startsWith(" "))
                    {
                        if(i==(m-6) && a[m-6-1].equals("   ") && m!=7 && m!=15 && m!=23 && m!=31 && m!=39 && m!=47 && m!=55 && m!=63 && m!=8 && m!=16 && m!=24 && m!=32 && m!=40 && m!=48 && m!=56 && m!=64 && m!=1 && m!=2 && m!=3 && m!=4 && m!=5 && m!=6)
                        {
                            j=3;
                            System.out.println('\f');
                        }                   
                        else if(i==(m+10) && a[m+10-1].equals("   ") && m!=7 && m!=15 && m!=23 && m!=31 && m!=39 && m!=47 && m!=55 && m!=63 && m!=8 && m!=16 && m!=24 && m!=32 && m!=40 && m!=48 && m!=56 && m!=64 && m!=57 && m!=58 && m!=59 && m!=60 && m!=61 && m!=62)
                        {
                            j=3;
                            System.out.println('\f');
                        }                    
                        else if(i==(m-15) && a[m-15-1].equals("   ")  && m!=9 && m!=10 && m!=11 && m!=12 && m!=13 && m!=14 && m!=15 && m!=8 && m!=16 && m!=24 && m!=32 && m!=40 && m!=48 && m!=56 && m!=64 && m!=1 && m!=2 && m!=3 && m!=4 && m!=5 && m!=6 && m!=7)
                        {
                            j=3;
                            System.out.println('\f');
                        }                    
                        else if(i==(m+17) && a[m+17-1].equals("   ") && m!=49 && m!=50 && m!=51 && m!=52 && m!=53 && m!=54 && m!=55 && m!=8 && m!=16 && m!=24 && m!=32 && m!=40 && m!=48 && m!=56 && m!=64 && m!=57 && m!=58 && m!=59 && m!=60 && m!=61 && m!=62 && m!=63)
                        {
                            j=3;
                            System.out.println('\f');
                        }                    
                        else if(i==(m+-17) && a[m-17-1].equals("   ") && m!=1 && m!=2 && m!=3 && m!=4 && m!=5 && m!=6 && m!=7 && m!=8 && m!=9 && m!=10 && m!=11 && m!=12 && m!=13 && m!=14 && m!=15 && m!=16 && m!=17 && m!=25 && m!=33 && m!=41 && m!=49 && m!=57)
                        {
                            j=3;
                            System.out.println('\f');
                        }
                        else if(i==(m-10) && a[m-10-1].equals("   ") && m!=1 && m!=2 && m!=3 && m!=4 && m!=5 && m!=6 && m!=7 && m!=8 && m!=10 && m!=18 && m!=26 && m!=34 && m!=42 && m!=50 && m!=58 && m!=9 && m!=17 && m!=25 && m!=33 && m!=41 && m!=49 && m!=57)
                        {
                            j=3;
                            System.out.println('\f');
                        }
                        else if(i==(m+15) && a[m+15-1].equals("   ") && m!=51 && m!=52 && m!=53 && m!=54 && m!=55 && m!=56 && m!=50 && m!=58 && m!=59 && m!=60 && m!=61 && m!=62 && m!=63 && m!=64 && m!=1 && m!=9 && m!=17 && m!=25 && m!=33 && m!=41 && m!=49 && m!=57)
                        {
                            j=3;
                            System.out.println('\f');
                        }
                        else if(i==(m+6) && a[m+6-1].equals("   ") && m!=2 && m!=10 && m!=18 && m!=26 && m!=34 && m!=42 && m!=50 && m!=58 && m!=59 && m!=60 && m!=61 && m!=62 && m!=63 && m!=64 && m!=1 && m!=9 && m!=17 && m!=25 && m!=33 && m!=41 && m!=49 && m!=57)
                        {
                            j=3;
                            System.out.println('\f');
                        }
                        else
                        {
                            System.out.println("choose correctly(invalid move)");
                        }
                    }
                    if(j==3)
                    {
                        save=a[i-1];
                        a[i-1]=a[m-1];
                        a[m-1]="   ";
                        kc=0;
                        l1=0;
                        l2=0;
                        l3=0;
                        l4=0;
                        l5=0;
                        l6=0;
                        l7=0;
                        for(l7=0;l7<64;l7++)
                        {
                            if(a[l7].startsWith("BK"))
                            {
                                i1=l7+1+1;
                            }
                        }
                        for(l1=0;l1<64;l1++)
                        {
                            if(a[l1].startsWith("WE"))
                            {
                                kc+=WE(l1+1,i1,a);
                            }
                        }
                        for(l2=0;l2<64;l2++)
                        {
                            if(a[l2].startsWith("WH"))
                            {
                                kc+=WH(l2+1,i1,a);
                            }
                        }
                        for(l3=0;l3<64;l3++)
                        {
                            if(a[l3].startsWith("WC"))
                            {
                                kc+=WC(l3+1,i1,a);
                            }
                        }
                        for(l4=0;l4<64;l4++)
                        {
                            if(a[l4].startsWith("WQ"))
                            {
                                kc+=WQ(l4+1,i1,a);
                            }
                        }
                        for(l5=0;l5<64;l5++)
                        {
                            if(a[l5].startsWith("WK"))
                            {
                                kc+=WK(l5+1,i1,a);
                            }
                        }
                        for(l6=0;l6<64;l6++)
                        {
                            if(a[l6].startsWith("WP"))
                            {
                                kc+=WP(l6+1,i1,a);
                            }
                        }
                        a[m-1]=a[i-1];
                        a[i-1]=save;
                        if(kc==0)
                        {
                            j=6;
                        }
                    }
                    if(j==3)
                    {
                        System.out.println("move invalid as u are blocking your king by getting checked");
                    }
                    if(j==6)
                    {
                        a[i-1]=a[m-1];
                        a[m-1]="   ";
                    }
                    A=0;B=0;C=0;
                    for(A=0;A<64;A++)
                    {
                        if(a[A].startsWith("WK"))
                        {
                            B=A+1;
                        }
                    }
                    C=BH(i,B,a);
                    if(c==1)
                    {
                        System.out.println("Its a check");
                    }
                }
                if(k=='C' || k=='Q')
                {
                    if(queenhack==0)
                    {
                        if(m!=i)
                        {
                            w=0;
                            for(v=1;v<=7;v++)
                            {
                                if(m-(v*7)>=0)
                                {
                                    if((a[m-(v*7)-1].startsWith("B")))
                                    {
                                        System.out.println("choose correctly(invalid move)");
                                        break;
                                    }
                                    if(w==1)
                                    {
                                        System.out.println("choose correctly(invalid move)");
                                        break;
                                    }
                                    if((a[m-(v*7)-1].startsWith("W")))
                                    {
                                        if(w==1)
                                        {
                                            System.out.println("choose correctly(invalid move)");
                                            break;
                                        }
                                        w++;
                                    }
                                    if((m-(v*7)==i))
                                    {
                                        j=3;
                                        System.out.println('\f');
                                    }
                                }
                            }
                            w=0;
                            for(x=1;x<=7;x++)
                            {
                                if(m-(x*9)>=0)
                                {
                                    if((a[m-(x*9)-1].startsWith("B")))
                                    {
                                        System.out.println("choose correctly(invalid move)");
                                        break;
                                    }
                                    if(w==1)
                                    {
                                        System.out.println("choose correctly(invalid move)");
                                        break;
                                    }
                                    if((a[m-(x*9)-1].startsWith("W")))
                                    {
                                        if(w==1)
                                        {
                                            System.out.println("choose correctly(invalid move)");
                                            break;
                                        }
                                        w++;
                                    }
                                    if((m-(x*9)==i))
                                    {
                                        j=3;
                                        System.out.println('\f');
                                    }
                                }
                            }
                            w=0;
                            for(y=1;y<=7;y++)
                            {
                                if(m+(y*9)<=64)
                                {
                                    if((a[m+(y*9)-1].startsWith("B")))
                                    {
                                        System.out.println("choose correctly(invalid move)");
                                        break;
                                    }
                                    if(w==1)
                                    {
                                        System.out.println("choose correctly(invalid move)");
                                        break;
                                    }
                                    if((a[m+(y*9)-1].startsWith("W")))
                                    {
                                        if(w==1)
                                        {
                                            System.out.println("choose correctly(invalid move)");
                                            break;
                                        }
                                        w++;
                                    }
                                    if((m+(y*9)==i))
                                    {
                                        j=3;
                                        System.out.println('\f');
                                    }
                                }
                            }
                            w=0;
                            for(z=1;z<=7;z++)
                            {
                                if(m+(z*7)<=64)
                                {
                                    if((a[m+(z*7)-1].startsWith("B")))
                                    {
                                        System.out.println("choose correctly(invalid move)");
                                        break;
                                    }
                                    if(w==1)
                                    {
                                        System.out.println("choose correctly(invalid move)");
                                        break;
                                    }
                                    if((a[m+(z*7)-1].startsWith("W")))
                                    {
                                        if(w==1)
                                        {
                                            System.out.println("choose correctly(invalid move)");
                                            break;
                                        }
                                        w++;
                                    }
                                    if((m+(z*7)==i))
                                    {
                                        j=3;
                                        System.out.println('\f');
                                    }
                                }
                            }
                        }
                        if(j==3)
                        {
                            save=a[i-1];
                            a[i-1]=a[m-1];
                            a[m-1]="   ";
                            kc=0;
                            l1=0;
                            l2=0;
                            l3=0;
                            l4=0;
                            l5=0;
                            l6=0;
                            l7=0;
                            for(l7=0;l7<64;l7++)
                            {
                                if(a[l7].startsWith("BK"))
                                {
                                    i1=l7+1;
                                }
                            }
                            for(l1=0;l1<64;l1++)
                            {
                                if(a[l1].startsWith("WE"))
                                {
                                    kc+=WE(l1+1,i1,a);
                                }
                            }
                            for(l2=0;l2<64;l2++)
                            {
                                if(a[l2].startsWith("WH"))
                                {
                                    kc+=WH(l2+1,i1,a);
                                }
                            }
                            for(l3=0;l3<64;l3++)
                            {
                                if(a[l3].startsWith("WC"))
                                {
                                    kc+=WC(l3+1,i1,a);
                                }
                            }
                            for(l4=0;l4<64;l4++)
                            {
                                if(a[l4].startsWith("WQ"))
                                {
                                    kc+=WQ(l4+1,i1,a);
                                }
                            }
                            for(l5=0;l5<64;l5++)
                            {
                                if(a[l5].startsWith("WK"))
                                {
                                    kc+=WK(l5+1,i1,a);
                                }
                            }
                            for(l6=0;l6<64;l6++)
                            {
                                if(a[l6].startsWith("WP"))
                                {
                                    kc+=WP(l6+1,i1,a);
                                }
                            }
                            a[m-1]=a[i-1];
                            a[i-1]=save;
                            if(kc==0)
                            {
                                j=6;
                            }
                        }
                        if(j==3)
                        {
                            System.out.println("move invalid as u are blocking your king by getting checked");
                        }
                        if(j==6)
                        {
                            a[i-1]=a[m-1];
                            a[m-1]="   ";
                        }
                        A=0;B=0;C=0;
                        for(A=0;A<64;A++)
                        {
                            if(a[A].startsWith("WK"))
                            {
                                B=A+1;
                            }
                        }
                        if(k=='C')
                        {
                            C=BC(i,B,a);
                        }
                        else if(k=='Q')
                        {
                            C=BQ(i,B,a);
                        }
                        if(c==1)
                        {
                            System.out.println("Its a check");
                        }
                    }
                }
                if(k=='P')
                {
                    for(no=0;no<7;no++)
                    {
                        if(m>=(no*8)+1 && m<=(no+1)*8 && i>=((no-1)*8)+1 && i<=(no)*8)
                        {
                            if(i==(m-7) || i==(m-9))
                            {
                                if(a[i-1].startsWith("B"))
                                {
                                    j=3;
                                }
                                else
                                {
                                    System.out.println("choose correctly(invalid move)");
                                }
                            }
                            else if(i==(m-8))
                            {
                                if(a[i-1].startsWith(" "))
                                {
                                    j=3;
                                }
                                else
                                {
                                    System.out.println("choose correctly(invalid move)");
                                }
                            }
                        }
                        else if(m>=(no*8)+1 && m<=(no+1)*8 && i>=((no-2)*8)+1 && i<=(no-1)*8)
                        {
                            if(m>=49 && m<=56 && i==(m-16))
                            {
                                if(a[i-1].startsWith(" "))
                                {
                                    j=3;
                                }
                                else
                                {
                                    System.out.println("choose correctly(invalid move)");
                                }
                            }
                        }
                        else
                        {
                            System.out.println("choose correctly(invalid move)");
                        }
                    }
                    if(j==3)
                    {
                        save=a[i-1];
                        a[i-1]=a[m-1];
                        a[m-1]="   ";
                        kc=0;
                        l1=0;
                        l2=0;
                        l3=0;
                        l4=0;
                        l5=0;
                        l6=0;
                        l7=0;
                        for(l7=0;l7<64;l7++)
                        {
                            if(a[l7].startsWith("BK"))
                            {
                                i1=l7+1;
                            }
                        }
                        for(l1=0;l1<64;l1++)
                        {
                            if(a[l1].startsWith("WE"))
                            {
                                kc+=WE(l1+1,i1,a);
                            }
                        }
                        for(l2=0;l2<64;l2++)
                        {
                            if(a[l2].startsWith("WH"))
                            {
                                kc+=WH(l2+1,i1,a);
                            }
                        }
                        for(l3=0;l3<64;l3++)
                        {
                            if(a[l3].startsWith("WC"))
                            {
                                kc+=WC(l3+1,i1,a);
                            }
                        }
                        for(l4=0;l4<64;l4++)
                        {
                            if(a[l4].startsWith("WQ"))
                            {
                                kc+=WQ(l4+1,i1,a);
                            }
                        }
                        for(l5=0;l5<64;l5++)
                        {
                            if(a[l5].startsWith("WK"))
                            {
                                kc+=WK(l5+1,i1,a);
                            }
                        }
                        for(l6=0;l6<64;l6++)
                        {
                            if(a[l6].startsWith("WP"))
                            {
                                kc+=WP(l6+1,i1,a);
                            }
                        }
                        a[m-1]=a[i-1];
                        a[i-1]=save;
                        if(kc==0)
                        {
                            j=6;
                        }
                    }
                    if(j==3)
                    {
                        System.out.println("move invalid as u are blocking your king by getting checked");
                    }
                    if(j==6)
                    { 
                        if(i<=1 && i>=8)
                        {
                            do
                            {
                                naman=0;
                                System.out.println("Your pawn has reached the end of the board what do u want it to change to");
                                ali=ob.nextLine();
                                if(ali.startsWith("B"))
                                {
                                    if(ali.startsWith("BE") || ali.startsWith("BH") || ali.startsWith("BC") || ali.startsWith("BQ"))
                                    {
                                        for(Z=0;Z<64;Z++)
                                        {
                                            if(a[Z].equals(ali))
                                            {
                                                cmon++;
                                            }
                                        }
                                        if(cmon==0)
                                        {
                                            naman++;
                                        }
                                        else
                                        {
                                            System.out.println("Its already in use");
                                        }
                                    }
                                    else
                                    {
                                        System.out.println("It has to be an elsephant or a horse or a cammel or a queen");
                                    }
                                }
                                else
                                {
                                    System.out.println("It has to be black");
                                }
                                cmon=0;
                                ali="";
                            }while(naman!=0);
                            if(naman!=0)
                            {
                                a[m-1]=ali;
                            }
                        }
                        System.out.println('\f');
                        a[i-1]=a[m-1];
                        a[m-1]="   ";
                    }
                    A=0;B=0;C=0;
                    for(A=0;A<64;A++)
                    {
                        if(a[A].startsWith("WK"))
                        {
                            B=A+1;
                        }
                    }
                    C=BPC(i,B,a);
                    if(c==1)
                    {
                        System.out.println("Its a check");
                    }
                }
                if(k=='K')
                {
                    if(i==m+8 || i==m-8 || i==m+1 || i==m-1 || i==m+9 || i==m+7 || i==m-7 || i==m-9)
                    {
                        if(a[i-1].startsWith("WK"))
                        {
                            System.out.println("choose correctly(you cant the king via the king)");
                        }
                        else
                        {
                            if(a[i-1].startsWith("W") || a[i-1].startsWith(" "))
                            {
                                kc=0;
                                l1=0;
                                l2=0;
                                l3=0;
                                l4=0;
                                l5=0;
                                l6=0;
                                for(l1=0;l1<64;l1++)
                                {
                                    if(a[l1].startsWith("WE"))
                                    {
                                        kc+=WE(l1+1,i,a);
                                    }
                                }
                                for(l2=0;l2<64;l2++)
                                {
                                    if(a[l2].startsWith("WH"))
                                    {
                                        kc+=WH(l2+1,i,a);
                                    }
                                }
                                for(l3=0;l3<64;l3++)
                                {
                                    if(a[l3].startsWith("WC"))
                                    {
                                        kc+=WC(l3+1,i,a);
                                    }
                                }
                                for(l4=0;l4<64;l4++)
                                {
                                    if(a[l4].startsWith("WQ"))
                                    {
                                        kc+=WQ(l4+1,i,a);
                                    }
                                }
                                for(l5=0;l5<64;l5++)
                                {
                                    if(a[l5].startsWith("WK"))
                                    {
                                        kc+=WK(l5+1,i,a);
                                    }
                                }
                                for(l6=0;l6<64;l6++)
                                {
                                    if(a[l6].startsWith("WP"))
                                    {
                                        kc+=WP(l6+1,i,a);
                                    }
                                }
                                if(kc==0)
                                {
                                    j=3;
                                }
                                else
                                {
                                    System.out.println("choose correctly(its a check there)");
                                }
                            }
                            else
                            {
                                System.out.println("choose correctly(invalid move)");
                            }
                        }
                    }
                    else
                    {
                        System.out.println("choose correctly(invalid move)");
                    }
                    if(j==3)
                    {
                        System.out.println('\f');
                        a[i-1]=a[m-1];
                        a[m-1]="   ";
                    }
                }
            }while(j!=6);
            a1++;
            d1=c1;
            for(b1=0;b1<=63;b1++)
            {
                if(a[b1].startsWith(" "))
                {
                }
                else
                {
                    c1++;
                }
            }
            if(d1>c1)
            {
                a1=0;
            }
            if(a1==50)
            {
                System.out.println("In the last 50 moves no kill has been observed hence the game is a draw");
                break;
            }
            for(e1=0;e1<=63;e1++)
            {
                if(a[e1].startsWith(" "))
                {
                    f1++;
                }
                if(a[e1].startsWith("BK") || a[e1].startsWith("WK"))
                {
                    g1++;
                }
            }
            if(f1==g1)
            {
                System.out.println("Only the kings are left hence the game is a draw");
                break;
            }
            f1=0;
            g1=0;
            for(ctr=0;ctr<64;ctr++)
            {
                if(a[ctr].startsWith("W"))
                {
                    sv=ctr;
                    cv++;
                }
            }
            if(cv==1)
            {
                if(a[sv].startsWith("WK"))
                {
                    sm=smwc(a);
                }
            }
            if(sm==1)
            {
                System.out.println("Black wins");
                System.out.println("Stalemate");
                break;
            }
            cv=0;
            sm=0;
        }
    }

    public static int WE(int m,int i,String a[])
    {
        int b,c,d,g,h,j=1,l,n=0,o=0,p=0,q=0,r=0,up=0,down=0,s=0,t=0,u=0,left=0,right=0,v,w,x,y,z,queenhack=0,a1=0,b1=0,c1=0,d1=0,e1=0,f1=0,g1=0;
        String e;
        char f,k;
        for(l=0;l<=7;l++)
        {
            if(m>=(1+(l*8)) && m<=((l*8)+8))
            {
                n=l;
                break;
            }
        }
        for(o=0;o<=7;o++)
        {
            if(m==((n*8)+1)+o)
            {
                p=o;
                break;
            }
        }
        if(m!=i)
        {
            for(q=0;q<=7;q++)
            {
                if(i==(1+p)+(8*q))
                {
                    j++;
                    break;
                }
            }
            if(j==1)
            {
                if(i>=(n*8)+1 && i<=((n+1)*8))
                {
                    j=j+2;
                }
            }
        }
        if(j==2)
        {
            for(r=1;r<=7;r++)
            {
                if(m-(r*8)>0)
                {
                    if(a[(m-(r*8))-1]=="   ")
                    {
                        up++;
                        continue;
                    }
                    if(a[(m-(r*8))-1].startsWith("W"))
                    {
                        up=r-1;
                        break;
                    }
                    if(a[(m-(r*8))-1].startsWith("B"))
                    {
                        up=r;
                        break;
                    }
                }
            }
            for(s=1;s<=7;s++)
            {
                if(m+(s*8)<=64)
                {
                    if(a[(m+(s*8))-1]=="   ")
                    {
                        down++;
                        continue;
                    }
                    if(a[(m+(s*8))-1].startsWith("W"))
                    {
                        down=s-1;
                        break;
                    }
                    if(a[(m+(s*8))-1].startsWith("B"))
                    {
                        down=s;
                        break;
                    }
                }
            }
            if(m-i>0)
            {
                if(m-i<=up*8)
                {
                    j++;
                }
            }
            else
            {
                if(i-m<=down*8)
                {
                    j++;
                }
            }
        }
        else if(j==3)
        {
            j--;
            for(t=1;t<=7;t++)
            {
                if((m-t)>=(n*8)+1)
                {
                    if(a[(m-t)-1]=="   ")
                    {
                        left++;
                        continue;
                    }
                    if(a[(m-t)-1].startsWith("W"))
                    {
                        left=t-1;
                        break;
                    }
                    if(a[(m-t)-1].startsWith("B"))
                    {
                        left=t;
                        break;
                    }
                }
            }
            for(u=1;u<=7;u++)
            {
                if((m+t)<=((n+1)*8))
                {
                    if(a[(m+t)-1]=="   ")
                    {
                        right++;
                        continue;
                    }
                    if(a[(m+t)-1].startsWith("W"))
                    {
                        right=t-1;
                        break;
                    }
                    if(a[(m+t)-1].startsWith("B"))
                    {
                        right=t;
                        break;
                    }
                }
            }
            if(m-i>0)
            {
                if(m-i<=left)
                {
                    j++;
                }
            }
            else
            {
                if(i-m<=right)
                {
                    j++;
                }
            }
        }
        if(j==3)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }

    public static int WH(int m,int i,String a[])
    {
        int b,c,d,g,h,j=1,l,n=0,o=0,p=0,q=0,r=0,up=0,down=0,s=0,t=0,u=0,left=0,right=0,v,w,x,y,z,queenhack=0,a1=0,b1=0,c1=0,d1=0,e1=0,f1=0,g1=0;
        String e;
        char f,k;
        if(i!=0)
        {
            if(a[i-1].startsWith("B") || a[i-1].startsWith(" "))
            {
                if(i==(m-6) && a[m-6-1].equals("   ") && m!=7 && m!=15 && m!=23 && m!=31 && m!=39 && m!=47 && m!=55 && m!=63 && m!=8 && m!=16 && m!=24 && m!=32 && m!=40 && m!=48 && m!=56 && m!=64 && m!=1 && m!=2 && m!=3 && m!=4 && m!=5 && m!=6)
                {
                    j=3;
                }                   
                else if(i==(m+10) && a[m+10-1].equals("   ") && m!=7 && m!=15 && m!=23 && m!=31 && m!=39 && m!=47 && m!=55 && m!=63 && m!=8 && m!=16 && m!=24 && m!=32 && m!=40 && m!=48 && m!=56 && m!=64 && m!=57 && m!=58 && m!=59 && m!=60 && m!=61 && m!=62)
                {
                    j=3;
                }                    
                else if(i==(m-15) && a[m-15-1].equals("   ")  && m!=9 && m!=10 && m!=11 && m!=12 && m!=13 && m!=14 && m!=15 && m!=8 && m!=16 && m!=24 && m!=32 && m!=40 && m!=48 && m!=56 && m!=64 && m!=1 && m!=2 && m!=3 && m!=4 && m!=5 && m!=6 && m!=7)
                {
                    j=3;
                }                    
                else if(i==(m+17) && a[m+17-1].equals("   ") && m!=49 && m!=50 && m!=51 && m!=52 && m!=53 && m!=54 && m!=55 && m!=8 && m!=16 && m!=24 && m!=32 && m!=40 && m!=48 && m!=56 && m!=64 && m!=57 && m!=58 && m!=59 && m!=60 && m!=61 && m!=62 && m!=63)
                {
                    j=3;
                }                    
                else if(i==(m+-17) && a[m-17-1].equals("   ") && m!=1 && m!=2 && m!=3 && m!=4 && m!=5 && m!=6 && m!=7 && m!=8 && m!=9 && m!=10 && m!=11 && m!=12 && m!=13 && m!=14 && m!=15 && m!=16 && m!=17 && m!=25 && m!=33 && m!=41 && m!=49 && m!=57)
                {
                    j=3;
                }
                else if(i==(m-10) && a[m-10-1].equals("   ") && m!=1 && m!=2 && m!=3 && m!=4 && m!=5 && m!=6 && m!=7 && m!=8 && m!=10 && m!=18 && m!=26 && m!=34 && m!=42 && m!=50 && m!=58 && m!=9 && m!=17 && m!=25 && m!=33 && m!=41 && m!=49 && m!=57)
                {
                    j=3;
                }
                else if(i==(m+15) && a[m+15-1].equals("   ") && m!=51 && m!=52 && m!=53 && m!=54 && m!=55 && m!=56 && m!=50 && m!=58 && m!=59 && m!=60 && m!=61 && m!=62 && m!=63 && m!=64 && m!=1 && m!=9 && m!=17 && m!=25 && m!=33 && m!=41 && m!=49 && m!=57)
                {
                    j=3;
                }
                else if(i==(m+6) && a[m+6-1].equals("   ") && m!=2 && m!=10 && m!=18 && m!=26 && m!=34 && m!=42 && m!=50 && m!=58 && m!=59 && m!=60 && m!=61 && m!=62 && m!=63 && m!=64 && m!=1 && m!=9 && m!=17 && m!=25 && m!=33 && m!=41 && m!=49 && m!=57)
                {
                    j=3;
                }
            }
        }
        if(j==3)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }

    public static int WC(int m,int i,String a[])
    {
        int b,c,d,g,h,j=1,l,n=0,o=0,p=0,q=0,r=0,up=0,down=0,s=0,t=0,u=0,left=0,right=0,v,w,x,y,z,queenhack=0,a1=0,b1=0,c1=0,d1=0,e1=0,f1=0,g1=0;
        String e;
        char f,k;
        if(m!=i)
        {
            w=0;
            for(v=1;v<=7;v++)
            {
                if(m-(v*7)>0)
                {
                    if((a[m-(v*7)-1].startsWith("W")))
                    {
                        break;
                    }
                    if(w==1)
                    {
                        break;
                    }
                    if((a[m-(v*7)-1].startsWith("B")))
                    {
                        if(w==1)
                        {
                            break;
                        }
                        w++;
                    }
                    if((m-(v*7)==i))
                    {
                        j=3;
                    }
                }
            }
            w=0;
            for(x=1;x<=7;x++)
            {
                if(m-(x*9)>0)
                {
                    if((a[m-(x*9)-1].startsWith("W")))
                    {
                        break;
                    }
                    if(w==1)
                    {
                        break;
                    }
                    if((a[m-(x*9)-1].startsWith("B")))
                    {
                        if(w==1)
                        {
                            break;
                        }
                        w++;
                    }
                    if((m-(x*9)==i))
                    {
                        j=3;
                    }
                }
            }
            w=0;
            for(y=1;y<=7;y++)
            {
                if(m+(y*9)<=64)
                {
                    if((a[m+(y*9)-1].startsWith("W")))
                    {
                        break;
                    }
                    if(w==1)
                    {
                        break;
                    }
                    if((a[m+(y*9)-1].startsWith("B")))
                    {
                        if(w==1)
                        {
                            break;
                        }
                        w++;
                    }
                    if((m+(y*9)==i))
                    {
                        j=3;
                    }
                }
            }
            w=0;
            for(z=1;z<=7;z++)
            {
                if(m+(z*7)<=64)
                {
                    if((a[m+(z*7)-1].startsWith("W")))
                    {
                        break;
                    }
                    if(w==1)
                    {
                        break;
                    }
                    if((a[m+(z*7)-1].startsWith("B")))
                    {
                        if(w==1)
                        {
                            break;
                        }
                        w++;
                    }
                    if((m+(z*7)==i))
                    {
                        j=3;
                    }
                }
            }
        }
        if(j==3)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }

    public static int WQ(int m,int i,String a[])
    {
        int b,c,d,g,h,j=1,l,n=0,o=0,p=0,q=0,r=0,up=0,down=0,s=0,t=0,u=0,left=0,right=0,v,w,x,y,z,queenhack=0,a1=0,b1=0,c1=0,d1=0,e1=0,f1=0,g1=0;
        String e;
        char f,k;
        {   
            for(l=0;l<=7;l++)
            {
                if(m>=(1+(l*8)) && m<=((l*8)+8))
                {
                    n=l;
                    break;
                }
            }
            for(o=0;o<=7;o++)
            {
                if(m==((n*8)+1)+o)
                {
                    p=o;
                    break;
                }
            }
            if(m!=i)
            {
                for(q=0;q<=7;q++)
                {
                    if(i==(1+p)+(8*q))
                    {
                        j++;
                        break;
                    }
                }
                if(j==1)
                {
                    if(i>=(n*8)+1 && i<=((n+1)*8))
                    {
                        j=j+2;
                    }
                }
            }
            if(j==2)
            {
                for(r=1;r<=7;r++)
                {
                    if(m-(r*8)>0)
                    {
                        if(a[(m-(r*8))-1]=="   ")
                        {
                            up++;
                            continue;
                        }
                        if(a[(m-(r*8))-1].startsWith("W"))
                        {
                            up=r-1;
                            break;
                        }
                        if(a[(m-(r*8))-1].startsWith("B"))
                        {
                            up=r;
                            break;
                        }
                    }
                }
                for(s=1;s<=7;s++)
                {
                    if(m+(s*8)<=64)
                    {
                        if(a[(m+(s*8))-1]=="   ")
                        {
                            down++;
                            continue;
                        }
                        if(a[(m+(s*8))-1].startsWith("W"))
                        {
                            down=s-1;
                            break;
                        }
                        if(a[(m+(s*8))-1].startsWith("B"))
                        {
                            down=s;
                            break;
                        }
                    }
                }
                if(m-i>0)
                {
                    if(m-i<=up*8)
                    {
                        j++;
                    }
                }
                else
                {
                    if(i-m<=down*8)
                    {
                        j++;
                    }
                }
            }
            else if(j==3)
            {
                j--;
                for(t=1;t<=7;t++)
                {
                    if((m-t)>=(n*8)+1)
                    {
                        if(a[(m-t)-1]=="   ")
                        {
                            left++;
                            continue;
                        }
                        if(a[(m-t)-1].startsWith("W"))
                        {
                            left=t-1;
                            break;
                        }
                        if(a[(m-t)-1].startsWith("B"))
                        {
                            left=t;
                            break;
                        }
                    }
                }
                for(u=1;u<=7;u++)
                {
                    if((m+t)<=((n+1)*8))
                    {
                        if(a[(m+t)-1]=="   ")
                        {
                            right++;
                            continue;
                        }
                        if(a[(m+t)-1].startsWith("W"))
                        {
                            right=t-1;
                            break;
                        }
                        if(a[(m+t)-1].startsWith("B"))
                        {
                            right=t;
                            break;
                        }
                    }
                }
                if(m-i>0)
                {
                    if(m-i<=left)
                    {
                        j++;
                    }
                }
                else
                {
                    if(i-m<=right)
                    {
                        j++;
                    }
                }
            }
            if(j==3)
            {
                return 1;
            } 
        }
        if(queenhack==0)
        {
            if(m!=i)
            {
                w=0;
                for(v=1;v<=7;v++)
                {
                    if(m-(v*7)>0)
                    {
                        if((a[m-(v*7)-1].startsWith("W")))
                        {
                            break;
                        }
                        if(w==1)
                        {
                            break;
                        }
                        if((a[m-(v*7)-1].startsWith("B")))
                        {
                            if(w==1)
                            {
                                break;
                            }
                            w++;
                        }
                        if((m-(v*7)==i))
                        {
                            j=3;
                        }
                    }
                }
                w=0;
                for(x=1;x<=7;x++)
                {
                    if(m-(x*9)>0)
                    {
                        if((a[m-(x*9)-1].startsWith("W")))
                        {
                            break;
                        }
                        if(w==1)
                        {
                            break;
                        }
                        if((a[m-(x*9)-1].startsWith("B")))
                        {
                            if(w==1)
                            {
                                break;
                            }
                            w++;
                        }
                        if((m-(x*9)==i))
                        {
                            j=3;
                        }
                    }
                }
                w=0;
                for(y=1;y<=7;y++)
                {
                    if(m+(y*9)<=64)
                    {
                        if((a[m+(y*9)-1].startsWith("W")))
                        {
                            break;
                        }
                        if(w==1)
                        {
                            break;
                        }
                        if((a[m+(y*9)-1].startsWith("B")))
                        {
                            if(w==1)
                            {
                                break;
                            }
                            w++;
                        }
                        if((m+(y*9)==i))
                        {
                            j=3;
                        }
                    }
                }
                w=0;
                for(z=1;z<=7;z++)
                {
                    if(m+(z*7)<=64)
                    {
                        if((a[m+(z*7)-1].startsWith("W")))
                        {
                            break;
                        }
                        if(w==1)
                        {
                            break;
                        }
                        if((a[m+(z*7)-1].startsWith("B")))
                        {
                            if(w==1)
                            {
                                break;
                            }
                            w++;
                        }
                        if((m+(z*7)==i))
                        {
                            j=3;
                        }
                    }
                }
            }
            if(j==3)
            {
                return 1;
            }
            else
            {
                return 0;
            }
        }
        return 0;
    }

    public static int WP(int m,int i,String a[])
    {
        int no,b,c,d,g,h,j=1,l,n=0,o=0,p=0,q=0,r=0,up=0,down=0,s=0,t=0,u=0,left=0,right=0,v,w,x,y,z,queenhack=0,a1=0,b1=0,c1=0,d1=0,e1=0,f1=0,g1=0;
        String e;
        char f,k;
        for(no=0;no<7;no++)
        {
            if(m>=(no*8)+1 && m<=(no+1)*8 && i>=((no+1)*8)+1 && i<=(no+2)*8)
            {
                if(i==(m+7) || i==(m+9))
                {
                    if(a[i-1].startsWith("B"))
                    {
                        j=3;
                    }
                }
                else if(i==(m+8))
                {
                    if(a[i-1].startsWith(" "))
                    {
                        j=3;
                    }
                }
            }
            if(m>=9 && m<=16 && i==(m+16))
            {
                if(m>=(no*8)+1 && m<=(no+1)*8 && i>=((no+2)*8)+1 && i<=(no+3)*8)
                {
                    if(a[i-1].startsWith(" "))
                    {
                        j=3;
                    }
                }
            }
        }
        if(j==3)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }   

    public static int WPC(int m,int i,String a[])
    {
        int no,b,c,d,g,h,j=1,l,n=0,o=0,p=0,q=0,r=0,up=0,down=0,s=0,t=0,u=0,left=0,right=0,v,w,x,y,z,queenhack=0,a1=0,b1=0,c1=0,d1=0,e1=0,f1=0,g1=0;
        String e;
        char f,k;
        for(no=0;no<7;no++)
        {
            if(m>=(no*8)+1 && m<=(no+1)*8 && i>=((no+1)*8)+1 && i<=(no+2)*8)
            {
                if(i==(m+7) || i==(m+9))
                {
                    if(a[i-1].startsWith("B"))
                    {
                        j=3;
                    }
                }
            }
        }
        if(j==3)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }

    public static int BE(int m,int i,String a[])
    {
        int b,c,d,g,h,j=1,l,n=0,o=0,p=0,q=0,r=0,up=0,down=0,s=0,t=0,u=0,left=0,right=0,v,w,x,y,z,queenhack=0,a1=0,b1=0,c1=0,d1=0,e1=0,f1=0,g1=0;
        String e;
        char f,k;
        for(l=0;l<=7;l++)
        {
            if(m>=(1+(l*8)) && m<=((l*8)+8))
            {
                n=l;
                break;
            }
        }
        for(o=0;o<=7;o++)
        {
            if(m==((n*8)+1)+o)
            {
                p=o;
                break;
            }
        }
        if(m!=i)
        {
            for(q=0;q<=7;q++)
            {
                if(i==(1+p)+(8*q))
                {
                    j++;
                    break;
                }
            }
            if(j==1)
            {
                if(i>=(n*8)+1 && i<=((n+1)*8))
                {
                    j=j+2;
                }
            }
        }
        if(j==2)
        {
            for(r=1;r<=7;r++)
            {
                if(m-(r*8)>0)
                {
                    if(a[(m-(r*8))-1]=="   ")
                    {
                        up++;
                        continue;
                    }
                    if(a[(m-(r*8))-1].startsWith("B"))
                    {
                        up=r-1;
                        break;
                    }
                    if(a[(m-(r*8))-1].startsWith("W"))
                    {
                        up=r;
                        break;
                    }
                }
            }
            for(s=1;s<=7;s++)
            {
                if(m+(s*8)<=64)
                {
                    if(a[(m+(s*8))-1]=="   ")
                    {
                        down++;
                        continue;
                    }
                    if(a[(m+(s*8))-1].startsWith("B"))
                    {
                        down=s-1;
                        break;
                    }
                    if(a[(m+(s*8))-1].startsWith("W"))
                    {
                        down=s;
                        break;
                    }
                }
            }
            if(m-i>0)
            {
                if(m-i<=up*8)
                {
                    j++;
                }
            }
            else
            {
                if(i-m<=down*8)
                {
                    j++;
                }
            }
        }
        else if(j==3)
        {
            j--;
            for(t=1;t<=7;t++)
            {
                if((m-t)>=(n*8)+1)
                {
                    if(a[(m-t)-1]=="   ")
                    {
                        left++;
                        continue;
                    }
                    if(a[(m-t)-1].startsWith("B"))
                    {
                        left=t-1;
                        break;
                    }
                    if(a[(m-t)-1].startsWith("W"))
                    {
                        left=t;
                        break;
                    }
                }
            }
            for(u=1;u<=7;u++)
            {
                if((m+t)<=((n+1)*8))
                {
                    if(a[(m+t)-1]=="   ")
                    {
                        right++;
                        continue;
                    }
                    if(a[(m+t)-1].startsWith("B"))
                    {
                        right=t-1;
                        break;
                    }
                    if(a[(m+t)-1].startsWith("W"))
                    {
                        right=t;
                        break;
                    }
                }
            }
            if(m-i>0)
            {
                if(m-i<=left)
                {
                    j++;
                }
            }
            else
            {
                if(i-m<=right)
                {
                    j++;
                }
            }
        }
        if(j==3)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }

    public static int BH(int m,int i,String a[])
    {
        int b,c,d,g,h,j=1,l,n=0,o=0,p=0,q=0,r=0,up=0,down=0,s=0,t=0,u=0,left=0,right=0,v,w,x,y,z,queenhack=0,a1=0,b1=0,c1=0,d1=0,e1=0,f1=0,g1=0;
        String e;
        char f,k;
        if(i!=0)
        {
            if(a[i-1].startsWith("W") || a[i-1].startsWith(" "))
            {
                if(i==(m-6) && a[m-6-1].equals("   ") && m!=7 && m!=15 && m!=23 && m!=31 && m!=39 && m!=47 && m!=55 && m!=63 && m!=8 && m!=16 && m!=24 && m!=32 && m!=40 && m!=48 && m!=56 && m!=64 && m!=1 && m!=2 && m!=3 && m!=4 && m!=5 && m!=6)
                {
                    j=3;
                }                   
                else if(i==(m+10) && a[m+10-1].equals("   ") && m!=7 && m!=15 && m!=23 && m!=31 && m!=39 && m!=47 && m!=55 && m!=63 && m!=8 && m!=16 && m!=24 && m!=32 && m!=40 && m!=48 && m!=56 && m!=64 && m!=57 && m!=58 && m!=59 && m!=60 && m!=61 && m!=62)
                {
                    j=3;
                }                    
                else if(i==(m-15) && a[m-15-1].equals("   ")  && m!=9 && m!=10 && m!=11 && m!=12 && m!=13 && m!=14 && m!=15 && m!=8 && m!=16 && m!=24 && m!=32 && m!=40 && m!=48 && m!=56 && m!=64 && m!=1 && m!=2 && m!=3 && m!=4 && m!=5 && m!=6 && m!=7)
                {
                    j=3;
                }                    
                else if(i==(m+17) && a[m+17-1].equals("   ") && m!=49 && m!=50 && m!=51 && m!=52 && m!=53 && m!=54 && m!=55 && m!=8 && m!=16 && m!=24 && m!=32 && m!=40 && m!=48 && m!=56 && m!=64 && m!=57 && m!=58 && m!=59 && m!=60 && m!=61 && m!=62 && m!=63)
                {
                    j=3;
                }                    
                else if(i==(m+-17) && a[m-17-1].equals("   ") && m!=1 && m!=2 && m!=3 && m!=4 && m!=5 && m!=6 && m!=7 && m!=8 && m!=9 && m!=10 && m!=11 && m!=12 && m!=13 && m!=14 && m!=15 && m!=16 && m!=17 && m!=25 && m!=33 && m!=41 && m!=49 && m!=57)
                {
                    j=3;
                }
                else if(i==(m-10) && a[m-10-1].equals("   ") && m!=1 && m!=2 && m!=3 && m!=4 && m!=5 && m!=6 && m!=7 && m!=8 && m!=10 && m!=18 && m!=26 && m!=34 && m!=42 && m!=50 && m!=58 && m!=9 && m!=17 && m!=25 && m!=33 && m!=41 && m!=49 && m!=57)
                {
                    j=3;
                }
                else if(i==(m+15) && a[m+15-1].equals("   ") && m!=51 && m!=52 && m!=53 && m!=54 && m!=55 && m!=56 && m!=50 && m!=58 && m!=59 && m!=60 && m!=61 && m!=62 && m!=63 && m!=64 && m!=1 && m!=9 && m!=17 && m!=25 && m!=33 && m!=41 && m!=49 && m!=57)
                {
                    j=3;
                }
                else if(i==(m+6) && a[m+6-1].equals("   ") && m!=2 && m!=10 && m!=18 && m!=26 && m!=34 && m!=42 && m!=50 && m!=58 && m!=59 && m!=60 && m!=61 && m!=62 && m!=63 && m!=64 && m!=1 && m!=9 && m!=17 && m!=25 && m!=33 && m!=41 && m!=49 && m!=57)
                {
                    j=3;
                }
            }
        }
        if(j==3)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }

    public static int BC(int m,int i,String a[])
    {
        int b,c,d,g,h,j=1,l,n=0,o=0,p=0,q=0,r=0,up=0,down=0,s=0,t=0,u=0,left=0,right=0,v,w,x,y,z,queenhack=0,a1=0,b1=0,c1=0,d1=0,e1=0,f1=0,g1=0;
        String e;
        char f,k;
        if(m!=i)
        {
            w=0;
            for(v=1;v<=7;v++)
            {
                if(m-(v*7)>0)
                {
                    if((a[m-(v*7)-1].startsWith("B")))
                    {
                        break;
                    }
                    if(w==1)
                    {
                        break;
                    }
                    if((a[m-(v*7)-1].startsWith("W")))
                    {
                        if(w==1)
                        {
                            break;
                        }
                        w++;
                    }
                    if((m-(v*7)==i))
                    {
                        j=3;
                    }
                }
            }
            w=0;
            for(x=1;x<=7;x++)
            {
                if(m-(x*9)>0)
                {
                    if((a[m-(x*9)-1].startsWith("B")))
                    {
                        break;
                    }
                    if(w==1)
                    {
                        break;
                    }
                    if((a[m-(x*9)-1].startsWith("W")))
                    {
                        if(w==1)
                        {
                            break;
                        }
                        w++;
                    }
                    if((m-(x*9)==i))
                    {
                        j=3;
                    }
                }
            }
            w=0;
            for(y=1;y<=7;y++)
            {
                if(m+(y*9)<=64)
                {
                    if((a[m+(y*9)-1].startsWith("B")))
                    {
                        break;
                    }
                    if(w==1)
                    {
                        break;
                    }
                    if((a[m+(y*9)-1].startsWith("W")))
                    {
                        if(w==1)
                        {
                            break;
                        }
                        w++;
                    }
                    if((m+(y*9)==i))
                    {
                        j=3;
                    }
                }
            }
            w=0;
            for(z=1;z<=7;z++)
            {
                if(m+(z*7)<=64)
                {
                    if((a[m+(z*7)-1].startsWith("B")))
                    {
                        break;
                    }
                    if(w==1)
                    {
                        break;
                    }
                    if((a[m+(z*7)-1].startsWith("W")))
                    {
                        if(w==1)
                        {
                            break;
                        }
                        w++;
                    }
                    if((m+(z*7)==i))
                    {
                        j=3;
                    }
                }
            }
        }
        if(j==3)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }

    public static int BQ(int m,int i,String a[])
    {
        int b,c,d,g,h,j=1,l,n=0,o=0,p=0,q=0,r=0,up=0,down=0,s=0,t=0,u=0,left=0,right=0,v,w,x,y,z,queenhack=0,a1=0,b1=0,c1=0,d1=0,e1=0,f1=0,g1=0;
        String e;
        char f,k;
        {   
            for(l=0;l<=7;l++)
            {
                if(m>=(1+(l*8)) && m<=((l*8)+8))
                {
                    n=l;
                    break;
                }
            }
            for(o=0;o<=7;o++)
            {
                if(m==((n*8)+1)+o)
                {
                    p=o;
                    break;
                }
            }
            if(m!=i)
            {
                for(q=0;q<=7;q++)
                {
                    if(i==(1+p)+(8*q))
                    {
                        j++;
                        break;
                    }
                }
                if(j==1)
                {
                    if(i>=(n*8)+1 && i<=((n+1)*8))
                    {
                        j=j+2;
                    }
                }
            }
            if(j==2)
            {
                for(r=1;r<=7;r++)
                {
                    if(m-(r*8)>0)
                    {
                        if(a[(m-(r*8))-1]=="   ")
                        {
                            up++;
                            continue;
                        }
                        if(a[(m-(r*8))-1].startsWith("B"))
                        {
                            up=r-1;
                            break;
                        }
                        if(a[(m-(r*8))-1].startsWith("W"))
                        {
                            up=r;
                            break;
                        }
                    }
                }
                for(s=1;s<=7;s++)
                {
                    if(m+(s*8)<=64)
                    {
                        if(a[(m+(s*8))-1]=="   ")
                        {
                            down++;
                            continue;
                        }
                        if(a[(m+(s*8))-1].startsWith("B"))
                        {
                            down=s-1;
                            break;
                        }
                        if(a[(m+(s*8))-1].startsWith("W"))
                        {
                            down=s;
                            break;
                        }
                    }
                }
                if(m-i>0)
                {
                    if(m-i<=up*8)
                    {
                        j++;
                    }
                }
                else
                {
                    if(i-m<=down*8)
                    {
                        j++;
                    }
                }
            }
            else if(j==3)
            {
                j--;
                for(t=1;t<=7;t++)
                {
                    if((m-t)>=(n*8)+1)
                    {
                        if(a[(m-t)-1]=="   ")
                        {
                            left++;
                            continue;
                        }
                        if(a[(m-t)-1].startsWith("B"))
                        {
                            left=t-1;
                            break;
                        }
                        if(a[(m-t)-1].startsWith("W"))
                        {
                            left=t;
                            break;
                        }
                    }
                }
                for(u=1;u<=7;u++)
                {
                    if((m+t)<=((n+1)*8))
                    {
                        if(a[(m+t)-1]=="   ")
                        {
                            right++;
                            continue;
                        }
                        if(a[(m+t)-1].startsWith("B"))
                        {
                            right=t-1;
                            break;
                        }
                        if(a[(m+t)-1].startsWith("W"))
                        {
                            right=t;
                            break;
                        }
                    }
                }
                if(m-i>0)
                {
                    if(m-i<=left)
                    {
                        j++;
                    }
                }
                else
                {
                    if(i-m<=right)
                    {
                        j++;
                        System.out.println('\f');
                    }
                }
            }
            if(j==3)
            {
                return 1;
            }
            queenhack++;
        }
        if(queenhack==1)
        {
            if(m!=i)
            {
                w=0;
                for(v=1;v<=7;v++)
                {
                    if(m-(v*7)>0)
                    {
                        if((a[m-(v*7)-1].startsWith("B")))
                        {
                            break;
                        }
                        if(w==1)
                        {
                            break;
                        }
                        if((a[m-(v*7)-1].startsWith("W")))
                        {
                            if(w==1)
                            {
                                break;
                            }
                            w++;
                        }
                        if((m-(v*7)==i))
                        {
                            j=3;
                        }
                    }
                }
                w=0;
                for(x=1;x<=7;x++)
                {
                    if(m-(x*9)>0)
                    {
                        if((a[m-(x*9)-1].startsWith("B")))
                        {
                            break;
                        }
                        if(w==1)
                        {
                            break;
                        }
                        if((a[m-(x*9)-1].startsWith("W")))
                        {
                            if(w==1)
                            {
                                break;
                            }
                            w++;
                        }
                        if((m-(x*9)==i))
                        {
                            j=3;
                        }
                    }
                }
                w=0;
                for(y=1;y<=7;y++)
                {
                    if(m+(y*9)<=64)
                    {
                        if((a[m+(y*9)-1].startsWith("B")))
                        {
                            break;
                        }
                        if(w==1)
                        {
                            break;
                        }
                        if((a[m+(y*9)-1].startsWith("W")))
                        {
                            if(w==1)
                            {
                                break;
                            }
                            w++;
                        }
                        if((m+(y*9)==i))
                        {
                            j=3;
                        }
                    }
                }
                w=0;
                for(z=1;z<=7;z++)
                {
                    if(m+(z*7)<=64)
                    {
                        if((a[m+(z*7)-1].startsWith("B")))
                        {
                            break;
                        }
                        if(w==1)
                        {
                            break;
                        }
                        if((a[m+(z*7)-1].startsWith("W")))
                        {
                            if(w==1)
                            {
                                break;
                            }
                            w++;
                        }
                        if((m+(z*7)==i))
                        {
                            j=3;
                        }
                    }
                }
            }
            if(j==3)
            {
                return 1;
            }
            else
            {
                return 0;
            }
        }
        return 0;
    }

    public static int BP(int m,int i,String a[])
    {
        int b,c,d,g,h,j=1,l,n=0,o=0,p=0,q=0,r=0,up=0,down=0,no=0,s=0,t=0,u=0,left=0,right=0,v,w,x,y,z,queenhack=0,a1=0,b1=0,c1=0,d1=0,e1=0,f1=0,g1=0;
        String e;
        char f,k;
        for(no=0;no<7;no++)
        {
            if(m>=(no*8)+1 && m<=(no+1)*8 && i>=((no-1)*8)+1 && i<=(no)*8)
            {
                if(i==(m-7) || i==(m-9))
                {
                    if(a[i-1].startsWith("W"))
                    {
                        j=3;
                    }
                }
                else if(i==(m-8))
                {
                    if(a[i-1].startsWith(" "))
                    {
                        j=3;
                    }
                }
            }
            if(m>=49 && m<=56 && i==(m-16))
            {
                if(m>=(no*8)+1 && m<=(no+1)*8 && i>=((no-2)*8)+1 && i<=(no-1)*8)
                {
                    if(a[i-1].startsWith(" "))
                    {
                        j=3;
                    }
                }
            }
        }
        if(j==3)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }

    public static int BPC(int m,int i,String a[])
    {
        int no=0,b,c,d,g,h,j=1,l,n=0,o=0,p=0,q=0,r=0,up=0,down=0,s=0,t=0,u=0,left=0,right=0,v,w,x,y,z,queenhack=0,a1=0,b1=0,c1=0,d1=0,e1=0,f1=0,g1=0;
        String e;
        char f,k;
        for(no=0;no<7;no++)
        {
            if(m>=(no*8)+1 && m<=(no+1)*8 && i>=((no-1)*8)+1 && i<=(no)*8)
            {
                if(i==(m-7) || i==(m-9))
                {
                    if(a[i-1].startsWith("W"))
                    {
                        j=3;
                    }
                }
            }
        }
        if(j==3)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }

    public static int BK(int m,int i,String a[])
    {
        int b,c,d,g,h,j=1,l,n=0,o=0,p=0,q=0,r=0,up=0,down=0,s=0,t=0,u=0,left=0,right=0,v,w,x,y,z,queenhack=0,a1=0,b1=0,c1=0,d1=0,e1=0,f1=0,g1=0;
        String e;
        char f,k;
        if(i==m+8 || i==m-8 || i==m+1 || i==m-1 || i==m+9 || i==m+7 || i==m-7 || i==m-9)
        {
            if(a[i-1].startsWith("WK"))
            {
            }
            else
            {
                if(a[i-1].startsWith("W") || a[i-1].startsWith(" "))
                {
                    j=3;
                }
            }
        }
        if(j==3)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }

    public static int WK(int m,int i,String a[])
    {
        int b,c,d,g,h,j=1,l,n=0,o=0,p=0,q=0,r=0,up=0,down=0,s=0,t=0,u=0,left=0,right=0,v,w,x,y,z,queenhack=0,a1=0,b1=0,c1=0,d1=0,e1=0,f1=0,g1=0;
        String e;
        char f,k;
        if(i==m+8 || i==m-8 || i==m+1 || i==m-1 || i==m+9 || i==m+7 || i==m-7 || i==m-9)
        {
            if(a[i-1].startsWith("BK"))
            {
            }
            else
            {
                if(a[i-1].startsWith("B") || a[i-1].startsWith(" "))
                {
                    j=3;
                }
            }
        }
        if(j==3)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }

    public static int wcr(int m,int i,String a[],String e)
    { 
        int b=0,l1,l2,l3,l4,l5,l6,l7,kc=0,i1=0,j=0;
        String save="";
        char k;
        k=e.charAt(1);
        if(k=='E')
        {
            b=WE(m,i,a);
        }
        if(k=='H')
        {
            b=WH(m,i,a);
        }
        if(k=='C')
        {
            b=WC(m,i,a);
        }
        if(k=='Q')
        {
            b=WQ(m,i,a);
        }
        if(k=='P')
        {
            b=WP(m,i,a);
        }
        if(k=='K')
        {
            if(i==m+8 || i==m-8 || i==m+1 || i==m-1 || i==m+9 || i==m+7 || i==m-7 || i==m-9)
            {
                if(a[i-1].startsWith("BK"))
                {
                    System.out.println("choose correctly(you cant the king via the king)");
                }
                else
                {
                    if(a[i-1].startsWith("B") || a[i-1].startsWith(" "))
                    {
                        kc=0;
                        l1=0;
                        l2=0;
                        l3=0;
                        l4=0;
                        l5=0;
                        l6=0;
                        for(l1=0;l1<64;l1++)
                        {
                            if(a[l1].startsWith("BE"))
                            {
                                kc+=BE(l1+1,i,a);
                            }
                        }
                        for(l2=0;l2<64;l2++)
                        {
                            if(a[l2].startsWith("BH"))
                            {
                                kc+=BH(l2+1,i,a);
                            }
                        }
                        for(l3=0;l3<64;l3++)
                        {
                            if(a[l3].startsWith("BC"))
                            {
                                kc+=BC(l3+1,i,a);
                            }
                        }
                        for(l4=0;l4<64;l4++)
                        {
                            if(a[l4].startsWith("BQ"))
                            {
                                kc+=BQ(l4+1,i,a);
                            }
                        }
                        for(l5=0;l5<64;l5++)
                        {
                            if(a[l5].startsWith("BK"))
                            {
                                kc+=BK(l5+1,i,a);
                            }
                        }
                        for(l6=0;l6<64;l6++)
                        {
                            if(a[l6].startsWith("BP"))
                            {
                                kc+=BP(l6+1,i,a);
                            }
                        }
                        if(kc==0)
                        {
                            j=3;
                        }
                    }
                }
                if(j==3)
                {
                    return 1;
                }
            }
        }
        if(b!=0)
        {
            save=a[i-1];
            a[i-1]=a[m-1];
            a[m-1]="   ";
            kc=0;
            l1=0;
            l2=0;
            l3=0;
            l4=0;
            l5=0;
            l6=0;
            l7=0;
            for(l7=0;l7<64;l7++)
            {
                if(a[l7].startsWith("WK"))
                {
                    i1=l7+1;
                }
            }
            for(l1=0;l1<64;l1++)
            {
                if(a[l1].startsWith("BE"))
                {
                    kc+=BE(l1+1,i1,a);
                }
            }
            for(l2=0;l2<64;l2++)
            {
                if(a[l2].startsWith("BH"))
                {
                    kc+=BH(l2+1,i1,a);
                }
            }
            for(l3=0;l3<64;l3++)
            {
                if(a[l3].startsWith("BC"))
                {
                    kc+=BC(l3+1,i1,a);
                }
            }
            for(l4=0;l4<64;l4++)
            {
                if(a[l4].startsWith("BQ"))
                {
                    kc+=BQ(l4+1,i1,a);
                }
            }
            for(l5=0;l5<64;l5++)
            {
                if(a[l5].startsWith("BK"))
                {
                    kc+=BK(l5+1,i1,a);
                }
            }
            for(l6=0;l6<64;l6++)
            {
                if(a[l6].startsWith("BP"))
                {
                    kc+=BPC(l6+1,i1,a);
                }
            }
            a[m-1]=a[i-1];
            a[i-1]=save;
        }
        if(kc==0)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    } 

    public static int bcr(int m,int i,String a[],String e)
    { 
        int b=0,l1,l2,l3,l4,l5,l6,l7,kc=0,i1=0,j=0;
        String save="";
        char k;
        k=e.charAt(1);
        if(k=='E')
        {
            b=BE(m,i,a);
        }
        if(k=='H')
        {
            b=BH(m,i,a);
        }
        if(k=='C')
        {
            b=BC(m,i,a);
        }
        if(k=='Q')
        {
            b=BQ(m,i,a);
        }
        if(k=='P')
        {
            b=BP(m,i,a);
        }
        if(k=='K')
        {
            if(i==m+8 || i==m-8 || i==m+1 || i==m-1 || i==m+9 || i==m+7 || i==m-7 || i==m-9)
            {
                if(a[i-1].startsWith("WK"))
                {

                }
                else
                {
                    if(a[i-1].startsWith("W") || a[i-1].startsWith(" "))
                    {
                        kc=0;
                        l1=0;
                        l2=0;
                        l3=0;
                        l4=0;
                        l5=0;
                        l6=0;
                        for(l1=0;l1<64;l1++)
                        {
                            if(a[l1].startsWith("WE"))
                            {
                                kc+=WE(l1+1,i,a);
                            }
                        }
                        for(l2=0;l2<64;l2++)
                        {
                            if(a[l2].startsWith("WH"))
                            {
                                kc+=WH(l2+1,i,a);
                            }
                        }
                        for(l3=0;l3<64;l3++)
                        {
                            if(a[l3].startsWith("WC"))
                            {
                                kc+=WC(l3+1,i,a);
                            }
                        }
                        for(l4=0;l4<64;l4++)
                        {
                            if(a[l4].startsWith("WQ"))
                            {
                                kc+=WQ(l4+1,i,a);
                            }
                        }
                        for(l5=0;l5<64;l5++)
                        {
                            if(a[l5].startsWith("WK"))
                            {
                                kc+=WK(l5+1,i,a);
                            }
                        }
                        for(l6=0;l6<64;l6++)
                        {
                            if(a[l6].startsWith("WP"))
                            {
                                kc+=WP(l6+1,i,a);
                            }
                        }
                        if(kc==0)
                        {
                            j=3;
                        }
                    }
                }
                if(j==3)
                {
                    return 1;
                }
            }
        }
        if(b!=0)
        {
            save=a[i-1];
            a[i-1]=a[m-1];
            a[m-1]="   ";
            kc=0;
            l1=0;
            l2=0;
            l3=0;
            l4=0;
            l5=0;
            l6=0;
            l7=0;
            for(l7=0;l7<64;l7++)
            {
                if(a[l7].startsWith("BK"))
                {
                    i1=l7+1;
                }
            }
            for(l1=0;l1<64;l1++)
            {
                if(a[l1].startsWith("WE"))
                {
                    kc+=WE(l1+1,i1,a);
                }
            }
            for(l2=0;l2<64;l2++)
            {
                if(a[l2].startsWith("WH"))
                {
                    kc+=WH(l2+1,i1,a);
                }
            }
            for(l3=0;l3<64;l3++)
            {
                if(a[l3].startsWith("WC"))
                {
                    kc+=WC(l3+1,i1,a);
                }
            }
            for(l4=0;l4<64;l4++)
            {
                if(a[l4].startsWith("WQ"))
                {
                    kc+=WQ(l4+1,i1,a);
                }
            }
            for(l5=0;l5<64;l5++)
            {
                if(a[l5].startsWith("WK"))
                {
                    kc+=WK(l5+1,i1,a);
                }
            }
            for(l6=0;l6<64;l6++)
            {
                if(a[l6].startsWith("WP"))
                {
                    kc+=WPC(l6+1,i1,a);
                }
            }
            a[m-1]=a[i-1];
            a[i-1]=save;
        }
        if(kc==0)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    } 

    public static int smwc(String a[])
    {
        int m=0,z,i,l1,l2,l3,l4,l5,l6,kc,no=0,j=0;
        for(z=0;z<64;z++)
        {
            if(a[z].startsWith("WK"))
            { 
                m=z+1;
            }
        }
        for(i=0;i<64;i++)
        {
            if(i==m+8 || i==m-8 || i==m+1 || i==m-1 || i==m+9 || i==m+7 || i==m-7 || i==m-9)
            {
                if(a[i-1].startsWith("BK"))
                {
                }
                else
                {
                    if(a[i-1].startsWith("B") || a[i-1].startsWith(" "))
                    {
                        kc=0;
                        l1=0;
                        l2=0;
                        l3=0;
                        l4=0;
                        l5=0;
                        l6=0;
                        for(l1=0;l1<64;l1++)
                        {
                            if(a[l1].startsWith("BE"))
                            {
                                kc+=BE(l1+1,i,a);
                            }
                        }
                        for(l2=0;l2<64;l2++)
                        {
                            if(a[l2].startsWith("BH"))
                            {
                                kc+=BH(l2+1,i,a);
                            }
                        }
                        for(l3=0;l3<64;l3++)
                        {
                            if(a[l3].startsWith("BC"))
                            {
                                kc+=BC(l3+1,i,a);
                            }
                        }
                        for(l4=0;l4<64;l4++)
                        {
                            if(a[l4].startsWith("BQ"))
                            {
                                kc+=BQ(l4+1,i,a);
                            }
                        }
                        for(l5=0;l5<64;l5++)
                        {
                            if(a[l5].startsWith("BK"))
                            {
                                kc+=BK(l5+1,i,a);
                            }
                        }
                        for(l6=0;l6<64;l6++)
                        {
                            if(a[l6].startsWith("BP"))
                            {
                                kc+=BP(l6+1,i,a);
                            }
                        }
                        if(kc==0)
                        {
                            j=3;
                        }
                    }
                }
            }
            if(j==3)
            {  
                no++;
            }
        }       
        if(no==0)
        {
            return 1;
        }
        else 
        {
            return 0;
        }
    }

    public static int smbc(String a[])
    {
        int m=0,z,i,l1,l2,l3,l4,l5,l6,kc,no=0,j=0;
        for(z=0;z<64;z++)
        {
            if(a[z].startsWith("BK"))
            { 
                m=z+1;
            }
        }
        for(i=0;i<64;i++)
        {
            if(i==m+8 || i==m-8 || i==m+1 || i==m-1 || i==m+9 || i==m+7 || i==m-7 || i==m-9)
            {
                if(a[i-1].startsWith("WK"))
                {
                }
                else
                {
                    if(a[i-1].startsWith("W") || a[i-1].startsWith(" "))
                    {
                        kc=0;
                        l1=0;
                        l2=0;
                        l3=0;
                        l4=0;
                        l5=0;
                        l6=0;
                        for(l1=0;l1<64;l1++)
                        {
                            if(a[l1].startsWith("WE"))
                            {
                                kc+=WE(l1+1,i,a);
                            }
                        }
                        for(l2=0;l2<64;l2++)
                        {
                            if(a[l2].startsWith("WH"))
                            {
                                kc+=WH(l2+1,i,a);
                            }
                        }
                        for(l3=0;l3<64;l3++)
                        {
                            if(a[l3].startsWith("WC"))
                            {
                                kc+=WC(l3+1,i,a);
                            }
                        }
                        for(l4=0;l4<64;l4++)
                        {
                            if(a[l4].startsWith("WQ"))
                            {
                                kc+=WQ(l4+1,i,a);
                            }
                        }
                        for(l5=0;l5<64;l5++)
                        {
                            if(a[l5].startsWith("WK"))
                            {
                                kc+=WK(l5+1,i,a);
                            }
                        }
                        for(l6=0;l6<64;l6++)
                        {
                            if(a[l6].startsWith("WP"))
                            {
                                kc+=WP(l6+1,i,a);
                            }
                        }
                        if(kc==0)
                        {
                            j=3;
                        }
                    }
                }
            }
            if(j==3)
            {  
                no++;
            }
        }       
        if(no==0)
        {
            return 1;
        }
        else 
        {
            return 0;
        }
    }

    public static void cricket()
    {
        Scanner ob=new Scanner(System.in);
        int a,c,e,f,h,i,k,l=0,m,n,p,q=0,r;
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
                    break;
                }
            }
            System.out.println("their score is "+q);
            if(q>l)
            {
                r=q-l;
                System.out.print("you loose by "+r);
                System.out.println(" runs. ");
            }
            else
            {
                r=l-q;
                System.out.print("you win by "+r+" runs");
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
                    break;
                }
            }
            System.out.println("your score is  "+l);    
            if(q>l)
            {
                r=q-l;
                System.out.print("you loose by "+r);
                System.out.println(" runs. ");
            }
            else
            {
                r=l-q;
                System.out.print("you win by "+r+" runs");
            }   
        }    
        a=0;c=0;d=0;e=0;f=0;g=0;h=0;i=0;j=0;k=0;l=0;m=0;n=0;o=0;p=0;q=0;r=0;
    }

    public static void jumblewords()
    {
        Scanner ob=new Scanner(System.in);
        String a;
        System.out.println("Enter a word");
        a=ob.next();
        System.out.println("Enter a hint");
        String z=ob.next();
        System.out.println('\f');
        int b;
        b=a.length();
        String c[]=new String[b];
        int f;
        char d;
        String e;
        double h;
        int g;
        int i=0;
        for(f=0;f<b;f++)
        {
            d=a.charAt(f);
            e=d+"";
            c[f]=e;
        }
        while(i<b)
        {
            h=(Math.random())*100;
            g=(int)h;
            if(g<b)
            {
                if(c[g]==null)
                {
                    continue;
                }
                else
                {
                    System.out.print(c[g]);
                    c[g]=null;
                    i++;
                }
            }
        }
        System.out.println("");
        System.out.println("the hint is "+z);
        System.out.println("Enter the word");
        String x=ob.next();
        if(x.equals(a)==true )
        {
            System.out.println("you won");
        }
        else
        {
            System.out.println("you lost");
            System.out.println("the word was "+a);

        }
    }

    public static void xando()
    {
        Scanner ob=new Scanner(System.in);
        int b,c,e,d=0,f,j=0,k=0;
        String a[]=new String[9];
        for(b=0;b<9;b++)
        {
            a[b]="  ";
        }
        System.out.println(a[0]+"|"+a[1]+"|"+a[2]);
        System.out.println("--"+"|"+"--"+"|"+"--");
        System.out.println(a[3]+"|"+a[4]+"|"+a[5]);
        System.out.println("--"+"|"+"--"+"|"+"--");
        System.out.println(a[6]+"|"+a[7]+"|"+a[8]);
        for(int g=0;g<=1000000;g++)
        {
            while(d<=0)
            {
                if(k==0)
                    System.out.println("player X choose a position");
                else
                    System.out.println("poss already used choose another poss");
                e=ob.nextInt();
                e=e-1;
                if(e<=9)
                {
                    if(a[e]!="  ")
                    {
                        k++;
                        continue;
                    }
                    else
                    {
                        a[e]="X ";
                        d++;
                        j++;
                    }
                }
                else
                    System.out.println("choose properly");
            }
            k=0;
            System.out.println('\f');
            System.out.println(a[0]+"|"+a[1]+"|"+a[2]);
            System.out.println("--"+"|"+"--"+"|"+"--");
            System.out.println(a[3]+"|"+a[4]+"|"+a[5]);
            System.out.println("--"+"|"+"--"+"|"+"--");
            System.out.println(a[6]+"|"+a[7]+"|"+a[8]);
            d=0;
            if(a[0]==a[1] && a[1]==a[2] && a[2]=="X " || a[0]==a[3] && a[3]==a[6] && a[6]=="X " || a[0]==a[4] && a[4]==a[8] && a[8]=="X ")
            {
                System.out.println("x wins");
                break;
            }
            if(a[8]==a[5] && a[5]==a[2] && a[2]=="X " || a[6]==a[7] && a[7]==a[8] && a[8]=="X " || a[6]==a[4] && a[4]==a[2] && a[2]=="X ")
            {
                System.out.println("x wins");
                break;
            }
            if( a[1]==a[4] && a[4]==a[7] && a[7]=="X " || a[3]==a[4] && a[4]==a[5] && a[5]=="X ")
            {
                System.out.println("X wins");
                break;
            }    
            if(j==9)
            {
                System.out.println("Its a draw");
                break;
            }
            while(d<=0)
            {
                if(k==0)
                    System.out.println("player O choose a position");
                else
                    System.out.println("poss already used choose another poss");
                f=ob.nextInt();
                f=f-1;
                if(f<=9)
                {
                    if(a[f]!="  ")
                    {
                        k++;
                        continue;
                    }
                    else
                    {
                        a[f]="O ";
                        d++;
                        j++;
                    }
                }
                else
                    System.out.println("choose properly");
            }
            System.out.println('\f');
            System.out.println(a[0]+"|"+a[1]+"|"+a[2]);
            System.out.println("--"+"|"+"--"+"|"+"--");
            System.out.println(a[3]+"|"+a[4]+"|"+a[5]);
            System.out.println("--"+"|"+"--"+"|"+"--");
            System.out.println(a[6]+"|"+a[7]+"|"+a[8]);
            d=0;
            if(a[0]==a[1] && a[1]==a[2] && a[2]=="O " || a[0]==a[3] && a[3]==a[6] && a[6]=="O " || a[0]==a[4] && a[4]==a[8] && a[8]=="O ")
            {
                System.out.println("O wins");
                break;
            }
            if(a[8]==a[5] && a[5]==a[2] && a[2]=="O " || a[6]==a[7] && a[7]==a[8] && a[8]=="O " || a[6]==a[4] && a[4]==a[2] && a[2]=="O ")
            {
                System.out.println("O wins");
                break;
            }
            if( a[1]==a[4] && a[4]==a[7] && a[7]=="O " || a[3]==a[4] && a[4]==a[5] && a[5]=="O ")
            {
                System.out.println("O wins");
                break;
            }    
        } 
    }

    public static void connect()
    {
        Scanner ob=new Scanner(System.in);
        int b,c,d=0,d1,e,c1,k=0,g=0,h=0,i=0,l,m,n,o,p=0,z=0,x=0,y=0;
        String a[]=new String[42];
        for(b=0;b<42;b++)
        {
            a[b]="  ";
        }
        for(c=0;c<42;c=c+7)
        {
            System.out.println(a[c]+"|"+a[c+1]+"|"+a[c+2]+"|"+a[c+3]+"|"+a[c+4]+"|"+a[c+5]+"|"+a[c+6]);    
            System.out.println("--"+"|"+"--"+"|"+"--"+"|"+"--"+"|"+"--"+"|"+"--"+"|"+"--");
        }
        for(d1=0;d1<=100000;d1++)
        {
            while(d<=0)
            {
                if(k==0)
                    System.out.println("player X choose a coloumn to put in");
                else
                    System.out.println("coloumn filled choose another coloumn");
                e=ob.nextInt();
                e=e-1;
                g=e;
                h=0;
                i=-1;
                if(e<=6)
                {
                    if(a[e]!="  ")
                    {
                        k++;
                        continue;
                    }
                    for(int f=1;f<=6;f++)
                    {
                        if(h!=0)
                            g=g+7;
                        h++;
                        if(a[g]=="  ")
                        {
                            i=g;
                        }
                    }
                    if(i!=-1)
                    {
                        a[i]="X ";
                        d++;
                        y++;
                    }
                }
                else
                    System.out.println("choose properly");
            }
            d=0;k=0;h=0;
            System.out.println('\f');
            for(c1=0;c1<42;c1=c1+7)
            {
                System.out.println(a[c1]+"|"+a[c1+1]+"|"+a[c1+2]+"|"+a[c1+3]+"|"+a[c1+4]+"|"+a[c1+5]+"|"+a[c1+6]);    
                System.out.println("--"+"|"+"--"+"|"+"--"+"|"+"--"+"|"+"--"+"|"+"--"+"|"+"--");
            }
            for(int q=0;q<=3;q++)
            {
                l=35+q;m=29+q;n=23+q;o=17+q;
                for(int j=1;j<=3;j++)
                {
                    if(a[l]==a[m]&&a[m]==a[n]&&a[n]==a[o]&&a[o]=="X ")
                    {
                        z++;
                    }
                    l=l-7;m=m-7;n=n-7;o=o-7;
                }
            }
            for(int q=0;q<=3;q++)
            {
                l=41-q;m=33-q;n=25-q;o=17-q;
                for(int j=1;j<=3;j++)
                {
                    if(a[l]==a[m]&&a[m]==a[n]&&a[n]==a[o]&&a[o]=="X ")
                    {
                        z++;
                    }
                    l=l-7;m=m-7;n=n-7;o=o-7;
                }
            }
            for(int q=0;q<=3;q++)
            {
                l=35+q;m=36+q;n=37+q;o=38+q;
                for(int j=1;j<=6;j++)
                {
                    if(a[l]==a[m]&&a[m]==a[n]&&a[n]==a[o]&&a[o]=="X ")
                    {
                        z++;
                    }
                    l=l-7;m=m-7;n=n-7;o=o-7;
                }
            }
            for(int q=0;q<=6;q++)
            {
                l=35+q;m=28+q;n=21+q;o=14+q;
                for(int j=1;j<=3;j++)
                {
                    if(a[l]==a[m]&&a[m]==a[n]&&a[n]==a[o]&&a[o]=="X ")
                    {
                        z++;
                    }
                    l=l-7;m=m-7;n=n-7;o=o-7;
                }
            }
            if(z>=1)
            {
                System.out.println("X wins");
                break;
            }    
            while(d<=0)
            {
                if(k==0)
                    System.out.println("player O choose a coloumn to put in");
                else
                    System.out.println("coloumn filled choose another coloumn");
                e=ob.nextInt();
                e=e-1;
                g=e;
                h=0;
                i=-1;
                if(e<=6)
                {
                    if(a[e]!="  ")
                    {
                        k++;
                        continue;
                    }
                    for(int f=1;f<=6;f++)
                    {
                        if(h!=0)
                            g=g+7;
                        h++;
                        if(a[g]=="  ")
                        {
                            i=g;
                        }
                    }
                    if(i!=-1)
                    {
                        a[i]="O ";
                        d++;
                        y++;
                    }
                }
                else
                    System.out.println("choose properly");
            }
            d=0;k=0;h=0;
            System.out.println('\f');
            for(c1=0;c1<42;c1=c1+7)
            {
                System.out.println(a[c1]+"|"+a[c1+1]+"|"+a[c1+2]+"|"+a[c1+3]+"|"+a[c1+4]+"|"+a[c1+5]+"|"+a[c1+6]);    
                System.out.println("--"+"|"+"--"+"|"+"--"+"|"+"--"+"|"+"--"+"|"+"--"+"|"+"--");
            }
            for(int q=0;q<=3;q++)
            {
                l=35+q;m=29+q;n=23+q;o=17+q;
                for(int j=1;j<=3;j++)
                {
                    if(a[l]==a[m]&&a[m]==a[n]&&a[n]==a[o]&&a[o]=="O ")
                    {
                        x++;
                    }
                    l=l-7;m=m-7;n=n-7;o=o-7;
                }
            }
            for(int q=0;q<=3;q++)
            {
                l=41-q;m=33-q;n=25-q;o=17-q;
                for(int j=1;j<=3;j++)
                {
                    if(a[l]==a[m]&&a[m]==a[n]&&a[n]==a[o]&&a[o]=="O ")
                    {
                        x++;
                    }
                    l=l-7;m=m-7;n=n-7;o=o-7;
                }
            }
            for(int q=0;q<=3;q++)
            {
                l=35+q;m=36+q;n=37+q;o=38+q;
                for(int j=1;j<=6;j++)
                {
                    if(a[l]==a[m]&&a[m]==a[n]&&a[n]==a[o]&&a[o]=="O ")
                    {
                        x++;
                    }
                    l=l-7;m=m-7;n=n-7;o=o-7;
                }
            }
            for(int q=0;q<=6;q++)
            {
                l=35+q;m=28+q;n=21+q;o=14+q;
                for(int j=1;j<=3;j++)
                {
                    if(a[l]==a[m]&&a[m]==a[n]&&a[n]==a[o]&&a[o]=="O ")
                    {
                        x++;
                    }
                    l=l-7;m=m-7;n=n-7;o=o-7;
                }
            }
            if(x>=1)
            {
                System.out.println("O wins");
                break;
            }
            if(y>=42)
            {
                System.out.println("it is a tie");
                break;
            }
        }
    }

    public static void hangman()
    {
        Scanner ob=new Scanner(System.in);
        String a,f,i; 
        int b,d,g,k=0,pos=0,kz=0;
        System.out.println("enter a word");
        a=ob.nextLine();
        System.out.println("enter a hint");
        f=ob.nextLine();
        System.out.println("enter the no of chances");
        g=ob.nextInt();
        System.out.println('\f');
        System.out.println("the no of chances are"+g);
        System.out.println("if you enter the word and if its wrong you loose 5 chsnces ");
        System.out.println("if you enter the wrong letter twice it will be counted");
        b=a.length();
        System.out.println("the no of letters is "+b);
        System.out.println("the hint is "+f);
        String c[]=new String[b];
        for(d=0;d<b;d++)
        {
            c[d]="_ ";
        }
        for(int e=0;e<=1000000;e++)
        {
            System.out.println("enter 1 to guess a letter and enter 2 to guess the word");
            int h=ob.nextInt();
            if(h==1)
            {
                System.out.println("enter a letter");
                i=ob.next();

                for(int j2=0;j2<b;j2++)
                {
                    if(c[j2].equals(i)==true)
                    {
                        kz++;
                    }
                }
                if(kz>0)
                {
                    System.out.println("letter already taken");
                    kz=0;
                }

                else if(a.indexOf(i)>=0)
                {
                    for(int j=0;j<b;j++)
                    {
                        char za=a.charAt(j);
                        String zb=za+"";

                        if(zb.equals(i)==true)
                        {
                            c[j]=i;k++;
                        }
                        System.out.print(c[j]);
                    }
                    System.out.println("");

                }
                else
                {
                    g--;
                    System.out.print("the letter does not exist in the word you have more "+g);
                    System.out.println(" chances");
                }
            }
            else if(h==2)
            {
                System.out.println("enter the word");
                String n=ob.next();
                if(n.equals(a))
                {
                    System.out.println("you won the game");
                    break;
                }
                else
                {
                    g=g-5;
                    System.out.println("the word does not exist in the word you have more "+g+" chances");
                }
            }
            else
            {
                System.out.println("choose properly");
                continue;
            }
            if(k==b)
            {
                System.out.println("you  won the game");
                break;
            }
            if(g<=0)
            {
                System.out.println("you  lost the game");
                break;
            }
        }
    }
}