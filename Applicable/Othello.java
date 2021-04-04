import java.util.*;
class Othello
{
    public static void main()
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
}