import java.util.*;
public class Romeo
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        int a=((x*5)+(y*10))/z;
        System.out.printf("%d",a);
    }
}