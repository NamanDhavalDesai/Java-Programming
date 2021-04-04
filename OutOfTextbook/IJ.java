class IJ
{
    public static void main()
    {
        int i,j,x;
        String a[]={"Parshva","Rashi","Rachit","Rahul","Rahil"},t;
        for(i=0;i<a.length;i++)
        {
            for(j=i+1;j<a.length;j++)
            {
                x=a[i].compareTo(a[j]);
                if(x>0)
                {
                    t=a[i];a[i]=a[j];a[j]=t;
                }
            }
        }
        for(i=0;i<a.length;i++)
        System.out.println(a[i]);
    }
}
        