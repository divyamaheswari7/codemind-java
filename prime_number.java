import java.util.*;
public class Div{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        for(int i=1;i<n+1;i++){
            if(n%i==0){
                c++;
            }
        }
        if(c==2)System.out.println("prime");
        else System.out.println("not a prime");
    }
}