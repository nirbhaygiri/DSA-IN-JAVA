
import java.util.Scanner;
public class StarRectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of rows :");
        int a=sc.nextInt();
        System.out.println("Enter no of columns :");
        int b=sc.nextInt();


        for(int i=1; i<=a; i++){
            for(int j=1; j<=b; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
