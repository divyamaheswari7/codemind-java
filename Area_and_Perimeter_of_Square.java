import java.util.Scanner;
public class AreaPerimeter
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int area=a*a;
        int per=4*a;
        System.out.printf("%d %d",area,per);
    }
}