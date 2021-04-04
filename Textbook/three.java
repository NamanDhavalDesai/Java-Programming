import java.util.*;
class three
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        char t;
        String a,e,i,o,u;
        System.out.println("enter your letter");
        t=ob.next().charAt(0);
        if(t=='a'||t=='e'||t=='i'||t=='o'||t=='u')
        {
            System.out.println("vowel");
        }
        else
        {
            System.out.println("consonant");
        }
    }
}

            