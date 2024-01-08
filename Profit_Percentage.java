import java.util.*;
public class Div{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double a=sc.nextInt();
        double b=sc.nextInt();
        double res=((b-a)/a*100);
        System.out.printf("%.2f",res);
    }
    
}