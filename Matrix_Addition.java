import java.util.*;
public class Div{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        int[][] arr1=new int[r1][c1];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        int r2=sc.nextInt();
        int c2=sc.nextInt();
        int[][] arr2=new int[r2][c2];
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        int[][] add=new int[r1][c1];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                add[i][j]=arr1[i][j]+arr2[i][j];
                System.out.print(add[i][j]+" ");
            }
            System.out.println();
        }
    }
}