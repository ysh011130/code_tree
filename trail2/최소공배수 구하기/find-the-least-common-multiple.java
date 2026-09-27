import java.util.Scanner;

public class Main {

    private static int gcd(int n, int m) {
        while(m != 0) {
            int r = n % m;
            n = m;
            m = r;
        }
        return n;
    }

    private static int lcm(int n, int m) {
        return (n * m) / gcd(n, m);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Please write your code here.
        System.out.println(lcm(n, m));
    }
}