class ninetytwo22
{
    public static void main()
    {
        int a[]={1,2,3,4,5,6,7,8,9,0};
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    int x=a[i];
                    int y=a[j];
                    a[j]=x;
                    a[i]=y;
                }
            }
        }
         for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}