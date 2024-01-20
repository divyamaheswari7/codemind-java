import java.util.*;
public class Octa
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0)
        {
            String s=sc.nextLine();
            int temp=Integer.parseInt(s,8);
            String binary=Integer.toBinaryString(temp);
            System.out.println(binary);
        }
    }
}