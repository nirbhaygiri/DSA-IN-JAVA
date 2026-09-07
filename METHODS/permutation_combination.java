import java.util.Scanner;

public class permutation_combination {
    public static int fact(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;

        }
        return f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n :");
        int n = sc.nextInt();
        System.out.println("Enter r :");
        int r = sc.nextInt();

        int nFact = fact(n);
        int rFact = fact(r);
        int nrFact = fact(n - r);
        int ncr = nFact / (rFact * nrFact);
        System.out.println("answer :" + ncr);
        sc.close();
    }
}
