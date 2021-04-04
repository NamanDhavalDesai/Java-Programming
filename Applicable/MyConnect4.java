import java.util.*;//35 variables and 123 lines
class MyConnect4
{
    public static void main()
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
                System.out.println("Red wins");
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
                System.out.println("yellow wins");
                break;
            }
            if(y>=42)
            {
                System.out.println("it is a tie");
                break;
            }
        }
    }
}        