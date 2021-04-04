class twelwe87
{
    private int days;
    private double bill,nbill,d;

    private String name,address;
    private int a;
    public twelwe87(int a,String b,String c)
    {
        bill=3000;
        address=c;
        days=a;
        name=b;
    }

    public void calc()
    {
        if(days<=5)
            d=0;
        else
            d=10;
        d=d/100;
        nbill=bill+(d*bill);
    }

    public void show()
    {
        System.out.println("bill = "+bill);
        System.out.println("address = "+address);
        System.out.println("name = "+name);
    }
} 
