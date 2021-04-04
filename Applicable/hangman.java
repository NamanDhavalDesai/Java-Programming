import java.util.*;
class hangman
{
    public static void main()
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
        for(int e=0;e<=100000;e++)
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
                    System.out.println("letter already taken");kz=0;
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
                    System.out.println("chances");
                }
            }
            else if(h==2)
            {
                System.out.println("enter the word");
                String n=ob.next();
                if(n.equals(a))
                {
                    System.out.print("you gave won the game");
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
                System.out.println("you gave won the game");
                break;
            }
            if(g<=0)
            {
                System.out.println("you gave lost the game");
                break;
            }
        }

    }
}
