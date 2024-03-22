import java.util.*;
public class Div{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=(int)Math.sqrt(n);
        if(a*a==n)System.out.println("True");
        else System.out.println("False");
    }
}