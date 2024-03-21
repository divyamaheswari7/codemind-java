import java.util.*;
public class CompareTriplets
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int[] a=new int[3];
        int[] b=new int[3];
        for(int i=0;i<3;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<3;i++)
        {
            b[i]=sc.nextInt();
        }
        int ali=0;
        int bob=0;
        for(int i=0;i<3;i++){
            if(a[i]>b[i]){
                ali++;
            }
            else if(a[i]<b[i])
            {
                bob++;    
            }
        }
        System.out.print(ali+" "+bob);
    }
}