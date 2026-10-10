
import java.util.Scanner;
public class InputOutputArray {
   public static void main(String[] args) {
    //  int[] arr={34,35,23,23,56};
    // System.out.println("Arrays :");
    // for(int i=0; i<=4; i++){
    //     System.out.print(arr[i] + " ");
    // }


    Scanner sc=new Scanner(System.in);
    int[] arr=new int[5];
     
    //input
    System.out.println("Enter the no:");
    for(int i=0; i<5; i++){
        arr[i]=sc.nextInt();
    }

    //output
     for(int i=0; i<5; i++){
        System.out.println(arr[i] + " ");
    }
    sc.close();

   }
    
}
