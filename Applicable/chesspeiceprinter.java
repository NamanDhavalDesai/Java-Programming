class chesspeiceprinter
{
    public static void main()
    {
        String a[]=new String[64];
        int b,c,d,g,h,i,j,l,m=0,n=0,o=0,p=0,q=0,r=0,up=0,down=0,s=0,t=0,u=0,left=0,right=0,v,w,x,y,z,queenhack=0,z1;
        String e;
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
        {//for printing
            System.out.println("+ "+"|"+"   0 "+"|"+"   1 "+"|"+"   2 "+"|"+"   3 "+"|"+"   4 "+"|"+"   5 "+"|"+"   6 "+"|"+"   7 "+"|");
            System.out.println("  "+"|"+"-----"+"|"+"-----"+"|"+"-----"+"|"+"-----"+"|"+"-----"+"|"+"-----"+"|"+"-----"+"|"+"-----"+"|");
            for(c=0;c<64;c=c+8)
            {
                if(c%8==0)
                {
                    if(c<=9)
                    {
                        System.out.print(" ");
                    }
                    System.out.print(c+1+"|");
                }
                for(z1=0;z1<=7;z1++)
                {
                    if(z1+c==3 || z1+c==11 || z1+c==19 || z1+c==27 || z1+c==35 || z1+c==43 || z1+c==51 || z1+c==59 || z1+c==7 || z1+c==15 || z1+c==23 || z1+c==31 || z1+c==39 || z1+c==47 || z1+c==55 || z1+c==63)
                    {
                        if(a[z1+c].startsWith("WP"))
                        {
                            System.out.print("  \u2659  "+"|");
                        }
                        if(a[z1+c].startsWith("WE"))
                        {
                            System.out.print("  \u2656  "+"|");
                        }
                        if(a[z1+c].startsWith("WH"))
                        {
                            System.out.print("  \u2658  "+"|");
                        }
                        if(a[z1+c].startsWith("WQ"))
                        {
                            System.out.print("  \u2655  "+"|");
                        }
                        if(a[z1+c].startsWith("WK"))
                        {
                            System.out.print("  \u2654  "+"|");
                        }
                        if(a[z1+c].startsWith("WC"))
                        {
                            System.out.print("  \u2657  "+"|");
                        }
                        if(a[z1+c].startsWith("BP"))
                        {
                            System.out.print("  \u265F  "+"|");
                        }
                        if(a[z1+c].startsWith("BE"))
                        {
                            System.out.print("  \u265C  "+"|");
                        }
                        if(a[z1+c].startsWith("BH"))
                        {
                            System.out.print("  \u265E  "+"|");
                        }
                        if(a[z1+c].startsWith("BQ"))
                        {
                            System.out.print("  \u265B  "+"|");
                        }
                        if(a[z1+c].startsWith("BK"))
                        {
                            System.out.print("  \u265A  "+"|");
                        }
                        if(a[z1+c].startsWith("BC"))
                        {
                            System.out.print("  \u265D  "+"|");
                        }
                        if(a[z1+c].startsWith(" "))
                        {
                            System.out.print("     "+"|");
                        }
                    }
                    else
                    {
                        if(a[z1+c].startsWith(" "))
                        {
                            System.out.print("     "+"|");
                        }
                        if(a[z1+c].startsWith("WP"))
                        {
                            System.out.print("  \u2659 "+"|");
                        }
                        if(a[z1+c].startsWith("WE"))
                        {
                            System.out.print("  \u2656 "+"|");
                        }
                        if(a[z1+c].startsWith("WH"))
                        {
                            System.out.print("  \u2658 "+"|");
                        }
                        if(a[z1+c].startsWith("WQ"))
                        {
                            System.out.print("  \u2655 "+"|");
                        }
                        if(a[z1+c].startsWith("WK"))
                        {
                            System.out.print("  \u2654 "+"|");
                        }
                        if(a[z1+c].startsWith("WC"))
                        {
                            System.out.print("  \u2657 "+"|");
                        }
                        if(a[z1+c].startsWith("BP"))
                        {
                            System.out.print("  \u265F "+"|");
                        }
                        if(a[z1+c].startsWith("BE"))
                        {
                            System.out.print("  \u265C "+"|");
                        }
                        if(a[z1+c].startsWith("BH"))
                        {
                            System.out.print("  \u265E "+"|");
                        }
                        if(a[z1+c].startsWith("BQ"))
                        {
                            System.out.print("  \u265B "+"|");
                        }
                        if(a[z1+c].startsWith("BK"))
                        {
                            System.out.print("  \u265A "+"|");
                        }
                        if(a[z1+c].startsWith("BC"))
                        {
                            System.out.print("  \u265D "+"|");
                        }

                    }
                }
                System.out.println("");
                System.out.println("  "+"|"+"-----"+"|"+"-----"+"|"+"-----"+"|"+"-----"+"|"+"-----"+"|"+"-----"+"|"+"-----"+"|"+"-----"+"|");
            }
        }
    }
}