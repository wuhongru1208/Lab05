import java.util.Scanner;

public class JPA504 {
    public static int sum2(int m) {
        if(m == 1) {
            return 2;
        }
        else {
            return sum2(m - 1) + 2 * m;
        }
    }
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.printf("Input n:");
        int n = a.nextInt();
        int ans = sum2(n);
        System.out.println("Ans:"+ans);
    }
}
