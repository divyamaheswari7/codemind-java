import java.util.*;
import java.lang.*;
public class Div{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int c=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                c++;
            }
        }
        if(c==n)System.out.println("True");
        else System.out.println("False");
    }
}