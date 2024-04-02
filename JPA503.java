import java.util.Scanner;
public class JPA503 {
    public static int gcd(int a,int b) {
        while(b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        while(true) {
            System.out.printf("Input m :");
            int m = a.nextInt();
            if (m == 999) {
                break;
            }
            System.out.printf("Input n :");
            int n = a.nextInt();

            int aa = gcd(m,n);
            System.out.println("最大公因數="+aa);
        }
    }
}
