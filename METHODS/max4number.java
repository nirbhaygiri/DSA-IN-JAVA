import java.util.Scanner;

public class max4number {
    public static void max(int a, int b, int c, int d){
        System.out.println("maximum is :"+Math.max(Math.max(a,b),Math.max(c,d)));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a:");
        int a=sc.nextInt();
        System.out.println("Enter b:");
        int b=sc.nextInt();
        System.out.println("Enter c:");
        int c=sc.nextInt();
        System.out.println("Enter d:");
        int d=sc.nextInt();
        max(a,b,c,d);
        
        sc.close();
    } 
}
