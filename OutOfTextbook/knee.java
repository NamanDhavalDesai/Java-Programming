import java.util.*;
class knee
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        String cy[]={"india","australia","america","uae","afghanistan","china","pakistan","south africa","france","GERMANY"};
        String ci[]={"delhi","sydney","washington dc","abu dhabi","kabul","beijing","islamabad", "johannesberg","paris","berlin"};
        int i;String cc;
        do{
        System.out.println("Enter country or XXX to stop");
        cc=ob.nextLine();
        for(i=0;i<10;i++)
        {
            if(cy[i].equalsIgnoreCase(cc))
            {
                System.out.println(cc+"'s capital is " +ci[i]);
            }
        }
    }
    while(!(cc.equalsIgnoreCase("XXX")));
}
}