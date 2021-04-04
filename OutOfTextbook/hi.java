class hi
{
    public static void main()
    {
        int min;
        int i,j,t,a[]={10,30,15,70,20};
        for(i=0;i<a.length;i++)
        {
            min=i;
            for(j=i+1;j<a.length;j++)
            {
                if(a[min]>a[j])
                min=j;
            }
            t=a[i];a[i]=a[min];a[min]=t;
        }
        for(i=0;i<a.length;i++)
        System.out.println(a[i]);
    }
}