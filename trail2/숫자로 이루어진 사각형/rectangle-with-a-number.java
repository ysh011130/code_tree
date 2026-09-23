import java.util.Scanner;
public class Main {

    private static void printNum(int n) {
        int cnt = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (cnt >= 10) {
                    cnt = 1;
                }
                System.out.print(cnt++ + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        printNum(n);
    }
}