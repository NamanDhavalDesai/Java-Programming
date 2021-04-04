import java.util.*;
class algorithm
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        int b,c,d=0,d1,e,c1,k=0,g=0,h=0,i=0,l,m,n,o,p=0,z=0,x=0,y=0,ar,or,pi,le,a3,ask;
        String ca="";
        System.out.println('\f');
        System.out.println("Enter the order");
        or=ob.nextInt();
        System.out.println("Enter the length");
        le=ob.nextInt();
        System.out.println("If you want visualization enter 1 else enter any other number");
        ask=ob.nextInt();
        ar=or*or;
        String a[]=new String[ar];
        int xy[]=new int[le];
        for(b=0;b<ar;b++)
        {
            a[b]="  ";
        }
        {//printing
            for(pi=0;pi<or;pi++)
            {
                System.out.print("|"+"--");    
            } 
            System.out.println("|");
            for(c1=0;c1<ar;c1=c1+or)
            {
                System.out.print("|");
                for(pi=0;pi<or;pi++)
                {
                    System.out.print(a[c1+pi]+"|");    
                } 
                System.out.println("");
                for(pi=0;pi<or;pi++)
                {
                    System.out.print("|"+"--");    
                } 
                System.out.println("|");
            }
        }
        ca=ob.next();
        System.out.println('\f');
        if((le)<=or)
            for(int q=0;q<=(or-le);q++)
            {
                for(a3=0;a3<le;a3++)
                {
                    xy[a3]=(or*(or-1))+q;
                    xy[a3]=xy[a3]-(a3*(or-1));
                }
                for(int j=0;j<=(or-le);j++)
                {
                    for(a3=0;a3<le;a3++)
                    {
                        a[xy[a3]]="O ";
                    }
                    {//printing
                        for(pi=0;pi<or;pi++)
                        {
                            System.out.print("|"+"--");    
                        } 
                        System.out.println("|");
                        for(c1=0;c1<ar;c1=c1+or)
                        {
                            System.out.print("|");
                            for(pi=0;pi<or;pi++)
                            {
                                System.out.print(a[c1+pi]+"|");    
                            } 
                            System.out.println("");
                            for(pi=0;pi<or;pi++)
                            {
                                System.out.print("|"+"--");    
                            } 
                            System.out.println("|");
                        }
                    }
                    x++;
                    System.out.println(x);
                    if(ask==1)
                        ca=ob.next();
                    System.out.println('\f');
                    for(a3=0;a3<le;a3++)
                    {
                        a[xy[a3]]="  ";
                    }
                    for(a3=0;a3<le;a3++)
                    {
                        xy[a3]=xy[a3]-or;
                    }
                }
            }
        System.out.println(x);
        if((le)<=or)
            for(int q=0;q<=(or-le);q++)
            {
                for(a3=0;a3<le;a3++)
                {
                    xy[a3]=((or*or)-1)-q;
                    xy[a3]=xy[a3]-(a3*(or+1));
                }
                for(int j=0;j<=(or-le);j++)
                {
                    for(a3=0;a3<le;a3++)
                    {
                        a[xy[a3]]="O ";
                    }
                    {//printing
                        for(pi=0;pi<or;pi++)
                        {
                            System.out.print("|"+"--");    
                        } 
                        System.out.println("|");
                        for(c1=0;c1<ar;c1=c1+or)
                        {
                            System.out.print("|");
                            for(pi=0;pi<or;pi++)
                            {
                                System.out.print(a[c1+pi]+"|");    
                            } 
                            System.out.println("");
                            for(pi=0;pi<or;pi++)
                            {
                                System.out.print("|"+"--");    
                            } 
                            System.out.println("|");
                        }
                    }
                    x++;
                    System.out.println(x);
                    if(ask==1)
                        ca=ob.next();
                    System.out.println('\f');
                    for(a3=0;a3<le;a3++)
                    {
                        a[xy[a3]]="  ";
                    }
                    for(a3=0;a3<le;a3++)
                    {
                        xy[a3]=xy[a3]-or;
                    }
                }
            }
        System.out.println(x);
        if(le<=or)
            for(int q=0;q<or;q++)
            {
                for(a3=0;a3<le;a3++)
                {
                    xy[a3]=a3+(q*or);
                }
                for(int j=0;j<(or-le+1);j++)
                {                       
                    for(a3=0;a3<le;a3++)
                    {
                        if(j!=0)
                            xy[a3]++;
                    }
                    for(a3=0;a3<le;a3++)
                    {
                        a[xy[a3]]="O ";
                    }
                    {//printing
                        for(pi=0;pi<or;pi++)
                        {
                            System.out.print("|"+"--");    
                        } 
                        System.out.println("|");
                        for(c1=0;c1<ar;c1=c1+or)
                        {
                            System.out.print("|");
                            for(pi=0;pi<or;pi++)
                            {
                                System.out.print(a[c1+pi]+"|");    
                            } 
                            System.out.println("");
                            for(pi=0;pi<or;pi++)
                            {
                                System.out.print("|"+"--");    
                            } 
                            System.out.println("|");
                        }
                    }
                    x++;
                    System.out.println(x);
                    if(ask==1)
                        ca=ob.next();
                    System.out.println('\f');
                    for(a3=0;a3<le;a3++)
                    {
                        a[xy[a3]]="  ";
                    }                  
                }              
            }
        System.out.println(x);       
        if(le<=or)
            for(int q=0;q<or;q++)
            {
                for(a3=0;a3<le;a3++)
                {
                    xy[a3]=(a3*or)+(q);
                    
                }
                for(int j=0;j<(or-le+1);j++)
                {                                           
                    for(a3=0;a3<le;a3++)
                    {
                        a[xy[a3]+(j*or)]="O ";
                    }
                    {//printing
                        for(pi=0;pi<or;pi++)
                        {
                            System.out.print("|"+"--");    
                        } 
                        System.out.println("|");
                        for(c1=0;c1<ar;c1=c1+or)
                        {
                            System.out.print("|");
                            for(pi=0;pi<or;pi++)
                            {
                                System.out.print(a[c1+pi]+"|");    
                            } 
                            System.out.println("");
                            for(pi=0;pi<or;pi++)
                            {
                                System.out.print("|"+"--");    
                            } 
                            System.out.println("|");
                        }
                    }
                    x++;
                    System.out.println(x);
                    if(ask==1)
                        ca=ob.next();
                    System.out.println('\f');
                    for(a3=0;a3<le;a3++)
                    {a[xy[a3]+(j*or)]="  ";
                    }                  
                }              
            }
        System.out.println(x);
    }
}