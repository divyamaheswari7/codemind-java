import java.lang.Math;
import java.util.Scanner;
public class Test{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        double a=s.nextDouble();
        double b=s.nextDouble();
        double res=Math.sqrt((a*a)+(b*b));
        System.out.printf("%.2f",res);
    }
}