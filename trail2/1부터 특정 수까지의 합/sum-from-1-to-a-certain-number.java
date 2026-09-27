import java.util.Scanner;
public class Main {

    private static int add(int n) {
        int result = 0;;
        for (int i=1;i<=n;i++) {
            result += i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        System.out.println(add(n) / 10);
    }
}