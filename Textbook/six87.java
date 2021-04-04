class six87
{
    private int sides;
    private double area;
    private String name;
    private int a,b,c;
    public six87(int a,int b,int c)
    {
        sides=4;
        name="Rectangle";
        sides=a;
        this.b=b;
        this.c=c;
    }

    public void setNameAndArea()
    {

        if(sides==3)
        {
            name="triangle"; 
            area=0.5*b*c;
        }
        else
        {
           
            area=b*c;
        }
    }

    public void show()
    {
        System.out.println("area = "+area);
        System.out.println("name = "+name);
    }
} 
