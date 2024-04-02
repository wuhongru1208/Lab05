import java.util.Scanner;
public class JPA502 {
    
    public static int abc(int i) {
        if(i == 0) {
            return 1;
        } 
        else {
            return  i*abc(i-1);
        }
    }
    public static int facTail(int a,int b) {
        if (a == 1) {
            return b;
        } 
        else {
            return facTail(a-1,a*b);
        } 

    }
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        while (true) {
            System.out.printf("Input n(0 <= n <= 16):");
            int n = a.nextInt();
            if (n == 999) {
                break;
            }
            int b = abc(n);
            System.out.println(n + "的乘階(迴圈) = "+b);
            int c = facTail(n,1);
            System.out.println(n + "的乘階(尾迴圈) = "+c);
        }

    }
}