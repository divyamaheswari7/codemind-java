import java.util.Scanner;
public class Test{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        double a=sc.nextInt();
        double b=sc.nextInt();
        double loss=((a-b)/a)*100;
        System.out.printf("%.2f",loss);
    }
}