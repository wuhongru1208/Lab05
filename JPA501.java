import java.util.Scanner;
public class JPA501 {
    
    public static int abc(int i) {
        if(i == 0) {
            return 1;
        } 
        else {
            return  i*abc(i-1);
        }
    }
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        while (true) {
            System.out.printf("Input n(0 <= n <= 16):");
            int a = n.nextInt();
            if (a == 999) {
                break;
            }
            int b = abc(a);
            System.out.println(a + "的乘階 = "+b);
        }

    }
}
