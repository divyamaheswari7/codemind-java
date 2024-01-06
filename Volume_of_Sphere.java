import java.util.Scanner;
public class Test{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        double pie=3.14; 
        double res=(4.0/3.0)*pie*(a*a*a);
        System.out.printf("%.2f",res);
    }
}