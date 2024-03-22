import java.util.*;
public class Div{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int b=sc.nextInt();
        for(int i=1;i<=b;i++){
            if(i%2!=0)System.out.printf(n+" x "+i+" = "+n*i+"
");
        }
    }
}