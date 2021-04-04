import java.util.*;
class X_and_O
{
    public static void main()
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
}