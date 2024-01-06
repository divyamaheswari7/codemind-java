import java.util.*;
public class Divya{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double a=sc.nextInt();
        double b=sc.nextInt();
        double c=sc.nextInt();
        double s=(a+b+c)/2d;
        double res=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.printf("%.2f",res);
    }
}